
package b8a_group3;

/**
 *
 * @author asala
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;
public class B8A_Group3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
       Scanner input = new Scanner(System.in);
        String[] longDonuts = {"Chocklate", "Glazed Craze "};
        int[] longDonuts_Price = {8, 8};
        String[] fancyDonuts = {"Cinnamon Pepitas", "Strawberry Short Cake", "Orio"};
        int[] fancyDonuts_Price = {10, 11, 11};
        String[] RegularDonuts = {"Chocklate", "Glazed Craze", "Choco Custard", "Birthday Cake"};
        int[] RegularDonuts_Price = {6, 6, 8, 8};

        Customer customer1 = new Customer();
         File Dots_Summary = new File("Dots_Summary.txt");
        File Customer_review = new File("Customer_review.txt");
        PrintWriter revwrite = new PrintWriter(Customer_review);
        PrintWriter output = new PrintWriter(Dots_Summary);
        String type = "";
        String[] typeAndFlavor = new String[8];
        boolean choiceFlavor = false , PaymentCheck = true;
        String[] info;
        int t = 0, TotalAmount = 0;
        int w = 0, choice, choice1;

        do {
            //first menu
            System.out.println("\n♡♡♡♡♡♡♡♡♡♡♡♡ Welcome to Dotes ♡♡♡♡♡♡♡♡♡♡♡♡");
            System.out.println("1- Search items ♡ ");
            System.out.println("2- Payment ♡♡♡");
            System.out.println("3- Write a review ♡♡");
            System.out.println("4- Show Summary ♡♡♡♡");
            System.out.println("♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡");
            System.out.print("Enter your choice: ");
            choice1 = input.nextInt(); //choice from the first menu

            switch (choice1) {
                case 1: {
                    //Search items
                    //second menu
                    SecondMenu();
                    //third menu
                    info = thirdMenu(longDonuts, fancyDonuts, RegularDonuts, input,longDonuts_Price,fancyDonuts_Price,RegularDonuts_Price);
                    choice = Integer.parseInt(info[0]); //choice from the second menue
                    if (choice == 4 || t == 8) {
                        break;
                    }
                    type = info[1];
                    do {
                        typeAndFlavor[t] = "";
                        if (info[2].equals("true")) {
                            break;//to exit
                        }
                        System.out.print("Enter the flavor you want: ");
                        int choice2 = input.nextInt();// choice from the third menu
                        if (type.equals("longDonuts")) {
                            w = t;
                            for (int i = 0; i < longDonuts.length; i++) {
                                if (choice2 == (i + 1)) {
                                    typeAndFlavor[t] = type + "_" + longDonuts[i];
                                     TotalAmount += longDonuts_Price[i];
                                    choiceFlavor = false;
                                    type = "";
                                    t++;

                                }
                            }
                        } else if (type.equals("fancyDonuts")) {
                            w = t;
                            for (int i = 0; i < fancyDonuts.length; i++) {
                                if (choice2 == (i + 1)) {
                                    typeAndFlavor[t] = type + "_" + fancyDonuts[i];
                                    TotalAmount += fancyDonuts_Price[i];
                                    choiceFlavor = false;
                                    type = "";
                                    t++;

                                }
                            }
                        } else if (type.equals("RegularDonuts")) {
                            w = t;
                            for (int i = 0; i < RegularDonuts.length; i++) {
                                if (choice2 == (i + 1)) {
                                    typeAndFlavor[t] = type + "_" + RegularDonuts[i];
                                    TotalAmount += RegularDonuts_Price[i];
                                    choiceFlavor = false;
                                    type = "";
                                    t++;
                                }

                            }
                        }
                        if (typeAndFlavor[w].equals("")) {
                            System.out.println("wrong choice from the third menu");
                            choiceFlavor = true;
                        }
                    } while (choiceFlavor == true);
                    break;
                }

                case 2: {
                    //Payment
                    customer1.Payment();
                    System.out.print("Choose your payment method:");
                    int PaymentMethod = input.nextInt();
                    if (PaymentMethod == 1) {
                        customer1.Credit_Card(input);
                        PaymentCheck = true;
                    } else if (PaymentMethod == 2) {
                        customer1.Cash(input, TotalAmount);
                        PaymentCheck = false;
                    } else {
                        System.out.println("Wrong choice! Try again");
                       System.out.print("Choose your payment method:");
                        PaymentMethod = input.nextInt();
                    }

                    break;
                }
                
                case 3: {

                    System.out.println(Write_review(revwrite));
                    break;
                }
                default: {
                    //Show Summary
                    break;
                }

            }
           
        } while (choice1 != 4 && t < 8);

        customer1.addOrder(typeAndFlavor);
        ArrayList<String> orders = customer1.allOrders(); 
        System.out.println("You can now look at your summary in the Dots Summary txt");
        Dots_Summary(output, orders, TotalAmount, customer1, PaymentCheck);
        output.close();
        output.flush();
    }
 //---------------------------------------------------------------------------------------------------------------------------------------

     public static void SecondMenu() {
        System.out.println("\n♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡");
        System.out.println("1 - Long Donuts");
        System.out.println("2 - Fancy Donut");
        System.out.println("3 - Regular Donuts");
        System.out.println("4- Back To First Menu");
        System.out.println("♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡");

    }
//---------------------------------------------------------------------------------------------------------------------------------------
    public static String[] thirdMenu(String[] longDonuts, String[] fancyDonuts, String[] RegularDonuts, Scanner input,int[] longDonuts_Price , int[] fancyDonuts_Price ,int[] RegularDonuts_Price) {
        String[] info = new String[3];
        int choice;
        String type = "";
        boolean wrongChoice = false;
        boolean flag = false;// to exit
        do {
            //see the second menue
            System.out.print("Enter choice from the second menue: ");
            choice = input.nextInt();
            System.out.println("\n------------------------------");
            switch (choice) {
                case 1:
                    type = "longDonuts";
                    for (int i = 0; i < longDonuts.length; i++) {
                        System.out.println((i + 1) + ": " + longDonuts[i]+" ------- "+longDonuts_Price[i]+"$"); 
                    }
                    
                    break;
                case 2:
                    type = "fancyDonuts";
                    for (int i = 0; i < fancyDonuts.length; i++) {
                        System.out.println((i + 1) + ": " + fancyDonuts[i]+" ------- "+fancyDonuts_Price[i]+"$");
                    }
                    wrongChoice = false;
                    break;
                case 3:
                    type = "RegularDonuts";
                    for (int i = 0; i < RegularDonuts.length; i++) {
                        System.out.println((i + 1) + ": " + RegularDonuts[i]+" ------- "+RegularDonuts_Price[i]+"$");
                    }
                    wrongChoice = false;
                    break;
                case 4:
                    flag = true;// to exit
                    System.out.println("Back To First Menu");
                    wrongChoice = false;
                    break;
                default:
                    wrongChoice = true;
                    System.out.println("wrong choice from the second menu");
            }
            System.out.println("------------------------------");
        } while (wrongChoice == true);
        info[0] = choice + "";
        info[1] = type;
        info[2] = flag + "";
        return info;
    } 
//---------------------------------------------------------------------------------------------------------------------------------------    
       public static void Dots_Summary(PrintWriter output, ArrayList<String> orders, int Total, Customer c, boolean test) {
        output.print("♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡ Thank you for visiting Dots ♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡");
        output.println("\n\n\t\t\t\tThis is your summary:");
        output.println("Orders: ");
        for (int i = 0; i < orders.size(); i++) {
            output.println(orders.get(i));
        }
        output.println("\nYour total amount " + Total);
        if (test == true) {
            output.print("\nYou have chosen to pay by credit card");
            output.print("\nYour card number: " + c.getCardNumber());
            output.print("\nPayment status: complete ☆☆☆☆");
        } else {
            output.print("\nYou have chosen to pay cash");
            output.print("\nThe name of the neighborhood: " + c.getNeighborhoodName());
            output.print("\nThe Street Nmae:" + c.getStreetName());
            output.print("\nPayment status: pending ☆☆☆☆");
        }

    }
    public static String Write_review(PrintWriter revwrite) {
        System.out.println("We hope you liked dounts, "
                + "Tell us what's your opinion ♡♡♡ ?");
        Scanner r = new Scanner(System.in);
        String rev = r.nextLine();
        revwrite.append("Your review ☆☆☆☆: ");
        revwrite.append(rev);
        String message = "\nYour review has been recived, Thank you ♡♡♡";
        revwrite.append(message);
        revwrite.flush();
        revwrite.close();
        return message;
    }
}
