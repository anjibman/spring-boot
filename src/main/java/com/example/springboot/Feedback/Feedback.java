package com.example.springboot.Feedback;

public class Feedback {
    private String uuid;
    private String name;
    private String email;
    private String phoneNumber;

    private Integer ltrScore;
    private String feedback;

    public Feedback() {
    }

    public Feedback(String uuid, String name, String email, String phoneNumber, Integer ltrScore, String feedback) {
        this.uuid = uuid;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.ltrScore = ltrScore;
        this.feedback = feedback;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getLtrScore() {
        return ltrScore;
    }

    public void setLtrScore(Integer ltrScore) {
        this.ltrScore = ltrScore;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "uuid='" + uuid + '\'' +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", ltrScore=" + ltrScore +
                ", feedback='" + feedback + '\'' +
                '}';
    }


}
