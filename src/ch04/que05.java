package ch04;

public class que05 {
    public static void main(String[] args) {

        int[] marks = {70, 60, 55, 75, 95, 90, 80, 80, 85, 100};
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        double average = (double) sum / marks.length;
        System.out.println("A 학급의 평균 점수: " + average);
    }
}
