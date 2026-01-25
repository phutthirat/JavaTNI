import javax.swing.*;

public class BookInventory {
    public static void main(String[] args) {
        Book books[] = new Book[3];

        for(int i = 0; i < books.length; i++) {
            String book_title = JOptionPane.showInputDialog("Enter book title:");
            int book_totalnumber = Integer.parseInt(JOptionPane.showInputDialog("Enter the total number"));
            books[i] = new Book(book_title,book_totalnumber);

        }
        for(Book each_book : books){
            System.out.println(each_book.getTitle() + " has " +each_book.getTotalBook() + " book,can borrow "
                    + each_book.getAvailableBook()+" books.");

        }

    }

}