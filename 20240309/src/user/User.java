package user;

import book.BookList;
import operation.IOperation;

public abstract class User {

    protected String name;
    protected IOperation[] iOperation;
    public User(String name) {
        this.name = name;
    }

    public void doIOperation(int choice, BookList bookList) {
        this.iOperation[choice].work(bookList);
    }

    public abstract int menu();
}
