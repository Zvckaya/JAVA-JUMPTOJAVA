package ch05;
class Calculator1 {
    Integer value=0;
    void add(int val) {
        this.value += val;
    }

    public Integer getValue() {
        return this.value;
    }
}
public class que06 {


        public static void main(String[] args) {
            Calculator1 cal = new Calculator1();
            cal.add(3);  // 여기서 NullPointerException 이 발생한다.
            System.out.println(cal.getValue());
        }

}
