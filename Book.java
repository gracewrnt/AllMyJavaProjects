public class Book {
    //Field
    String bookName,languague,author;
    int publishYear,pages;
    private int price;
    //Method
    int getPrice()
    {
        return price;
    }
    //Constructor Method
    Book(String bookName) 
    {
        this.bookName = bookName;
    }
    Book(String author,String bookName)
    {
        this.bookName = bookName;
        this.author = author;
    }
}
