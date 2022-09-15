package javaOdevler;

public class Odev2 {
	public static void run() {
		ders5();
		ders6();
		ders7();
		ders8();
		ders9();
		ders10();
		ders11();
		ders12();
		ders13();
		ders14();
		ders15();
		ders16();
		ders17();
		ders18();
		ders19MiniProje1();
		ders20MiniProje2();
		ders21MiniProje3();
		ders22MiniProje4();
		ders23MiniProje5();
	}

	private static void ders5() {
		System.out.println("**** JAVA DERSI 5: Hello World Uygulamasi ile Baslayalim ****");

		System.out.println("Merhaba Java");
		System.out.println("Merhaba Java 2");
	}

	private static void ders6() {
		System.out.println("**** JAVA DERSI 6: Degiskenler ve Degisken Kullanim Ihtiyaci ****");

		// Degiskenler camalCase ile yazilir
		int ogrenciSayisi = 12;
		String mesaj = "Öğrenci sayısı : ";

		System.out.println(mesaj + ogrenciSayisi);
		System.out.println(mesaj + ogrenciSayisi);

		System.out.println("Öğrenci sayım : " + ogrenciSayisi);
		System.out.println("Öğrenci sayım : " + ogrenciSayisi);
		System.out.println("Öğrenci sayım : " + ogrenciSayisi);
	}

	private static void ders7() {
		System.out.println("**** JAVA DERSI 7: Temel Veri Tipleriyle Calismak ****");

		// ** PRIMITIVE TYPES **

		// Tamsayi - 4 bytes
		int sayi = 12;
		sayi = 13;

		// kusuratli sayi - 8 bytes
		double doubleSayi = 12.5;

		// Tek tirnak icerisinde olmali
		char karakter = 'A';
		String sehir = "ANKARA"; // karakter toplulugu

		// true veya false olabilir
		boolean dogrumu = true;
	}

	private static void ders8() {
		System.out.println("**** JAVA DERSI 8: if bloklariyla calismak ****");

		int sayi = 24;

		if (sayi < 20) {
			System.out.println("Sayı 20'den küçüktür");
		} else if (sayi == 20) {
			System.out.println("Sayı 20'ye eşittir");
		} else {
			System.out.println("Sayı 20'den büyüktür");
		}
	}

	private static void ders9() {
		System.out.println("**** JAVA DERSI 9: ReCap Demo 1 En Büyük Sayı Hangisi ****");
		int sayi1 = 266;
		int sayi2 = 25;
		int sayi3 = 2;

		int enBuyuk = sayi1;

		if (enBuyuk < sayi2) {
			enBuyuk = sayi2;
		}
		if (enBuyuk < sayi3) {
			enBuyuk = sayi3;
		}
		System.out.println("En Büyük Sayi : " + enBuyuk);

		int enKucuk = sayi1;

		if (enKucuk > sayi2) {
			enKucuk = sayi2;
		}
		if (enKucuk > sayi3) {
			enKucuk = sayi3;
		}
		System.out.println("En Küçük Sayi : " + enKucuk);
	}

	private static void ders10() {
		System.out.println("**** JAVA DERSI 10: Switch Bloklarıyla Çalışmak ****");

		char grade = 'G';

		switch (grade) {
		case 'A':
			System.out.println("Mükemmel : Geçtiniz");
			break;
		case 'B':
			System.out.println("Çok Güzel : Geçtiniz");
			break;
		case 'C':
			System.out.println("iyi : Geçtiniz");
			break;
		case 'D':
			System.out.println("Fena Değil : Geçtiniz");
			break;
		case 'F':
			System.out.println("Malesef Kaldınız");
			break;
		default:
			System.out.println("Geçersiz not girdiniz");
			break;
		}
	}

