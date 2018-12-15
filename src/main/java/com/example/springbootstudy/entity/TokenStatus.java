package com.example.springbootstudy.entity;

public class TokenStatus {
    private boolean isLiving;

    private String userId;

    public boolean isLiving() {
        return isLiving;
    }

    public void setLiving(boolean living) {
        isLiving = living;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
