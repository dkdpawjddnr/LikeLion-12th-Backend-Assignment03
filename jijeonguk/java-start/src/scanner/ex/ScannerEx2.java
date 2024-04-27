package scanner.ex;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        //문제 - 홀수 짝수
        //사용자로부터 하나의 정수를 입력받고, 이 정수가 홀수인지 짝수인지 판별하는 프로그램을 작성하세요.
        //실행 결과 예시 ```
        //하나의 정수를 입력하세요:1
        //입력한 숫자 1는 홀수입니다. ```
        //실행 결과 예시 ```
        //하나의 정수를 입력하세요:4
        //입력한 숫자 4는 짝수입니다.
        Scanner scanner = new Scanner(System.in);

        System.out.print("하나의 정수를 입력하세요 : ");
        int intValue = scanner.nextInt();

        if (intValue%2 ==0){
            System.out.println("입력한 숫자" + intValue + "는 짝수입니다.");
        } else {
            System.out.println("입력한 숫자" + intValue + "는 홀수입니다.");
        }
    }
}
