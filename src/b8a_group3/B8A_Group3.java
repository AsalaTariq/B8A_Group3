
package b8a_group3;

/**
 *
 * @author asala
 */
import java.util.*;
public class B8A_Group3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        String[] longDonuts = {"Chocklate", "Glazed Craze "};
        String[] fancyDonuts = {"Cinnamon Pepitas", "Strawberry Short Cake", "Orio"};
        String[] RegularDonuts = {"Chocklate", "Glazed Craze", "Choco Custard", "Birthday Cake"};

        Customer customer1 = new Customer();
        String type = "";
        String[] typeAndFlavor = new String[8];
        boolean choiceFlavor = false;
        String[] info;
        int t = 0;
        int w = 0, choice, choice1;

        do {
            //first menu
            
            choice1 = input.nextInt(); //choice from the first menu

            switch (choice1) {
                case 1: {
                    //Search items
                    //second menu
                    
                    //third menu
                    info = thirdMenu(longDonuts, fancyDonuts, RegularDonuts, input);
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
                }
                
                case 3:{
                    //Write a review
                }
                default: {
                    //Show Summary
                    break;
                }

            }
           
        } while (choice1 != 4 && t < 8);

        customer1.addOrder(typeAndFlavor);
        ArrayList<String> orders = customer1.allOrders();     
    }
//---------------------------------------------------------------------------------------------------------------------------------------
    public static String[] thirdMenu(String[] longDonuts, String[] fancyDonuts, String[] RegularDonuts, Scanner input) {
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
                        System.out.println((i + 1) + ": " + longDonuts[i]+" ------- "); 
                    }
                    
                    break;
                case 2:
                    type = "fancyDonuts";
                    for (int i = 0; i < fancyDonuts.length; i++) {
                        System.out.println((i + 1) + ": " + fancyDonuts[i]+" ------- ");
                    }
                    wrongChoice = false;
                    break;
                case 3:
                    type = "RegularDonuts";
                    for (int i = 0; i < RegularDonuts.length; i++) {
                        System.out.println((i + 1) + ": " + RegularDonuts[i]+" ------- ");
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
}
