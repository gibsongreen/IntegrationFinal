// Gibson Green
// Integration Project
public class MacBook extends AppleProducts {
  protected boolean touchDiplayKeyboard;
  protected int numberOfPorts;
  protected int macBookStorageSize;

  // overriden communicate method
  public void communicate() {
    System.out.println("This MacBook is sending an email to the outside world.");
  }

  public boolean isTouchDiplayKeyboard() {
    return touchDiplayKeyboard;
  }

  public void setTouchDiplayKeyboard(boolean touchDiplayKeyboard) {
    this.touchDiplayKeyboard = touchDiplayKeyboard;
  }

  public int getNumberOfPorts() {
    return numberOfPorts;
  }

  public void setNumberOfPorts(int numberOfPorts) {
    this.numberOfPorts = numberOfPorts;
  }

  public int getMacBookStorageSize() {
    return macBookStorageSize;
  }

  public void setMacBookStorageSize(int macBookStorageSize) {
    this.macBookStorageSize = macBookStorageSize;
  }

  public void showProductType() {
    System.out.println("This is a MacBook.");
  }
}
