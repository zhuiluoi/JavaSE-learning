package operation;

import book.BookList;

public class ShowOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("显示图书.....");
        int cur = bookList.getUsedSize();
        for (int i = 0; i < cur; i++) {
            System.out.println(bookList.getBook(i));
        }
    }
}
