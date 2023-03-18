package AbstractInterface;

import javax.xml.namespace.QName;

//자바에서 다중상속을 불가하다
public class Cat extends Animal{
//    부모의 변수 + 메서드를 상속(생성자는 제외)
//    부모의 생성자를 상속받고 싶으면 자식클래스의 생성자에 super()를 추가, this()와 유사하게 이해하면 됨
//    접근범위 default
String nick_name = "야옹이cat";


//    private String name;
//    private int age;
    Cat(String name, int age){
        super(name, age);
//        suepr를 통해 아래와 같이 초기화 로직을 상속
//        super를 통해 private변수가 접근이 안됨에도, animal클래스가 초기화를 진행하므로
//        간접적으로 private변수도 사용할 수가 있게 된다
//        this.name = name;
//        this.age = age;
    }
//Animal 클래스에 abstract키워드로 인해 구현을 강제받고 있는 메서드
//    특정 메서드를 인터페이스화 시킨 방식
    @Override
    public void abstract_test() {

    }
//    @Override 어노테이션은 옵션
//    public void play() {
//        System.out.println("사뿐사뿐 걸어다닙니다.");
//    }

//    void play(){
//        super.play(); // 부모꺼를 그대로 가져다 쓰겠다는 의미
//    }
//    public void shape(){ //Animal에서 shape 앞에 final을 붙여서 오류뜸
//
//    }
    void cry(){
        System.out.println("야옹야옹");

    }


    //    private변수는 상속을 받지 못한다
    void test_print(){
//        System.out.println(name);
//        cat의 nick_name이 있으면 cat의 변수값,
        System.out.println(nick_name);
//        super 키워드를 통해 부모클래스의 변수임을 명시한것
        System.out.println(super.nick_name);
    }
}
//클래스안에 클래스가 더 있는 경우는, 내부클래스가 있는 경우
//한 클래스 내에 public 클래스는 1개만 가능
//인터페이스를 구현(implemants)하려면 반드시 인터페이스에 정의돈 모든 메서드를 구현해야한다
class Catimplements implements  AnimalInterface1{
//    메서드 override : 상속 또는 구현시 부모클래스(인터페이스)의 기능을 재정의 하는것
    @Override
    public void play() {
        System.out.println("사뿐사뿐 걸어다닙니다.");
    }

    @Override
    public void shape() {
        System.out.println("날렵하게 생겼습니다.");
    }

    @Override
    public void cry() {
        System.out.println("야옹야옹");
    }
    //자바에서 인터페이스 다중구현은 가능하다
//    어차피 구현은 부모의 메서드 구현 내용을 따지지 않기 때문에, 누구로부터 구현받았는지에 대한 혼선이 없음
    class CatMultiimplements implements  AnimalInterface1, AnimalInterface2 {

        @Override
        public void play() {

        }

        @Override
        public void shape() {

        }

        @Override
        public void cry() {

        }

        @Override
        public void weight() {

        }
    }
}
