from Baju import Baju

def display_table(produk):

    header = ["ID", "Nama Produk", "Harga", "Stok", "Jenis", "Bahan", "Warna", "Untuk", "Size", "Merk"]
    
    # Menentukan panjang maksimum setiap kolom (antara panjang header dan data terpanjang)
    col_width = [len(h) for h in header]

    for item in produk:
        col_width[0] = max(col_width[0], len(str(item.get_id())))
        col_width[1] = max(col_width[1], len(item.get_nama()))
        col_width[2] = max(col_width[2], len(str(item.get_harga())))
        col_width[3] = max(col_width[3], len(str(item.get_stok())))
        col_width[4] = max(col_width[4], len(item.get_jenis()))
        col_width[5] = max(col_width[5], len(item.get_bahan()))
        col_width[6] = max(col_width[6], len(item.get_warna()))
        col_width[7] = max(col_width[7], len(item.get_untuk()))
        col_width[8] = max(col_width[8], len(item.get_size()))
        col_width[9] = max(col_width[9], len(item.get_merk()))

    # Membuat garis pemisah tabel
    garis = "+" + "+".join("-" * (w + 2) for w in col_width) + "+"

    # Cetak Header
    print(garis)
    print("| " + " | ".join(h.ljust(col_width[i]) for i, h in enumerate(header)) + " |")
    print(garis)

    # Cetak Data Produk
    for item in produk:
        print("| " + 
              f"{str(item.get_id()).rjust(col_width[0])} | " +
              f"{item.get_nama().ljust(col_width[1])} | " +
              f"{str(item.get_harga()).rjust(col_width[2])} | " +
              f"{str(item.get_stok()).rjust(col_width[3])} | " +
              f"{item.get_jenis().ljust(col_width[4])} | " +
              f"{item.get_bahan().ljust(col_width[5])} | " +
              f"{item.get_warna().ljust(col_width[6])} | " +
              f"{item.get_untuk().ljust(col_width[7])} | " +
              f"{item.get_size().ljust(col_width[8])} | " +
              f"{item.get_merk().ljust(col_width[9])} |")
    
    print(garis)


def main():
    produk = [
        Baju(1, "Dress", 50000, 100, "Fashion", "Kanvas", "Merah", "Kucing", "M", "Nike"),
        Baju(2, "Kaos", 75000, 50, "Fashion", "Katun", "Putih", "Kelinci", "L", "Adidas"),
        Baju(3, "Pelana", 120000, 30, "Pelindung", "Kulit", "Hitam", "Kuda", "M", "Gucci"),
        Baju(4, "Pelana", 250000, 20, "Pelindung", "Kulit", "Coklat", "Onta", "L", "Puma"),
        Baju(5, "Jaket", 90000, 10, "Fashion", "Logam", "Emas", "Kucing", "M", "Ray-Ban")
    ]

    # Input produk baru dari user
    print("\nMasukkan Data Produk Baru:")
    id_produk = int(input("ID: "))
    nama_produk = input("Nama Produk: ")
    harga_produk = int(input("Harga Produk: "))
    stok_produk = int(input("Stok Produk: "))
    jenis = input("Jenis: ")
    bahan = input("Bahan: ")
    warna = input("Warna: ")
    untuk = input("Untuk: ")
    size = input("Size: ")
    merk = input("Merk: ")

    produk.append(Baju(id_produk, nama_produk, harga_produk, stok_produk, jenis, bahan, warna, untuk, size, merk))

    print("\nTabel Data Produk PetShop:")
    display_table(produk)

if __name__ == "__main__":
    main()
