package com.example.week8_day2.model;

import java.util.List;

public enum TaskStatus {
    NEW("New"),
    IN_PROGRESS("In progress"),
    DONE("Done"),
    CANCELED("");

    private final String statusTitle;

    TaskStatus(String statusTitle) {
        this.statusTitle = statusTitle;
    }

    public String getStatusTitle() {
        return statusTitle;
    }
}
