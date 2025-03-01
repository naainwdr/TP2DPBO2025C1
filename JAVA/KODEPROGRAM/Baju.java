public class Baju extends Aksesoris {
    private String untuk;
    private String size;
    private String merk;

	// Constructor default
	public Baju(){
	}
	
    // Constructor dengan parameter
    public Baju(String untuk, String size, String merk) {
        this.untuk = untuk;
        this.size = size;
        this.merk = merk;
    }

    // Getter dan Setter
    public String getUntuk() {
        return untuk;
    }
    public void setUntuk(String untuk) {
        this.untuk = untuk;
    }

    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }

    public String getMerk() {
        return merk;
    }
    public void setMerk(String merk) {
        this.merk = merk;
    }
}
