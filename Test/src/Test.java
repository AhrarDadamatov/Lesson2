import java.util.ArrayList;

public class Test {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(19);
        numbers.add(1,20);
        System.out.println(numbers.get(1));
        // numbers.remove(1);
        // numbers.clear();
        for(Integer el : numbers){
            System.out.println(el);
        }
    }
}
