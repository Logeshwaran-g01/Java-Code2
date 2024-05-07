public class Person {

    private String name;
    private int age;

    //Using Constructor
    public Person (String name,int age ){
        this.name = name;
        this.age = age;
    }

    // using getter method

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Jhon" , 30);
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());
    }
}
