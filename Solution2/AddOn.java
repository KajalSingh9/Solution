public class AddOn {

    public int getPrice(String type,String addOn ){
        if(type.equals("Espress")){
            if(addOn == "Milk") return 60;
            else if(addOn == "Cream")   return 75;
            else return 100;
        }
        if (type.equals("Cappuccino")) {
            if(addOn == "Milk") return 80;
            else if(addOn == "Cream")   return 90;
            else return 125;
        }
        if(type.equals("Latte")){
            if(addOn == "Milk") return 100;
            else if(addOn == "Cream")   return 125;
            else return 150;
        }
        return 0;
    }


}
