package ch05;
import java.util.ArrayList;

class MaxLimitCalculator extends Calculator{
    void add(int val){
        this.value+=val;
        if (this.value>100){
            this.value=100;
        }
    }

}

class Calculator{
    int value;

    Calculator(){
        this.value = 0;
    }
    void add(int val){
        this.value +=val;
    }
    void minus(int val){
        this.value -=val;
    }
    int getValue(){
        return this.value;
    }
    boolean isOdd(int num){
        if (num%2==0){
            return false;
        }
        else {
            return true;
        }
    }

    int avg(int[] arr){
        int sum=0;
        for (int i=0;i<arr.length;i++ ){
            sum+=arr[i];
        }
        return sum/arr.length;
    }
    int avg(ArrayList<Integer> arr){
        int result=0;
        for (int value: arr){
            result += value;
        }
        return result/arr.size();
    }
}

public class que01to4 {
    public static void main(String[] args) {

        Calculator cal = new Calculator();


    }
}
