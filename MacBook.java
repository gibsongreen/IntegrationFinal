// Gibson Green
// Integration Project
/** MacBook class extends ApplesProducts and is a class describing MacBooks.
 * @author gibso
 *
 */
public class MacBook extends AppleProducts {
  /** touch display keyboard if it has one or not.
   * 
   */
  protected boolean touchDiplayKeyboard;
  /**
   * how many ports does computer have.
   */
  protected int numberOfPorts;
  /**
   * how much storage computer has.
   */
  protected int macBookStorageSize;

  /* (non-Javadoc)
   * @see AppleProducts#communicate()
   */
  public void communicate() {
    System.out.println("This MacBook is sending an email to the outside world.");
  }

  /** isTouchDisplayKeyBoard returns if touch keyboard is on computer.
   * @return touchDisplayKeyboard
   */
  public boolean isTouchDiplayKeyboard() {
    return touchDiplayKeyboard;
  }

  /** sets the boolean to true or false if they keyboard has touch keyboard.
   * @param touchDiplayKeyboard
   */
  public void setTouchDiplayKeyboard(boolean touchDiplayKeyboard) {
    this.touchDiplayKeyboard = touchDiplayKeyboard;
  }

  /** gets the number of ports the computer has.
   * @return number of ports.
   */
  public int getNumberOfPorts() {
    return numberOfPorts;
  }

  /** sets the number of ports that the computer has.
   * @param numberOfPorts
   */
  public void setNumberOfPorts(int numberOfPorts) {
    this.numberOfPorts = numberOfPorts;
  }

  /** gets the MacBook storages size.
   * @return MacBook Storage Size
   */
  public int getMacBookStorageSize() {
    return macBookStorageSize;
  }

  /** sets the MacBook storage size.
   * @param macBookStorageSize
   */
  public void setMacBookStorageSize(int macBookStorageSize) {
    this.macBookStorageSize = macBookStorageSize;
  }

  /* (non-Javadoc)
   * @see AppleProducts#showProductType()
   */
  public void showProductType() {
    System.out.println("This is a MacBook.");
  }
}
