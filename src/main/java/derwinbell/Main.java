package derwinbell;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void menuApp(){
        Customer customer = new Customer();
        CoffeeItem purchase = new CoffeeItem("", 0);
        Scanner scan = new Scanner(System.in);

        String playAgain;
        int drinks = 0;



        System.out.println("Whats your Name?");
        customer.setName(scan.nextLine());

        System.out.println("Whats your phone number?");
        customer.setPhoneNumber(scan.nextLine());
        System.out.println("Your name is " + customer.getName() + "\nPhone Number: " + customer.getPhoneNumber());



        do {
            playAgain = "n";
            System.out.println(customer.getName() + "| Drinks Toward Rewards: " + customer.getDrinksPurchase());
            if(customer.getDrinksPurchase() >= 5){
                customer.reward(drinks);
                drinks = 0;
                int freeDrink = scan.nextInt();
                switch (freeDrink){
                    case 1:
                        purchase.setItemName("Espresso");
                        purchase.setPrice(0);
                        break;

                    case 2:
                        purchase.setItemName("Latte");
                        purchase.setPrice(0);
                        break;
                    case 3:
                        purchase.setItemName("Cappuccino");
                        purchase.setPrice(0);
                        break;
                    case 4:
                        purchase.setItemName("Americano");
                        purchase.setPrice(0);
                        break;
                    case 5:
                        purchase.setItemName("Mocha");
                        purchase.setPrice(0);
                        break;
                    case 6:
                        purchase.setItemName("Cold Brew");
                        purchase.setPrice(0);
                        break;
                }


            }
            else{
                System.out.println("Select item\n1. Espresso 5.00\n2. Latte 2.00\n3. Cappuccino 15.00\n4. Americano 4.00\n5. Mocha 2.50\n6. Cold Brew 1.50");
                int userInput = scan.nextInt();

                if(userInput > 6 || userInput < 1) {
                    System.out.println("invalid ");
                    continue;
                }

                switch (userInput){
                    case 1:
                        purchase.setItemName("Espresso");
                        purchase.setPrice(5.94);

                        customer.count(drinks++);
                        break;

                    case 2:
                        purchase.setItemName("Latte");
                        purchase.setPrice(2.88);

                        customer.count(drinks++);
                        break;
                    case 3:
                        purchase.setItemName("Cappuccino");
                        purchase.setPrice(15.99);

                        customer.count(drinks++);
                        break;
                    case 4:
                        purchase.setItemName("Americano");
                        purchase.setPrice(4.23);

                        customer.count(drinks++);
                        break;
                    case 5:
                        purchase.setItemName("Mocha");
                        purchase.setPrice(2.59);

                        customer.count(drinks++);
                        break;
                    case 6:
                        purchase.setItemName("Cold Brew");
                        purchase.setPrice(1.52);

                        customer.count(drinks++);
                        break;
                }
            }
            customer.setDrinksPurchase(customer.count(drinks));

            System.out.println("You want " + purchase.getItemName() + " " + "it is $" + purchase.getPrice());



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