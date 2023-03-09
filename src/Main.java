import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Gideceğiniz mesafe(km): ");
        double distance=scanner.nextDouble();
        System.out.print("Yaşınız: ");
        int age= scanner.nextInt();
        System.out.println("Yolculuk türünü seçiniz:\n1- Tek yön uçak bileti\n2- Gidiş-dönüş uçak bileti");
        int flightType= scanner.nextInt();

        double pricePerKm= flightType==1? 0.10 : 0.20;
        double price= distance*pricePerKm;

        if(age<0||distance<0||flightType<1||flightType>2){
            System.out.println("Hatalı bilgi girdiniz!");
        }
        else{
            if(age<12){
                price /=2;
            }
            else if(age<=24){
                price= (price*90)/100;
            }
            else if(age>65){
                price=(price*70)/100;
            }

            if (flightType==2){
                price=(price*80/100);
            }
            System.out.println("Toplam tutar: "+price);
        }


    }
}