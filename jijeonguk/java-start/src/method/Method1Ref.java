package method;

public class Method1Ref {
    public static void main(String[] args) {
        //계산1
        int sum = add(5,10);
        System.out.println("결과1 출력:" + sum);
        //계산2
        int sum2 = add(10,100);
        System.out.println("결과2 출력:" + sum2);
    }

    //add 메서드
    public static int add(int a, int b) {
        System.out.println(a + "+" + b + " 연산 수행");
        int sum = a+b;
        return sum;
    }
}
