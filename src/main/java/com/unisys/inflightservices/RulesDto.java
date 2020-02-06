package com.unisys.inflightservices;

import java.io.Serializable;
import java.util.List;
import org.kie.api.definition.type.Label;



public class RulesDto
  implements Serializable
{
  static final long serialVersionUID = 1L;
  @Label("FlightDetailsList")
  private List<FlightDetails> flightDetailsList;
  
  public RulesDto() {}
  
  public List<FlightDetails> getFlightDetailsList() { return this.flightDetailsList; }



  
  public void setFlightDetailsList(List<FlightDetails> flightDetailsList) { this.flightDetailsList = flightDetailsList; }



  
  public RulesDto(List<FlightDetails> flightDetailsList) { this.flightDetailsList = flightDetailsList; }
}
