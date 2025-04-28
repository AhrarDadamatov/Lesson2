public class For {
    public static void main(String[] args){
        for (int i = 0; i <= 10; i++){
            System.out.println("Element:" + i);
        }
        for (float i = 100; i > 10; i /= 2){
            System.out.println("Element:" + i);
        }
        for (float i = 100; i > 10; i -= 10) {
            System.out.println("Element:" + i);
        }
    }
}