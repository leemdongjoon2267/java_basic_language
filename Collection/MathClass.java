package Collection;

import java.lang.invoke.CallSite;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MathClass {
    public static void main(String[] args) {
//        Math.random()은 임의의 double형 실수값을 반환하는 것
//        double temp = Math.random();
//        System.out.println(temp);
////        0~99까지 임의 수를 출력
//        int result = (int)(Math.random()*100);
//        System.out.println(result);
//
////        Math.abs()는 절대값을 반환하는 함수
//        int input = -100;
//        System.out.println(Math.abs(input));

        double d1 = 0.1234;
//        Math.floor() : 내림, Math.ceil() : 올림, Math.round() : 반올림
        System.out.println(Math.floor(d1));
        System.out.println(Math.ceil(d1));
        System.out.println(Math.round(d1));
//        소수3번째 자리 반올림하도록 로직을 짜보자
        System.out.println((double)Math.round(d1*100)/100);

//        Math.max는 둘중에 더 큰값, Max.min은 둘중에 더 작은값
        System.out.println(Math.max(1.03, 1.06));

//        Math.pow는 제곱 연산, Math.sqrt()는 제곱근 연산
        System.out.println(Math.pow(10, 2));
        System.out.println(Math.sqrt(10));
        char a ='a';
        System.out.println(Character.toString(a).getClass());

        List<Integer> lst = new ArrayList<>(Arrays.asList(10,20,30));
        for(int l : lst){
            System.out.println(l);
        }
    }
}
