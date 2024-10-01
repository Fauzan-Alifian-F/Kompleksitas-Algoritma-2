import java.util.Scanner;

public class PangkatDua {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int bilangan = input.nextInt();

       
        int hasil = 0;
        for (int i = 1; i <= bilangan; i++) {
            hasil += bilangan;
        }

        System.out.println("Hasil pangkat dua dari " + bilangan + " adalah: " + hasil);

       
    }
}