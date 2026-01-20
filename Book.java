public class Book {
    private String title;
    private int totalBook;
    private int availableBook;

    public Book(String title,int totalBook) {
        this.title = title;
        this.totalBook = totalBook;
        this.availableBook = totalBook;
    }

    public Book(String title){
        this.title = title;
        this.totalBook = 0;
        this.availableBook = totalBook;
    }
    public Book(){
        this.title = "";
        this.totalBook = 0;
        this.availableBook = totalBook;
    }

    public String getTitle() {
        return title;
    }

    public int getTotalBook() {
        return totalBook;
    }

    public int getAvailableBook() {
        return availableBook;
    }
    public void borrowBook(){
        if(availableBook >0)
            totalBook -= 1;
    }
    public void returnBook(){
        if(availableBook<totalBook)
            availableBook += 1;
    }
}
