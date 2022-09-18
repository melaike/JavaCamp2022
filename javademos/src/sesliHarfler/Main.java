package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		char harf = 'E';
		
		switch(harf) {
		case 'A':
			System.out.println(harf+"  Kalın Sesli Harf");
			break;
		case 'E':
			System.out.println(harf+"  İnce Sesli Harf");
			break;
		case 'I':
			System.out.println(harf+"  Kalın Sesli Harf");
			break;
		case 'İ':
			System.out.println(harf+"  İnce Sesli Harf");
			break;
		case 'O':
			System.out.println(harf+"  Kalın Sesli Harf");
			break;
		case 'Ö':
			System.out.println(harf+"= İnce Sesli Harf");
			break;
		case 'U':
			System.out.println(harf+"  Kalın Sesli Harf");
			break;
		case 'Ü':
			System.out.println(harf+"  İnce Sesli Harf");
			break;
		}
		
		System.out.println("-----------------");
		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kalın Sesli Harf");
			break;
			default:
				System.out.println("İnce sesli harf");
		}
		

	}

}
