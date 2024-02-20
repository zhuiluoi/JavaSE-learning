public class Test {


    public static int test(int n)
    {
        if (n < 10) {
            return n;
        } else {
            return n % 10 + test(n / 10);
        }
    }

    //在同一个类中,分别定义求两个整数的方法 和 三个小数之和的方法。 并执行代码，求出结果
    public static int add(int a,int b) {
        return a+b;
    }

    public static double add(double a,double b,double c) {
        return a+b+c;
    }


    //在同一个类中定义多个方法：要求不仅可以求2个整数的最大值，还可以求3个小数的最大值？
    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    public static double max(double a,double b,double c) {
        return Math.max(Math.max(a, b), c);
    }

    //递归求 N 的阶乘
    public static int fact(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

    //递归求 1 + 2 + 3 + ... + 10
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sum(n - 1);
        }
    }

    //按顺序打印一个数字的每一位(例如 1234 打印出 1 2 3 4)    （递归）
    public static void printNum(int n) {
        if (n < 10) {
            System.out.print(n % 10 + " ");
        } else {
            printNum(n / 10);
            System.out.print(n % 10 + " ");
        }
    }

    //写一个递归方法，输入一个非负整数，返回组成它的数字之和
    public static int numSum(int n) {
        if (n < 10) {
            return n;
        } else {
            return n % 10 + numSum(n / 10);
        }
    }

    //递归求斐波那契数列的第 N 项
    public static int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }


    //递归求解汉诺塔问题
    public static void hanio(int n,char pos1,char pos2,char pos3) {
        if(n == 1) {
            move(pos1,pos3);
        }else {
            hanio(n-1,pos1,pos3,pos2);
            move(pos1,pos3);
            hanio(n-1,pos2,pos1,pos3);
        }
    }

    public static void move(char pos1,char pos2) {
        System.out.print(pos1+" -> "+pos2+" ");
    }

    public static void main(String[] args) {
        hanio(1,'A','B','C');
        System.out.println();
        hanio(2,'A','B','C');
        System.out.println();
        hanio(3,'A','B','C');
        System.out.println();
        hanio(4,'A','B','C');

    }
}
