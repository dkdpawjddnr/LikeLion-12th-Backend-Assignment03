package scanner;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        //Scanner 예제2
        //이번에는 Scanner 를 활용하는 간단한 예제를 만들어보자.
        //두 수를 입력받고 그 합을 출력하는 예제이다

        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번째 숫자를 입력하세요: ");
        int num1 = scanner.nextInt();

        System.out.print("두번째 숫자를 입력하세요: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        System.out.print("두 숫자의 합 : " + sum);
    }
}
