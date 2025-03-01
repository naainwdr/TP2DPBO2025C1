import java.util.*;

public class Main {
    public static void displayTable(List<Baju> produk) {

        // Header tabel
        String[] header = {"ID", "Nama Produk", "Harga", "Stok", "Jenis", "Bahan", "Warna", "Untuk", "Size", "Merk"};
        int[] colWidth = {2, 11, 5, 4, 5, 5, 5, 5, 4, 4};

        // Menyesuaikan lebar kolom dengan data
        for (Baju baju : produk) {
            colWidth[0] = Math.max(colWidth[0], String.valueOf(baju.getId()).length());
            colWidth[1] = Math.max(colWidth[1], baju.getNama().length());
            colWidth[2] = Math.max(colWidth[2], String.valueOf(baju.getHarga()).length());
            colWidth[3] = Math.max(colWidth[3], String.valueOf(baju.getStok()).length());
            colWidth[4] = Math.max(colWidth[4], baju.getJenis().length());
            colWidth[5] = Math.max(colWidth[5], baju.getBahan().length());
            colWidth[6] = Math.max(colWidth[6], baju.getWarna().length());
            colWidth[7] = Math.max(colWidth[7], baju.getUntuk().length());
            colWidth[8] = Math.max(colWidth[8], baju.getSize().length());
            colWidth[9] = Math.max(colWidth[9], baju.getMerk().length());
        }

        // Membuat garis pemisah tabel
		StringBuilder garis = new StringBuilder("+");
		for (int width : colWidth) {
			garis.append("-".repeat(width + 2)).append("+"); // Tambahkan 2 untuk margin kiri dan kanan
		}


        // Menampilkan header
        System.out.println(garis);
        System.out.print("|");
        for (int i = 0; i < 10; i++) {
            System.out.printf(" %-"+ colWidth[i] +"s |", header[i]); // Rata kiri
        }
        System.out.println();
        System.out.println(garis);

        // Menampilkan isi tabel
        for (Baju baju : produk) {
            System.out.printf("| %" + colWidth[0] + "d | %-"+ colWidth[1] +"s | %" + colWidth[2] + "d | %" + colWidth[3] + "d | %-"+ colWidth[4] +"s | %-"+ colWidth[5] +"s | %-"+ colWidth[6] +"s | %-"+ colWidth[7] +"s | %-"+ colWidth[8] +"s | %-"+ colWidth[9] +"s |\n",
                    baju.getId(), baju.getNama(), baju.getHarga(), baju.getStok(),
                    baju.getJenis(), baju.getBahan(), baju.getWarna(),
                    baju.getUntuk(), baju.getSize(), baju.getMerk());
        }
        System.out.println(garis);
    }

    public static void main(String[] args) {
        List<Baju> produk = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

        // Membuat objek Baju satu per satu dengan setter
        Baju temp;

        temp = new Baju();
        temp.setId(1);
        temp.setNama("Dress");
        temp.setHarga(50000);
        temp.setStok(100);
        temp.setJenis("Fashion");
        temp.setBahan("Kanvas");
        temp.setWarna("Merah");
        temp.setUntuk("Kucing");
        temp.setSize("M");
        temp.setMerk("Nike");
        produk.add(temp);

        temp = new Baju();
        temp.setId(2);
        temp.setNama("Kaos");
        temp.setHarga(75000);
        temp.setStok(50);
        temp.setJenis("Fashion");
        temp.setBahan("Katun");
        temp.setWarna("Putih");
        temp.setUntuk("Kelinci");
        temp.setSize("L");
        temp.setMerk("Adidas");
        produk.add(temp);

        temp = new Baju();
        temp.setId(3);
        temp.setNama("Pelana");
        temp.setHarga(120000);
        temp.setStok(30);
        temp.setJenis("Pelindung");
        temp.setBahan("Kulit");
        temp.setWarna("Hitam");
        temp.setUntuk("Kuda");
        temp.setSize("M");
        temp.setMerk("Gucci");
        produk.add(temp);

        temp = new Baju();
        temp.setId(4);
        temp.setNama("Pelana");
        temp.setHarga(250000);
        temp.setStok(20);
        temp.setJenis("Pelindung");
        temp.setBahan("Kulit");
        temp.setWarna("Coklat");
        temp.setUntuk("Onta");
        temp.setSize("L");
        temp.setMerk("Puma");
        produk.add(temp);

        temp = new Baju();
        temp.setId(5);
        temp.setNama("Jaket");
        temp.setHarga(90000);
        temp.setStok(10);
        temp.setJenis("Fashion");
        temp.setBahan("Ceruty");
        temp.setWarna("Merah Muda");
        temp.setUntuk("Kucing");
        temp.setSize("M");
        temp.setMerk("Ray-Ban");
        produk.add(temp);
		
		// Tambah produk baru dari input user
        System.out.println("\nMasukkan Data Produk Baru:");

        Baju bajuBaru = new Baju(); // Buat objek baru

        System.out.print("ID: ");
        bajuBaru.setId(scanner.nextInt());
        scanner.nextLine(); // Membersihkan buffer input
        System.out.print("Nama Produk: ");
        bajuBaru.setNama(scanner.nextLine());
        System.out.print("Harga Produk: ");
        bajuBaru.setHarga(scanner.nextInt());
        System.out.print("Stok Produk: ");
        bajuBaru.setStok(scanner.nextInt());
        scanner.nextLine(); // Membersihkan buffer input
        System.out.print("Jenis: ");
        bajuBaru.setJenis(scanner.nextLine());
        System.out.print("Bahan: ");
        bajuBaru.setBahan(scanner.nextLine());
        System.out.print("Warna: ");
        bajuBaru.setWarna(scanner.nextLine());
        System.out.print("Untuk : ");
        bajuBaru.setUntuk(scanner.nextLine());
        System.out.print("Size: ");
        bajuBaru.setSize(scanner.nextLine());
        System.out.print("Merk: ");
        bajuBaru.setMerk(scanner.nextLine());

        // Menambahkan ke list
        produk.add(bajuBaru);

        System.out.println("\nTabel Data Produk PetShop:");
        displayTable(produk);
    }
}
