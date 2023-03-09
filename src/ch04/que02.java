package ch04;

public class que02 {
    public static void main(String[] args) {
        int num = 1;
        int result = 0;
        while (num<=1000){
            if(num%3==0){
                System.out.println("3의배수 : "+num);
                result+=num;
            }
            num++;
        }
        System.out.println("3의 배수의 합은 : "+result);

    }

}
