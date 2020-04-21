/*
    	Nama	: Achmad Novanto
	Stambuk : 13020180039
	Tanggal	: 21 April 2020
	Waktu	: 21.02 WITA
*/

public class PolymorphismHewan
{
    public static void main(String[] args) 
    {
        PolymorphismMakhluk tombol;
        PolymorphismMamalia mamalia=new PolymorphismMamalia();
        PolymorphismSapi sapiSumba=new PolymorphismSapi();
        tombol=mamalia;
        tombol.info();      //polymorphism
        tombol=sapiSumba;
        tombol.info();      //polymorphism
    }
}