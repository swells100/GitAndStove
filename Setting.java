package Stove;

public enum Level {
  OFF ("---"), LOW ("--+"), MEDIUM ("-++"), HIGH ("+++");
  private String value;

  Level(String inVal) {
    value = inVal;
  }

  public String toString() {
    return value;
  }
}
