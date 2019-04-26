// Gibson Green
// Integration Project
public class iPhone extends AppleProducts {
  protected String iPhoneColor;
  protected int iPhoneStorageSize;

  public String getiPhoneColor() {
    return iPhoneColor;
  }

  public void setiPhoneColor(String iPhoneColor) {
    this.iPhoneColor = iPhoneColor;
  }

  public int getiPhoneStorageSize() {
    return iPhoneStorageSize;
  }

  public void setiPhoneStorageSize(int iPhoneStorageSize) {
    this.iPhoneStorageSize = iPhoneStorageSize;
  }
  
  //overriden communicate method
  public void communicate() {
    System.out.println("This iPhone is making a phone call.");
  }
  //overriden product type method
  public void showProductType() {
    System.out.println("This is a iPhone.");
  }
}

