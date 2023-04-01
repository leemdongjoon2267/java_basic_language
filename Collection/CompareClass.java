package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareClass {
    public static void main(String[] args) {
//        String a = "abg";
//        String b = "abg";
////        문자의 크기를 비교하는 메서드
////        문자는 아스키코드 비교를 톻해 차이만큼의 숫자값이 return
//        System.out.println(a.compareTo(b));
//
//        Integer a1 = 10;
//        Integer a2 = 9;
////        숫자는 크다, 같다, 작다만을 1, 0, -1을 통해 return
//        System.out.println(a1.compareTo(a2));

//        compare to는  comparable 인터페이스를 구현한 메서그
//        compare to는 많은 클래스에서 이미 구현되어 있고, 매개변수가 1개밖에 없다는게 특징

//        compare은 Comparator 인터페이스를 구현해야함
//        collections 객체에 미리 구현되어 있기도 하지만, 일반적으로 개발자가 직접 구현하여 사용
//        그리고 Comparator는 Comparable과 다르게, compare메서드만을 가지고 있지는 않고 여려 메서드 존재

//        List<String> st_lst = new ArrayList<>();
//        st_lst.add("abc");
//        st_lst.add("ddd");
//        st_lst.add("cde");
////        오름차순 정렬
//        Collections.sort(st_lst);
//        System.out.println(st_lst);
//
////        내림차순 정렬
//        Collections.sort(st_lst, Collections.reverseOrder());
//        System.out.println(st_lst);


        List<StudentComparator> lst = new ArrayList<>();
        StudentComparator st1 = new StudentComparator();
        st1.setName("kim");
        st1.setAge(15);
        st1.setClassNumber(1);
        lst.add(st1);

        StudentComparator st2 = new StudentComparator();
        st2.setName("choi");
        st2.setAge(16);
        st2.setClassNumber(2);
        lst.add(st2);

        StudentComparator st3 = new StudentComparator();
        st3.setName("lee");
        st3.setAge(14);
        st3.setClassNumber(3);
        lst.add(st3);



//        Collections의 sort기능을 활용하되, Comparator자리에 직접 커스터마이징한 Comparator객체를 삽일할 것이다
        Collections.sort(lst, new Comparator<StudentComparator>() {
            @Override
            public int compare(StudentComparator o1, StudentComparator o2) {
//                기본설정이 오름차순, 내림차순을 하고 싶다면 o1과 o2의 자리만 바꾸면 끝
                return o1.getName().compareTo(o2.getName());
//                return o1.getAge() - (o2.getAge()); // 나이는 -로 해줘야함
            }
        });

//        객체를 list에 담고 정렬시킬때 가장 일반적인 형태(화살표 함수 방식)
        Collections.sort(lst, (StudentComparator o1, StudentComparator o2) -> o2.getAge() -o1.getAge());

        for(StudentComparator s : lst){
            System.out.println("이름은 : " + s.getName() + " 나이는 : " + s.getAge() + " 반은 : " + s.getClassNumber());
        }
    }
}
