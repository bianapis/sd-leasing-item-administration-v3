package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAssuranceRetrieveInputModelAssuranceInstanceAnalysis
 */
public class BQAssuranceRetrieveInputModelAssuranceInstanceAnalysis   {
  private String assuranceInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return assuranceInstanceAnalysisReference
  **/

  public String getAssuranceInstanceAnalysisReference() {
    return assuranceInstanceAnalysisReference;
  }

  public void setAssuranceInstanceAnalysisReference(String assuranceInstanceAnalysisReference) {
    this.assuranceInstanceAnalysisReference = assuranceInstanceAnalysisReference;
  }


}

