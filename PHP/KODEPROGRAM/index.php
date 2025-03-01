<?php
require_once "Baju.php";

$produk = [
	new Baju(1, "Dress", 50000, 100, "uploads/n.jpg", "Fashion", "Kanvas", "Merah", "Kucing", "M", "Nike"),
	new Baju(2, "Kaos", 75000, 50, "uploads/k.jpg", "Fashion", "Katun", "Putih", "Kelinci", "L", "Adidas"),
	new Baju(3, "Pelana", 120000, 30, "uploads/r.jpg", "Pelindung", "Kulit", "Hitam", "Kuda", "M", "Gucci"),
	new Baju(4, "Pelana", 250000, 20, "uploads/i.jpg", "Pelindung", "Kulit", "Coklat", "Onta", "L", "Puma"),
	new Baju(5, "Jaket", 90000, 10, "uploads/e.jpg", "Fashion", "Logam", "Emas", "Kucing", "M", "Ray-Ban"),
];

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $id = count($produk) + 1;
    $nama = $_POST['nama'];
    $harga = $_POST['harga'];
    $stok = $_POST['stok'];
    $jenis = $_POST['jenis'];
    $bahan = $_POST['bahan'];
    $warna = $_POST['warna'];
    $untuk = $_POST['untuk'];
    $size = $_POST['size'];
    $merk = $_POST['merk'];

    // Pastikan folder uploads ada
    $targetDir = "uploads/";
    if (!is_dir($targetDir)) {
        mkdir($targetDir, 0777, true); // Buat folder uploads jika belum ada
    }

    // Upload Foto
    $foto = "uploads/default.jpg"; // Default jika tidak ada foto
    if (!empty($_FILES['foto']['name'])) {
        $targetFile = $targetDir . basename($_FILES["foto"]["name"]);
        if (move_uploaded_file($_FILES["foto"]["tmp_name"], $targetFile)) {
            $foto = $targetFile;
        } else {
            echo "Gagal mengunggah file.";
        }
    }

    $produk[] = new Baju($id, $nama, $harga, $stok, $foto, $jenis, $bahan, $warna, $untuk, $size, $merk);
}

?>

<!DOCTYPE html>
<html>
<head>
    <title>Daftar Produk</title>
    <style>
        table { border-collapse: collapse; width: 100%; }
        th, td { border: 1px solid black; padding: 8px; text-align: left; }
        th { background-color: #f2f2f2; }
        img { width: 50px; height: 50px; object-fit: cover; }
    </style>
</head>
<body>
    <h2>Daftar Produk</h2>
    <form method="post" enctype="multipart/form-data">
        <label>Nama Produk: <input type="text" name="nama" required></label><br><br>
        <label>Harga: <input type="number" name="harga" required></label><br><br>
        <label>Stok: <input type="number" name="stok" required></label><br><br>
        <label>Jenis: <input type="text" name="jenis" required></label><br><br>
        <label>Bahan: <input type="text" name="bahan" required></label><br><br>
        <label>Warna: <input type="text" name="warna" required></label><br><br>
        <label>Untuk: <input type="text" name="untuk" required></label><br><br>
        <label>Size: <input type="text" name="size" required></label><br><br>
        <label>Merk: <input type="text" name="merk" required></label><br><br>
        <label>Foto Produk: <input type="file" name="foto"></label><br><br>
        <button type="submit">Tambah Produk</button>
    </form>
    <br>
    <table>
        <tr>
            <th>ID</th><th>Foto</th><th>Nama Produk</th><th>Harga</th><th>Stok</th><th>Jenis</th>
            <th>Bahan</th><th>Warna</th><th>Untuk</th><th>Size</th><th>Merk</th>
        </tr>
        <?php foreach ($produk as $item): ?>
        <tr>
            <td><?= htmlspecialchars($item->getId()) ?></td>
            <td><img src="<?= htmlspecialchars($item->getFoto()) ?>" alt="<?= htmlspecialchars($item->getNama()) ?>"></td>
            <td><?= htmlspecialchars($item->getNama()) ?></td>
            <td><?= number_format($item->getHarga(), 0, ',', '.') ?></td>
            <td><?= htmlspecialchars($item->getStok()) ?></td>
            <td><?= htmlspecialchars($item->getJenis()) ?></td>
            <td><?= htmlspecialchars($item->getBahan()) ?></td>
            <td><?= htmlspecialchars($item->getWarna()) ?></td>
            <td><?= htmlspecialchars($item->getUntuk()) ?></td>
            <td><?= htmlspecialchars($item->getSize()) ?></td>
            <td><?= htmlspecialchars($item->getMerk()) ?></td>
        </tr>
        <?php endforeach; ?>
    </table>
</body>
</html>
