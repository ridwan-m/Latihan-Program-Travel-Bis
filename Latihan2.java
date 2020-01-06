import java.util.Scanner;

public class Latihan2{
    public static void main(String[] args) {
        int ac=0;
        int na=0;
        int jumlahkursi=0;
        int hargasatuan=0;
        int total;

        Scanner Obj=new Scanner(System.in);
        System.out.print("Nama  : ");
        String nama = Obj.nextLine();
        System.out.println("1. Jakarta-Bandung");
        System.out.println("2. Bandung-Jakarta");
        System.out.println("3. Jakarta-Tasikmalaya");
        System.out.print("Jenis Tiket   : ");
        int jenis = Obj.nextInt();
        System.out.println("1. NA ");
        System.out.println("2. AC ");
        System.out.print("Type  : ");
        int type = Obj.nextInt();
        System.out.print("Jumlah Kursi  : ");
        int jkursi = Obj.nextInt();
        
        System.out.println();
        System.out.println("Terimakasih Telah Melakukan Transaksi Dengan Rincian Sebagai Berikut");
        System.out.println();
        System.out.println("Nama: " +nama);

        if(jenis==1){
            System.out.println("Tiket : Jakarta-Bandung");
            na = 90000;
            ac = 130000;
        }else if(jenis==2){
            System.out.println("Tiket : Bandung-Jakarta");
            na = 70000;
            ac = 150000;
        }else{
            System.out.println("Tiket : Jakarta-Tasikmalaya");
            na = 50000;
            ac = 70000;
        }
        if(type==1){
            System.out.println("Type: "+"NA");
        }else{
            System.out.println("Type: "+"AC");
        }

        hargasatuan=na;
        hargasatuan=ac;
        System.out.println("Harga Satuan: "+hargasatuan);  
        System.out.println("Jumlah Kursi: "+jkursi);
        if(jkursi==1){
            total = hargasatuan;
            System.out.println("Total Biaya: "+total);
        }else if(jkursi>1){
            total = hargasatuan*jkursi;
            System.out.println("Total Biaya: "+total);
        }
        System.out.println();
        System.out.println("Bayar Di Minimarket Terdekat");
        
    }
}