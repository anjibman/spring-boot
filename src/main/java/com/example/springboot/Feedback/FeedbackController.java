package com.example.springboot.Feedback;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FeedbackController {
    @Autowired
    private FeedbackHardcodedService feedbackHardcodedService;

    @GetMapping("/feedbacks")
    public List<Feedback> getAllCourses() {
        return feedbackHardcodedService.findAll();
    }
}
