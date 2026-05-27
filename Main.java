import java.util.Scanner;

public class Main {
    public static void main(String [] args) 
    {
        boolean instore = true;
        System.out.println("Welcome to SALAD Supermarkets! How can we help you?");
        Cart yourCart = new Cart();
        while(instore){
        System.out.println("---select an option---");
        System.out.println("1. I'd like to shop!");
        System.out.println("2. What's today's deal?");
        System.out.println("3. What's this month's special drink?");
        System.out.println("4. I'm leaving...");
        Scanner in = new Scanner(System.in);
        int pick = in.nextInt();
        
        while(pick<=0||pick>=5){
            System.out.println("Sorry, I don't think we offer that here! Are you sure you don't wan't something?");
            pick = in.nextInt();
        }

        if(pick==1){
            yourCart.shop();
            System.out.println("What else would you like to do?");
        }



        if(pick==2){
            String[] products = {"bananas","apples", "bottles of shampoo", "toothpaste tubes", "soup cans", "dozens of eggs", "bags of chips", 
                            "cartons of milk", "6-pack beers", "paper towel rolls", "ketchup bottles", "donuts", "cheese blocks", "boxes of butter", "bottles of rosé"};
            int price = (int)(Math.random()*9)+2;
            int index = (int)(Math.random()*15);
            String product = products[index];
            int quant = (int)(Math.random()*4)+2;
            System.out.println("Today, you can get "+quant+" "+product+" for the low, low price of $"+price+".99! Would you like to buy?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            Scanner two = new Scanner(System.in);
            int a = two.nextInt();
            if(a==1){
                System.out.println("Thank you for your purchase!");
                yourCart.addItem(product, (price+0.99)/quant, quant);
            } 
            else if(a==2){
                System.out.println("That's all right!");
            } else {
                System.out.println("Huh?");
            }
            System.out.println("What else would you like to do?");
        }




        if(pick==3){
            String[] drinks = {"Blueberry Frost Fizz","Cherry Velvet Rose","Kiwi Meadow Mist","Lavender Blossom Breeze","Honeydew Citrus Spritz","Mango Sunset Cooler",
                "Watermelon Citrus Spark","Peach Golden Tide","Apple Harvest Glow","Pumpkin Ember Cider","Maple Pear Chai","Peppermint Midnight Cocoa"};
            Scanner three = new Scanner(System.in);
            System.out.println("Sorry... What was the month again?");
            System.out.println("1. January");
            System.out.println("2. February");
            System.out.println("3. March");
            System.out.println("4. April");
            System.out.println("5. May");
            System.out.println("6. June");
            System.out.println("7. July");
            System.out.println("8. August");
            System.out.println("9. September");
            System.out.println("10. October");
            System.out.println("11. November");
            System.out.println("12. December");
            int m = three.nextInt()-1;
            String drink = drinks[m];
            int ranprice = (int)(Math.random()*9)+2;
            System.out.println("Oh right! This month, it's "+drink+"! Want some? It's only $"+ranprice+".99!");
             System.out.println("1. Sure!");
            System.out.println("2. Nah");
            m = three.nextInt();
            if(m==1){
                System.out.println("Thank you for your purchase! Enjoy!");
                yourCart.addItem(drink,ranprice+0.99,1);
            } 
            else if(m==2){
                System.out.println("That's all right!");
            } 
            System.out.println("What else would you like to do?");

        }






        if(pick==4){
            System.out.println("Alright! Time to get you checked out! Here's your current cart:");
            double tot = yourCart.checkout();
            Scanner f = new Scanner(System.in);
            System.out.println("How much would you like to tip?");
            double tip = f.nextDouble();
            tot+=tip;
            System.out.println("Will you be paying with cash or credit(There is a 5% fee for credit)?");
            System.out.println("1. Cash");
            System.out.println("2. Card");
            int p = f.nextInt();
            if(p==2){
                tot=tot*1.05;
            }
            System.out.println("Your total is now $"+tot);
            System.out.println("Please sign(no spaces):");
            String sig = f.next();
            System.out.println("Thank you for signing. Here's your signature: "+sig);
            System.out.println("Thanks for stopping by! Come back next time!");
            instore=false;
        }

    }
        //put your method calls and prints here
    }
    
}
