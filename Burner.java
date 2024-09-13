
public class Burner {
	enum Temperature{ BLAZING, HOT, WARM, COLD}
	Temperature myTempreture;
	Setting mySetting;
	int timer;
	public final int TIME_DURATION; 
	public Burner() {
		myTempreture = COLD;
		mySetting = OFF;
	}
	public Temperature getMyTempreture() {
		return myTempreture;
	}
	public void plusButton() {
		timer = TIME_DURATION;
		switch(getMyTempreture()) {
		  case COLD:
		    myTempreture = WARM;
		    break;
		  case WARM:
		    myTempreture = HOT:
		    break;
		  case HOT:
			myTempreture = BLAZING;
		  default:
			break;
		}
	}
	public void minusButton() {
		timer = TIME_DURATION;
		switch(getMyTempreture()) {
		  case BLAZING:
		    myTempreture = HOT;
		    break;
		  case HOT:
		    myTempreture = WARM:
		    break;
		  case COLD:
			myTempreture = OFF;
		  default:
			break;
		}
	}
	public void updateTimer() {
		timer++;
	}
	public void display() {
		System.out.println(Burner.toString());
	}
	
}
