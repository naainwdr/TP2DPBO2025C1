#include <iostream>
#include <list>
#include <iomanip>
#include "Baju.cpp"

using namespace std;

void displayTable(list<Baju> &produk) {

    // Header tabel
    string header[] = {"ID", "Nama Produk", "Harga", "Stok", "Jenis", "Bahan", "Warna", "Untuk", "Size", "Merk"};
    int colWidth[10] = {2, 11, 5, 4, 5, 5, 5, 5, 4, 4};

    // Menyesuaikan lebar kolom dengan data
    for (list<Baju>::iterator it = produk.begin(); it != produk.end(); ++it) {
        colWidth[0] = max(colWidth[0], (int)to_string(it->get_id()).length());
        colWidth[1] = max(colWidth[1], (int)it->get_nama().length());
        colWidth[2] = max(colWidth[2], (int)to_string(it->get_harga()).length());
        colWidth[3] = max(colWidth[3], (int)to_string(it->get_stok()).length());
        colWidth[4] = max(colWidth[4], (int)it->getJenis().length());
        colWidth[5] = max(colWidth[5], (int)it->getBahan().length());
        colWidth[6] = max(colWidth[6], (int)it->getWarna().length());
        colWidth[7] = max(colWidth[7], (int)it->getUntuk().length());
        colWidth[8] = max(colWidth[8], (int)it->getSize().length());
        colWidth[9] = max(colWidth[9], (int)it->getMerk().length());
    }

    // Membuat garis pemisah tabel
    string garis = "+";
    for (int i = 0; i < 10; i++) {
        garis += string(colWidth[i] + 2, '-') + "+";
    }
    
    // Menampilkan header
    cout << garis << "\n|";
    for (int i = 0; i < 10; i++) {
        cout << " " << setw(colWidth[i]) << left << header[i] << " |";
    }
    cout << "\n" << garis << "\n";

    // Menampilkan isi tabel
    for (list<Baju>::iterator it = produk.begin(); it != produk.end(); ++it) {
        cout << "| " << setw(colWidth[0]) << it->get_id()
             << " | " << setw(colWidth[1]) << it->get_nama()
             << " | " << setw(colWidth[2]) << it->get_harga()
             << " | " << setw(colWidth[3]) << it->get_stok()
             << " | " << setw(colWidth[4]) << it->getJenis()
             << " | " << setw(colWidth[5]) << it->getBahan()
             << " | " << setw(colWidth[6]) << it->getWarna()
             << " | " << setw(colWidth[7]) << it->getUntuk()
             << " | " << setw(colWidth[8]) << it->getSize()
             << " | " << setw(colWidth[9]) << it->getMerk()
             << " |\n";
    }

    cout << garis << "\n";
}

int main() {
    list<Baju> produk = {
        Baju(1, "Dress", 50000, 100, "Fashion", "Kanvas", "Merah", "Kucing", "M", "Nike"),
        Baju(2, "Kaos", 75000, 50, "Fashion", "Katun", "Putih", "Kelinci", "L", "Adidas"),
        Baju(3, "Pelana", 120000, 30, "Pelindung", "Kulit", "Hitam", "Kuda", "M", "Gucci"),
        Baju(4, "Pelana", 250000, 20, "Pelindung", "Kulit", "Coklat", "Onta", "L", "Puma"),
        Baju(5, "Jaket", 90000, 10, "Fashion", "Logam", "Emas", "Kucing", "M", "Ray-Ban")
    };

    // Input produk baru dari user
    int id, harga_produk, stok_produk;
    string nama_produk, jenis, bahan, warna, untuk, size, merk;

    cout << "Masukkan Data Produk Baru:\n";
    cout << "ID: "; cin >> id;
    cin.ignore();
    cout << "Nama Produk: "; getline(cin, nama_produk);
    cout << "Harga Produk: "; cin >> harga_produk;
    cout << "Stok Produk: "; cin >> stok_produk;
    cin.ignore();
    cout << "Jenis: "; getline(cin, jenis);
    cout << "Bahan: "; getline(cin, bahan);
    cout << "Warna: "; getline(cin, warna);
    cout << "Untuk: "; getline(cin, untuk);
    cout << "Size: "; getline(cin, size);
    cout << "Merk: "; getline(cin, merk);

    produk.push_back(Baju(id, nama_produk, harga_produk, stok_produk, jenis, bahan, warna, untuk, size, merk));

    // Menampilkan tabel data produk
    cout << "\nTabel Data Produk PetShop:\n";
    displayTable(produk);

    return 0;
}
