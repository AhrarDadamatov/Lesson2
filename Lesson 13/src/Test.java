import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args){
        /////////// JAVA 5 ////////////
        Animal ourAnimal = new Animal();
        List animals = new ArrayList();
        animals.add("cat");
        animals.add("dog");
        animals.add("frog");
        animals.add(ourAnimal);

        String animal = (String) animals.get(1);
        System.out.println(animal);

        //////////// jeneric /////////////
        List<String> animals2 = new ArrayList<String>();
        animals2.add("cat");
        animals2.add("dog");
        animals2.add("frog");

        String animal2 = animals2.get(1);

        //////////// JAVA 7 //////////////
        // List<String> animals3 = new ArrayList<>();

    }
}

class Animal {

}