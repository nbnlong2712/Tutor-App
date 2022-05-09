package com.nguyenhuyhoang.lettutor.models;

import java.util.Date;

public class Booking {
    String id;
    String userId;
    String scheduleDetailId;
    String tutorMeetingLink;
    String studentMeetingLink;
    int scoreByTutor;
    String recordUrl;
    Date startPeriodTimestamp;
    Date endPeriodTimestamp;
    String tutorId;
    String tutorAvatar;
    String tutorName;

    //Constructor
    public Booking(String id, String userId, String scheduleDetailId, String tutorMeetingLink, String studentMeetingLink, int scoreByTutor, String recordUrl, Date startPeriodTimestamp, Date endPeriodTimestamp, String tutorId, String tutorAvatar, String tutorName) {
        this.id = id;
        this.userId = userId;
        this.scheduleDetailId = scheduleDetailId;
        this.tutorMeetingLink = tutorMeetingLink;
        this.studentMeetingLink = studentMeetingLink;
        this.scoreByTutor = scoreByTutor;
        this.recordUrl = recordUrl;
        this.startPeriodTimestamp = startPeriodTimestamp;
        this.endPeriodTimestamp = endPeriodTimestamp;
        this.tutorId = tutorId;
        this.tutorAvatar = tutorAvatar;
        this.tutorName = tutorName;
    }

    //get set
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getScheduleDetailId() {
        return scheduleDetailId;
    }

    public void setScheduleDetailId(String scheduleDetailId) {
        this.scheduleDetailId = scheduleDetailId;
    }

    public String getTutorMeetingLink() {
        return tutorMeetingLink;
    }

    public void setTutorMeetingLink(String tutorMeetingLink) {
        this.tutorMeetingLink = tutorMeetingLink;
    }

    public String getStudentMeetingLink() {
        return studentMeetingLink;
    }

    public void setStudentMeetingLink(String studentMeetingLink) {
        this.studentMeetingLink = studentMeetingLink;
    }

    public int getScoreByTutor() {
        return scoreByTutor;
    }

    public void setScoreByTutor(int scoreByTutor) {
        this.scoreByTutor = scoreByTutor;
    }

    public String getRecordUrl() {
        return recordUrl;
    }

    public void setRecordUrl(String recordUrl) {
        this.recordUrl = recordUrl;
    }

    public Date getStartPeriodTimestamp() {
        return startPeriodTimestamp;
    }

    public void setStartPeriodTimestamp(Date startPeriodTimestamp) {
        this.startPeriodTimestamp = startPeriodTimestamp;
    }

    public Date getEndPeriodTimestamp() {
        return endPeriodTimestamp;
    }

    public void setEndPeriodTimestamp(Date endPeriodTimestamp) {
        this.endPeriodTimestamp = endPeriodTimestamp;
    }

    public String getTutorId() {
        return tutorId;
    }

    public void setTutorId(String tutorId) {
        this.tutorId = tutorId;
    }

    public String getTutorAvatar() {
        return tutorAvatar;
    }

    public void setTutorAvatar(String tutorAvatar) {
        this.tutorAvatar = tutorAvatar;
    }

    public String getTutorName() {
        return tutorName;
    }

    public void setTutorName(String tutorName) {
        this.tutorName = tutorName;
    }

    //toString
    @Override
    public String toString() {
        return "Booking{" +
                "id='" + id + '\'' +
                ", userId='" + userId + '\'' +
                ", scheduleDetailId='" + scheduleDetailId + '\'' +
                ", tutorMeetingLink='" + tutorMeetingLink + '\'' +
                ", studentMeetingLink='" + studentMeetingLink + '\'' +
                ", scoreByTutor=" + scoreByTutor +
                ", recordUrl='" + recordUrl + '\'' +
                ", startPeriodTimestamp=" + startPeriodTimestamp +
                ", endPeriodTimestamp=" + endPeriodTimestamp +
                ", tutorId='" + tutorId + '\'' +
                ", tutorAvatar='" + tutorAvatar + '\'' +
                ", tutorName='" + tutorName + '\'' +
                '}';
    }
}
