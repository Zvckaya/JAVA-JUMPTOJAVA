package ch03;
import java.util.HashMap;

public class que08 {
    public static void main(String[] args) {
        HashMap<String, Integer> grade = new HashMap<>();
        grade.put("A", 90);
        grade.put("B", 80);
        grade.put("C", 70);
        int valB = grade.get("B");
        grade.remove("B");
        System.out.println(valB);
        System.out.println(grade);
    }
}