package book;

public class Book {
    private String bookName;
    private String author;
    private int price;
    private String type;
    private boolean isLend;

    public Book(String bookName, String author, int price, String type) {
        this.bookName = bookName;
        this.author = author;
        this.price = price;
        this.type = type;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isLend() {
        return isLend;
    }

    public void setLend(boolean lend) {
        isLend = lend;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", " + (isLend == true ? "已借出" : "未借出") +
                '}';
    }
}
