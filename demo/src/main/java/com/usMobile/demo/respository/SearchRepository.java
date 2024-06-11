package com.usMobile.demo.respository;

import com.usMobile.demo.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface SearchRepository {

    List<String> getCurrentCycleDailyUsage(String userId, String mdn);

    List<String> getCycleHistory(String userId, String mdn);
}