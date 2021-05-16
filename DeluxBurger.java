
package burgerrestaurant;


public class DeluxBurger  extends NormalBurger{
 private final String TypeOfBread="white bread";
        private final String TypeOfMeet="beef";
        private final boolean ExtraCheese=false;
        private final boolean ExtraTomato=false;

           public static void DeluxBurger(DeluxBurger d){
             DeluxBurger dBurger= new DeluxBurger();
        
                    dBurger.setWithDrink(true);
                    
               
                    dBurger.setWithFries(true);
System.out.println("your total price for this meal contains fries and drink is = "+dBurger.Price(dBurger.isExtraCheese(), dBurger.isExtraTomato(), dBurger.isWithFries(), dBurger.isWithDrink()));
}
}
