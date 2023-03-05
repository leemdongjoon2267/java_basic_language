package instance_class;

public class ClassIntro {
//    static이 붙으면 메서드가 아니라, 클래스 함수라 부른다
//    메서드는 클래스를 통해 만들어지 객체의 함수다
//    객체를 만들면 heap메모리 공간에 저장되어, 휘발되지 않는 성질을 가진다
    public static void main(String[] args) {

        System.out.println(Calculator.total);
//        Calculator c1 = new Calculator();
//        System.out.println(c1.instacne_total);


////        클래스 변수와 클래스 함수를 사용한 방식의 문제점
////        a회사의 재무처리를 한다
//        int total_a = Calculator.add(10);
//        System.out.println(total_a);
//
////        b회사의 재무처리를 한다
//        int total_b = Calculator.add(10);
//        System.out.println(total_b);
//        System.out.println(Calculator.total);


//        클래스의 복제본을 만드는게 객체이고,
//        각변수명을  calA.instance_total calB.instance_total 등 따로 관리하게 된다
        Calculator calA = new Calculator();
         calA.instance_add(10);
        System.out.println(calA.instance_total);

        Calculator calB = new Calculator();
         calB.instance_add(10);
        System.out.println(calB.instance_total);
    }
}
