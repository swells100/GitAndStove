package Stove;

public enum Setting {
  OFF ("---"), LOW ("--+"), MEDIUM ("-++"), HIGH ("+++");
  private String value;

  Setting(String inVal) {
    value = inVal;
  }

  public String toString() {
    return this.value;
  }
}
