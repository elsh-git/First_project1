import java.util.*;
import java.io.FileWriter;
import java.awt.Desktop;
import java.io.IOException;
import java.io.File;

/**
 * @author elad shechtman
 * @version 1.0
 */

public class Main {


    public static <exeption> void main(String[] args) throws Exception {
        boolean tag1 = false;
        boolean tag2 = false;
        boolean tag3 = false;
        int dots_tag = 0;
        String temp1 = "";
        String mark = "red" ;
        List<Double> results = new ArrayList<Double>();
        CoinFactory coinFactory = new CoinFactory();
        Scanner myObj = new Scanner(System.in);
        System.out.println("***First screen***");
        System.out.println("Welcome to currency converter");
        System.out.println("Please choose an option (1/2/3):");
        System.out.println("1. Dollars to Shekels");
        System.out.println("2. Shekels to Dollars");
        System.out.println("3. Shekels to Euros");

        while (tag1 == false) {
            tag3 = false;
            temp1 = "";
            String input1 = myObj.nextLine();
            if (input1.length() == 1) {
                char character1 = input1.charAt(0);
                if ((int) character1 == 49) {
                    System.out.println();
                    System.out.println();
                    System.out.println();

                    System.out.println("Please enter an amount to convert:");

                    while (tag2 == false) {
                        dots_tag = 0;
                        String input2 = myObj.nextLine();

                        for (int i = 0; input2.length() > i; ) {
                            char character2 = input2.charAt(i);
                            int ascii2 = (int) character2;

                            if (ascii2 > 47 && ascii2 < 58 && dots_tag <= 1) {
                                temp1 += character2;
                                i++;


                            } else if (ascii2 == 46 && dots_tag < 1) {
                                temp1 += character2;
                                dots_tag += 1;
                                i++;


                            } else {
                                System.out.println("you insert Wrong value ! ");
                                System.out.println("Please enter an amount to convert:");
                                dots_tag = 0;
                                temp1 = "";
                                break;
                            }
                        }


                        if (input2.isEmpty()) {
                            tag2 = false;
                            System.out.println("you insert Wrong value ! ");
                            System.out.println("Please enter an amount to convert:");
                        }

                        if (input2.equals(temp1) && input2.length() >= 1) {
                            double amount = Double.parseDouble(temp1);
                            ICalcualte myShekels = coinFactory.getCoinInstance(Coins.ILS);
                            results.add(myShekels.calculate(amount));
                            System.out.println("yours amount in Shekels = " + myShekels.calculate(amount));
                            mark = "green";
                            tag2 = true;
                        }
                        dots_tag = 0;
                        temp1 = "";
                    }



                } else if ((int) character1 == 50) {
                    System.out.println();
                    System.out.println();
                    System.out.println();

                    System.out.println("Please enter an amount to convert:");

                    while (tag2 == false) {

                        String input2 = myObj.nextLine();

                        for (int i = 0; input2.length() > i; ) {
                            char character2 = input2.charAt(i);
                            int ascii2 = (int) character2;

                            if (ascii2 > 47 && ascii2 < 58 && dots_tag <= 1) {
                                temp1 += character2;
                                i++;

                            } else if (ascii2 == 46 && dots_tag < 1) {
                                temp1 += character2;
                                dots_tag += 1;
                                i++;


                            }  else {
                                System.out.println("you insert Wrong value ! ");
                                System.out.println("Please enter an amount to convert:");
                                i = 0;
                                dots_tag = 0;
                                temp1 = "";

                                break;
                            }
                        }

                        if (input2.isEmpty()) {
                            System.out.println("you insert Wrong value ! ");
                            System.out.println("Please enter an amount to convert:");
                        }

                        if (input2.equals(temp1) && input2.length() >= 1) {
                            double amount = Double.parseDouble(temp1);
                            ICalcualte myDollars = coinFactory.getCoinInstance(Coins.USD);
                            results.add(myDollars.calculate(amount));
                            System.out.println("yours amount in American Dollars = " + myDollars.calculate(amount));
                            mark = "green";
                            tag2 = true;
                        }
                        dots_tag = 0;
                        temp1 = "";
                    }

                }
                if ((int) character1 == 51) {
                    System.out.println();
                    System.out.println();
                    System.out.println();

                    System.out.println("Please enter an amount to convert:");

                    while (tag2 == false) {
                        dots_tag = 0;
                        String input2 = myObj.nextLine();

                        for (int i = 0; input2.length() > i; ) {
                            char character2 = input2.charAt(i);
                            int ascii2 = (int) character2;

                            if (ascii2 > 47 && ascii2 < 58 && dots_tag <= 1) {
                                temp1 += character2;
                                i++;


                            } else if (ascii2 == 46 && dots_tag < 1) {
                                temp1 += character2;
                                dots_tag += 1;
                                i++;


                            } else {
                                System.out.println("you insert Wrong value ! ");
                                System.out.println("Please enter an amount to convert:");
                                dots_tag = 0;
                                temp1 = "";
                                break;
                            }
                        }


                        if (input2.isEmpty()) {
                            tag2 = false;
                            System.out.println("you insert Wrong value ! ");
                            System.out.println("Please enter an amount to convert:");
                        }

                        if (input2.equals(temp1) && input2.length() >= 1) {
                            double amount = Double.parseDouble(temp1);
                            ICalcualte myEuros = coinFactory.getCoinInstance(Coins.EUR);
                            results.add(myEuros.calculate(amount));
                            System.out.println("yours amount in Euros = " + myEuros.calculate(amount));
                            mark = "green";
                            tag2 = true;
                        }
                        dots_tag = 0;
                        temp1 = "";
                    }
                } else if (mark == "red") {
                    System.out.println("you insert Wrong value ! ");
                    System.out.println("pleas try agaen");
                    System.out.println("Please choose an option (1/2):");
                    System.out.println("1. Dollars to Shekels");
                    System.out.println("2. Shekels to Dollars");
                    System.out.println("3. Shekels to Euros");
                }
            }else{

                System.out.println("you insert Wrong value ! ");
                System.out.println("pleas try agaen");
                System.out.println("Please choose an option (1/2):");
                System.out.println("1. Dollars to Shekels");
                System.out.println("2. Shekels to Dollars");
                System.out.println("3. Shekels to Euros");
            }
            while ((tag3 == false)  && (mark == "green") ) {
                tag2 = false;
                System.out.println();
                System.out.println();
                System.out.println();

                System.out.println("Do you want to do enader coin conversion? ");
                System.out.println("Please choose an option (y/n):");
                System.out.println("Y. yes i want to do enader coin conversion ");
                System.out.println("N. no and check out ");
                String input3 = myObj.nextLine();

                if (input3.equalsIgnoreCase("n")) {
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println("Thanks for using our currency converter");
                    System.out.println(Arrays.toString(results.toArray()));
                    FileWriter myWriter = new FileWriter("results.txt");
                    myWriter.write(Arrays.toString(results.toArray()));
                    myWriter.close();
                    Desktop desktop = Desktop.getDesktop();
                    desktop.open(new File("results.txt"));
                    tag3 = true;
                    tag1 = true;

                } else if (input3.equalsIgnoreCase("y")) {
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println("Please choose an option (1/2):");
                    System.out.println("1. Dollars to Shekels");
                    System.out.println("2. Shekels to Dollars");
                    System.out.println("3. Shekels to Euros");
                    mark ="red";
                    tag1 = false;
                    tag2 = false;
                    tag3 = true;

                } else {
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println("you insert Wrong value ! ");
                }
            }

            }
        }
    }




