
package burgerrestaurant;

import java.util.Scanner;

/**
 *
 * @author Haneenahmedawadmoham
 */
public class HealthyBurger extends NormalBurger  {
      private final String TypeOfBread="brown";

    public static void HealthyBurger(HealthyBurger h){
          HealthyBurger hBurger= new HealthyBurger();
         Scanner sc = new Scanner(System.in); 
     System.out.println("chicken or beef??");
           hBurger.setTypeOfMeet(sc.nextLine());
            System.out.println("u wanna extra addition??");
            String Add=sc.nextLine();
            if(Add.equalsIgnoreCase("yes")){
                System.out.println("what do u prefere??"+'\n'+"1- extra cheese"+'\n'+"2 - extra tomato"+'\n'+"3 - drink"+'\n'+"4 - fries"+'\n'+"u can just choose 2 addirtion "); 
                String addtion = sc.nextLine();
               
                if( addtion .contains("1")){
                    hBurger.setExtraCheese(true);
                    
                } if( addtion .contains("2")){
                    hBurger.setExtraTomato(true);
                   
                } if ( addtion .contains("3")){
                    hBurger.setWithDrink(true);
                   
                }if ( addtion .contains("4")){
                    hBurger.setWithFries(true);}
}System.out.println("your total prise is  "+hBurger.Price(hBurger.isExtraCheese(), hBurger.isExtraTomato(), hBurger.isWithFries(), hBurger.isWithDrink()));
}
}
