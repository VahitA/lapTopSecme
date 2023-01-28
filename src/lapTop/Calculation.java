package lapTop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculation {

    int lapTopNo;
    String secilenMarkaAdi="";
    String secilenCPUAdi="";
    String secilenSizeAdi="";
    String secilenRamAdi="";
    String secilenRenkAdi="";

    static int secilenCPUFiyat=0;
    static int secilenSizeFiyat=0;
    static int secilenRamFiyat=0;
    static int secilenRenkFiyat=0;


    List<Calculation> bilgList=new ArrayList<>();

    int toplamFiyat=secilenCPUFiyat+secilenRamFiyat+secilenRenkFiyat+secilenSizeFiyat;

    public Calculation() {
    }

    public Calculation(int lapTopNo, String secilenMarkaAdi, String secilenCPUAdi,
                       String secilenSizeAdi, String secilenRamAdi,
                       String secilenRenkAdi) {
        this.lapTopNo = lapTopNo;
        this.secilenMarkaAdi = secilenMarkaAdi;
        this.secilenCPUAdi = secilenCPUAdi;
        this.secilenSizeAdi = secilenSizeAdi;
        this.secilenRamAdi = secilenRamAdi;
        this.secilenRenkAdi = secilenRenkAdi;
    }

    @Override
    public String toString() {
        return "Calculation{" +
                "lapTopNo=" + lapTopNo +
                ", secilenMarkaAdi='" + secilenMarkaAdi + '\'' +
                ", secilenCPUAdi='" + secilenCPUAdi + '\'' +
                ", secilenSizeAdi='" + secilenSizeAdi + '\'' +
                ", secilenRamAdi='" + secilenRamAdi + '\'' +
                ", secilenRenkAdi='" + secilenRenkAdi + '\'' +
                ", toplamFiyat=" + toplamFiyat +
                '}';
    }

    public void Ram() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Rami seciniz:\n" +
                "1- 32 gb, fiyati 300\n"+
                "2- 16 gb, fiyati 200\n"+
                "3- 8 gb, fiyati 100\n"+
                "4- 4 gb, fiyati 50\n");
        String secimRam= scan.nextLine();
        switch(secimRam){
            case "1": secilenRamAdi="32 gb";
                secilenRamFiyat=300;
                break;
            case "2":  secilenRamAdi="16 gb";
                secilenRamFiyat=200;
                break;
            case "3":  secilenRamAdi="8 gb";
                secilenRamFiyat=100;
                break;
            case "4":  secilenRamAdi="4 gb";
                secilenRamFiyat=50;
                break;
            default:
                System.out.println("Yanlis secim. Tekrar secim yapiniz");
                Ram();
        }
    }

    public void CPU() {
        Scanner scan=new Scanner(System.in);
        System.out.println("CPU seciniz:\n" +
                "1- i3, fiyati 200\n"+
                "2- i5, fiyati 300\n"+
                "3- i7, fiyati 500\n");

        String secimCPU= scan.nextLine();
        switch(secimCPU){
            case "1": secilenCPUAdi="i3";
                secilenCPUFiyat=200;
                break;
            case "2":  secilenCPUAdi="i5";
                secilenCPUFiyat=200;
                break;
            case "3":  secilenCPUAdi="i7";
                secilenCPUFiyat=100;
                break;
            default:
                System.out.println("Yanlis secim. Tekrar secim yapiniz");
                CPU();
        }
    }

    public void Size() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Size seciniz:\n" +
                "1- Mini, fiyati 100\n"+
                "2- Middle, fiyati 200\n"+
                "3- Max, fiyati 300\n");

        String secimSize= scan.nextLine();
        switch(secimSize){
            case "1": secilenSizeAdi="Mini";
                secilenSizeFiyat=100;
                break;
            case "2":  secilenSizeAdi="Middle";
                secilenSizeFiyat=200;
                break;
            case "3":  secilenSizeAdi="Max";
                secilenSizeFiyat=300;
                break;
            default:
                System.out.println("Yanlis secim. Tekrar secim yapiniz");
                Size();
        }
    }

    public void Renk() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Renk seciniz:\n" +
                "1- Red, fiyati 400\n"+
                "2- Orange, fiyati 300\n"+
                "3- Silver, fiyati 200\n"+
                "4- Black, fiyati 150\n");

        String secimRenk= scan.nextLine();
        switch(secimRenk){
            case "1": secilenRenkAdi="Red";
                secilenRenkFiyat=400;
                break;
            case "2":  secilenRenkAdi="Orange";
                secilenRenkFiyat=300;
                break;
            case "3":  secilenRenkAdi="Silver";
                secilenRenkFiyat=200;
                break;
            case "4":  secilenRenkAdi="Black";
                secilenRenkFiyat=150;
                break;
            default:
                System.out.println("Yanlis secim. Tekrar secim yapiniz");
                Renk();
        }
    }

    public void Marka() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Marka seciniz:\n" +
                "1- Asus\n"+
                "2- HP\n"+
                "3- Casper\n"+
                "4- LG\n");

        String secimMarka= scan.nextLine();
        switch(secimMarka){
            case "1": secilenMarkaAdi= "Asus"; break;
            case "2": secilenMarkaAdi=  "HP"; break;
            case "3": secilenMarkaAdi=  "Casper"; break;
            case "4": secilenMarkaAdi=  "LG"; break;
            default:
                System.out.println("Yanlis secim. Tekrar secim yapiniz");
                Marka();
        }
    }
}