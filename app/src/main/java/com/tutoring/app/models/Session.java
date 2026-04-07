package com.tutoring.app.models;

import java.util.Date;

public class Session {
    private String id;
    private String tutorId;
    private String studentId;
    private Date sessionDate;
    private String subject;
    private String duration;

    public Session(String id, String tutorId, String studentId, Date sessionDate, String subject, String duration) {
        this.id = id;
        this.tutorId = tutorId;
        this.studentId = studentId;
        this.sessionDate = sessionDate;
        this.subject = subject;
        this.duration = duration;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTutorId() {
        return tutorId;
    }

    public void setTutorId(String tutorId) {
        this.tutorId = tutorId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public Date getSessionDate() {
        return sessionDate;
    }

    public void setSessionDate(Date sessionDate) {
        this.sessionDate = sessionDate;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}