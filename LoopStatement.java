import java.util.Scanner;

public class LoopStatement {
    public static void main(String[] args) {
//        int num에 숫자가 주어졌을때
//        해당 숫자를 가지고 n*1, n*2 ... n*9 단을 출력해보자
//        반복문 쓰지 말고, println을 9개 써서 만들자

//        System.out.println("구구단을 입력하세요");
//        Scanner sc = new Scanner(System.in); // 입력 받을때는  out이 아니라 in
//        int num = sc.nextInt();
//        System.out.println(num+"x1 = " + num*1);
//        System.out.println(num+"x2 = " + num*2);
//        System.out.println(num+"x3 = " + num*3);
//        System.out.println(num+"x4 = " + num*4);
//        System.out.println(num+"x5 = " + num*5);
//        System.out.println(num+"x6 = " + num*6);
//        System.out.println(num+"x7 = " + num*7);
//        System.out.println(num+"x8 = " + num*8);
//        System.out.println(num+"x9 = " + num*9);

//        반복문 사용
//        for문
//        System.out.println("구구단을 입력하세요");
//        Scanner sc = new Scanner(System.in); // 입력 받을때는  out이 아니라 in
//        int num = sc.nextInt();
//
//        for(int i=1; i<10; i++){
//            System.out.println(num*i);
//        }

        System.out.println("구구단을 입력하세요");
        Scanner sc = new Scanner(System.in); // 입력 받을때는  out이 아니라 in
        int input = sc.nextInt();

        int num = 1;
        while(num<10){
            System.out.println(input+"X"+num+"="+input*num);
            num = num + 1;
        }
    }
}
