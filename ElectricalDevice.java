
public class ElectricalDevice implements Switchable {
	protected String nameDevice;
	protected float price;
	protected String id;
	protected int switcher;
	
	
	public ElectricalDevice(String nameDevice, float price, String id, int switcher2) {
		this.nameDevice = nameDevice;
		this.price = price;
		this.id = id;
		this.switcher = switcher2;
	}

	@Override
	public void turnOn() {
		
	}

	
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
	}
	
	
	@Override
	public String toString() {
		return " Name Device : " + nameDevice + ", Price : " + price + ", id : " + id + ", Switcher : "
				+ switcher;
	}
	
	

}
