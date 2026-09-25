import static java.lang.System.out;

public class Main{
    public static void main(String[] args){
        // this with constructor
        Monster mons1 = new Monster("John", 20);
        mons1.show();

        // this with different name
        Monster2 mons2 = new Monster2("Mike");
        mons2.show();
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
        out.println("Age: " + age);
    }

}


class Monster2{
    public String name;

    public Monster2(String Hisname){
        this.name = Hisname;
    }

    public void show(){
        out.println("Name: " + name);
    }
}