// Gibson Green
// Integration Project
/**iPhone class extends the Apple Product class and is a class describing iPhones.
 * @author gibso
 *
 */
public class iPhone extends AppleProducts {
  /** what is the iPhone color.
   * 
   */
  protected String iphoneColor;
  /** gives the iPhone storage.
   * 
   */
  protected int iPhoneStorageSize;

  /** gets the iPhone color.
   * @return iPhone color
   */
  public String getiPhoneColor() {
    return iphoneColor;
  }

  /** sets the iPhone color.
   * @param iPhoneColor
   */
  public void setiPhoneColor(String iPhoneColor) {
    this.iphoneColor = iPhoneColor;
  }

  /** gets the iPhone storage size.
   * @return storage size
   */
  public int getiPhoneStorageSize() {
    return iPhoneStorageSize;
  }

  /** sets the iPhone storage size.
   * @param iPhoneStorageSize
   */
  public void setiPhoneStorageSize(int iPhoneStorageSize) {
    this.iPhoneStorageSize = iPhoneStorageSize;
  }
  
  //overriden communicate method
  /* (non-Javadoc)
   * @see AppleProducts#communicate()
   */
  public void communicate() {
    System.out.println("This iPhone is making a phone call.");
  }
  
  //overriden product type method
  /* (non-Javadoc)
   * @see AppleProducts#showProductType()
   */
  public void showProductType() {
    System.out.println("This is a iPhone.");
  }
}
