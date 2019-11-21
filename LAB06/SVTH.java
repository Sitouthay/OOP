
public class SVTH extends SV {
	protected String tenDT;
	protected float diemDT;
	
	public SVTH(String hoTen, int namSinh, float dtb, String tenDT, float diemDT) {
		super(hoTen, namSinh, dtb);
		this.tenDT = tenDT;
		this.diemDT = diemDT;
	}
	
	public void hienThi() {
		System.out.println("");
	}
	
	@Override
	public String loaiSV() {
		return "TT";
	}

	@Override
	public boolean duocTN() {
		return dtb >= 5 && diemDT >= 7;
	}
	
	public boolean equals(Object s)
	{
		if (s instanceof SVTH)
		{
			SVTH ss = (SVTH) s;
			return hoTen.equals(ss.hoTen) && namSinh==ss.namSinh && dtb==ss.dtb && tenDT.equals(ss.tenDT) && diemDT == ss.diemDT;
		}
		else return false;
	}


}
