package org.launchcode.codingevents.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Objects;

@Entity
public class Event {

    @Id
    @GeneratedValue
    private int id;
    @NotBlank(message="Name is required")
    @Size(min = 3, max=50, message="Name must be between 3 and 50 characters.")
    private String name;
    @Size(max=500, message="Description is too long.")
    private String description;

    @NotBlank(message="Email is required")
    @Email(message = "Invalid email.")
    private String contactEmail;

    private EventsType type;

    public Event(String name, String description, String contactEmail, EventsType type) {
        this.name = name;
        this.description = description;
        this.contactEmail = contactEmail;
        this.type = type;
    }

    public Event(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public EventsType getType() {
        return type;
    }

    public void setType(EventsType type) {
        this.type = type;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return getId() == event.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
