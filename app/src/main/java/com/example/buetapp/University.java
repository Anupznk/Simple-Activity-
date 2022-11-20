package com.example.buetapp;

public class University {
    private String name;
    private String rankinAsia;

    public University(String name, String rankinAsia) {
        this.name = name;
        this.rankinAsia = rankinAsia;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRank() {
        return rankinAsia;
    }

    public void setRank(String rankinAsia) {
        this.rankinAsia = rankinAsia;
    }
}
