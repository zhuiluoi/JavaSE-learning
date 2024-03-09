package book;

public class BookList {
    private Book[] bookList = new Book[10];
    private int usedSize;


    public BookList() {
        bookList[0] = new Book("三国演义", "罗贯中", 10, "小说");
        bookList[1] = new Book("西游记", "吴承恩", 9, "小说");
        bookList[2] = new Book("红楼梦", "曹雪芹", 11, "小说");
        this.usedSize = 3;
    }

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }

    public Book getBook(int pos) {
        return bookList[pos];
    }

    public void setBook(int pos, Book book) {
        this.bookList[pos] = book;
    }

    public boolean isFull() {
        return usedSize >= bookList.length;
    }
}
