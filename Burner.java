package Stove;

public class Burner {
	enum Temperature{ BLAZING, HOT, WARM, COLD}
	Temperature myTemperature;
	Setting mySetting;
	int timer;
	public final int TIME_DURATION; 
	public Burner() {
		myTemperature = COLD;
		mySetting = OFF;
	}
	public Temperature getMyTemperature() {
		return myTemperature;
	}
	public void plusButton() {
		timer = TIME_DURATION;
		switch(getMyTemperature()) {
		  case COLD:
		    myTemperature = WARM;
		    break;
		  case WARM:
		    myTemperature = HOT:
		    break;
		  case HOT:
			myTemperature = BLAZING;
		  default:
			break;
		}
	}
	public void minusButton() {
		timer = TIME_DURATION;
		switch(getMyTemperature()) {
		  case BLAZING:
		    myTemperature = HOT;
		    break;
		  case HOT:
		    myTemperature = WARM:
		    break;
		  case COLD:
			myTemperature = OFF;
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
