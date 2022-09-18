package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj ="Bugün Hava Çok Güzel.";
		System.out.println(mesaj);
		
		/*System.out.println("Eleman sayısı : "+ mesaj.length());
		System.out.println("5.elaman : "+mesaj.charAt(4));
		System.out.println(mesaj.concat(" Yaşasın!"));
		System.out.println(mesaj.startsWith("A"));
		System.out.println(mesaj.endsWith("."));
		char[] karakterler = new char[5];
		
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		
		System.out.println(mesaj.indexOf("av"));//aramaya baştan başlar
		System.out.println(mesaj.lastIndexOf("e"));//aramaya sondan başlar*/
		
		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);
		
		System.out.println(mesaj.substring(2,5));//metin kesme yapar.
		
		for (String kelime : mesaj.split(" ")) {//isteğimiz şekilde böler
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase());//harfleri küçültür.
		System.out.println(mesaj.toUpperCase());//hepsinin harflerini büyürtür.
		
		System.out.println(mesaj.trim());//metnin başında ve sonundaki boşlukları attı.
	}

}
