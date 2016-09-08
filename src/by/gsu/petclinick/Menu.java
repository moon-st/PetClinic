package by.gsu.petclinick;

import java.util.Scanner;

public class Menu {



    public void run() {

        AnimalCollection collection = new AnimalCollection(10);

        exitLabel: while (true) {
            printMenuHelp();
            int selectedItem = getInt();

            switch (selectedItem) {
                case 0:
                    break exitLabel;
                case 1:
                    collection.add();
                    break;
                case 2: {
                    int index = getInt();
                    collection.update(index);
                    break;
                }
                case 3: {
                    int index = getInt();
                    collection.delete(index);
                    break;
                }
                case 4:
                    collection.printAll();
                    break;
                default:
                    System.out.println("wrong input, try again");

            }



        }
    }

    private void printMenuHelp() {
        String message = "" +
                "Select item:\n" +
                "1 - add element\n" +
                "2 - update element\n" +
                "3 - delete element\n" +
                "4 - print all\n" +
                "5 - save to file\n" +
                "6 - load from file\n" +
                "0 - exit\n";

        System.out.println(message);
    }


    private int getInt() {
        Scanner s = new Scanner(System.in);
        int result = Integer.parseInt(s.nextLine());
        return result;
    }
}
