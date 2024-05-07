public class Tea {

    private boolean isPrepare;
    private boolean hasMilk;
    private boolean hasSugar;


    // Constructor
    public Tea(){
        this.isPrepare = false;
        this.hasMilk = true;
        this.hasSugar = false;
    }
// Method to prepare tea
    public void prepareTea(){
        if (!isPrepare){
            isPrepare = true;
            System.out.println("Tea Prepare: " );
        }else {
            System.out.println("Tea already prepare: ");
        }
    }

// Method to add Milk
    public void addMilk(){
        if (isPrepare && !hasMilk){
            hasMilk = true;
            System.out.println("Mill added to Tea");
        }else if (!isPrepare){
            System.out.println("Tea need to be prepared first");
        }else {
            System.out.println("Milk already add to Tea");
        }
    }
    // Method to add Sugar
    public void addSugar(){
        if (isPrepare && !hasSugar){
            hasSugar = true;
            System.out.println("Sugar add to Tea");
        } else if (!isPrepare) {
            System.out.println("Tea need to be prepared First");

        }else {
            System.out.println("Sugar already added to Tea");
        }
    }

    public static void main(String[] args) {
        Tea tea1 = new Tea();
        tea1.prepareTea();
        tea1.addMilk();
        tea1.addSugar();
    }
}
