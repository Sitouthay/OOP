
public abstract class SV {
	protected String hoTen;
	protected int namSinh;
	protected float dtb;
	
	public abstract String loaiSV();
	public abstract boolean duocTN();                                                                                                     

	public SV(String hoTen, int namSinh, float dtb) {
		this.hoTen = hoTen;
		this.namSinh = namSinh;
		this.dtb = dtb;
	}
	
	public void hienThi() {
		System.out.println("Ten : " + hoTen + ", Sinh Nam : " + namSinh + ", DTB : " + dtb);
	}
	
	
	public boolean equals(Object s)
	{
		if (s instanceof SV)
		{
			SV ss = (SV) s;
			return hoTen.equals(ss.hoTen) && namSinh==ss.namSinh && dtb==ss.dtb;
		}
		else return false;
	}

}
