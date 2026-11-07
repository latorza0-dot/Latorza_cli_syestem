package com.scc.model;

public record ActivityLog(int id, int user_id, String action_type, String description, String timestamp) {
    @Override
    public String toString() {
        return String.format("%-5d | %-8d | %-18s | %-35s | %-20s", id, user_id, action_type, description, timestamp);
    }
}