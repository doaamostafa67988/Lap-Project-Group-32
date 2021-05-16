
package burgerrestaurant;

import java.util.Scanner;


public class NormalBurger {
   //atributes
     private String name;
   private String TypeOfMeet;
   private String TypeOfBread;
   private boolean ExtraCheese;
   private boolean ExtraTomato;
   private boolean withfries;
   private boolean withdrink;

 //constractor 
 

    public NormalBurger() {
    }
  //setter and getter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeOfMeet() {
        return TypeOfMeet;
    }

    public void setTypeOfMeet(String TypeOfMeet) {
        this.TypeOfMeet = TypeOfMeet;
    }

    public String getTypeOfBread() {
        return TypeOfBread;
    }

    public void setTypeOfBread(String TypeOfBread) {
        this.TypeOfBread = TypeOfBread;
    }

    public boolean isExtraCheese() {
        return ExtraCheese;
    }

    public void setExtraCheese(boolean ExtraCheese) {
        this.ExtraCheese = ExtraCheese;
    }

    public boolean isExtraTomato() {
        return ExtraTomato;
    }

    public void setExtraTomato(boolean ExtraTomato) {
        this.ExtraTomato = ExtraTomato;
    }

    public boolean isWithFries() {
        return withfries;
    }

    public void setWithFries(boolean WithSalat) {
        this.withfries = WithSalat;
    }

    public boolean isWithDrink() {
        return withdrink;
    }

    public void setWithDrink(boolean WithCoCaCola) {
        this.withdrink = withdrink;
    }
     //Price Method
    public static double Price( boolean ExtraCheese,boolean ExtraTomato, boolean withfries,boolean withdrink){
        int price=50;
        int PriceOfCheese=5;
        int priceOfTomato=5;
        int priceOfFries=10;
        int priceOfDrink=10;
        if(ExtraCheese){
            System.out.println("you add extra cheese ,it cost 5$");
          price+=  PriceOfCheese;
        }if(ExtraTomato){
             System.out.println("you add extra tomato ,it cost 5$");
           price+= priceOfTomato;
        }if(withfries){
             System.out.println("you add extra fries ,it cost 10$");
           price+= priceOfFries;
        }if(withdrink){
             System.out.println("you add extra drink ,it cost 10$");
           price += priceOfDrink;
        }
        return price;
    }
        public static void NormalBurger(NormalBurger n){
             NormalBurger burger= new NormalBurger();
         Scanner sc = new Scanner(System.in); 
     System.out.println(" would you like chicken or beef??");
           burger.setTypeOfMeet(sc.nextLine());
           System.out.println(" would you likewhite bread or brown bread??");
           burger.setTypeOfBread(sc.nextLine());
            System.out.println(" would you like extra additions ??");
            String ad=sc.nextLine();
            if(ad.equalsIgnoreCase("yes")){
                System.out.println("what do u want??"+'\n'+"1- extra cheese"+'\n'+"2 - extra tomato"+'\n'+"3 - drink "+'\n'+"4 - fries"+'\n'+"u can choose mare than one "); 
                String addition = sc.nextLine();
                if(addition.contains("1")){
                    burger.setExtraCheese(true);
                } if(addition.contains("2")){
                    burger.setExtraTomato(true);
                } if (addition.contains("3")){
                    burger.setWithDrink(true);
                }if (addition.contains("4")){
                    burger.setWithFries(true);}}
System.out.println("your total prise is  "+burger.Price(burger.isExtraCheese(), burger.isExtraTomato(), burger.isWithFries(), burger.isWithDrink()));
}
}
