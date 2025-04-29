public class For {
    public static void main(String[] args){
        for (int i = 5; i < 25; i += 2 ){
            if(i >= 17)
                break;

            System.out.println("Element:" + i);
        }
        /*for (float i = 100; i > 10; i /= 2){
            System.out.println("Element:" + i);
        }
        for (float i = 100; i > 10; i -= 10) {
            System.out.println("Element:" + i);
        }
    */}
}