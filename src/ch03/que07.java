package ch03;
import java.util.ArrayList;
import java.util.Arrays;

public class que07 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>(Arrays.asList("Life", "is", "too", "short"));
        String mylife = String.join(" ",myList);
        System.out.println(mylife); // [Life, is, too, short] 출력
    }
}