
public class Cooker extends ElectricalDevice {
	protected boolean cooking;
	
	public Cooker(String nameDevice, float price, String id, int switcher, boolean cooking) {
		super(nameDevice, price, id, switcher);
		this.cooking = cooking;
	}
}
