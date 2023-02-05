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
        int num1 = 10, num2 = 20, num3 = 20;
        boolean b1 = true;
        if(!(num1<num2 || num2<num3)){
            System.out.println("참입니다");
        }else{
            System.out.println("거짓입니다");
        }

    }
}
