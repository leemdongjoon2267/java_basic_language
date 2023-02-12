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

//        System.out.println("구구단을 입력하세요");
//        Scanner sc = new Scanner(System.in); // 입력 받을때는  out이 아니라 in
//        int input = sc.nextInt();
//
//        int num = 1;
//        while(num<10){
//            System.out.println(input+"X"+num+"="+input*num);
//            num = num + 1;
//        }

//        int i = 1;
//        int j = 9;
//        while(i<10){
//            System.out.println(i+"X"+j+"="+i*j);
//            i++;
//            j--;
//        }

        //        약수의 개수 구하기
//
//        System.out.println("아무 숫자를 입력해주세요");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//       // int n = 100;
//        int count = 0;
//        int x = 1;
//
//        while(x <= n){
//            if(n%x==0){
//                count++;
//            }
//            x++;
//        }
//        System.out.println(count);

//       사칙연산 프로그램 : while, switch
//        스캐너를 통해서 +-*/를 하나 입력
//        두개의 숫자 입력
//        while문은 무한 반복
//        while(true){
//            System.out.println("원하는 사칙연산은 입력하세요");
//            Scanner sc = new Scanner(System.in);
//            String str = sc.nextLine();
//            System.out.println("첫번째 숫자를 입력하세요");
//            double n = sc.nextDouble();
//            System.out.println("두번째 숫자를 입력하세요");
//            double x = sc.nextDouble();
//
//            double result = 0;
//
//            switch(str){
//                case "+" :
//                    result = (n+x);
//                    break;
//                case "-" :
//                    result = (n-x);
//                    break;
//                case "*":
//                    result = (n*x);
//                    break;
//                case "/" :
//                    result = (n/x);
//                    break;
//            }
//            System.out.println("결과는 :"+result);
//        }
//        변수의 유효범위는 {}까지만 유효하고 하위 depth에서는 상위 depth값을 알지만
//        싱으; depth에서는 하위 depth에서 선언된 값을 알지 못한다
//        int a = 0;
//        while(a>100){
//            System.out.println("hello"+a);
//            a++;
//        }
//        System.out.println(a);
//        for(int a=100; a>0; a--){
//            System.out.println("hello"+a);
//        }
//        System.out.println(a);



//        배열
//        int n1 = 10;
//        int n2 = 20;
//        int n3 = 30;
//        System.out.println(n1);
//        int[] arr1 = {10,20,30,40,50};
//        for(int i=0; i<arr1.length; i++){
//            arr1[i] = arr1[i]+10;
//            System.out.println(arr1[i]);
//        }

//        enhanced for문 : for each문
//        for(int a : arr1){
//            System.out.println(a);
//        }

//        String 타입의 배열로 "aaa", "bbb", "ccc", "ddd", "fff"를 담고  for each문으로 출력
//        String[] arr2 = {"aaa","bbb","ccc","ddd","fff"};
//        for(int i=0; i<arr2.length; i++){
//            System.out.println(arr2[i]);
//        }
//
//        for(String a : arr2){
//            System.out.println(a);
//        }

//        2중(다중) 반복문
//        int num = 2;
//        for(int i=1; i<10; i++){
//            System.out.println(num+"X"+i+"="+num*i);
//        }

        for(int i=2; i<10; i++){
            System.out.println(i+"단입니다.");
            for(int j=1; j<10; j++){
                System.out.println(i+"X"+j+"="+i*j);
            }
        }
    }
}
