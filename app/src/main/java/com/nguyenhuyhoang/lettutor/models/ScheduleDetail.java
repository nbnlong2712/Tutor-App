package com.nguyenhuyhoang.lettutor.models;

public class ScheduleDetail {
    int startPeriodTimestamp;
    int endPeriodTimestamp;
    String id;
    String scheduleId;
    String startPeriod;
    String endPeriod;
    boolean isBooked;

    //Constructor
    public ScheduleDetail(int startPeriodTimestamp, int endPeriodTimestamp, String id, String scheduleId, String startPeriod, String endPeriod, boolean isBooked) {
        this.startPeriodTimestamp = startPeriodTimestamp;
        this.endPeriodTimestamp = endPeriodTimestamp;
        this.id = id;
        this.scheduleId = scheduleId;
        this.startPeriod = startPeriod;
        this.endPeriod = endPeriod;
        this.isBooked = isBooked;
    }

    //get set
    public int getStartPeriodTimestamp() {
        return startPeriodTimestamp;
    }

    public void setStartPeriodTimestamp(int startPeriodTimestamp) {
        this.startPeriodTimestamp = startPeriodTimestamp;
    }

    public int getEndPeriodTimestamp() {
        return endPeriodTimestamp;
    }

    public void setEndPeriodTimestamp(int endPeriodTimestamp) {
        this.endPeriodTimestamp = endPeriodTimestamp;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
    }

    public String getStartPeriod() {
        return startPeriod;
    }

    public void setStartPeriod(String startPeriod) {
        this.startPeriod = startPeriod;
    }

    public String getEndPeriod() {
        return endPeriod;
    }

    public void setEndPeriod(String endPeriod) {
        this.endPeriod = endPeriod;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    //toString

    @Override
    public String toString() {
        return "ScheduleDetail{" +
                "startPeriodTimestamp=" + startPeriodTimestamp +
                ", endPeriodTimestamp=" + endPeriodTimestamp +
                ", id='" + id + '\'' +
                ", scheduleId='" + scheduleId + '\'' +
                ", startPeriod='" + startPeriod + '\'' +
                ", endPeriod='" + endPeriod + '\'' +
                ", isBooked=" + isBooked +
                '}';
    }
}
