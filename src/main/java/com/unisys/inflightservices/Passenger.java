package com.unisys.inflightservices;

import java.io.Serializable;
import org.kie.api.definition.type.Label;










public class Passenger
  implements Serializable
{
  static final long serialVersionUID = 1L;
  @Label("Passenger Type")
  private String passengerType;
  @Label("Age")
  private int age;
  @Label("Airline ID")
  private String airlineID;
  @Label("Passenger Name")
  private String passenger_name;
  @Label("Tier Number")
  private String tier_number;
  @Label("ID")
  private String id;
  @Label("Category")
  private String category;
  
  public Passenger() {}
  
  public String getPassengerType() { return this.passengerType; }


  
  public void setPassengerType(String passengerType) { this.passengerType = passengerType; }


  
  public int getAge() { return this.age; }


  
  public void setAge(int age) { this.age = age; }


  
  public String getAirlineID() { return this.airlineID; }


  
  public void setAirlineID(String airlineID) { this.airlineID = airlineID; }


  
  public String getPassenger_name() { return this.passenger_name; }


  
  public void setPassenger_name(String passenger_name) { this.passenger_name = passenger_name; }


  
  public String getTier_number() { return this.tier_number; }


  
  public void setTier_number(String tier_number) { this.tier_number = tier_number; }


  
  public String getId() { return this.id; }


  
  public void setId(String id) { this.id = id; }


  
  public String getCategory() { return this.category; }


  
  public void setCategory(String category) { this.category = category; }




  
  public Passenger(String passengerType, int age, String airlineID, String passenger_name, String tier_number, String id, String category) {
    this.passengerType = passengerType;
    this.age = age;
    this.airlineID = airlineID;
    this.passenger_name = passenger_name;
    this.tier_number = tier_number;
    this.id = id;
    this.category = category;
  }
}
