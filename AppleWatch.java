// Gibson Green
// Integration Project
public class AppleWatch extends AppleProducts {
  protected String wristBandSize;
  protected String wristBandColor;
  protected int seriesNumber;

  //overriden communicate method
  public void communicate() {
    System.out.println("This Apple Watch is communicating with the outside world.");
  }

  public String getWristBandSize() {
    return wristBandSize;
  }

  public void setWristBandSize(String wristBandSize) {
    this.wristBandSize = wristBandSize;
  }

  public String getWristBandColor() {
    return wristBandColor;
  }

  public void setWristBandColor(String wristBandColor) {
    this.wristBandColor = wristBandColor;
  }

  public int getSeriesNumber() {
    return seriesNumber;
  }

  public void setSeriesNumber(int seriesNumber) {
    this.seriesNumber = seriesNumber;
  }

  public void takeHeartRate() {
    System.out.println("Apple Watch is taking your heart rate.");
  }

  //prints EKG to the screen as method specific to AppleWatch
  public void takeEKG() {
    System.out.println("Apple Watch is taking your EKG.");
  }
  public void showProductType() {
    System.out.println("This is a Apple Watch.");
  }
}
