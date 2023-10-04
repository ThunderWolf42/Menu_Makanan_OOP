import java.util.Scanner;

class Menu{
    static Scanner jawab=new Scanner(System.in);
    static int hargaMakanan=0;
    static int hargaMinuman=0;


    public static void MenuMakanan(){
        System.out.println("");
        System.out.println("Menu Makanan");
        System.out.println("============");
        System.out.println("1.Nasi");
        System.out.println("2.Ayam");
        System.out.println("3.Soto");
        System.out.println("-------------");
        System.out.print("Pilihan paket adalah: ");
        int pilihanMakanan=jawab.nextInt();

        if (pilihanMakanan==1) {
            hargaMakanan=4000;
        }
        else if(pilihanMakanan==2){
            hargaMakanan=8000;
        }
        else if(pilihanMakanan==3){
            hargaMakanan=9000;
        }
    }

    public static void MenuMinuman(){
        System.out.println("");
        System.out.println("Menu Minuman");
        System.out.println("============");
        System.out.println("1.Teh tawar");
        System.out.println("2.Teh manis");
        System.out.println("3.Jus");
        System.out.println("-------------");
        System.out.print("Pilihan paket adalah: ");
        int pilihanMinuman=jawab.nextInt();

        if (pilihanMinuman==1) {
            hargaMinuman=4000;
        }
        else if(pilihanMinuman==2){
            hargaMinuman=8000;
        }
        else if(pilihanMinuman==3){
            hargaMinuman=9000;
        }
    }

    public static void Bayar(){
        int totalBayar=hargaMakanan+hargaMinuman;
        System.out.println("");
        System.out.println("Total yang dibayar = Rp. "+totalBayar);
    }

    //---PeriksaJawaban---
    public static void PeriksaJawaban(int pilihan){

        switch(pilihan){
            case 1:
                MenuMakanan();
                MainMenu();
                break;
            case 2:
                MenuMinuman();
                MainMenu();
                break;
            case 3:
                Bayar();
                MainMenu();
                break;
            case 4:
                System.out.println("Selesai");
                break;
            default:
                break;
        }
    }

    //---MainMenu
    public static void MainMenu(){

        System.out.println("");
        System.out.println("RESTORAN OOP");
        System.out.println("============");
        System.out.println("1.Makanan");
        System.out.println("2.Minuman");
        System.out.println("3.Bayar");
        System.out.println("4.Selesai");
        System.out.println("------------");
        System.out.print("Pilihan anda adalah: ");

        int jawaban=jawab.nextInt();
        PeriksaJawaban(jawaban);
    }

    //---Main---
    public static void main (String[] args){
        MainMenu();
    }

}