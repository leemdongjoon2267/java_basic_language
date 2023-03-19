package Collection;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class TimePackage {
    public static void main(String[] args) {
//        예전에는  Calendar 클래스를 사용했지만, 월을 표현함에 있어 0~11까지로 표현을 하는 문제 등
//        몇가지 문제로 인해 java.time 패키지를 주로 사용하게 되었다.

//        java.time 패키지 중에 LocalDateTime이 가장 많이 사용된다
//        LocalTime, LocalDate, LocalDatetime
        LocalDate today = LocalDate.now();
        System.out.println(today);
        LocalTime present = LocalTime.now();
        System.out.println(present);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        LocalDateTime input = LocalDateTime.of(2023,02,16,17,05,16);
        System.out.println(input);
        System.out.println(input.isBefore(now));

//        오늘 연도만 출력하려면 return : int
        System.out.println(now.getYear());

//        오전 오후 구분 : ChronoField를 사용하여 오전이면 0 오후면 1을 구할 수 있다
        System.out.println(now.get(ChronoField.AMPM_OF_DAY));
        String ampm ="";
        if(now.get(ChronoField.AMPM_OF_DAY)==0){
            ampm ="오전";
        }else{
            ampm ="오후";
        }
        System.out.println("지금은"+ampm+"입니다");
    }
}
