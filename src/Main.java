import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main{
    public static void main(String[] args) {
        int choice;
        Scanner inputInt = new Scanner(System.in);
        Scanner inputStr = new Scanner(System.in);
        Map<String,String> dictionary=new TreeMap<>();

        do {
            System.out.print("MENU\n1-ADD\n2-EDIT\n3-LIST\n4-SEARCH\n5-DELETE\n6-EXIT\nYour choice=");
            choice = inputInt.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the word: ");
                    String word = inputStr.nextLine();
                    System.out.print("Enter the meaning: ");
                    String meaning = inputStr.nextLine();
                    dictionary.put(word, meaning);
                    break;
                case 2:
                    System.out.print("Enter the word to edit: ");
                    word = inputStr.nextLine();
                    System.out.print("Enter the meaning: ");
                    meaning = inputStr.nextLine();
                    dictionary.put(word, meaning);
                    break;
                case 3:
                    System.out.println("****** Words in the Dictionary ******");
                    Iterator<Map.Entry<String, String>> iterator = dictionary.entrySet().iterator();
                    while (iterator.hasNext()) {
                        Map.Entry<String, String> entry = iterator.next();
                        System.out.println(entry.getKey() + ":" + entry.getValue());
                    }
                    break;
                case 4:
                    System.out.println("Enter the word to search: ");
                    word = inputStr.nextLine();
                    if (dictionary.containsKey(word))
                        System.out.println(dictionary.get(word));
                    else
                        System.out.println("Word not found.");

                    break;
                case 5:
                    System.out.println("Enter the word to delete: ");
                    word = inputStr.nextLine();
                    if (dictionary.remove(word) != null) {
                        System.out.println("Word removed.");
                    } else {
                        System.out.println("Word not found.");
                    }
                    break;
                case 6:
                    System.out.println("Exiting...");
                default:
                    System.out.println("Invalid entry. Please select a valid option.");
            }


        } while (choice != 6) ;
    }
}
