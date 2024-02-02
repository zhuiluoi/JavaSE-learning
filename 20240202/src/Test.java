import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("请输入n的值");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fib(n));

    }

    public static int fib(int n) {
        int a = 0;
        int b = 1;

        if (n == 0) {
            return a;
        } else if (n == 1) {
            return b;
        } else {
            int tmp = 0;
            for (int i=2;i<=n;i++) {
                tmp = b;
                b = a + b;
                a = tmp;
            }
            return b;
        }
    }



    public static int max2(int a, int b) {
        return Math.max(a, b);
    }

    public static int max3(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }

    public static void main7(String[] args) {
        System.out.println("请输入两个数");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(max2(a, b));
        System.out.println("请输入三个数");
        a = sc.nextInt();
        b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(max3(a, b, c));
    }



    public static void main6(String[] args) {
        System.out.println("请输入一个数");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while (a != 0) {
            System.out.printf("%d, ", a % 10);
            a /= 10;
        }
    }



    public static void main5(String[] args) {
        String key = "a123456";
        int count = 0;
        System.out.println("请输入密码");
        Scanner sc = new Scanner(System.in);
        while (count != 3) {
            String a = sc.nextLine();
            if (a.equals(key)) {
                System.out.println("登录成功!");
                break;
            } else {
                count++;
                System.out.printf("密码错误，还有%d次机会", 3 - count);
                System.out.println();
            }
        }

    }





    public static void main4(String[] args) {
        double sum = 0;
        for (int i=1; i<=100; i++) {
            if (i % 2 == 0) {
                sum -= 1.0 / i;
            } else {
                sum += 1.0 / i;
            }
        }
        System.out.println(sum);
    }




    public static void main3(String[] args) {
        Random random = new Random();
        int toGuess = random.nextInt(100);
        System.out.println("请输入你猜的数字(1-100)");
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n > toGuess) {
                System.out.println("大了");
            } else if (n > toGuess) {
                System.out.println("大了");
            } else {
                System.out.println("猜对了!");
                break;
            }
        }
        sc.close();
    }


    public static void main2(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            for(int i = 0; i < n; i++ ){
                for(int j = 0; j < n; j++){
                    if(i==j || (i+j) == n-1 ){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

    }

    public static void main1(String[] args) {
        int count = 0;
        for (int i=1; i<=100; i++) {
            int tmp = i;
            while (tmp != 0) {
                if (tmp % 10 == 9) {
                    count++;
                }
                tmp /= 10;
            }
        }
        System.out.println(count);
    }
}
