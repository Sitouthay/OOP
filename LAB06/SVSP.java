
public class SVSP extends SV {
	protected String noiTT;
	protected float diemTT;
	
	public SVSP(String hoTen, int namSinh, float dtb, String noiTT, float diemTT) {
		super(hoTen, namSinh, dtb);
		this.noiTT = noiTT;
		this.diemTT = diemTT;
	}
	
	public void hienThi() {
		System.out.println("");
	}
	
	@Override
	public String loaiSV() {
		return "SP";
	}

	@Override
	public boolean duocTN() {
		return dtb >= 5 && diemTT >= 7;
		
	}
	
	public boolean equals(Object s)
	{
		if (s instanceof SVSP)
		{
			SVSP ss = (SVSP) s;
			return hoTen.equals(ss.hoTen) && namSinh==ss.namSinh && dtb==ss.dtb && noiTT.equals(ss.noiTT) && diemTT == ss.diemTT;
		}
		else return false;	
	}

	
}
