package operation;

import book.BookList;

import java.util.Scanner;

public class FindOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        Scanner scanner = new Scanner(System.in);
        int cur = bookList.getUsedSize();
        System.out.println("寻找图书.....");
        System.out.println("请输入你要查找的图书的书名：");
        String bookName = scanner.nextLine();
        for (int i = 0; i < cur; i++) {
            if (bookList.getBook(i).getBookName().equals(bookName)) {
                System.out.println("找到了");
                System.out.println(bookList.getBook(i));
                return;
            }
        }
        System.out.println("没找到！！");
    }
}
