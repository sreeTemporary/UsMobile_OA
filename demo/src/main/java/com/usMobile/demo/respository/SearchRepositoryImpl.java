package com.usMobile.demo.respository;

import com.mongodb.client.AggregateIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.usMobile.demo.model.Cycle;
import com.usMobile.demo.model.Daily_Usage;
import com.usMobile.demo.model.User;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.convert.MongoConverter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class SearchRepositoryImpl implements SearchRepository {

    @Autowired
    MongoClient client;

    @Autowired
    MongoConverter converter;

    /**
     * Gets the Daily cycle usage based off of Userid and mdn
     *
     * @param userId the userId string that acts as the foreign key in the Daily_Usage table
     * @param mdn the mdn string associated with each Daily_Usage document
     * @return List<String> the date and usage in MBs
     */
    @Override
    public List<String> getCurrentCycleDailyUsage(String userId, String mdn){

        final List<String> res = new ArrayList<>();
        final List<Daily_Usage> dailyUsage = new ArrayList<>();

        MongoDatabase database = client.getDatabase("UsMobile");
        MongoCollection<Document> collection = database.getCollection("Daily_Usage");
        AggregateIterable<Document> result = collection.aggregate(Arrays.asList(new Document("$search",
                        new Document("text",
                                new Document("query", mdn)
                                        .append("path", "mdn")
                                        .append("query", userId)
                                        .append("path", "userId"))),
                new Document("$limit", 10L)));

        result.forEach(doc -> dailyUsage.add(converter.read(Daily_Usage.class, doc)));

        dailyUsage.forEach(d -> res.add(d.getUsageDate() + " - " + d.getUsedInMb()));
        return res;
    }

    /**
     * Gets the Cycle history based off of Userid and mdn
     *
     * @param userId the userId string that acts as the foreign key in the Cycle table
     * @param mdn the mdn string associated with each Cycle document
     * @return List<String> the cycleId: the startDate and the endDate
     */
    @Override
    public List<String> getCycleHistory(String userId, String mdn){

        final List<String> res = new ArrayList<>();
        final List<Cycle> cycleList = new ArrayList<>();

        MongoDatabase database = client.getDatabase("UsMobile");
        MongoCollection<Document> collection = database.getCollection("Cycle");
        AggregateIterable<Document> result = collection.aggregate(Arrays.asList(new Document("$search",
                        new Document("text",
                                new Document("query", mdn)
                                        .append("path", "mdn")
                                        .append("query", userId)
                                        .append("path", "userId"))),
                new Document("$limit", 10L)));

        result.forEach(doc -> cycleList.add(converter.read(Cycle.class, doc)));

        cycleList.forEach(d -> res.add(d.get_id() + ": " + d.getStartDate() + " - " + d.getEndDate()));
        return res;
    }
}
