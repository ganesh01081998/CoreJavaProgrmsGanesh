
class Vehicle{
    void model(){
        System.out.println("this is vehicle class");
    }
}
class Car extends Vehicle {
    void model(){
        super.model();
        System.out.println();
    }

 

}
public class B {
public static void main(String[] args) {
Car a=new Car();
        a.model();
    }
}

