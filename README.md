# Coding Events Application

## Purpose
The purpose of this application is to keep track of some fictional coding events. The coding events are sorted by categories and respective tags

## Current State
Currently, this app can store coding events and organize them by category type. This app can then store the information into a SQL database for easier use

## Future Improvements

### Add person class so users can sign up for events and create any events

1. The person class might hold the following fields: 
   - id (int) - the unique user ID
   - firstName (String) - the user's first name
   - lastName (String) - the user's last name
   - email (String) - the user's email, which will also function as their username
   - password (String) - the user's password
- The class would need getters for all these fields. It would have setters for all fields except id (since it shouldn't change

2. The person class will also have the following references:
   - PersonProfile - a class to gather up all of the profile information about the user
   - List<Events> eventsAttending - to store events the user wants to attend
   - List<Events> eventsOwned - a different list to store the events the user has created
- Person would have a many-to-many relationship with Event via List<Events> events Attending. It would have a one-to-many relationship with Event via List<Events> eventsOwned.


### Adjust Id to reorder once an event is deleted
1. Try to set list to auto-increment and see if that solves issue.
