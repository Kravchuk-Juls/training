package com.codespace.workB28P1.task3;

import java.util.Arrays;

public class Train {
    private int number;
    private String stationDispatch;
    private String stationArrival;
    private String timeDispatch;
    private String timeArrival;

    private DaysOfWeek[] days;

    public Train() {}

    public int getNumber() { return number; }
    public void setNumber(int number) { this.number = number; }
    public String getStationDispatch() { return stationDispatch; }
    public void setStationDispatch(String stationDispatch) { this.stationDispatch = stationDispatch; }
    public String getStationArrival() { return stationArrival; }
    public void setStationArrival(String stationArrival) { this.stationArrival = stationArrival; }
    public String getTimeDispatch() { return timeDispatch; }
    public void setTimeDispatch(String timeDispatch) { this.timeDispatch = timeDispatch; }
    public String getTimeArrival() { return timeArrival; }
    public void setTimeArrival(String timeArrival) { this.timeArrival = timeArrival; }
    public DaysOfWeek[] getDays() { return days; }
    public void setDays(DaysOfWeek[] days) { this.days = days; }

    @Override
    public String toString() {
        return "Train number " + number +
                " dispatches from " + stationDispatch + " at " + timeDispatch +
                " and arrives in " + stationArrival + " at " + timeArrival +
                " on " + Arrays.toString(days) ;
    }
}
