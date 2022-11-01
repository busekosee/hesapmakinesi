import java.io.InputStream;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	dörtislem obje=new dörtislem();
	System.out.println("sayı bir giriniz:");
	
	Scanner sayı1=new Scanner(System.in);
	float ilksayı=sayı1.nextFloat();
	System.out.println("islem seciniz");
		Scanner islem=new Scanner(System.in);
		int islemdegeri=islem.nextInt();
		System.out.println("sayı iki giriniz:");
	Scanner sayı2=new Scanner(System.in);
		float ikincisayi=sayı2.nextFloat();
	
		türevinteagral obje1=new türevinteagral();
		System.out.println("katsayı giriniz:");
		Scanner katsayı=new Scanner(System.in);
		int katsayıdegeri=katsayı.nextInt();
		System.out.println("üs giriniz:");
		Scanner üs=new Scanner(System .in);
		int üsdegeri=üs.nextInt();
		mutlakdeger obje2=new mutlakdeger();
		Scanner sayı=new Scanner(System.in);
		int deger=sayı.nextInt();
		System.out.println("sayı giriniz:"+"|"+deger+"|");
		modalma obje3=new modalma();
		Scanner sayı5=new Scanner(System.in);
		int deger1=sayı.nextInt();
		Scanner say2=new Scanner(System.in);
		int deger2=say2.nextInt();
		
		
		switch(islemdegeri) {
		case 1:obje.toplama(ilksayı, ikincisayi);
	break;
	case 2:obje.cıkarma(ilksayı, ikincisayi);
	break;
	case 3:obje.bölme(ilksayı, ikincisayi);
	break;
	case 4:obje.carpma(ilksayı, ikincisayi);
	break;
		case 5:obje1.türev(katsayıdegeri, üsdegeri);
		break;		case 6:obje1.integral(katsayıdegeri, üsdegeri);
		break;

		case 7:obje2.mutlak(deger);
		break;
	case 8:obje3.modal(deger1, deger2);
		}
		

	}

	
}
