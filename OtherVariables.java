import java.sql.ClientInfoStatus;
import java.util.*;

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

//        String[] arr = {"abc", "bcd", "cdf", "eft"};
//        StringBuffer sb = new StringBuffer();
//        for(String a : arr){
//            sb.append(a);
//        }
//        sb.insert(10,"aaaaa");
//        String result = sb.toString();

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
//        Character c = '\u2000';
//        System.out.println(c);
//        String a = "\u2000abc\u2000";
//        System.out.println(a.trim());
//        System.out.println(a.strip());

//        String에서 int로 변환
//        Integer.parseInt
//        String st = "10";
//        int num  = Integer.parseInt(st);
//        System.out.println(num);

//        int에서 String으로 변환
//        Integer.toString, String.valueOf
//        웬만한 타입은 모두 toString을 가지고 있음
//        new해서 만드는 대부분의 객체에 toString이 있음
//        int a = 10;
//        String st = Integer.toString(a);
//        st = String.valueOf(a);

//        char int간의 변환
//        char ch = 'a';
//        int num = (int)ch;
//        num = Character.valueOf(ch);
//        System.out.println(num);

//        배열
//        int[] arr = {10,20,30,40,50}; // 배열 선언과 동시에 값을 할당
//        primitive타입은 해당 타입(0)으로 초기화, 참조형 변수는 null로 초기화
//        int[] arr2 = new int[5]; // 배열 선언만 : Java의 배열은 반드시 길이르 명시해줘야함
//
//        String[] st_arr = {"abc", "bcd"};
//        String[] st_arr2 = new String[10]; // 아직 값이 정해지지 않았을때 사용
//        System.out.println(st_arr2);

//        Arrays클래스 기능
//        int[] arr = {30,20,10,50};
//        오름차순 정렬 : Arrays.sort
//        프로그래밍에서 별다른 설정이 없으면 정렬의 기본은 오름차순
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        내림차순같은 경우에는 Integer를 쓰거나, Comparator를 해야함
//        Arrays.sort의 내림차순은 Collections.reverseOrder()를 써야한다, 하지만 primitive타입은 안됨
//        String[] st_arr = {"abc", "aaa", "bbb"};
//        Arrays.sort(st_arr, Collections.reverseOrder());

//        int의 내림차순 정렬 : Integer로 변환 -> Collections.reverseOrder()
//        Stream을 이용한 방법
//        Integer[] arr_integer = Arrays.stream(arr).boxed().toArray(Integer[]::new);
//        Arrays.sort(arr_integer, Collections.reverseOrder());
//        System.out.println(Arrays.toString(arr_integer));

//        직접 내림차순
//        int[] arr = {30,20,10,50};
//        Arrays.sort(arr);
////        10,20,30,50
//        int[] arr_new = new int[arr.length];
//        int cnt = 0;
//        for(int i=arr.length-1; i>=0; i--){
//            arr_new[cnt] = arr[i];
//            cnt++;
//        }
//        System.out.println(Arrays.toString(arr_new));

//        검색 : binaraySearch(이진검색) - 자료형이 정렬되어 있어야 정상적으로 자료를 검색하여 index를 리턴
//        int[] arr = {30,20,10,50};
//        Arrays.sort(arr);
//        System.out.println(Arrays.binarySearch(arr, 30));

//        배열의 복사 : copyOf(복사하고자하는 배열, length), copyOfRange(복사하고자하는 배열, a, b)
//        String[] arr_st = {"a1", "a2", "a3"};
//        String[] arr_st_new = Arrays.copyOf(arr_st, 5);
//        System.out.println(Arrays.toString(arr_st_new));


//        list와 배열과의 차이는 자료길이의 유연함
//        선언방법은 new List를 통해 List를 생성
//        List<String> l1 = new ArrayList<>();
//        l1.add("abc");
//        l1.add("bcd");
//        System.out.println(l1);

//        List<String> l2 = new ArrayList<>(Arrays.asList("abc", "bcd"));

