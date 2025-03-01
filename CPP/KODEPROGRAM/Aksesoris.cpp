#include <bits/stdc++.h>
#include "Petshop.cpp"

using namespace std;

class Aksesoris : public Petshop {
	private:
		string jenis;
		string bahan;
		string warna;

	public:
		Aksesoris(int id, string nama_produk, int harga_produk, int stok_produk,
		string jenis, string bahan, string warna)
		: Petshop(id, nama_produk, harga_produk, stok_produk) {
			this->jenis = jenis;
			this->bahan = bahan;
			this->warna = warna;
		}
		
		void setJenis(string jenis){
			this->jenis = jenis;
		}
		string getJenis(){
			return jenis;
		}

		void setBahan(string bahan){
			this->bahan = bahan;
		}
		string getBahan(){
			return bahan;
		}

		void setWarna(string warna){
			this->warna = warna;
		}
		string getWarna(){
			return warna;
		}

};
