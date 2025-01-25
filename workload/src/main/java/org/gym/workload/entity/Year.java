package org.gym.workload.entity;

public class Year {
    private Long id;

    private int yearNumber;

    private int[] durationByMonths = new int[12];

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getYearNumber() {
        return yearNumber;
    }

    public void setYearNumber(int yearNumber) {
        this.yearNumber = yearNumber;
    }

    public int[] getDurationByMonths() {
        return durationByMonths;
    }

    public void setDurationByMonths(int[] durationByMonths) {
        this.durationByMonths = durationByMonths;
    }
}
