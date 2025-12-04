import java.util.Scanner; // 1. Adım: Scanner kütüphanesini içeri al

public class DatePrinterInput {

    public static void main(String[] args) {
        // Kullanıcıdan veri almak için bir tarayıcı (Scanner) oluşturuyoruz
        Scanner scan = new Scanner(System.in);

        System.out.println("--- TARİH BİLGİLERİNİ GİRİNİZ ---");

        // 1. Günü iste ve değişkene ata
        System.out.print("Günü giriniz (Örn: Monday): ");
        String day = scan.next(); // Tek kelime alacağı için next() yeterli

        // 2. Ay ismini iste
        System.out.print("Ay ismini giriniz (Örn: July): ");
        String month = scan.next();

        // 3. Ayın kaçı olduğunu iste
        System.out.print("Ayın kaçıncı günü (Sayı): ");
        int date = scan.nextInt();

        // 4. Yılı iste
        System.out.print("Yılı giriniz (Sayı): ");
        int year = scan.nextInt();

        // --- METOTLARI ÇAĞIRMA (INVOKE) ---
        // Aldığımız değişkenleri metotlara parametre (argüman) olarak gönderiyoruz.
        
        System.out.println("\n--- ÇIKTILAR ---");
        
        System.out.print("Amerikan Formatı: ");
        printAmerican(day, date, month, year);

        System.out.print("Avrupa Formatı:   ");
        printEuropean(day, date, month, year);
        
        scan.close(); // İşimiz bitince scanner'ı kapatmak iyi bir alışkanlıktır.
    }

    // Amerikan Formatı Metodu
    public static void printAmerican(String day, int date, String month, int year) {
        System.out.println(day + ", " + month + " " + date + ", " + year);
    }

    // Avrupa Formatı Metodu
    public static void printEuropean(String day, int date, String month, int year) {
        System.out.println(date + " " + month + " " + year + ", " + day);
    }
}