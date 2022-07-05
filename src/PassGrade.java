
import java.util. Scanner;


public class PassGrade {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int toplam = 0 ;

        System.out.println("matematik");
        int mat_notlar = input.nextInt();
        System.out.println("fizik");
        int fiz_notlar = input.nextInt();
        System.out.println("türkçe");
        int türk_notlar = input.nextInt();
        System.out.println("kimya");
        int kim_notlar = input.nextInt();
        System.out.println("müzik");
        int müz_notlar = input.nextInt();

        if(mat_notlar >=0 && mat_notlar<=100) {

            toplam += mat_notlar;
            if (fiz_notlar >= 0 && fiz_notlar <= 100) {

                toplam +=fiz_notlar;
            }

            if (türk_notlar >= 0 && türk_notlar <= 100) {

                toplam +=türk_notlar;
            }
            if (kim_notlar >= 0 && kim_notlar <= 100) {

                toplam +=kim_notlar;
            }
            if (müz_notlar >= 0 && müz_notlar <= 100) {

                toplam +=müz_notlar;
            }
        }

        System.out.println("Ortalamanız hesaplanıyor...");

        double ortalama= toplam / 5;

        System.out.println(ortalama);
        System.out.println("toplam:"+ toplam);



        if(ortalama <= 55)

            System.out.println("Başarısız oldunuz");

        else
            System.out.println("Tebrikler geçtiniz");






















    }
}
