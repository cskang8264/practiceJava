import java.util.Scanner;

public class practice1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("단수를 입력해주세요.");
        int dan = sc.nextInt();

        for (int i = 1; i < 10; i++) {
            System.out.println(dan + "*" + i + "=" + dan*i);
        }

    }
}
