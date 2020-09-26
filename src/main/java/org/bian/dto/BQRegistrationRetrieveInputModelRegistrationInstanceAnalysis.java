package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRegistrationRetrieveInputModelRegistrationInstanceAnalysis
 */
public class BQRegistrationRetrieveInputModelRegistrationInstanceAnalysis   {
  private String registrationInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return registrationInstanceAnalysisReference
  **/

  public String getRegistrationInstanceAnalysisReference() {
    return registrationInstanceAnalysisReference;
  }

  public void setRegistrationInstanceAnalysisReference(String registrationInstanceAnalysisReference) {
    this.registrationInstanceAnalysisReference = registrationInstanceAnalysisReference;
  }


}

