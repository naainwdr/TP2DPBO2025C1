<?php
class Petshop {

    public $id;
    public $nama_produk;
    public $harga_produk;
    public $stok_produk;
	public $foto_produk;

    public function __construct($id, $nama_produk, $harga_produk, $stok_produk, $foto_produk) {
        $this->id = $id;
        $this->nama_produk = $nama_produk;
        $this->harga_produk = $harga_produk;
        $this->stok_produk = $stok_produk;
		$this->foto_produk = $foto_produk;
    }

    public function getId() {
        return $this->id;
    }

    public function setId($id) {
        $this->id = $id;
    }

    public function getNama() {
        return $this->nama_produk;
    }

    public function setNama($nama_produk) {
        $this->nama_produk = $nama_produk;
    }

    public function getHarga() {
        return $this->harga_produk;
    }

    public function setHarga($harga_produk) {
        $this->harga_produk = $harga_produk;
    }

    public function getStok() {
        return $this->stok_produk;
    }

    public function setStok($stok_produk) {
        $this->stok_produk = $stok_produk;
    }
	
	public function getFoto() {
        return $this->foto_produk;
    }

    public function setFoto($foto_produk) {
        $this->foto_produk = $foto_produk;
	}
}
?>
