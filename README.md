# Event Scheduler GUI


## Effortlessly manage your events with this simple and efficient Event Scheduler GUI!

## Description
The Event Scheduler GUI is a Java-based desktop application that allows users to manage events using an intuitive graphical user interface (GUI). The application enables users to add, edit, and delete events, with each event timestamped for easy tracking. It is built using Java Swing for the GUI components and a `HashMap` to store event data.

## Features

### 1. **Add Events**
- Users can create new events by entering the event name.
- Each event is automatically timestamped with the current date and time.

### 2. **Edit Events**
- Existing events can be updated with a new name.
- The timestamp is refreshed upon editing.

### 3. **Delete Events**
- Users can delete events by specifying the event name.
- Events are immediately removed from the list upon confirmation.

### 4. **Event Display**
- A scrollable text area displays the list of events and their timestamps.
- The display updates automatically after every action (add, edit, delete).

### 5. **User-Friendly GUI**
- Built using Java Swing for a simple and responsive interface.
- Includes buttons for adding, editing, and deleting events.

## Requirements
- Java Development Kit (JDK) 8 or higher

## How to Run
1. Ensure that JDK is installed and set up on your system.
2. Save the code as `EventSchedulerGUI.java`.
3. Compile the code using the following command:
   ```bash
   javac EventSchedulerGUI.java
   ```
4. Run the application:
   ```bash
   java EventSchedulerGUI
   ```

## Code Structure

### Classes and Methods
- **`EventSchedulerGUI`**: The main class that initializes the GUI and handles event management.
  - **`addEvent`**: Prompts the user to input a new event and adds it to the list with a timestamp.
  - **`editEvent`**: Allows the user to modify the name of an existing event.
  - **`deleteEvent`**: Removes an event based on user input.
  - **`getCurrentTimestamp`**: Generates the current date and time in `yyyy-MM-dd HH:mm:ss` format.
  - **`updateEventTextArea`**: Refreshes the display area to show the current list of events.

### User Interface
- **JFrame**: Main application window.
- **JTextArea**: Displays the event list.
- **JPanel**: Contains buttons for user actions.
- **JButton**: Buttons for `Add Event`, `Edit Event`, and `Delete Event`.

## Example Workflow
1. **Adding an Event**:
   - Click the "Add Event" button.
   - Enter the event name when prompted.
   - The event is added to the list with a timestamp.

2. **Editing an Event**:
   - Click the "Edit Event" button.
   - Enter the name of the event to edit.
   - Enter the new name when prompted.
   - The event is updated with the new name and a refreshed timestamp.

3. **Deleting an Event**:
   - Click the "Delete Event" button.
   - Enter the name of the event to delete.
   - The event is removed from the list.

## Future Enhancements
- Add a search feature to quickly locate events.
- Enable event categorization and filtering.
- Implement data persistence to save events across sessions.
- Add notifications or reminders for events.

## License
This project is open-source and available under the MIT License. Feel free to use, modify, and distribute it.

