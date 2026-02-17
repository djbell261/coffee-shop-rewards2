package derwinbell;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void menuApp(){
        Customer customer = new Customer("Derwin", "302-605-5552", 0);
        Purchase purchase = new Purchase("", 0, true);
        Scanner scan = new Scanner(System.in);

        String playAgain;
        int points = 0;
        String tier = "Bronze";



        System.out.println("Whats your Name?");
        customer.setName(scan.nextLine());

        System.out.println("Whats your phone number?");
        customer.setPhoneNumber(scan.nextLine());
        System.out.println("Your name is " + customer.getName() + "\nPhone Number: " + customer.getPhoneNumber() + "\nPoints: " + customer.getPoints());


        do {
            playAgain = "n";

            if(tier.equals("Bronze") && points >= 200) {
                System.out.println("Hey nigga you want to go up a Tier? \nits 200 points to go up to SILVER (y/n)");
                String choice = scan.next();
                if(choice.equals("y")) {
                    System.out.println("Congrats nigga, you made it");
                    tier = "Silver";
                    points-=200;
                    scan.nextLine() ;
                }
                else if(choice.equals("n")) {
                    System.out.println("oh alright, broke ass nigga");
                    scan.nextLine() ;

                }
            }
            else if (tier.equals("Silver") && points >= 400){
                System.out.println("Damn Big Back\n you keep coming back! \nits 400 points to go up to GOLD you want in? (y/n)");
                String choice = scan.next();
                if(choice.equals("y")) {
                    System.out.println("ofc your fat ass would");
                    tier = "Gold";
                    points-=400;
                }
                else if(choice.equals("n")) {
                    System.out.println("oh fasho, maybe you can invest in a gym membership then");

                }

            }

            System.out.println("its 100 points for a free drink, do you want it? (y/n)");
            String freeDrink = scan.nextLine();

            if(freeDrink.equals("y"))
            {
                if(points >= 100){
                    System.out.println("Here's your free drink!");
                }
                else {
                    System.out.println("nigga that's not enough");
                    points-=100;
                }
            }
            else if (freeDrink.equals("n")){
                System.out.println("Okay, what would you like today?");
            }
            else {
                System.out.println("Invalid");
            }



            System.out.println("Select item\n1. Ramen Noodles 5.00\n2. Sprite 2.00\n3. TV Dinner 15.00\n4. Chips 4.00\n5. Diet Coke 2.50\n6. Fruit 1.50");
            int userInput = scan.nextInt();

            if(userInput > 8 || userInput < 1) {
                System.out.println("invalid ");
                continue;
            }



            switch (userInput){
                case 1:
                    purchase.setItemName("Ramen Noodles");
                    purchase.setPrice(5.94);
                    points += 90;
                    break;

                case 2:
                    purchase.setItemName("Sprite");
                    purchase.setPrice(2.88);
                    points += 50;
                    break;
                case 3:
                    purchase.setItemName("TV Dinner");
                    purchase.setPrice(15.99);
                    points += 100;
                    break;
                case 4:
                    purchase.setItemName("Chips");
                    purchase.setPrice(4.23);
                    points += 60;
                    break;
                case 5:
                    purchase.setItemName("Diet Coke");
                    purchase.setPrice(2.59);
                    points += 50;
                    break;
                case 6:
                    purchase.setItemName("Fruit");
                    purchase.setPrice(1.52);
                    points += 20;
                    break;
            }
            customer.setPoints(points);

            System.out.println("You want " + purchase.getItemName() + " " + "it is $" + purchase.getPrice());
            System.out.println("You get " + customer.getPoints() + " points" );
            System.out.println(customer.getName() + "|" + tier + "|" + customer.getPoints());

            while (true) {
                System.out.print("is That all?? (y/n): ");
                playAgain = scan.next().toLowerCase();

                if (playAgain.equals("y") || playAgain.equals("n")) {
                    scan.nextLine() ;
                    break;
                }
                else {
                    System.out.println("Invalid input!");

                }
            }


        }while(playAgain.equals("n"));


    }



    public static void main(String[] args) {
        menuApp();

    }
}