/*
    	Nama	: Achmad Novanto
	Stambuk : 13020180039
	Tanggal	: 21 April 2020
	Waktu	: 21.02 WITA
*/

public class InherOverridingLingkaran extends InherOverridingBangunDatar{
    
    // jari-jari lingkaran
    float r;
    
    @Override
    float luas(){
        float luas = (float) (Math.PI * r * r);
        System.out.println("Luas lingkaran: " + luas);
        return luas;
    }
    
    @Override
    float keliling(){
        float keliling = (float) (2 * Math.PI * r);
        System.out.println("Keliling Lingkaran: " + keliling);
        return keliling;
    }
    
}