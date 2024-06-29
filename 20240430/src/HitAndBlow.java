import java.util.Random;
import java.util.Scanner;

public class HitAndBlow {
    public static void main(String[] args) {
        int size = 4;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] answer = new int[size];
        for (int i = 0; i < size; i++) {
            int digit;
            do {
                digit = random.nextInt(10);
            } while (contains(answer, digit));
            answer[i] = digit;
        }

        int[] num = new int[size];

        int hit = 0;
        int blow;

        while (hit != 4) {
            System.out.print("4桁の数字を入力してください (重複なし):");
            hit = 0;
            blow = 0;
            int x = scanner.nextInt();
            int i = 3;
            while (x != 0) {
                num[i] = x % 10;
                x /= 10;
                i--;
            }
            for (int j = 0; j < num.length; j++) {
                if (num[j] == answer[j]) {
                    hit++;
                } else if (contains(answer, num[j])) {
                    blow++;
                }
            }
            System.out.println(hit + " Hit " + blow + " Blow");
        }
        System.out.println("おめでとう！正解です！");

    }

    public static boolean contains(int[] array, int num) {
        for (int i : array) {
            if (i == num) {
                return true;
            }
        }
        return false;
    }

}
