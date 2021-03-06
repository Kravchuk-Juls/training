package com.codespace.workB28P1.task3;

public enum DaysOfWeek {
    SUNDAY, MONDAY, TUESDAY,
    WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

    public DaysOfWeek nextDay() {
        DaysOfWeek[] days = DaysOfWeek.values();
        int position = this.ordinal();
        if (position == days.length - 1) { return days[0]; }
        return days[position+1];
    }
}
