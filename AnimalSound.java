class Animal{
    String name;
    int age;
    Animal(String name,int age){
        this.name=name;
        this.age=age;
    }
    void display(){
        System.out.println("Name is "+name);
        System.out.println("Age is "+age);
    }
    void makeSound(){
        System.out.println(" Animal Sound");
    }
}
class Dog extends Animal{
    Dog(String name,int age){
        super(name,age);
    }
    @Override
    void makeSound(){
        System.out.println("Bark");
    }
}
class Cat extends Animal{
    Cat(String name,int age){
        super(name,age);
    }
    @Override
    void makeSound(){
        System.out.println("Meoww");
    }
}
class Bird extends Animal{
    Bird(String name,int age){
        super(name, age);
    }
    @Override
    void makeSound(){
        System.out.println("Chirping");
    }
}
public class AnimalSound{
    public static void main(String args[]){
        Animal dog=new Dog("James",4);
        Animal cat=new Cat("Whiskers",2);
        Animal bird=new Bird("Tweety",1);
        dog.display();
        dog.makeSound();
        cat.display();
        cat.makeSound();
        bird.display();
        bird.makeSound();
    }
}