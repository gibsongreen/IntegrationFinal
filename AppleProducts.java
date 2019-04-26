/** Apple Products class decribes a general class of apple products.
 * @author gibso
 *
 */
public class AppleProducts {
  /** the product name.
   * 
   */
  protected String productName;
  /** the product display size.
   * 
   */
  protected double screenDisplaySize;
  /** serial number of the product.
   * 
   */
  protected String productSerialNumber;
  /** model year of the product.
   * 
   */
  protected int modelYear;
  /** is product charging.
   * 
   */
  protected boolean charging;
  /** is the product touch screen?
   * 
   */
  protected boolean touchScreen;
  
  /** gets the value of the touch screen.
   * @return touch screen.
   */
  public boolean getTouchScreen() {
    return touchScreen;
  }

  /** set the value of the touch screen.
   * @param touchScreen
   */
  public void setTouchScreen(boolean touchScreen) {
    this.touchScreen = touchScreen;
  }
  
  /** gets the value of the charging.
   * @return charging
   */
  public boolean getCharging() {
    return charging;
  }

  /** sets if the product is charging.
   * @param charging
   */
  public void setCharging(boolean charging) {
    this.charging = charging;
  }

  /** gets the productName.
   * @return productName
   */
  public String getProductName() {
    return productName;
  }

  /** sets the productName.
   * @param productName
   */
  public void setProductName(String productName) {
    this.productName = productName;
  }

  /** gets the screenDisplaySize.
   * @return screenDisplaySize
   */
  public double getScreenDisplaySize() {
    return screenDisplaySize;
  }

  /** sets the screenDisplaySize.
   * @param screenDisplaySize
   */
  public void setScreenDisplaySize(double screenDisplaySize) {
    this.screenDisplaySize = screenDisplaySize;
  }

  /** gets the productSerialNumber.
   * @return productSerialNumber
   */
  public String getProductSerialNumber() {
    return productSerialNumber;
  }

  /** sets the productSerialNumber.
   * @param productSerialNumber
   */
  public void setProductSerialNumber(String productSerialNumber) {
    this.productSerialNumber = productSerialNumber;
  }

  /** gets the model year of the product.
   * @return model year
   */
  public int getModelYear() {
    return modelYear;
  }

  /** sets the model year of the product.
   * @param modelYear
   */
  public void setModelYear(int modelYear) {
    this.modelYear = modelYear;
  }

  /** Method communicates.
   * 
   */
  public void communicate() {
    System.out.println("This Apple Product is communicating.");
  }
  
  /** Method prints what type of apple product it is.
   * 
   */
  public void showProductType() {
    System.out.println("This is a generic Apple Product.");
  }

  /** Charging method says if product is charging or not.
   * 
   */
  public void isCharging() {
    if (charging == true) {
      System.out.println("My Apple Product is plugged in and charging.");
    } else {
      System.out.println("My Apple Product is not charging right now.");
    }
  }
}
