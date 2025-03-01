class Petshop {

	private int id;
	private String nama_produk;
	private int harga_produk;
	private int stok_produk;

	public Petshop(){
	}

	// Constructor dengan Parameter
	public Petshop(int id, String nama_produk, int harga_produk, int stok_produk) {
		this.id = id;
		this.nama_produk = nama_produk;
		this.harga_produk = harga_produk;
		this.stok_produk = stok_produk;
	}
		
	// Getter dan Setter untuk mengakses dan mengubah data
    public int getId() { 
		return id; 
	}
    public void setId(int id) {
		this.id = id; 
	}

    public String getNama() {
		return nama_produk; 
	}
    public void setNama(String nama) { 
		this.nama_produk = nama; 
	}

    public int getHarga() {
		return harga_produk; 
	}
    public void setHarga(int harga) {
		this.harga_produk = harga;	
	}
	
	public int getStok() {
		return stok_produk; 
	}
    public void setStok(int stok) {
		this.stok_produk = stok;	
	}

}