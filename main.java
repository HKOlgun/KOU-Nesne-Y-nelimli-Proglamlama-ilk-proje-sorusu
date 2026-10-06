import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String name_surname = scanner.nextLine();
        long stu_num = scanner.nextInt();
        double km = scanner.nextDouble();
        double liter = scanner.nextDouble();
        double TL = scanner.nextDouble();
        int minute = scanner.nextInt();
        
        double cost1 = liter * TL;
        double spend = (liter / km) * 100;
        double cost2 = cost1 / km;
        
        System.out.print((minute / 60) + " saat ");
        System.out.println((minute % 60) + " dakika");
        
        System.out.println("Adı ve Soyadı: "+ name_surname);
        System.out.println("Öğrenci Numarası: "+ stu_num);
        System.out.println("Toplam mesafes: "+ km);
        System.out.println("Kullanılan yakıt: "+ liter);
        System.out.println("Yakıt maliyeti: "+ cost1);
        System.out.println("100 km başına düşen yakıt tüketimi: "+ spend);
        System.out.println("Kilometre başına maliyet: "+ cost2);
        System.out.println("Yolculuk süresi: "+ (minute / 60) + " saat " + (minute % 60) + " dakika");
        
        int last_two_num = (int) stu_num % 100;
        System.out.println("Öğrenci Kontol Kodu " + last_two_num);
        
        scanner.close();
	}
}
