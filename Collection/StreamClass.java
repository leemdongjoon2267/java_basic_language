package Collection;

import java.util.Arrays;

public class StreamClass {

    static int total = 0;

    public static void main(String[] args) {
        String[] arr = {"abc", "ab", "bc"};
//        arr에 있는 값들의 총길이의 합을 구해보자
//        int sum =0;
//        for(int i=0; i<arr.length; i++){
//            sum += arr[i].length();
//        }
//        System.out.println(sum);

        int sum = 0;
        String[] new_arr = Arrays.stream(arr).filter(a->a.length()>2).map(a->a).toArray(String[]::new);

        System.out.println(Arrays.toString(new_arr));

    }
}
