public class Test {
    public static void main(String[] args){
        Dog dog = new Dog();
        //Upcasting
        Animal animal = dog;

        //Downcasting
        Dog dog2 = (Dog) animal;
        dog2.bark();
    }
}
