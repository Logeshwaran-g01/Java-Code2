public class Circle {

    private double radius;


//Constructor with no Arguments
    public Circle(){

        this.radius=0.0;
    }

    //Constructor with one Arguments
    public Circle (double radius){

        this.radius=radius;
    }

    public double calculateCircumference(){
        return 2 * Math.PI * radius;
    }
    // Creating Getter and Setter
    public double getRadius(){
        return radius;
    }
    public void setRadius(){

        this.radius = radius;
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("Circle one Radius: " + circle1.getRadius());
        System.out.println("Circle one Circumfrence: " + circle1.calculateCircumference());


        Circle circle2 = new Circle(8.0);
        System.out.println("Circle two Radius: " + circle2.getRadius());
        System.out.println("Circle two Circumference: " + circle2.calculateCircumference());
    }


}
