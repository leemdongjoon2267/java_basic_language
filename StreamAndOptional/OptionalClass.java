package StreamAndOptional;

import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {

//        에외가 발생함으로써, 그 다음라인의 코드들이 실행되지 않는 문제가 발생
//        String non_opt = null;
//        System.out.println(non_opt.compareTo("abc"));
//        System.out.println("hello world");

//        optional 객체 생성
        Optional<String> opt = Optional.empty(); //opt변수에 null을 세팅
//        Optional<String> opt2 = Optional.of("aaa"); aaa찍힘
//        orElse, orElseThorw등의 메서드를 통해 optional에서 String으로 꺼내줘야함
        System.out.println(opt.orElse("none"));
        System.out.println(opt.orElse("none").compareTo("abc"));
        System.out.println("hello world");
    }
}
