// Gibson Green
// Integration Project
/** AppleWatch class extends ApplesProducts class and describes an Apple Watch product.
 * @author gibso
 *
 */
public class AppleWatch extends AppleProducts {
  /** what is the wristband size.
   * 
   */
  protected String wristBandSize;
  /** what is the wristband color.
   * 
   */
  protected String wristBandColor;
  /**what the apple watch series number is.
   * 
   */
  protected int seriesNumber;

  //overriden communicate method
  /* (non-Javadoc)
   * @see AppleProducts#communicate()
   */
  public void communicate() {
    System.out.println("This Apple Watch is communicating with the outside world.");
  }

  /** gets the wrist band string size.
   * @return wrist band size
   */
  public String getWristBandSize() {
    return wristBandSize;
  }

  /** sets the wrist band size.
   * @param wristBandSize
   */
  public void setWristBandSize(String wristBandSize) {
    this.wristBandSize = wristBandSize;
  }

  /** gets the wristband color.
   * @return wristband color
   */
  public String getWristBandColor() {
    return wristBandColor;
  }

  /** sets the wristband color.
   * @param wristBandColor
   */
  public void setWristBandColor(String wristBandColor) {
    this.wristBandColor = wristBandColor;
  }

  /** gets the applewatch series number.
   * @return series number
   */
  public int getSeriesNumber() {
    return seriesNumber;
  }

  /** sets the apple watch series number.
   * @param seriesNumber
   */
  public void setSeriesNumber(int seriesNumber) {
    this.seriesNumber = seriesNumber;
  }

  /**
   * 
   */
  public void takeHeartRate() {
    System.out.println("Apple Watch is taking your heart rate.");
  }

  //prints EKG to the screen as method specific to AppleWatch
  /**
   * 
   */
  public void takeEkg() {
    System.out.println("Apple Watch is taking your EKG.");
  }
  
  /* (non-Javadoc)
   * @see AppleProducts#showProductType()
   */
  public void showProductType() {
    System.out.println("This is a Apple Watch.");
  }
}
