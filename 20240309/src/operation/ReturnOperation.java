package operation;

import book.BookList;

import java.util.Scanner;

public class ReturnOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("归还图书.....");
        System.out.println("请输入你要归还的图书的书名：");
        String bookName = scanner.nextLine();
        int cur = bookList.getUsedSize();
        for (int i = 0; i < cur; i++) {
            if (bookList.getBook(i).getBookName().equals(bookName)) {
                bookList.getBook(i).setLend(false);
                System.out.println("归还成功！");
                return;
            }
        }
        System.out.println("归还失败！");

    }
}
