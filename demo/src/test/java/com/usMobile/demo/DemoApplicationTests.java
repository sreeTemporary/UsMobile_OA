package com.usMobile.demo;

import com.usMobile.demo.model.User;
import com.usMobile.demo.respository.SearchRepository;
import com.usMobile.demo.respository.UserRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	MongoTemplate mongoTemplate;

	@Autowired
	@Mock
	SearchRepository mockSearchRepository;

	@Autowired
	@Mock
	UserRepository mockUserRepository;

	@Test
	void testUserAdd() {
		User user = new User();
		user.set_id("666330503f073de8d8a86d98");
		user.setFirstName("Steph");
		user.setLastName("Curry");
		user.setPassword("warriors");
		user.setEmail("Steph.curry@gmail.com");

		mockUserRepository.save(user);

		User result = mongoTemplate.findById("666330503f073de8d8a86d98", User.class);

        assert result != null;
        assertEquals(result.get_id(), user.get_id());
		assertEquals(result.getEmail(), user.getEmail());
		assertEquals(result.getFirstName(), user.getFirstName());
		assertEquals(result.getLastName(), user.getLastName());

	}

	@Test
	void testUpdateAdd() {
		User existingUser = mockUserRepository.findById("666330503f073de8d8a86d95")
				.orElseThrow(() -> new RuntimeException("User not found"));
		existingUser.setFirstName("Klay");
		existingUser.setLastName("Thompson");
		mockUserRepository.save(existingUser);

		User result = mongoTemplate.findById("666330503f073de8d8a86d95", User.class);

		assert result != null;
		assertEquals(result.getFirstName(), "Klay");
		assertEquals(result.getLastName(), "Thompson");

	}

	@Test
	void testGetCurrentCycleDailyUsage() {
		List<String> cycleVals = new ArrayList<>();
		cycleVals.add("2024-06-02T00:00:00Z - 200");
		cycleVals.add("2024-06-06T00:00:00Z - 210");
		cycleVals.add("2024-06-10T00:00:00Z - 270");
		cycleVals.add("2024-06-14T00:00:00Z - 300");
		cycleVals.add("2024-06-18T00:00:00Z - 340");

		List<String> results = mockSearchRepository.getCurrentCycleDailyUsage("666330503f073de8d8a86d95","555-123-0002");

		assertEquals(results, cycleVals);
	}

	@Test
	void testGetCycleHistory() {
		List<String> cycles = new ArrayList<>();
		cycles.add("666332f83f073de8d8b071a1: 2024-06-10 - 2024-06-17");
		cycles.add("666332f83f073de8d8b071a5: 2024-06-30 - 2024-07-07");
		cycles.add("666332f83f073de8d8b071a9: 2024-07-20 - 2024-07-27");

		List<String> results = mockSearchRepository.getCycleHistory("666330503f073de8d8a86d95","555-123-0002");

		assertEquals(results, cycles);
	}

}
