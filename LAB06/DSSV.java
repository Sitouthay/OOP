
public class DSSV {
	private SV SV[];
	private int soSV;
	
	public DSSV(int x){
        soSV=x;
        SV=new SV[x];
    }
    public void them(SV sv){
        int vt=0;
        while(SV[vt]!=null){
            vt=vt+1;
        }
        SV[vt] = sv;
    }
	
	public String toString() {
		return String.format("soSV : " + soSV);
	}
	
	public void inDS() {
		for(int i = 0; i < soSV ; ++i) {
			SV[i].hienThi();
		}
	}
	
}

