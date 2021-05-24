package ex07_jdbc.sales;

public class SalesDTO {
	private String selesdate;
	private int seq;
	private String itemcode;
	private int qty;
	private int amount;
	private String regdate;
	
	public SalesDTO() {
		super();
	}
	
	public SalesDTO(String selesdate, int seq, String itemcode, int qty, int amount, String regdate) {
		super();
		this.selesdate = selesdate;
		this.seq = seq;
		this.itemcode = itemcode;
		this.qty = qty;
		this.amount = amount;
		this.regdate = regdate;
	}

	public String getSelesdate() {
		return selesdate;
	}

	public void setSelesdate(String selesdate) {
		this.selesdate = selesdate;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getItemcode() {
		return itemcode;
	}

	public void setItemcode(String itemcode) {
		this.itemcode = itemcode;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	@Override
	public String toString() {
		return "SalesDTO [selesdate=" + selesdate + ", seq=" + seq + ", itemcode=" + itemcode + ", qty=" + qty
				+ ", amount=" + amount + ", regdate=" + regdate + "]";
	}
}
