package AbstractInterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AbstractMain {
    public static void main(String[] args) {
//        Animal a1 = new Animal();
//        a1.play();
//        a1.shape();
//
//        Cat c1 = new Cat();
//        c1.play();
//        c1.shape();
//        c1.cry();
//
//        Dog d1 = new Dog();
//        d1.play();
//        d1.shape();
//        d1.cry();
//
////        객체타입을 CatImplements할수도 있지만, AnimalInterface1으로 할수도 있다
//        AnimalInterface1 ci1 = new Catimplements();
//        ci1.play();
//        ci1.shape();
//        ci1.cry();
////        List는 인터페이스이고 , ArrayLust, LinkedList등 구현체들에게 메서드 overriding을 강제한다
//        List<String> lst = new ArrayList<>();

//        상속에서의 super()
//        Cat c1 = new Cat("야옹이1", 10);
//        System.out.println(c1.getName());
//        c1.test_print();
//
//        AccessControll테스트
        AccessControll ac = new AccessControll();
        System.out.println(ac.name1);
        System.out.println(ac.name2);
        System.out.println(ac.name3);


//        final 키워드는 변수, 메서드, 클래스에 모두 적용 가능
//        주로 변수 앞에 변경불가능한 상수를 나타내는 키워드로 사용
//        클래스 앞에 붙으면 상속불가, 메서드 앞에 붙으면 오버라이딩 불가
        final String s1 = "abc";
//        s1 = "abc2"; // 앞에 fianl이 붙어서 상수를 재정의하는 것이 불가
    }
}
