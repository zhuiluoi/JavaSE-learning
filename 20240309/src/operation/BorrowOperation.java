package operation;

import book.BookList;

import java.util.Scanner;

public class BorrowOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("借阅图书.....");
        System.out.println("请输入你要借阅的图书的书名：");
        String bookName = scanner.nextLine();
        int cur = bookList.getUsedSize();
        for (int i = 0; i < cur; i++) {
            if (bookList.getBook(i).getBookName().equals(bookName)) {
                bookList.getBook(i).setLend(true);
                System.out.println("借阅成功！");
                return;
            }
        }
        System.out.println("借阅失败！");
    }
}
