package EnumPackage;

public class Student {
    private String name;
    private EnumClass Class_name; //우리학교 class_name은 first, second, third ㅡㄷㅇ 3가지 반만이 존재

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnumClass getClass_name() {
        return Class_name;
    }

    public void setClass_name(EnumClass Class_name) {
        this.Class_name = Class_name;
    }
}