//        배열에서 List로 변환
//        String[] arr = {"a1", "b1", "c1", "d1"};
//        List<String> l1 = new ArrayList<>(Arrays.asList(arr));
//        List<String> l2 = new ArrayList<>();
//        for(String a : arr){
//            l2.add(a);
//        }
////        List에서 배열로 변환
////        List에서 값을 꺼내는 메서드는 l2.get(index)
////        List에서 크기를 l2.size();
//        String[] answer = new String[l2.size()];
//        for(int i=0; i< answer.length; i++){
//            answer[i] = l2.get(i);
//        }
//        String[] answer2 = l2.stream().toArray(String[]::new);
//        System.out.println(Arrays.toString(answer));

//        int배열에서 List로 전환
//        int[] arr2 = {10,20,30};
//        List<Integer> l1 = new ArrayList<>();
//        for(int a : arr2){
//            l1.add(a);
//        }
//        System.out.println(l1);

////        list의 remove는 index로 지울 수 있고 value로도 지울 수 있움
//        List<Integer> lst = new ArrayList<>();
//        lst.add(1);
//        lst.add(2);
//        lst.add(3);
//        lst.remove(2);
//        System.out.println(lst);
//        System.out.println(lst.contains(1));
//        System.out.println(lst.isEmpty());

//        List의 정렬 : sort, Comparator.naturalOrder()가 오름차순, Comparator.reverseOrder()가 내림차순
//        List<String> lst = new ArrayList<>();
//        lst.add("b");
//        lst.add("a");
//        lst.add("c");
//        lst.sort(Comparator.naturalOrder());
//        lst.sort(Comparator.reverseOrder());
//        String[] arr = {"b", "a", "c"};
//        Arrays.sort(arr);
//        Arrays.sort(arr, Comparator.reverseOrder());

//        map : key, value로 이루어져있는 자료형

//        Map<String, String> mp  = new HashMap<>();
////        map에 값을 더할때 : map에서 key는 중복되지 않음
//        mp.put("a1", "abc");
//        mp.put("a2", "abc");
//        mp.put("a3", "abc");
//        System.out.println(mp);
//
////        map에서 값을꺼낼때 : key를 통해 값을꺼냄, value가 중복이 가능하므로 value를 통해 값을 꺼낼수는 없음
//        System.out.println(mp.get("a1"));
//
////        map은 자료 검색시 key를 통해 굉장히 빠르게 value를 찾아올 수 있음
//
////        key목록
//        System.out.println(mp.keySet());
////        각 key에 문자 f를 붙여 출력
//        for(String a : mp.keySet()){
//            System.out.println(a+"f");
//        }
//
////        value목록
//        System.out.println(mp.values());
//
////        containskey : 해당 key가 있는지 없는지, remove(key)
//        System.out.println(mp.containsKey("a1"));


//        map의 요소를 출력하는 방법1. Enhanced For문
//        Map<String, String> map1  = new HashMap<>();
//
//        map1.put("a1", "abc");
//        map1.put("a2", "abc");
////        for(String a : map1.keySet()){
////            System.out.println(a);
////       }
//
////        방법2. iterator 방식 : iterator() 메소드를 이용한 요소의 출력
////        iterator의 특직은 요소를 꺼낼때 소모가 된다
//        Iterator<String> iter = map1.keySet().iterator();
////        hasNext()는 요소가 있는지 없는지를 boolean형태로 출력
//
//
//        while(iter.hasNext()){
////            next()는 요소를 꺼내는 메서드
//            System.out.println(iter.next());
//        }



