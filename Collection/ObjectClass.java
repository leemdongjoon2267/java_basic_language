package Collection;

public class ObjectClass {
    public static void main(String[] args) {
        String a = "abc";
        int num = 10;
//        Integer.toString(num);
//        자바의 모든 클래스의 조상클래스는 Object
//        심지어, 별도로 만든 개별클래스의 부모도 extends Object가 생략되있는것
        Player p = new Player();
        p.toString();

//        equals()등 총 11개의 메서드가 Object클래스내에 내장되어있음
    }


}
