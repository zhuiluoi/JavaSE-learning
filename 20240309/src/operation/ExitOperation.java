package operation;

import book.BookList;

public class ExitOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("退出系统.....");
        int cur = bookList.getUsedSize();
        for (int i = 0; i < cur; i++) {
            bookList.setBook(i, null);
        }
        System.exit(0);
    }
}
