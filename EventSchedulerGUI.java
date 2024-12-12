//author - bhavya sharma - bhavss-25  (github)
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;//for handling action events 
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;//aloow and parse date
import java.util.Date;
import java.util.HashMap;//used to store store events and dates 
import java.util.Map;

public class EventSchedulerGUI {
    private JFrame frame;
    private JTextArea eventTextArea;
    private Map<String, String> events; // Map to store events with their timestamps
//gui- graphical user interface
    public EventSchedulerGUI() {
        frame = new JFrame("Event Scheduler");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        events = new HashMap<>();
  
        // Text area to display events
        eventTextArea = new JTextArea();
        eventTextArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(eventTextArea);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Panel for buttons
        JPanel buttonPanel = new JPanel();
        JButton addButton = new JButton("Add Event");
        JButton editButton = new JButton("Edit Event");
        JButton deleteButton = new JButton("Delete Event");

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addEvent();
            }
        });

        editButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                editEvent();
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteEvent();
            }
        });

        buttonPanel.add(addButton);
        buttonPanel.add(editButton);
        buttonPanel.add(deleteButton);

        frame.add(buttonPanel, BorderLayout.SOUTH);

        // Display the GUI
        frame.setVisible(true);
    }

    private void addEvent() {
        String eventName = JOptionPane.showInputDialog(frame, "Enter Event Name:");
        if (eventName != null && !eventName.isEmpty()) {
            String timestamp = getCurrentTimestamp();
            events.put(eventName, timestamp);
            updateEventTextArea();
        }
    }

    private void editEvent() {
        String eventName = JOptionPane.showInputDialog(frame, "Enter Event Name to Edit:");
        if (eventName != null && events.containsKey(eventName)) {
            String newEventName = JOptionPane.showInputDialog(frame, "Enter New Event Name:");
            if (newEventName != null && !newEventName.isEmpty()) {
                events.remove(eventName);
                events.put(newEventName, getCurrentTimestamp());
                updateEventTextArea();
            }
        } else {
            JOptionPane.showMessageDialog(frame, "Event not found.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void deleteEvent() {
        String eventName = JOptionPane.showInputDialog(frame, "Enter Event Name to Delete:");
        if (eventName != null && events.containsKey(eventName)) {
            events.remove(eventName);
            updateEventTextArea();
        } else {
            JOptionPane.showMessageDialog(frame, "Event not found.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private String getCurrentTimestamp() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return dateFormat.format(new Date());
    }

    private void updateEventTextArea() {
        eventTextArea.setText("");
        for (Map.Entry<String, String> entry : events.entrySet()) {
            eventTextArea.append(entry.getKey() + " - " + entry.getValue() + "\n");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EventSchedulerGUI();
            }
        });
    }
}
