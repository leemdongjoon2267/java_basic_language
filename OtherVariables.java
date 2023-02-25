import java.util.Arrays;
import java.util.Scanner;

public class OtherVariables {
    public static void main(String[] args) {
//        기초자료형 : 숫자, 문자(char), boolean, null
//         문자가 1개이상 : String
//        여러자료형을 하나의 변수표현 : 배열
//        int[] arr1 = {10,20,30};
//        String[] arr2 = {"kim", "lee", "choi"};

//        기타자료형
//        자바에서 배열의 문제는 배열이 길이를 줄이고 늘릴수 없음
//        List(배열의 발전된 형태) : 배열이 길이를 줄이고 늘릴 수 있음
//        map : key, value
//        set, queue, stack

//        String의 표현 방식
//        1)리터럴 표현방식
//        원시자료형의 표현방식
//        char c1 = 'a';
//        String st1 ="hello";
//        System.out.println(st1);
//        System.out.println(c1);
//        char c2 ='a';
//        System.out.println(c2);
//        System.out.println(c1==c2);
//        2)new String 표현방식 : 참조타입
//        new라는 키워드는 class를 기반으로 객체를 만들때 사용
//        String st2 = new String("hello");
//        원시타입은 메모리에 값을 담아놓지만, 참조타입은 메모리에 메모리주소를 담아둔다
//        System.out.println(st1==st2);
//        System.out.println(st1.equals(st2)); // true 또는 false리턴

//        int와 Integer
//        long의 참조타입 : Long, char의 참조타입 :Character
//        int num1= 10;
//        String st1 = "20";
//        int num2 = Integer.parseInt(st1);
//        String st2 = Integer.toString(num1);
//        System.out.println(num2);
//        System.out.println(st2.getClass());
//        indexOf : 특정 문자가 특정 문자에 몇번째 index에 해당하는지 int로 return
//        String a = "Hello Java";
//        int num = a.indexOf("Java");
//        System.out.println(num);

//        contains : 특정 문자가 특정 문자에 포함되어있는지 아닌지를 boolean으로 return
//        System.out.println(a.contains("Java"));

//        String st1 = "Hello Java World";
//        사용자가 입력한 문자 o를 전부 a로 바꿔서 출력하는 게임을 만들어보자
//        replaceAll
//        split : 스트링을 배열로 잘게 쪼갠다. ""공백을 기준으로 쪼갬

//        charAt() : String을 하나씩 잘라서 char형태로 return
//        st1.length()
//        int count = 0;
//        String st1 = "abcdefabcdef";
//        st1이 가지고 있는 a의 숫자는 몇개인가
//        for(int i=0; i<st1.length(); i++){
//            if(st1.charAt(i)=='a'){ // charAt() 괄호 안에 index를 넣어줘야함
//                count++;
//            }
//        }
//        System.out.println("a의 개수는 : "+count);

//        replace : 특정 문자열을 특정 문자열로 대체
//        replaceAll : 특정 문자열을 특정 문자열로 대체, 정규표현식 사용가능
//        String st1 = "abcabc";
//        System.out.println(st1.replaceAll("a","o"));

//        정규표현식(메타문자열) : 특정한 패턴을 가진 문자열을 찾는 것
//        regex regular expression
//        String st2 = "01abc123한글123";

////            숫자를 제외한 문자만 새로운 문자열에 담아보자
//            String st3 = st2.replaceAll("[0-9]",""); // 0부터 9까지 공백으로 대체
//            String st4 = st2.replaceAll("[^0-9]","");
//            String st5 = st2.replaceAll("[^a-z]","");
//            System.out.println(st3);
//            System.out.println(st4);
//            System.out.println(st5);

//        substring(a,b) : a부터 b미만까지 문자열을 잘라낸다
//        String st = "hello world";
//        String st2 = st.substring(6,11);
//
////        toUpperCase : 대문자로 변환 / toLowerCase : 소문자로 변환
//        System.out.println(st.toUpperCase());

//        split : 특정문자열을 가지고 규칙적으로 문자열을 자를때 사용, return값이 String배열
//        String st = "a:b:c:d";
//        String[] st_arr = st.split(":");
//        System.out.println(Arrays.toString(st_arr));
//
//        String st2 = "abcd";
//        String[] st2_arr = st2.split("");
//        System.out.println(Arrays.toString(st2_arr));

        String st3 = "dafwafguhgfhasda;f;gs;fafadagdahwfgagdagfsgi";
//        문자는 몇번째에서 시작하는지 알아맞춰보자
//        index of
//        System.out.println(st3.indexOf("w"));
////        charAt
//        int result = 0;
//        for(int i=0;i<st3.length(); i++){
//            if(st3.charAt(i)=='w'){
//                result = i;
//                System.out.println(result);
//            }
//        }
//        split을 써서 구해보자
//        String[] st3_arr = st3.split("");
//        System.out.println(Arrays.toString(st3_arr));
//        for(int i=0; i<st3_arr.length; i++){
//            if(st3_arr[i].equals("w")){
//                System.out.println(i);
//                break;
//            }
//        }

//        String에 값을 더하개먼셔 합친다.
//        메모리상에 과부하게 생길 수 있는 방식, 매번 값을 재정의하기 때문
//        StringBuffer, StringBuilder
//        두 방법은 대부분 유사하나, StringBuilder가 성능이 더 좋음
//        그러나 StringBuilder는 특정상황에서 문제가 발생할 여지가 있다.

//        Trim : 문자열 양 끝에 공백을 제거
//        String st = " hello world ";
//        System.out.println(st.trim());

//        String db_input = "abc@naver.com";
//        System.out.println("로그인 ID를 입력해주세요");
//        Scanner sc = new Scanner(System.in); // 입력 받을때는  out이 아니라 in
//        String input = sc.nextLine();
//        input = input.trim();
//        System.out.println(input);
//        System.out.println(input.equals(db_input));

//        Strip : 문자열 양 끝에 공백을 제거, 그러나 더 좋은 성능
        Character c = '\u2000';
        System.out.println(c);
        String a = "\u2000abc\u2000";
        System.out.println(a.trim());
        System.out.println(a.strip());
    }
}

