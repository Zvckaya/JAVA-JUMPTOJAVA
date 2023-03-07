package ch03;
public class que02 {
    boolean  isOdd(int num){
        if (num%2==0){
            return false;
        }
        else {
            return true;
        }
    }
    public static void main(String[] args) {
        int num =13;

        que02 a = new que02();

        System.out.println(a.isOdd(num));
    }


}
