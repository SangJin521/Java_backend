package ArrayListEx;

public class Product {
	private int prdNum;
	private String prdName;
	private int prdPrice;
	
	public Product(int prdnum, String prdName, int prdPrice) {
		super();
		this.prdNum = prdnum;
		this.prdName = prdName;
		this.prdPrice = prdPrice;
	}

	public int getPrdnum() {
		return prdNum;
	}

	public void setPrdnum(int prdnum) {
		this.prdNum = prdnum;
	}

	public String getPrdName() {
		return prdName;
	}

	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}

	public int getPrdPrice() {
		return prdPrice;
	}

	public void setPrdPrice(int prdPrice) {
		this.prdPrice = prdPrice;
	}

	@Override
	public String toString() {
		return "Product [prdnum=" + prdNum + ", prdName=" + prdName + ", prdPrice=" + prdPrice + "]";
	}
	
	
}
