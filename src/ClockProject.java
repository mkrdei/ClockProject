import java.util.Scanner;

public class ClockProject {
	public static void main(String[] args) {
		String ilkBolum = null;
		String ikinciBolum = null;
		String ucuncuBolum = null;
		String dorduncuBolum = null;
		String osoo;
		Scanner sc = new Scanner(System.in);
		System.out.print("Saati Giriniz: (SS:DD) ");
		String girdi = sc.nextLine();
		String[] ayir = girdi.split("(?!^)");
		String part1 = ayir[0];
		String part2 = ayir[1];
		String part3 = ayir[3];
		String part4 = ayir[4];
		int part1Int = Integer.parseInt(part1);
		int part2Int = Integer.parseInt(part2);
		int part3Int = Integer.parseInt(part3);
		int part4Int = Integer.parseInt(part4);

		if (part1Int > 2 || (part1Int == 2 && part2Int > 3) || (part3Int * 10 + part4Int) > 59
				|| (part3Int * 10 + part4Int) < 0 || !ayir[2].equals(":")) {
			System.out.println("geçersiz bir saat girdiniz.");

		} else {

			if (part1Int * 10 + part2Int >= 12) {
				osoo = "ös";
				part1Int -= 1;
				part2Int -= 2;
			} else {
				osoo = "öö";
			}
			if (part2Int == -1) {
				part1Int = 0;
				part2Int = 9;
			}
			if (part2Int == -1) {
				part2Int = 9;
			}

			if (part1Int == 1) {
				ilkBolum = "on";
			} else {
				ilkBolum = "";
			}

			if (part2Int == 0) {
				ikinciBolum = "";
			} else if (part2Int == 1) {
				ikinciBolum = "bir";
			} else if (part2Int == 2) {
				ikinciBolum = "iki";
			} else if (part2Int == 3) {
				ikinciBolum = "üç";
			} else if (part2Int == 4) {
				ikinciBolum = "dört";
			} else if (part2Int == 5) {
				ikinciBolum = "beþ";
			} else if (part2Int == 6) {
				ikinciBolum = "altý";
			} else if (part2Int == 7) {
				ikinciBolum = "yedi";
			} else if (part2Int == 8) {
				ikinciBolum = "sekiz";
			} else if (part2Int == 9) {
				ikinciBolum = "dokuz";
			}

			if (part3Int == 0) {
				ucuncuBolum = "";
			} else if (part3Int == 1) {
				ucuncuBolum = "on";
			} else if (part3Int == 2) {
				ucuncuBolum = "yirmi";
			} else if (part3Int == 3) {
				ucuncuBolum = "otuz";
			} else if (part3Int == 4) {
				ucuncuBolum = "kýrk";
			} else if (part3Int == 5) {
				ucuncuBolum = "elli";
			} else if (part3Int == 6) {
				ucuncuBolum = "altmýþ";
			}

			if (part4Int == 0) {
				dorduncuBolum = "";
			} else if (part4Int == 1) {
				dorduncuBolum = "bir";
			} else if (part4Int == 2) {
				dorduncuBolum = "iki";
			} else if (part4Int == 3) {
				dorduncuBolum = "üç";
			} else if (part4Int == 4) {
				dorduncuBolum = "dört";
			} else if (part4Int == 5) {
				dorduncuBolum = "beþ";
			} else if (part4Int == 6) {
				dorduncuBolum = "altý";
			} else if (part4Int == 7) {
				dorduncuBolum = "yedi";
			} else if (part4Int == 8) {
				dorduncuBolum = "sekiz";
			} else if (part4Int == 9) {
				dorduncuBolum = "dokuz";
			}

			if (part1Int + part2Int == 0) {
				ilkBolum = "on";
				ikinciBolum = "iki";
			}

			System.out.println("" + ilkBolum + "" + ikinciBolum + " " + ucuncuBolum + dorduncuBolum + " " + osoo);
		}
	}
}
