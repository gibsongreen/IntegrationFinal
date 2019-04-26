public class AppleProducts {
  protected String productName;
  protected double screenDisplaySize;
  protected String productSerialNumber;
  protected int modelYear;
  protected boolean charging;
  protected boolean touchScreen;
  
  public boolean geTouchScreen() {
    return touchScreen;
  }

  public void setTouchScreen(boolean touchScreen) {
    this.touchScreen = touchScreen;
  }
  
  public boolean getCharging() {
    return charging;
  }

  public void setCharging(boolean charging) {
    this.charging = charging;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public double getScreenDisplaySize() {
    return screenDisplaySize;
  }

  public void setScreenDisplaySize(double screenDisplaySize) {
    this.screenDisplaySize = screenDisplaySize;
  }

  public String getProductSerialNumber() {
    return productSerialNumber;
  }

  public void setProductSerialNumber(String productSerialNumber) {
    this.productSerialNumber = productSerialNumber;
  }

  public int getModelYear() {
    return modelYear;
  }

  public void setModelYear(int modelYear) {
    this.modelYear = modelYear;
  }

  public void communicate() {
    System.out.println("This Apple Product is communicating.");
  }
  
  public void showProductType() {
    System.out.println("This is a generic Apple Product.");
  }

  public void isCharging() {
    if (charging == true) {
      System.out.println("My Apple Product is plugged in and charging.");
    } else {
      System.out.println("My Apple Product is not charging right now.");
    }
  }
}

