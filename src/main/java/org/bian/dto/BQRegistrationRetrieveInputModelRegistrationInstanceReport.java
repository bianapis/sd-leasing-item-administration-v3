package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRegistrationRetrieveInputModelRegistrationInstanceReport
 */
public class BQRegistrationRetrieveInputModelRegistrationInstanceReport   {
  private String registrationInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return registrationInstanceReportReference
  **/

  public String getRegistrationInstanceReportReference() {
    return registrationInstanceReportReference;
  }

  public void setRegistrationInstanceReportReference(String registrationInstanceReportReference) {
    this.registrationInstanceReportReference = registrationInstanceReportReference;
  }


}

