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
        mySetting = Setting.LOW;
		    break;
		  case WARM:
		    myTemperature = Temperature.HOT;
        mySetting = Setting.MEDIUM;
		    break;
		  case HOT:
			myTemperature = Temperature.BLAZING;
      mySetting = Setting.HIGH;
		  default:
			break;
		}
	}
	public void minusButton() {
		timer = TIME_DURATION;
		switch(getMyTemperature()) {
		  case BLAZING:
		    myTemperature = Temperature.HOT;
        mySetting = Setting.MEDIUM;
		    break;
		  case HOT:
		    myTemperature = Temperature.WARM;
        mySetting = Setting.LOW;
		    break;
		  case COLD:
			  myTemperature = Temperature.COLD;
        mySetting = Setting.OFF;
		  default:
			break;
		}
	}
	public void updateTemperature() {
		timer++;
	}
	public void display() {
		System.out.println("[" + mySetting.toString() + "]....." + myTemperature);
	}
	
}
