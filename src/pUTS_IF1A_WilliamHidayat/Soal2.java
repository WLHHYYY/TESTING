package pUTS_IF1A_WilliamHidayat;

import java.io.*;
public class Soal2 {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in) ; 
		BufferedReader br = new BufferedReader (isr) ;
		// TODO Auto-generated method stub
	
	System.out.println("masukkan bilangan awal = ");
	int a = Integer.parseInt(br.readLine()) ; 	
	
	System.out.println("masukkan bilangan akhir anda = ");
	int b = Integer.parseInt(br.readLine()) ; 
	
	System.out.println("masukkan kelipatan bilangan ");
	int c = Integer.parseInt(br.readLine());
	
	 int i; 
	    for (i = a; i <= b; i = i + c)
	    if (i%c== 0) { 
	      System.out.print(i + " "); 
	    }
	
	}

}
