import javax.swing.JOptionPane;

public class TicketBooking {

    public static String select_showtime(Movie movie) {
        String menu = movie.toString() + "\nPress 1 to select 13:00\nPress 2 to select 14:30\nPress 3 to select 15:00\nEnter a number:";
        String choice = JOptionPane.showInputDialog(null, menu);
        if ("1".equals(choice)) return "13:00";
        if ("2".equals(choice)) return "14:30";
        if ("3".equals(choice)) return "15:00";
        return "Error time";
    }

    public static String select_seat_number() {
        String row = JOptionPane.showInputDialog(null, "Select seat row [A-G]:");
        String number = JOptionPane.showInputDialog(null, "Select seat number [1-12]:");
        return (row != null) ? row.toUpperCase() + number : "";
    }

    public static void main(String[] args) {
        Movie movie = new Movie("Titanic", 120, "PG-13");
        String show_time = select_showtime(movie);
        String seat_number = select_seat_number();
        Ticket ticket = new Ticket("T001", movie, show_time, seat_number, 240.0);

        int confirm = JOptionPane.showConfirmDialog(null,
                "Do you want to book a " + movie.getTitle() + " ticket?",
                "Book Ticket", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            String bookingResult = ticket.bookTicket();
            JOptionPane.showMessageDialog(null, bookingResult);
        }

        JOptionPane.showMessageDialog(null, ticket.toString());
    }
}