package pers.harry.entity;


public class Takeout {

  private Integer id;
  private Integer quanitty;
  private java.util.Date outDate;
  private String handler;
  private Integer productId;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public Integer getQuanitty() {
    return quanitty;
  }

  public void setQuanitty(Integer quanitty) {
    this.quanitty = quanitty;
  }


  public java.util.Date getOutDate() {
    return outDate;
  }

  public void setOutDate(java.util.Date outDate) {
    this.outDate = outDate;
  }


  public String getHandler() {
    return handler;
  }

  public void setHandler(String handler) {
    this.handler = handler;
  }


  public Integer getProductId() {
    return productId;
  }

  public void setProductId(Integer productId) {
    this.productId = productId;
  }

}
