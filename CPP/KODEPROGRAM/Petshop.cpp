#include <bits/stdc++.h>

using namespace std;

class Petshop {
	private:
		int id;
		string nama_produk;
		int harga_produk;
		int stok_produk;

	public:
		Petshop(){
		}

		// Constructor dengan Parameter
		Petshop(int id, string nama_produk, int harga_produk, int stok_produk) {
			this->id = id;
			this->nama_produk = nama_produk;
			this->harga_produk = harga_produk;
			this->stok_produk = stok_produk;
		}

		// Getter dan Setter
		int get_id() {
			return this->id; 
		}
		
		void set_id(int id) {
			this->id = id; 
		}

		string get_nama() {
			return this->nama_produk; 
		}
		
		void set_nama(string nama_produk) {
			this->nama_produk = nama_produk; 
		}

		int get_harga() {
			return this->harga_produk; 
		}
		
		void set_harga(int harga_produk) {
			this->harga_produk = harga_produk; 
		}
		
		int get_stok() {
			return this->stok_produk; 
		}
		
		void set_stok(int stok_produk) {
			this->stok_produk = stok_produk; 
		}

		~Petshop(){
		}
};
