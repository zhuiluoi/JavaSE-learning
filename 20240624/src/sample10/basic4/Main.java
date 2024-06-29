package sample10.basic4;

import java.time.LocalDate;

public class Main{
    public static void main(String[] args) {
        LocalDate localDate1 = LocalDate.of(2002,6,5);
        LocalDate localDate2 = LocalDate.of(2001,6,5);
        User user1 = new User("Enryo", "Inoue", localDate1);
        User user2 = new User("Yukichi", "Fukuzawa", localDate2);

        System.out.printf("Id : %d \n", user1.getId());
        System.out.printf("Name : %s \n", user1.getName());

        System.out.printf("Id : %d \n", user2.getId());
        System.out.printf("Name : %s \n", user2.getName());
        System.out.println();

        System.out.println(user1.getAge(LocalDate.now()));
        System.out.println(user2.getAge(LocalDate.now()));
    }
}