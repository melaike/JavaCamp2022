package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		int sayi = 25;
		int kalan = sayi % 2 ;
		System.out.println(kalan);
		boolean asalSayi= true;
		
		if(sayi==1) {
			System.out.println("Sayı asal değildir");
			return;
		}
		if(sayi<1) {
			System.out.println("Geçersiz sayı");
		}
		for(int i=2; i<sayi; i++) {
			
			if(sayi % i == 0) {
			
				asalSayi =false;
			}
		}
		
		if(asalSayi) {
			System.out.println("Asal Sayıdır");
		}else {
			
			System.out.println("Sayı asal değildir");
		}
		
		
		
		
		


	}

}
