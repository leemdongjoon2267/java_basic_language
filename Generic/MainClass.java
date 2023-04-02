package Generic;

public class MainClass {
    public static void main(String[] args) {
        GenericClass gc = new GenericClass();
        gc.setName("abc");
        gc.setAge(20);
        System.out.println("이름 : " + gc.getName() + " 나이 : " + gc.getAge());

    }
}
