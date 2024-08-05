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
            System.out.print("MENÜ\n1-Ekleme\n2-Düzeltme\n3-Listeleme\n4-Arama\n5-Silme\n6-Çıkış\nYapmak İstediğiniz Komutu Seçiniz=");
            choice = inputInt.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Kelime Giriniz=");
                    String word = inputStr.nextLine();
                    System.out.print("Anlamını Giriniz=");
                    String meaning = inputStr.nextLine();
                    dictionary.put(word, meaning);
                    break;
                case 2:
                    System.out.print("Düzeltmek İstediğiniz Kelimeyi Giriniz=");
                    word = inputStr.nextLine();
                    System.out.print("Anlamını Giriniz=");
                    meaning = inputStr.nextLine();
                    dictionary.put(word, meaning);
                    break;
                case 3:
                    System.out.println("******Kelimeler******");
                    Iterator<Map.Entry<String, String>> iterator = dictionary.entrySet().iterator();
                    while (iterator.hasNext()) {
                        Map.Entry<String, String> entry = iterator.next();
                        System.out.println(entry.getKey() + ":" + entry.getValue());
                    }
                    break;
                case 4:
                    System.out.println("Aranan Kelimeyi Giriniz=");
                    word = inputStr.nextLine();
                    if (dictionary.containsKey(word))
                        System.out.println(dictionary.get(word));
                    else
                        System.out.println("Böyle Bir Kelime Yoktur.");

                    break;
                case 5:
                    System.out.println("Silmek İstediğiiz Kelimeyi Giriniz=");
                    word = inputStr.nextLine();
                    dictionary.remove(word);
                    break;
                case 6:
                    System.out.println("Çıkış Yapılıyor.");
                default:
                    System.out.println("Hatalı Giriş Yaptınız.Tekrar Deneyiniz.");
            }


        } while (choice != 6) ;
    }
}
