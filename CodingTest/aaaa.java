package CodingTest;

public class aaaa {
    public static void main(String[] args) {
        String answer ;
        boolean checked = true;
        String[] arr={"abc","bcdddd","bcccccccc"};
        for(String s : arr){
            if(s.length()>=5 & s.length()<=10){
                answer = s.toUpperCase();
                checked = false;
                break;
            }
        }
        if(checked){
            answer = "없음";
            System.out.println(answer);
        }
    }
}
