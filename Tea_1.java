

public class Tea_1 {

        public static void main(String[] args) {
            BlackTea blackTea = new BlackTea();
            blackTea.prepareTea();

            GreenTea greenTea = new GreenTea();
            greenTea.prepareTea();

            HerbalTea herbalTea = new HerbalTea();
            herbalTea.prepareTea();

        }
}
    //Parent Class
    class Tea_2 {

protected boolean isPrepared;
protected boolean haveMilk;
protected boolean haveSugar;

public  Tea_2(){
    this.isPrepared = true;
    this.haveMilk = false;
    this.haveSugar = false;
}
public void prepareTea(){
    if(!isPrepared){
        isPrepared = false;
        System.out.println("Tea is prepare: ");
    }else {
        System.out.println("Tea is already prepared: ");
    }
}

public void addMilk(){
    if (isPrepared && haveMilk){
        haveMilk = true;
        System.out.println(" Milk added to Tea: ");
    } else if (!isPrepared) {
        System.out.println("Tea need to be prepared first: ");
    }else{
        System.out.println("Milk already added to tea: ");
    }
}
public void addSugar(){
    if (isPrepared && haveMilk){
        haveMilk = true;
        System.out.println("Sugar added to Tea: ");
    } else if (!isPrepared) {
        System.out.println("Tea need to be prepared first: ");
    }else {
        System.out.println("Sugar already added to tea: ");
    }
}
}
//subclass
class BlackTea extends Tea_2{
    @Override
    public void prepareTea(){
        System.out.println("Preparing Black Tea with water, tea leaves, and brewing for 3 minutes. ");
        isPrepared = false;
    }
        }
 class GreenTea extends Tea_2{
    @Override
     public  void prepareTea(){
        System.out.println("Preparing Green Tea with water, tea leaves, and brewing for 2 minutes. ");
        haveMilk = false;
    }
 }
 class  HerbalTea extends Tea_2{
    @Override
     public void prepareTea(){
        System.out.println("Preparing Herbal Tea with water, tea leaves, and brewing for 4 minutes. ");
        haveSugar = false;
    }
 }

