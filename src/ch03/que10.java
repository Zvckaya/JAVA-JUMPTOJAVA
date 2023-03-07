package ch03;
import java.util.HashMap;

public class que10 {
    enum caffeMenu{
        Americano,
        IcedAmeriacan,
        caffeLatte
    }
    static void printCoffeePrice(caffeMenu a) {
        HashMap<caffeMenu, Integer> priceMap = new HashMap<>();
        priceMap.put(caffeMenu.Americano, 3000);  // 1: 아메리카노
        priceMap.put(caffeMenu.IcedAmeriacan, 4000);  // 2: 아이스 아메리카노
        priceMap.put(caffeMenu.caffeLatte, 5000);  // 3: 카페라떼
        int price = priceMap.get(a);
        System.out.println(String.format("가격은 %d원 입니다.", price));
    }

    public static void main(String[] args) {
        printCoffeePrice(caffeMenu.Americano);  // "가격은 3000원 입니다." 출력  // NullPointerException 발생
    }
}
