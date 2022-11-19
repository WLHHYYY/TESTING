package pUTS_IF1A_WilliamHidayat;

import java.io.*;
public class Soal1 {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in) ; 
		BufferedReader br = new BufferedReader (isr) ; 
		// TODO Auto-generated method stub

		String kodemerk = null ;
		String merk = null;
		String kodejenis = null ; 
		String jenis = null ;
		int harga = 0 ; 
		int jumlahbeli ;
		String metodebayar = null;
		int diskon ;
		
		System.out.println("kalkulator pembayaran pelanggan");
		System.out.println("Masukkan kode merk = ");
		kodemerk = br.readLine();
		System.out.println("masukkan kode jenis motor = ");
		kodejenis = br.readLine() ;
		System.out.println("masukkan jumlah beli motor = ");
		jumlahbeli = Integer.parseInt(br.readLine());
		System.out.println("Masukkan metode pembayaran (tunai / kredit) = ");
		metodebayar = br.readLine();
		
		if (kodemerk.equalsIgnoreCase("ymh")) { 
			merk = "Yamaha";
				if (kodejenis.equalsIgnoreCase("b")) { 
					jenis = "bebek" ;
					harga = 15000000 ; 
				}else if (kodejenis.equalsIgnoreCase("m")) { 
					jenis = "matic" ;
					harga = 17000000 ; 
				}else if (kodejenis.equalsIgnoreCase("s")) { 
					jenis = "Sport" ;
					harga = 25000000 ;
				}
		}else if (kodemerk.equalsIgnoreCase("hnd")) {
			merk = "honda" ;
				if (kodejenis.equalsIgnoreCase("b")) { 
				jenis = "bebek" ;
				harga = 20000000 ; 
				}else if (kodejenis.equalsIgnoreCase("m")) { 
				jenis = "matic" ;
				harga = 22000000 ; 
				}else if (kodejenis.equalsIgnoreCase("s"))  { 
				jenis = "Sport" ;
				harga = 25000000 ;
				}
		}else if (kodemerk.equalsIgnoreCase("szk")) { 
			merk = "Suzuki" ;
				if (kodejenis.equalsIgnoreCase("b")) { 
				jenis = "bebek" ;
				harga = 18000000 ; 
				}else if (kodejenis.equalsIgnoreCase("m")) { 
				jenis = "matic" ;
				harga = 20000000 ; 
				}else if (kodejenis.equalsIgnoreCase("s"))  { 
				jenis = "Sport" ;
				harga = 22000000 ;
				}
		}else {
			System.out.println("maaf motor anda tidak terdefinisi");
		}
		
		int subtotal = harga * jumlahbeli ; 
		
		if (metodebayar.equalsIgnoreCase("tunai")) {
			diskon = 15/100*subtotal;
		}else {
			diskon = 0 ; 
		}
		
	
		
		
		System.out.println("jadi merk motor yang ingin anda beli adalah = "+merk);
		System.out.println("Jenis motor yang ingin anda beli adalah =" +jenis );
		System.out.println("Harga motor anda adalah =" +harga);
		System.out.println("diskon yang anda dapatkan adalah " +diskon);
		System.out.println("jadi total bayar yang anda bayarkan sebesar = " +(subtotal - diskon));
	
	}

}
