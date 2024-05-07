//Parent class
class Coff{
    private String name;

    public Coff(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void brew(){
        System.out.println("Brewing: " + name);
    }
}
class Espresso extends Coff {
    public Espresso() {
        super("Expresso");
    }
}
class Latte extends  Coff{
    public Latte(){
        super("Latte");
    }
}



public class Coffee {
    public static void main(String[] args) {
        Coff[] coffs = new Coff[2];
        coffs[0] = new Espresso();
        coffs[1] = new Latte();

        //polymorphic method invocation
        for (Coff coff : coffs){
            coff.brew();
        }
    }
}
