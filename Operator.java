public class Operator {
    public static void main(String[] args) {

//        산술연산자 : + - * / %
//        int num1 = 8;
//        int num2 = 3;
//        String result = "+연산자에 의한 결과 : " +(num1+num2);
//        System.out.println(result);
//        System.out.println("-연산자에 의한 결과 : " +(num1-num2));
//        System.out.println("*연산자에 의한 결과 : " +(num1*num2));
//        System.out.println("/연산자에 의한 결과 : " +(num1/num2));
//        System.out.println("%연산자에 의한 결과 : " +(num1%num2));

//        문자더하기, 숫자더하기
//        int num1 = 10;
//        String s1 = "20";
//        System.out.println(num1 + s1);

//        대입연산자
//        int num1 = 7, num2 = 7, num3 = 7;
//        num1 = num1 -3;
//        num2 -= 3;
//        num3 =- 3;
//        System.out.println("- 연산자에 의한 결과 : "+num1);
//        System.out.println("-= 연산자에 의한 결과 : "+num2);
//        System.out.println("=- 연산자에 의한 결과 : "+num3);

//        논리연산자
//        주의해야할 기호 : !=, <=
//        int num1 = 10, num2 = 20, num3 = 20;
//        boolean b1 = true;
//        if(!(num1<num2 || num2<num3)){
//            System.out.println("참입니다");
//        }else{
//            System.out.println("거짓입니다");
//        }

//        a++연산, ++a연산은 다르다.
//        a++연산은 후연산, ++a는 선연산

//        int a = 10;
//        a = a + 1;
//        System.out.println(a);
//        a++;
//        System.out.println(a);
//        ++a;
//        System.out.println(a);
//        아래식의 경우 두개의 연산이 수행되는 것으로 문제가 발생할 수 있다
//        System.out.println(a++);

//        상항연산자 : 3개의 항이 있는 연산자, if문과 연동
//        조건식? 참이면 : 거짓이면
        int a = 10;
        int b = 20;
        int c;
        c= a > b ? 100 : 0; // a가 b보다 크면 100 아니면 0
//        아래 if문과 완전히 동일한 문법
        if(a>b){
            c=100;
        }else{
            c=0;
        }
    }
}
