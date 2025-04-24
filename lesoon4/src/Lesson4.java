public class Lesson4 {
    public static void main (String[] args) {
        Human h1 = new Human("Bob",40);
        Human h2 = new Human("Bob",40);
        Human.description = "Nice";
        h1.getAllFields();
        h2.getAllFields();
        Human.description = "Bad";
        h1.getAllFields();
        h2.getAllFields();

   }

}
class Human {
    private String name;
    private int age;

    public static String description;


    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {this.name = name;}

    public void setAge(int age) {this.age = age;}

    public  void getAllFields(){
        System.out.println(name+","+age+","+description);
    }
}