
public class Burner {
	enum Temperature{ BLAZING, HOT, WARM, COLD}
	Temperature myTempreture;
	Setting mySetting;
	int timer;
	public final int TIME_DURATION; 
	public Temperature getMyTempreture() {
		return myTempreture;
	}
}
