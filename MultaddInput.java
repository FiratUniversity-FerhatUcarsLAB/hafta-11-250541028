import java.util.Scanner;

public class MultaddInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // --- GÖREV 1: Multadd Testi ---
        System.out.println("--- MULTADD İŞLEMİ (a * b + c) ---");
        
        System.out.print("a sayısını giriniz: ");
        double a = scan.nextDouble();

        System.out.print("b sayısını giriniz: ");
        double b = scan.nextDouble();

        System.out.print("c sayısını giriniz: ");
        double c = scan.nextDouble();

        // Kullanıcının girdiği sayılarla metodu çağırıyoruz
        double sonucMultadd = multadd(a, b, c);
        System.out.println("Sonuç (a*b+c): " + sonucMultadd);


        // --- GÖREV 2: ExpSum Testi ---
        System.out.println("\n--- EXPSUM İŞLEMİ (x * e^-x + sqrt...) ---");
        
        System.out.print("x değerini giriniz: ");
        double x = scan.nextDouble();

        // Kullanıcının girdiği x değeri ile karmaşık hesaplamayı çağırıyoruz
        double sonucExpSum = expSum(x);
        System.out.println("ExpSum Sonucu: " + sonucExpSum);
        
        scan.close();
    }

    // Matematiksel işlem metodu (Değişmedi, sadece gelen veriyi işler)
    public static double multadd(double a, double b, double c) {
        return a * b + c;
    }

    // Karmaşık formül metodu (İçinde multadd kullanıyor)
    public static double expSum(double x) {
        double eNegX = Math.exp(-x); 
        // Composition: multadd metodunu yardımcı olarak kullanıyoruz
        return multadd(x, eNegX, Math.sqrt(1.0 - eNegX));
    }
}