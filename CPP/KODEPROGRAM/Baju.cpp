#include <bits/stdc++.h>
#include "Aksesoris.cpp"

using namespace std;

class Baju : public Aksesoris {
	private:
		string untuk;
		string size;
		string merk;

	public:
		Baju(int id, string nama_produk, int harga_produk, int stok_produk,
		string jenis, string bahan, string warna, string untuk, string size, string merk)
		: Aksesoris(id, nama_produk, harga_produk, stok_produk, jenis, bahan, warna) {
			this->untuk = untuk;
			this->size = size;
			this->merk = merk;
		}
		
		void setUntuk(string untuk){
			this->untuk = untuk;
		}
		
		string getUntuk(){
			return untuk;
		}

		void setSize(string size){
			this->size = size;
		}
		
		string getSize(){
			return size;
		}

		void setMerk(string merk){
			this->merk = merk;
		}
		
		string getMerk(){
			return merk;
		}
};