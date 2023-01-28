package lapTop;

import java.util.Scanner;

public class MenuMethod extends Calculation{
    int tumToplam;
    int lapTopNumarasi=100;
    public void menu(){
        Marka();
        CPU();
        Size();
        Ram();
        Renk();

        toplamFiyat=secilenCPUFiyat+secilenRamFiyat+secilenRenkFiyat+secilenSizeFiyat;

        Calculation bilgisayar=new Calculation(++lapTopNumarasi,secilenMarkaAdi,
                secilenCPUAdi, secilenSizeAdi,  secilenRamAdi, secilenRenkAdi);

        bilgList.add(bilgisayar);

        for (Calculation each:bilgList
        ) {
            System.out.println(each);
        }

        tumToplam+=toplamFiyat;

        System.out.println("Alisverise devam etmek ister misiniz: E/H");
        Scanner scan=new Scanner(System.in);
        String secim= scan.nextLine();
        if(secim.equalsIgnoreCase("e")) {
            menu();
        } else System.out.println("Lutfen odemeyi yapiniz\n" +
                "Toplam odeme: "+tumToplam);
    }
}
