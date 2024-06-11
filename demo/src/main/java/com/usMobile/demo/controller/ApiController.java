package com.usMobile.demo.controller;

import com.usMobile.demo.respository.SearchRepository;
import com.usMobile.demo.respository.UserRepository;
import com.usMobile.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
public class ApiController {

    @Autowired
    UserRepository userRepo;

    @Autowired
    SearchRepository searchRepo;

    @ApiIgnore
    @RequestMapping(value = "/")
    public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui.html");
    }

    /**
     * API that adds a new User that was gotten from the request body to the User collections
     *
     * @param User the user info being added
     * @return User indicates a successful add
     */
    @PostMapping("/addUser")
    public User addUser(@RequestBody User user){
        return userRepo.save(user);
    }

    /**
     * API that updates the User that was gotten from the request body based off of _id
     *
     * @param User the user info being added
     * @return User indicates a successful update
     */
    @PutMapping("/updateUser")
    public User updateUser(@RequestBody User user){
        User existingUser = userRepo.findById(user.get_id())
                .orElseThrow(() -> new RuntimeException("User not found"));
        existingUser.setFirstName(user.getFirstName());
        existingUser.setLastName(user.getLastName());
        existingUser.setEmail(user.getEmail());
        return userRepo.save(existingUser);
    }

    /**
     * API that gets the Daily cycle usage based off of Userid and mdn
     *
     * @param userId the userId string that acts as the foreign key in the Daily_Usage table
     * @param mdn the mdn string associated with each Daily_Usage document
     * @return List<String> the date and usage in MBs
     */
    @GetMapping("/getDailyCycleUsage/{userId}/{mdn}")
    public List<String> getCurrentCycle(@PathVariable String userId, @PathVariable String mdn){
        try{
            return searchRepo.getCurrentCycleDailyUsage(userId, mdn);
        } catch (Exception e){
            String a = e.toString();
        }
        return null;
    }

    /**
     * API that gets the Cycle history based off of Userid and mdn
     *
     * @param userId the userId string that acts as the foreign key in the Cycle table
     * @param mdn the mdn string associated with each Cycle document
     * @return List<String> the cycleId: the startDate and the endDate
     */
    @GetMapping("/getCycleHistory/{userId}/{mdn}")
    public List<String> getCycleHis(@PathVariable String userId, @PathVariable String mdn){
        try{
            return searchRepo.getCycleHistory(userId, mdn);
        } catch (Exception e){
            String a = e.toString();
        }
        return null;
    }
}
