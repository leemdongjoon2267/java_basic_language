import java.math.BigDecimal;
import java.util.Scanner;

// java 변수 기초에 대한 클래스입니다.
public class Valieables {
    public static void main(String[] args) {
//        int라는 뜻은 a의 값이 정수값이 되어야 한다는 선언
//        a = 3의 의미는 오른쪽의 3의 값은 왼쪽의 a변수에 대입한다는 의미
//        int a  = 3;
//      a = a + 1은 오른쪽의 a + 1을 왼쪽의 a에 대입한다는 뜻
//        오른쪽의 a + 1은 현재 시점에서 3+1이므로 a는 4로 재정의 된다
//        아래의 문구는 a를 1만큼 증가시킬때 관용적을 굉장히 많이 사용
//    a = a + 1;
//    변수의 명명규칙
//    숫자로 시작할 수 없다, 띄어쓸 수 없다
//     System.out.println(a);
//    의미가 달라지는 단어 두개가 합쳐질때는 아래와 같이 대문자 하나로 구분
//        int abcAlphabet = 3;
//     자바에서 약속된 예야억를 변수으로 쓰면 안된다
//       변수 선언방법1
//        초기화 동시에 값 할당
//        byte num2 = 127;
//        변수 선언방법2
//        초기화 따로 값 할당 따로
//        num2 = 127;
//        System.out.println(num2);

//        byte num3 = 127;
//        아래는 오버플로우로 인해 에러가 발생 byte 범위는 -128~127
//        num3 = num3 +1;

//        정수 : int, Long
//        int를 많이 사용, 오버플로우나면 Long을 사용
//        Long 타입의 경우 숫자 뒤에 L을 붙여줘서 명시적으로 구분
//        Long L1 = 10L;
//        System.out.println(L1);

//        실수 :float, double
//        실수는 double을 많이 사용한다, float을 사용할 경우 관용적으로 f로 구분
//        float는 소수점 6자리다 보니, 오버플로우 발생
//        float f1 =1.23456789f;
//        double d1 = 1.23456789;
//        System.out.println(f1);
//        System.out.println(d1);

//        부동 소수점 : 컴퓨터에서는 2진체계의 연산을 하다보니, 소수점 계산은 필연적으로 오차 발생

//        double num = 0;
//        for(int i=0; i<1000; i++){
//            num = num + 0.1;
//        }
//        System.out.println("num : "+num);

//        10의자리를 곱하여 소수점 자리를 없애고, 10으로 다시 나누는 방식을 쓰게 되면, 소수점 연산의 오류를 해결할 수 있다

//        double d1 = 0.1;
//        double d2 = 0.2;
//
//        System.out.println((d1*10+d2*10)/10);

//        소수점 자리 해결을 위해 BigDecimal이라는 라이브러리 사용
//        BigDecimal d3 = new BigDecimal( "0.1");
//        BigDecimal d4 = new BigDecimal( "0.2");
//        System.out.println(d3.add(d4));

//        문자의 기본형은 char이고 한글자를 쓸때 사용한다
//        쌍따옴표가 아니라, 작은 따옴표를 통해 글자를 표현
//        String은 쌍따옴표 사용, 한글자이상
//        char c1 = 'a';
//        int n1 = c1;
//        System.out.println(c1);
//        System.out.println(n1);

//        double -> int?
//        int -> double?
//        묵시적 타입변환
//        int n1 = 10;
//        double d1 = n1;
//        System.out.println(d1);

//        명시적 타입변환
//        int n1 = 1;
//        int n2 = 4;
////        int / int의 결과 값은 int이므로 0이 담이게 된다
//        double d1 = n1/n2;
//        System.out.println(d1);
////        (double)을 통해 명시적으로 double로 타입변환 하였으므로, double / int 하여 double 결과값이 나오게 된다
//        double d2 = (double)n1/n2;
//        System.out.println(d2);

//        null 데이터가 없다는 명시적인 표현
//        String s1 = null;
//        System.out.println(s1);

//        boolea은 true / false 2가지
//        int n1 = 10;
//        int n2 = 20;
//        int n3 = 30;
//        if(n1<n2 && n2<n3){
//            System.out.println("참입니다");
//        }else{
//            System.out.println("거짓입니다");
//        }

//        System.out.println("숫자 2개를 입력해주세요");
//        System.out.println("첫번째 숫자를 입력해주세요");
//        Scanner sc1 = new Scanner(System.in); // 입력 받을때는  out이 아니라 in
//        int firstNum = sc1.nextInt();
//        System.out.println("firstNum : "+firstNum);
//        System.out.println("두번째 숫자를 입력해주세요");
//        Scanner sc2 = new Scanner(System.in); // 입력 받을때는  out이 아니라 in
//        int secondNum = sc2.nextInt();
//        System.out.println("secondNum : "+secondNum);
//
//        if(firstNum<secondNum){
//            System.out.println("큰수는 : " +secondNum);
//        }else{
//            System.out.println("큰수는 : "+firstNum);
//        }

//        변수란 변할 수 있는 숫자, 상수는 변할 수 없는 숫자(final), 자바 상수는 대문자로 선언
        int n1 = 20;
        n1 = 30;
        n1 = n1 + 10;
        System.out.println(n1);

//        final을 통해서 변할 수 없는 상수값을 지정
        final int BUSFEE = 1000;

//        상수값은 선언과 초기화가 따로 될 수는 없다





        }
}
