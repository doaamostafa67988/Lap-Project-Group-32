package burgerrestaurant;

import java.util.Scanner;

public class BurgerRestaurant {

    public static void main(String[] args) {
         int n= Begging();
         if(n==1){
                 NormalBurger burger= new NormalBurger();
          burger.NormalBurger(burger);
            }else if(n==2){
                HealthyBurger hBurger= new HealthyBurger();
                hBurger.HealthyBurger(hBurger);
            }else{
                 DeluxBurger dBurger= new DeluxBurger();
               dBurger. DeluxBurger(dBurger);
            }

    }
    public static int Begging( ){
          Scanner sc = new Scanner(System.in);  
    System.out.println("Hello at our Burger Resturant"+'\n'+"please enter your order");
    System.out.println("1 - Normal Burger "+'\n'+"2 - Healthy Burger"+'\n'+"3 - Delux Burger");
  int  choice = sc.nextInt() ;
  return choice;
}
}   