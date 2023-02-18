import java.util.Arrays;
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

//        for(int i=2; i<10; i++){
//            System.out.println(i+"단입니다.");
//            for(int j=1; j<10; j++){
//                System.out.println(i+"X"+j+"="+i*j);
//            }
//        }

//        배열
//        int[] arr = {100,20,30,60,80,20};
////        총합
//        int sum = 0;
////        for(int i : arr){
////            sum = sum+i;
////        }
//        for(int i=0; i<arr.length; i++){
//            System.out.println(arr[i]);
////            sum = arr[0]+arr[1]+arr[2]+arr[3]+arr[4]+arr[5];
//            sum = sum+arr[i];
//        }
//        System.out.println("총합 : "+sum);
////        평균
//        double average = (double)sum/arr.length;
//        System.out.println("평균 :"+(double)average);
////        최대값, 최소값
//        int max = arr[0];
//        for(int i=0; i<arr.length; i++){
//           if(arr[i]> max){
//               max = arr[i];
//           }
//        }
//        System.out.println("최대값 : "+max);
//        int min = arr[0];
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]< min){
//                min = arr[i];
//            }
//        }
//        System.out.println("최소값 : "+min);

//        최대공약수, 최소공배수
//        int a = 10; // 1,2,5,10
//        int b = 20; // 1,2,4,5,10,20
//       int num = a < b ? a : b;
//       int max = 0;
//       for(int i=1; i<=num; i++){
//            if (a % i == 0 && b % i == 0) {
//                max = i;
//            }
//        }
//       int min = max*(a/max)*(b/max);

//        int[] arr = {30,45,150,75,300};
//        int num = Arrays.stream(arr).min().getAsInt();
//        int max = 0;
//        for(int i=1; i<=num; i++){
//            boolean trueOrNot = true;
//            for(int a : arr){
//                if(a % i !=0){
//                    trueOrNot = false;
//                }
//            }
//            if(trueOrNot == true){
//                max = i;
//            }
//        }
//        System.out.println(max);
//
//        int min = max;
//        min *= max;
//        for(int a : arr){
//            min *= a/max;
//        }
//        System.out.println(max);
//        System.out.println(min);

//        배열의 자리 바꿈
//        int [] arr = {10,20,30,40,50}; // 20,30,40,50,10 으로 바꿔주기
//        System.out.println(Arrays.toString(arr)); // 배열의 값이 뭐가 있는지 출력해줌
//        //int temp = arr[0]; // temp : 임시값
//        for(int i=0; i<arr.length-1; i++){
//            int temp = arr[i];
//            arr[i] = arr[i+1]; // +1해줄때는 -1도 같이 해줘야함
//            arr[i+1] = temp; // 자리 교환
//
//        }
//        버블 소트
//        if(arr[i]<arr[i+1])
//        버블소트를 사용 안하면 2중포문 + 뒷자리가 차면 그 횟수만큼 줄어들어야 하는 것도 감안
//        System.out.println(Arrays.toString(arr));

//        버블 소트
//        int [] arr = {50,60,40,70,10,20};
//        int count = 0;
//        System.out.println(Arrays.toString(arr));
//        for(int i=1; i<=arr.length-1; i++){
//           for(int j=0; j<arr.length-i; j++){
//               if(arr[j]>arr[j+1]){
//                   int temp = arr[j+1];
//                   arr[j+1] = arr[j];
//                   arr[j] = temp;
//               }
//               count++;
//           }
//        }
//        System.out.println("반복횟수는 : "+count);
//        System.out.println(Arrays.toString(arr));


//        1번반복
        int [] arr = {10,20,30,40,50,60};
        for(int i=1; i<=arr.length-1; i++) {
            Boolean trueOrNot = true;

                for (int j = 0; j < arr.length - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j + 1];
                        arr[j + 1] = arr[j];
                        arr[j] = temp;
                        trueOrNot = false;
                    }
                }
            if(trueOrNot == true){
                break;
            }
            }

        System.out.println(Arrays.toString(arr));
    }
}
