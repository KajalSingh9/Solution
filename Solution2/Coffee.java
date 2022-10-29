public class Coffee {
    String type,addOn;
    int quant;

    Coffee(String type,String addOn,int quant){
        this.type = type;
        this.addOn = addOn;
        this.quant = quant;
        System.out.println("Order Successful.");
    }

    public void getTotalBill(){
        int total = 0;
        AddOn add = new AddOn();
        total = quant * add.getPrice(type, addOn);
        System.out.println("Your total bill of:");
        System.out.println("Type: " + type);
        System.out.println("Add-on: " + addOn);
        System.out.println("Quantity: " + quant);
        System.out.println("Total is :" + total);
    }

}
