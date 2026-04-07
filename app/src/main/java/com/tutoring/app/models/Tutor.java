package com.tutoring.app.models;

public class Tutor {
    private String id;
    private String name;
    private String subject;
    private float hourlyRate;

    public Tutor(String id, String name, String subject, float hourlyRate) {
        this.id = id;
        this.name = name;
        this.subject = subject;
        this.hourlyRate = hourlyRate;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public float getHourlyRate() {
        return hourlyRate;
    }
}