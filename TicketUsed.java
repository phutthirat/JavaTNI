import javax.swing.JOptionPane;

public class TicketUsed {
    public static String show_movie_list(Ticket... tickets) {
        String list = "";
        for (Ticket t : tickets) {
            list += t.getTicket_id() + ": " + t.getMovie().toString() + "\n";
        }
        return list;
    }

    public static void main(String[] args) {
        Ticket[] tickets = {
                new Ticket("T001", new Movie("Titanic", 120, "PG-13"), "12:00", "B7", 280),
                new Ticket("T002", new Movie("Pokemon", 102, "PG"), "11:00", "G11", 240),
                new Ticket("T003", new Movie("Silent Hill", 125, "R-13"), "14:30", "H2", 240)
        };

        boolean keepRunning = true;
        while (keepRunning) {
            int confirm = JOptionPane.showConfirmDialog(null, "Do you want to book or use a ticket?", "Ticket", JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.YES_OPTION) {
                String movie_list = show_movie_list(tickets);
                String idInput = JOptionPane.showInputDialog(null, movie_list + "\nEnter a ticket id for booking:");

                Ticket selectedTicket = null;
                for (Ticket t : tickets) {
                    if (t.getTicket_id().equalsIgnoreCase(idInput)) {
                        selectedTicket = t;
                        break;
                    }
                }

                if (selectedTicket != null) {
                    String menu = JOptionPane.showInputDialog(null, selectedTicket.getMovie().toString() +
                            "\nPress 1 to book a ticket\nPress 2 to use a ticket\nPress 3 to see a ticket status\n\nEnter a menu:");

                    if ("1".equals(menu)) {
                        String result = selectedTicket.bookTicket();
                        JOptionPane.showMessageDialog(null, result + "\n----------------------\n" + selectedTicket.toString());
                    } else if ("2".equals(menu)) {
                        String result = selectedTicket.useTicket();
                        JOptionPane.showMessageDialog(null, result + "\n----------------------\n" + selectedTicket.toString());
                    } else if ("3".equals(menu)) {
                        JOptionPane.showMessageDialog(null, selectedTicket.toString());
                    }

                    int again = JOptionPane.showConfirmDialog(null, "Do you want to book or use other tickets?", "Ticket", JOptionPane.YES_NO_OPTION);
                    if (again == JOptionPane.NO_OPTION) keepRunning = false;
                } else {
                    JOptionPane.showMessageDialog(null, "Ticket ID not found.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "END PROGRAM");
                keepRunning = false;
            }
        }
    }
}