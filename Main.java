import static java.lang.System.out;

public class Main{
    public static void main(String[] args){
        // this with constructor
        Monster mons1 = new Monster("John", 20);
        mons1.show();

        // this with different name
        Monster2 mons2 = new Monster2("Mike");
        mons2.show();

        // this with method
        Monster3 mons3 = new Monster3();
        mons3.setName("Tom");
        mons3.setName("Tom1");  // only show current name, not the previous one
        mons3.show();


        // this with two constructors
        Monster4 mons4 = new Monster4();
        mons4.show();
        

        // this method without get and set
        Monster5 mons5 = new Monster5();
        mons5.details("Jerry");
        mons5.show();


        // reference object
        
        Monster6 mons6 = new Monster6();
        mons6.name = "Sam";
        mons6.age = 30;
        
        Monster6 mons7 = mons6.sendInstance();
        System.out.println("Name: " + mons7.name);
        System.out.println("Age: " + mons7.age);
        
        

        // reference two class/obj
        Warrior w1 = new Warrior();
        Monster7 m1 = new Monster7("Jonny", w1);
        w1.showMonster7();


        // static variable
        Bicycle b1 = new Bicycle(10);
        Bicycle b2 = new Bicycle(20);
        Bicycle b3 = new Bicycle(30);

        out.println(b1.getId());
        out.println(b2.getId());
        out.println(b3.getId());

        out.println(Bicycle.getNumOfBiccle());

        // IIB
        Monster8 mons8 = new Monster8(30);

        // IIB value inside constructor
        Monster9 mons9 = new Monster9();
        
        //**************************
        // SIB
        Monster10 mons10 = new Monster10();     // SIB runs only one
        mons10.showCount();

            // second obj
        Monster10 mons11 = new Monster10();

        // **************************



        // static method
        Monster11.setstatic();


        // static varable with static method
        Monster12.showCount();




    
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


// this with different name
class Monster2{
    public String name;

    public Monster2(String Hisname){
        this.name = Hisname;
    }

    public void show(){
        out.println("Name: " + name);
    }
}


// this with method
class Monster3{
    public String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void show(){
        out.println("Name: " + getName());
    }
}



// this with two constructors
class Monster4{
    private String name;

    public Monster4(String name){
        this.name = name;
    }

    public Monster4(){
        this("Tommy");
    }

    public void show(){
        out.println("Name: " + name);
    }


}



// this method without get and set
class Monster5{
    private String name;

    public void details(String name){
        this.name = name;
    }

    public void show(){
        out.println("Name: " + name);
    }

}

// reference object
// then m1 and m2 refer to the same object, so both can access the same details.(use only same class and different object)
class Monster6{

    String name;
    int age;

    public Monster6 sendInstance(){
        return this;
    }

}


// two classes/objects are connected through a reference.
class Warrior{
    Monster7 mons8;

    public void setMonster7(Monster7 mons8){
        this.mons8 = mons8;
    }

    public void showMonster7(){
        out.println("Monster7 name: " + mons8.name);
    }

}

class Monster7{
    String name;

    public Monster7(String name, Warrior warr){
        this.name = name;

        // Pass the current Monster object to Warrior
        warr.setMonster7(this);

    }
}


// static variable --> (Only one copy exists in memory.)
class Bicycle{
    private int speed;  // instance variables
    private int id;

    private static int numOfBicycles = 0; // static variable

    // create cons
    public Bicycle(int startSpeed){ // here we need to creat epara.
        speed = startSpeed; // link with speed para
        numOfBicycles++;

        id = numOfBicycles;
    }

    public int getId(){
        return id;
    }

    public static int getNumOfBiccle(){
        return numOfBicycles;
    }
}




// IIB
class Monster8{
    int age;    // this variable when put { } not it is IIB. it just local block.
                // It does not automatically run when an object is created.
    

    public Monster8(int age){
        System.out.println("IIB runs before constructor:");
        this.age = age;

        out.println("Para Age: " + this.age);   

    }

    {
        System.out.println("IIB runs:");
        age = 10;
        out.println("IIB age: " + age); // cannot use outside { }
                                        // age cannot be accessed because its scope has ended.
    }

}


// IIB vlue use inside constructor
class Monster9{
    int Age;
    {
        Age = 20;
    }

    public Monster9(){
        out.println("IIB value iside constructor: " + Age);        

    }
}


// SIB
// static initializer block --> A Static Initializer Block initializes static variables.

class Monster10{
    

    static int monsterCount;
    int age;

    static {
        out.println();

        out.println("Static block runs:");
        monsterCount = 10;

    }

    public void showCount(){
        out.println("Monster count: " + monsterCount);
    }

    { 
        out.println("IIB runs");
        age = 50;
        out.println("IIB age: " + age);
        
    }

    Monster10(){
        out.println("Constructor runs");
    }
    /*
    SIB → once when class loads

    IIB → every time an object is created

    Constructor → every time an object is created */


}

// static method

class Monster11{

    static void setstatic(){
        out.println();
        out.println("Set static method");
    }
}



// static variable with static method
class Monster12{
    static int count = 10;

    static void showCount(){
        out.println(count);
    }



}