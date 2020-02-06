package com.unisys.inflightservices;

import java.io.Serializable;
import org.kie.api.definition.type.Label;







public class Service
  implements Serializable
{
  static final long serialVersionUID = 1L;
  @Label("Service ID")
  private String serviceId;
  @Label("Service Name")
  private String serviceName;
  @Label("Price")
  private double price;
  @Label("Currency")
  private String currency;
  @Label("Priority")
  private int priority;
  
  public Service() {}
  
  public String getServiceId() { return this.serviceId; }


  
  public void setServiceId(String serviceId) { this.serviceId = serviceId; }


  
  public String getServiceName() { return this.serviceName; }


  
  public void setServiceName(String serviceName) { this.serviceName = serviceName; }


  
  public String getCurrency() { return this.currency; }


  
  public void setCurrency(String currency) { this.currency = currency; }


  
  public int getPriority() { return this.priority; }


  
  public void setPriority(int priority) { this.priority = priority; }


  
  public double getPrice() { return this.price; }


  
  public void setPrice(double price) { this.price = price; }


  
  public Service(String serviceId, String serviceName, double price, String currency, int priority) {
    this.serviceId = serviceId;
    this.serviceName = serviceName;
    this.price = price;
    this.currency = currency;
    this.priority = priority;
  }
}
