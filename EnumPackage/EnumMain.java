package EnumPackage;

public class EnumMain {
    public static void main(String[] args) {
//        Student s1 = new Student();
//        s1.setName("홍길동");
//        s1.setClass_name("first");
//        System.out.println("학생 정보 이름은 " + s1.getName() + " 반은 " + s1.getClass_name());

        Student s2 = new Student();
        s2.setName("홍길순");
        s2.setClass_name(EnumClass.FIRST);
        System.out.println("학생 정보 이름은 " + s2.getName() + " 반은 " + s2.getClass_name());
    }
}
