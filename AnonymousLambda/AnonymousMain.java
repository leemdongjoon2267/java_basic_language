package AnonymousLambda;

import java.sql.SQLOutput;

public class AnonymousMain {
    public static void main(String[] args) {

//        일반객체
//        Anonymous a1 = new Anonymous();
//        System.out.println(a1.getNum());
//        System.out.println(a1.getClass()); //Class의 이름을 출력하는 함수
//
////        익명객체 : 상속을 받긴 받으나, 상속의 형태가 아님
////        참조변수의 타입이 Class로 출력되지 않고, 실행하고 있는 클래스의 이름이 출력됨
////        즉, 본래의 이름을 잃어버린 익명클래스(객체)가 됨
//        Anonymous a2 = new Anonymous(){
//            private  int num = 2;
//            @Override
//            public int getNum(){
//                return  this.num;
//            }
//        };
//        System.out.println(a2.getNum());
//        System.out.println(a2.getClass());

//        AnimalInterface ai = new AnimalInterface() {
//            @Override
//            public void cry() {
//                System.out.println("야옹야옹");
//            }
//        };
//        ai.cry();

//        익명객체방식에서 익명함수 방식으로의 전환 즉, 메서드에 이름이 없다는 뜻
//        매개변수의 타입/개수만으로도 메서드를 구분지을 수 있을때 익명함수를 쓸 수 있음
        AnimalInterface ai2 = (String a) -> System.out.println(a+"야옹야옹");
        ai2.cry("abc");
    }
}
