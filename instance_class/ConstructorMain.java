package instance_class;

public class ConstructorMain {
    public static void main(String[] args) {

//        ConstructorTest ct1 = new ConstructorTest(); //기본 생성자가 있어야 사용가능
//        System.out.println(ct1.getPassword());
//        System.out.println(ct1.getAge());

        ConstructorTest ct2 = new ConstructorTest("aaaa",20);
        System.out.println(ct2.getPassword());
        System.out.println(ct2.getAge());

    }
}