	private static void ders11() {
		System.out.println("**** JAVA DERSI 11: For Döngüsüyle Çalışmak ****");

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println("Çift sayi :" + i);
			} else {
				System.out.println("Tek sayi : " + i);
			}
		}
		System.out.println("Döngü Bitti");
	}

	private static void ders12() {
		System.out.println("**** JAVA DERSI 12: While Döngüsüyle Çalışmak ****");

		int i = 1;
		while (i < 10) {
			System.out.println(i);
			i++;
		}
	}

	private static void ders13() {
		System.out.println("**** JAVA DERSI 13: Do-While Döngüsüyle Çalışmak ****");

		int i = 1;

		do {
			System.out.println(i);
			i += 2;
		} while (i > 10);
		System.out.println("Do-While döngüsü bitti");
	}

	private static void ders14() {
		System.out.println("**** JAVA DERSI 14: Dizilerle Çalışmaya Başlamak ****");

		String ogrenci1 = "Emir";
		String ogrenci2 = "Demir";
		String ogrenci3 = "Ali";
		String ogrenci4 = "Veli";

		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);

		String[] ogrenciler = new String[4];
		ogrenciler[0] = "Emirhan";
		ogrenciler[1] = "Demirhan";
		ogrenciler[2] = "Alihan";
		ogrenciler[3] = "Velihan";

		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}

		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}
	}

	private static void ders15() {
		System.out.println("**** JAVA DERSI 15: ReCap Demo 2 Dizilerle Çalışmak ****");

		double[] myList = { 1.2, 6.3, 4.3, 5.6 };

		double total = 0;

		double max = myList[0];

		for (double number : myList) {
			if (max < number) {
				max = number;
			}
			total += number;
			System.out.println(number);
		}
		System.out.println("Total : " + total);
		System.out.println("Max : " + max);
	}

	private static void ders16() {
		System.out.println("**** JAVA DERSI 16: Çok Boyutlu Dizilerle Çalışmak ****");

		String[][] sehirler = new String[3][3];
		sehirler[0][0] = "İstanbul";
		sehirler[0][1] = "Bursa";
		sehirler[0][2] = "Bilecik";
		sehirler[1][0] = "Ankara";
		sehirler[1][1] = "Konya";
		sehirler[1][2] = "Kayseri";
		sehirler[2][0] = "Diyarbakır";
		sehirler[2][1] = "Şanlıurfa";
		sehirler[2][2] = "Gazianntep";

		for (int i = 0; i < sehirler.length; i++) {
			System.out.println("-----");
			for (int j = 0; j < sehirler[i].length; j++) {
				System.out.println(sehirler[i][j]);
			}
		}
	}

	private static void ders17() {
		System.out.println("**** JAVA DERSI 17: Stringlerle Çalışmak 1 ****");

		// bir karakter dizisidir
		String mesaj = "Bugün hava çok güzel";
		System.out.println(mesaj);

		System.out.println("Eleman sayısı : " + mesaj.length());
		System.out.println("5. eleman : " + mesaj.charAt(4));
		System.out.println(mesaj.concat(". Yaşasın!"));
		System.out.println(mesaj.startsWith("B"));
		System.out.println(mesaj.startsWith("A"));
		System.out.println(mesaj.endsWith("l"));

		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);

		System.out.println(mesaj.indexOf('a')); // 7
		System.out.println(mesaj.lastIndexOf('a')); // 9
	}

	private static void ders18() {
		System.out.println("**** JAVA DERSI 18: Stringlerle Çalışmak 2 ****");

		String mesaj = " Bugün hava çok güzel. ";
		System.out.println(mesaj);

		String yeniMesaj = mesaj.replace(" ", "-");
		System.out.println(yeniMesaj);

		System.out.println(mesaj.substring(2, 5));

		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}

		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());

		System.out.println(mesaj.trim());
	}

	private static void ders19MiniProje1() {
		System.out.println("**** JAVA DERSI 19: Mini Proje 1 - Sayı Asal mı?****");

		int number = 19;

		if (number == 1) {
			System.out.println("Sayı asal değildir!");
			return;
		}

		if (number < 2) {
			System.out.println("Sayı 1 den büyük olmalı!");
		}

		boolean isPrime = true;

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
				break;
			}
		}

		if (isPrime) {
			System.out.println("Sayı asal");
		} else {
			System.out.println("Sayı asal değil!");
		}
	}

	private static void ders20MiniProje2() {
		System.out.println("**** JAVA DERSI 20: Mini Proje 2 - Kalın Sesli ve İnce Sesli Harfler ****");

		char harf = 'a';

		switch (harf) {
		case 'a':
		case 'ı':
		case 'o':
		case 'u':
			System.out.println("Karakter kalın sesli bir harftir.");
			break;
		default:
			System.out.println("Karakter ince sesli bir harftir.");
			break;
		}
	}

	private static void ders21MiniProje3() {
		System.out.println("**** JAVA DERSI 21: Mini Proje 3 - Mükemmel Sayılar ****");

		int number = 28;

		int total = 0;

		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				total += i;
			}
		}

		if (total == number) {
			System.out.println("Mükemmel sayı");
		} else {
			System.out.println("Mükemmel sayı değil!");
		}
	}

	private static void ders22MiniProje4() {
		System.out.println("**** JAVA DERSI 22: Mini Proje 4 - Arkadaş Sayılar ****");

		int number1 = 220;
		int number2 = 284;

		int total1 = 0;
		int total2 = 0;

		for (int i = 1; i < number1; i++) {
			if (number1 % i == 0) {
				total1 += i;
			}
		}
		System.out.println(total1);

		for (int i = 1; i < number2; i++) {
			if (number2 % i == 0) {
				total2 += i;
			}
		}
		System.out.println(total2);
		if (number1 == total2 && number2 == total1) {
			System.out.println("Arkadaş Sayılar. :)");
		} else {
			System.out.println("Arkadaş sayı değiller. :(");
		}
	}

	private static void ders23MiniProje5() {
		System.out.println("**** JAVA DERSI 23: Mini Proje 5 - Sayı Bulma ****");

		int[] numbers = new int[] { 1, 2, 5, 7, 9 };
		int lookingFor = 5;

		boolean hasNumber = false;

		for (int i : numbers) {
			if (i == lookingFor) {
				System.out.println("Sayı bulundu");
				hasNumber = true;
				break;
			}
		}
		if (!hasNumber) {
			System.out.println("Sayı bulunamadı");
		}
	}
}