//        마라톤 완주하지 못한 선수
//        String[] participant = {"leo", "leo", "kiki", "eden","aaaa"}; // n개
//        String[] completion = {"eden", "leo", "kiki", "aaaa"}; // m개
////        mp에 completion목록에 사람이름 : 숫자 형태로 만들어둔다
//
//        Map<String, Integer> mp = new HashMap<>();
////        TreeMap을 사용하면 정력이 되어서 나옴
////        완주자 목록을 map에다가 넣어두고, participant로 조회해올지
////        participant 목록을 mp에다가 넣어두고, 완주목록으로 조회해올지
//        for(String a : completion){
////            if(mp.containsKey(a)){
////                mp.put(a, mp.get(a)+1);
////            }else{
////                mp.put(a, 1);
////            }
////            getOrDefault : key를 통해 값을 꺼내오되, 값이 있으면 해당값, 값이 없으면 Default로 설정한 값
//            mp.put(a, mp.getOrDefault(a, 0)+1);
//        }
//        String answer="";
//        for(String a : participant){
//            if(!mp.containsKey(a)){
//                answer = a;
//                break;
//            }
//            if(mp.get(a)>1){
//                mp.put(a, mp.get(a)-1);
//            }else if(mp.get(a)==1){
//                mp.remove(a);
//            }
//        }
//        System.out.println(answer);


//        String[] class1 = {"kim", "lee", "lee", "kim", "choi"}; //n개
//        Map<String, Integer> map1 = new HashMap<>();
//        for(String a : class1){
////            put("kim", 2);
////            put("lee", 2);
////            put("choi", 1);
//            map1.put(a, map1.getOrDefault(a, 0)+1);
//        }
//        System.out.println(map1.keySet());

//        set : 중복을 알아서 제거해준다
//        Set<String> set = new HashSet<>();
//        for(String a : class1){
//            set.add(a);
//        }

//        교집합, 합집합, 차집합
//        Set<Integer> st1 = new HashSet<>();
////        st1 : {1,2,3} st2 : {2,3,4} => 합집합 : {1,2,3,4} 교집합 : {2,3} 차집합 st1-st2 : {1}
//        st1.add(1);
//        st1.add(2);
//        st1.add(3);
//        Integer[] arr = {2,3,4};
//        Set<Integer> st2 = new HashSet<>(Arrays.asList(arr));
//
////        합집합 : addAll
////        교집합 : retainAll
////        차집합 : removeAll
//        st1.removeAll(st2);
//        System.out.println(st1);
//
////        값을 더하는 것 : add
////        여러값을 한꺼번에 더할때 : addAll
////        값을 제거하는 것 : remove
//
//        Set<Integer> st4 = new HashSet<>();
//        st4.add(10);
//        st4.addAll(Arrays.asList(20,30,40));
//        System.out.println(st4);

//        stack 자료구조 : 후입선출, 최신의 데이터가 필요할때 사용
//        Stack<String> st = new Stack<>();
////        자룔를 더하는것은 push
//        st.push("a1");
//        st.push("a2");
//        st.push("a3");
////        자료를 꺼내는것은 pop, 하지만 pop은 실제로 자료를 꺼내버리기 때문에,
////        pick을 사용해서 마지막 자료가 무엇인지를 확인을 할 수 있음
//        System.out.println(st.pop());
//        System.out.println(st);

//        1분에 한번식 환율 데이터가 쌓인다
//        int[] arr = {1300, 1301, 1302, 1209, 1240, 1300, 1301, 1302, 1209, 1240};

//        어떤 고객이 5분에 한번식 송금신청을 한다고 가정했을때,
//        해당 고객이 적용받은환율을 배열로 return해보자

        int[] arr = {1,1,3,3,0,1};
//        List<Integer> lst = new ArrayList<>();
//        for(int a : arr){
//            if(lst.isEmpty()){
//                lst.add(a);
//            }else{
//                if(lst.get(lst.size()-1)!=a){
//                    lst.add(a);
//                }
//            }
//        }
        Stack<Integer> st = new Stack<>();
       for(int a : arr){
           if(st.isEmpty()){
               st.push(a);
           }else{
               if(st.peek()!=a){
                   st.push(a);
               }
           }
       }
        System.out.println(st);
       int[] answer = new int[st.size()];
       int num = st.size();
//       for(int i = 0; i<num; i++){
//           answer[i] = st.pop();
//       }

        for(int i=num-1; i>=0; i--){
            answer[i] = st.pop();
        }
//        int num = 0;
//        for(int a : arr){
//            answer[num] = a;
//            num++;
//        }
        System.out.println(Arrays.toString(answer));




    }
}

