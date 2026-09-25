import static java.lang.System.out;

public class Main{
    public static void main(String[] args){
        // this with constructor
        Monster mons1 = new Monster("John", 20);
        mons1.show();


    }
}


// this key word
class Monster{
    public String name;
    public int age;

    public Monster(String name, int age){
        this.name = name;
        this.age = age;
        
    }

    public void show(){
        out.println("Name: " + name);
        out.print("Age: " + age);
    }

}