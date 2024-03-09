package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class DelOperation implements IOperation{
        @Override
        public void work(BookList bookList) {
                Scanner scanner = new Scanner(System.in);
                int cur = bookList.getUsedSize();
                int pos = -1;
                System.out.println("删除图书.....");
                System.out.println("请输入你要删除的图书的书名：");
                String bookName = scanner.nextLine();
                int i = 0;
                for (; i < cur; i++) {
                        Book book = bookList.getBook(i);
                        if (book.getBookName().equals(bookName)) {
                                pos = i;
                                break;
                        }
                }
                if (i >= cur) {
                        System.out.println("没有你要找的书！");
                }
                for (int j = pos; j < cur-1; j++) {
                        Book book = bookList.getBook(j+1);
                        bookList.setBook(j, book);
                }
                bookList.setUsedSize(cur-1);
                bookList.setBook(cur-1, null);
                System.out.println("删除成功！");
        }
}
