package instance_class;

public class ClassIntro {
//    클래스는 변수와 함수의 집합
//    static이 붙으면 메서드가 아니라, 클래스 함수라 부른다
//    메서드는 클래스를 통해 만들어지 객체의 함수다
//    객체를 만들면 heap메모리 공간에 저장되어, 휘발되지 않는 성질을 가진다
//    만드는 방식은 new class명을 통해 생성하고 instance라고 부른다
    public static void main(String[] args) {

//        System.out.println(ClassInstanceDifference1.static_total);
//        Calculator c1 = new Calculator();
//        System.out.println(c1.instacne_total);


////        클래스 변수와 클래스 함수를 사용한 방식과 객체를 사용한 방식의 차이점
//        a회사의 재무처리를 한다
//        int totalA = ClassInstanceDifference1.static_add(10);
////        10
//        System.out.println(totalA);
//
//
////        b회사의 재무처리를 한다
//        int totalB = ClassInstanceDifference1.static_add(10);
////        20
//        System.out.println(totalB);

//        a회사
//        ClassInstanceDifference1 ci1 = new ClassInstanceDifference1();
//        System.out.println(ci1.instance_total);
//        ci1.instance_add(10);
//        System.out.println(ci1.instance_total);
//
////        b회사
//        ClassInstanceDifference1 ci2 = new ClassInstanceDifference1();
//        System.out.println(ci2.instance_total);
//        ci2.instance_add(10);
//        System.out.println(ci2.instance_total);


//        전형적인 객체형식 예제
        InstanceUserSample  user1 = new InstanceUserSample();
//        user1.whois("홍", "abc@naver.com", "aaa", 20);
//        user1.getUserInfo();
        user1.setName("홍길동");
        user1.setPassword("aaaa");
        System.out.println("이름은 : "+ user1.getName());
        System.out.println("비밀번호는 : "+ user1.getPassword());



//        두 수를 더하고, 거기에 2를 곱학소, 거기에 3을 또 더한 값을 구하라
//        1 지역변수를 활용한 return값 출력
//        ClassIntro c1 =new ClassIntro();
        int a = 10;
        int b = 20;
        int c = method0(a, b);
        System.out.println("지역변수 result :" +c);


//        지역변수를 쓰려다보니, 지역변수는 return을 받아 사용해야 했다
//        1.객체변수로 만들어보자. method1
//        2.클래스변수로 만들어서 사용해보자. method2
        ClassIntro c1 = new ClassIntro();
        c1.method1(a, b);
        System.out.println("c1.instance_result :" +c1.instance_result);

//        3.클래스변수로 만들어서 사용해보자. method2
        method2(a,b);
        System.out.println("static_result : " +static_result);
    }
    public   static int method0(int input1, int input2){ //static을 붙이면 위에 객체 생성 안하고 c1.을 안해도 됨
        int result = (input1 + input2)*2 +3;
        return result;
    }
    int instance_result = 0;
    public  void method1(int input1, int input2){
        this.instance_result = (input1 + input2)*2 +3;

    }
    static int static_result = 0;
    public  static void method2(int input1, int input2){
        int result = (input1 + input2)*2 +3;

    }
}
