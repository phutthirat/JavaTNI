import javax.swing.JOptionPane;

public class ReturnBookTest {
    public static void main(String[] args) {
        Book book = new Book("Java Programming", 5);

        while (true) {
            int confirm = JOptionPane.showConfirmDialog(null,
                    "Do you want to borrow/return Book", "Borrow/Return Book",
                    JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.YES_OPTION) {
                String menuInput = JOptionPane.showInputDialog(null,
                        "Press 1 to borrow book\nPress 2 to return book");

                if (menuInput == null) continue;

                if (menuInput.equals("1")) {
                    if (book.getAvailableBook() > 0) {
                        book.borrowBook();
                        System.out.println("Borrowed 1 book, available " + book.getAvailableBook() + " books.");
                    } else {
                        JOptionPane.showMessageDialog(null, "No books available to borrow...",
                                "Warning Message", JOptionPane.WARNING_MESSAGE);
                    }
                } else if (menuInput.equals("2")) {
                    if (book.getTotalBook() == book.getAvailableBook()) {
                        JOptionPane.showMessageDialog(null, "Cannot return! All books are already here.",
                                "Warning Message", JOptionPane.WARNING_MESSAGE);
                    } else {
                        book.returnBook();
                        System.out.println("Returned 1 book, available " + book.getAvailableBook() + " books.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "END PROGRAM");
                    break;
                }
            } else {
                JOptionPane.showMessageDialog(null, "END PROGRAM");
                break;
            }
        }
    }
}
