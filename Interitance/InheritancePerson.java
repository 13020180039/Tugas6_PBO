/*
    	Nama	: Achmad Novanto
	Stambuk : 13020180039
	Tanggal	: 21 April 2020
	Waktu	: 21.02 WITA
*/

public class InheritancePerson {
protected String nama;
protected String alamat;

public InheritancePerson(){
System.out.println("inside person:construktor");
nama = "";
alamat = "";
}

public InheritancePerson(String nama, String alamat) {
this.nama = nama;
this.alamat = alamat;
    }

public String getAlamat() {
return alamat;
    }

public void setAlamat(String alamat) {
this.alamat = alamat;
    }

public String getNama() {
return nama;
    }

public void setNama(String nama) {
this.nama = nama;
    }

}