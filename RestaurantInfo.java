class Person{
    String name;
    int id;
    Person(String name,int id){
        this.name=name;
        this.id=id;
    }
    void displayInfo(){
        System.out.println("Name is "+name);
        System.out.println("ID is "+id);
    }
}
interface Worker{
    void performDuties();
}
class Chef extends Person implements Worker{
    String specialty;
    Chef(String name,int id,String specialty){
        super(name,id);
        this.specialty=specialty;
    }
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Specialty is "+specialty);
    }
    @Override
    public void performDuties(){
        System.out.println("Chef is cooking delicious meals");
    }
}
class Waiter extends Person implements Worker{
    int tablesAssigned;
    Waiter(String name,int id,int tablesAssigned){
        super(name, id);
        this.tablesAssigned=tablesAssigned;
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Tables Assigned are "+tablesAssigned);
    }
    @Override
    public void performDuties(){
        System.out.println("Waiter "+name+" is serving customers");
    }
}
public class RestaurantInfo{
    public static void main(String[] args){
        Chef chef = new Chef("Abc",101,"Food");
        System.out.println("Chef Details are");
        chef.displayInfo();
        chef.performDuties();
        System.out.println();
        Waiter waiter=new Waiter("Jon Snow",201,5);
        System.out.println("Waiter Details are");
        waiter.displayInfo();
        waiter.performDuties();
    }
}
