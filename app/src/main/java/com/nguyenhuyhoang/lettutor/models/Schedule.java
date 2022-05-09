package com.nguyenhuyhoang.lettutor.models;

import java.util.Date;
import java.util.List;

public class Schedule {
    String id;
    String tutorId;
    String startTime;
    String endTime;
    Date startTimestamp;
    Date endTimestamp;
    boolean isBooked;
    List<ScheduleDetail> scheduleDetails;

    //Constructor
    public Schedule(String id, String tutorId, String startTime, String endTime, Date startTimestamp, Date endTimestamp, boolean isBooked, List<ScheduleDetail> scheduleDetails) {
        this.id = id;
        this.tutorId = tutorId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.startTimestamp = startTimestamp;
        this.endTimestamp = endTimestamp;
        this.isBooked = isBooked;
        this.scheduleDetails = scheduleDetails;
    }

    //get set
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

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Date getStartTimestamp() {
        return startTimestamp;
    }

    public void setStartTimestamp(Date startTimestamp) {
        this.startTimestamp = startTimestamp;
    }

    public Date getEndTimestamp() {
        return endTimestamp;
    }

    public void setEndTimestamp(Date endTimestamp) {
        this.endTimestamp = endTimestamp;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    public List<ScheduleDetail> getScheduleDetails() {
        return scheduleDetails;
    }

    public void setScheduleDetails(List<ScheduleDetail> scheduleDetails) {
        this.scheduleDetails = scheduleDetails;
    }

    //toString

    @Override
    public String toString() {
        return "Schedule{" +
                "id='" + id + '\'' +
                ", tutorId='" + tutorId + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", startTimestamp=" + startTimestamp +
                ", endTimestamp=" + endTimestamp +
                ", isBooked=" + isBooked +
                ", scheduleDetails=" + scheduleDetails +
                '}';
    }
}
