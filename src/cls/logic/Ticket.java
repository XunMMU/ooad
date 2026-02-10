package src.cls.logic;

import java.time.LocalDateTime;

public class Ticket {

    private String ticketId;
    private LocalDateTime entryTime;

    public Ticket(String plateNumber, String spotId) {
        this.entryTime = LocalDateTime.now();
        // Format: T-PLATE-TIMESTAMP [cite: 76]
        this.ticketId = "T-" + plateNumber + "-" + System.currentTimeMillis();
    }

    public String getTicketId() {
        return ticketId;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    // Helper for testing fines (simulates entering X hours ago)
    public void simulateTimePassage(long hours) {
        this.entryTime = this.entryTime.minusHours(hours);
    }
}
