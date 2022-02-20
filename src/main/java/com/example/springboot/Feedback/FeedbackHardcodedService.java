package com.example.springboot.Feedback;

import com.example.springboot.Feedback.Feedback;
import com.github.javafaker.Faker;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class FeedbackHardcodedService {
    private static List<Feedback> feedbacks = new ArrayList<>();

    static {
        feedbacks.add(generateRandomCourse());
        feedbacks.add(generateRandomCourse());
        feedbacks.add(generateRandomCourse());
        feedbacks.add(generateRandomCourse());
    }

    public List<Feedback> findAll() {
        return feedbacks;
    }

    private static Feedback generateRandomCourse() {
        Faker faker = new Faker();

        String name = faker.funnyName().name();
        String email = faker.internet().emailAddress();
        String phoneNumber = faker.phoneNumber().phoneNumber();
        Integer ltrScore = faker.number().numberBetween(0, 10);
        String feedback = faker.lorem().sentence();

        return new Feedback(UUID.randomUUID().toString(), name, email, phoneNumber, ltrScore, feedback);

    }


}
