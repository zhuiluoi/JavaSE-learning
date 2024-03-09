package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class AddOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("新增图书.....");
        int cur = bookList.getUsedSize();
        if (bookList.isFull()){
            System.out.println("满了，新增失败");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要新增图书的书名：");
        String bookName = scanner.nextLine();

        System.out.println("请输入你要新增图书的作者：");
        String author = scanner.nextLine();

        System.out.println("请输入你要新增图书的价格：");
        int price = scanner.nextInt();
        scanner.nextLine();
        System.out.println("请输入你要新增图书的类型：");
        String type = scanner.nextLine();

        Book book = new Book(bookName, author, price, type);
        bookList.setBook(cur, book);
        bookList.setUsedSize(cur+1);
        System.out.println("新增成功！");
    }
}
