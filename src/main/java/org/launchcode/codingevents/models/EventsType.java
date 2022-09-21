package org.launchcode.codingevents.models;

public enum EventsType {
    CONFERENCE("Conference"),
    MEETUP("Meetup"),
    WORKSHOP("Workshop"),
    SOCIAL("Social");

    private final String displayName;

    EventsType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
