package Stove;

public class Burner {
	enum Temperature{ BLAZING, HOT, WARM, COLD}
	Temperature myTemperature;
	Setting mySetting;
	int timer;
	public final int TIME_DURATION = 2;
	public Burner() {
		myTemperature = Temperature.COLD;
		mySetting = Setting.OFF;
	}
	public Temperature getMyTemperature() {
		return myTemperature;
	}
	public void plusButton() {
		timer = TIME_DURATION;
		switch(getMyTemperature()) {
		  case COLD:
		    myTemperature = Temperature.WARM;
		    break;
		  case WARM:
		    myTemperature = Temperature.HOT;
		    break;
		  case HOT:
			myTemperature = Temperature.BLAZING;
		  default:
			break;
		}
	}
	public void minusButton() {
		timer = TIME_DURATION;
		switch(getMyTemperature()) {
		  case BLAZING:
		    myTemperature = Temperature.HOT;
		    break;
		  case HOT:
		    myTemperature = Temperature.WARM;
		    break;
		  case COLD:
			  myTemperature = Temperature.COLD;
		  default:
			break;
		}
	}
	public void updateTemperature() {
		timer++;
		myTemperature.plusButton();
		mySetting = Setting.ON;
		
	}
	public void display() {
		System.out.println("[" + mySetting.toString() + "]....." + myTemperature);
	}
	
}
