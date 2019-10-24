
public class Fan extends ElectricalDevice {
	protected int speed = 0;
	protected boolean swing;
	
	
	public Fan(String nameDevice, float price, String id, int switcher, int speed, boolean swing) {
		super(nameDevice, price, id, switcher);
		this.speed = speed;
		this.swing = swing;
	}
	
	public int incSpeed(int touch) {
		if(touch == 1) {
			speed = 1;
		}if(touch == 2) {
			speed = 2;
		}if(touch == 3) {
			speed = 3;
		}else { 
			speed = 0;
		}
		return touch;
	}

	public boolean update() {
		if(swing = true) {
			System.out.println("Swing");
			return true;
		}else 
			System.out.println("Stand");
			return false;
	}
}
