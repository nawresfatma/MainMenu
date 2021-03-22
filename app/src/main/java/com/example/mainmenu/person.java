package com.example.mainmenu;

import java.util.Comparator;

public class person implements Comparable<person> {
    private int rank;
    private String name;
    private String points;
    private int coin;
    private int profile;

    public person(int rank, String name, String points, int coin, int profile) {
        this.rank = rank;
        this.name = name;
        this.points = points;
        this.coin = coin;
        this.profile = profile;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        this.points = points;
    }

    public int getCoin() {
        return coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }

    public int getProfile() {
        return profile;
    }

    public void setProfile(int profile) {
        this.profile = profile;
    }


    @Override
    public int compareTo(person other) {
        return this.points.compareTo(other.points);
    }
}
