import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String Menu;
        Scanner input = new Scanner(System.in);

        while (true){
            Menu = "";
            System.out.println("Coffee Shop");
            System.out.println("===========\n");

            do {
                System.out.println("Available Coffee's");
                System.out.println("1.Espresso");
                System.out.println("2.Cappuccino");
                System.out.println("3.Latte");
                System.out.print("What do you want to order? ");
                Menu = input.nextLine();
                if(Menu.equals("Espresso") || Menu.equals("Cappuccino")||Menu.equals("Latte"))  break;
            }while (true);

            if(Menu.equals("Espresso")){
                orderEspresso();
            }
            if(Menu.equals("Cappuccino")){
                orderCappuccino();
            }
            if(Menu.equals("Latte")){
                orderLatte();
            }
        }
    }

    private static void orderLatte() {
        String type = "",addOn ="";
        int quant = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Order Latte:");
        System.out.println("Add-on Available:");
        System.out.println("1.Milk");
        System.out.println("2.Cream");
        System.out.println("3.Latte");
        System.out.print("What do you want to addon with coffee?");
        addOn = input.nextLine();
        System.out.println("How much cups you want to order:");
        quant = input.nextInt();

        Coffee latte = new Coffee(type, addOn, quant);
        latte.getTotalBill();
    }

    private static void orderCappuccino() {
        String type = "",addOn ="";
        int quant = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Order Cappuccion:");
        System.out.println("Add-on Available:");
        System.out.println("1.Milk");
        System.out.println("2.Cream");
        System.out.println("3.Latte");
        System.out.print("What do you want to addon with coffee?");
        addOn = input.nextLine();
        System.out.print("How much cups you want to order:");
        quant = input.nextInt();

        Coffee cap = new Coffee(type, addOn, quant);
        cap.getTotalBill();
    }

    private static void orderEspresso() {
        String type = "",addOn ="";
        int quant = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Order Espresso:");
        System.out.println("Add-on Available:");
        System.out.println("1.Milk");
        System.out.println("2.Cream");
        System.out.println("3.Latte");
        System.out.print("What do you want to addon with coffee :");
        addOn = input.nextLine();
        System.out.println("How much cups you want to order :");
        quant = input.nextInt();

        Coffee esp = new Coffee(type, addOn, quant);
        esp.getTotalBill();

    }
    static void cls(){
        for(int i=0;i<15;i++) System.out.println("");
    }
}