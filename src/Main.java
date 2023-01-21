import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double boy,kilo;
        Scanner scan = new Scanner(System.in);

        System.out.println("boyunuzu metre cinsinden giriniz: ");
        boy = scan.nextDouble();
        System.out.println("kilonuzu cinsinden giriniz: ");
        kilo = scan.nextDouble();

        double vki = kilo / (boy*boy);
        System.out.println("vucut kitle indeksiniz : "+vki);
    }
}