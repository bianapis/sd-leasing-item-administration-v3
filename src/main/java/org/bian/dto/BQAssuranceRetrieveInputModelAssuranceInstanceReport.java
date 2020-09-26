package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAssuranceRetrieveInputModelAssuranceInstanceReport
 */
public class BQAssuranceRetrieveInputModelAssuranceInstanceReport   {
  private String assuranceInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return assuranceInstanceReportReference
  **/

  public String getAssuranceInstanceReportReference() {
    return assuranceInstanceReportReference;
  }

  public void setAssuranceInstanceReportReference(String assuranceInstanceReportReference) {
    this.assuranceInstanceReportReference = assuranceInstanceReportReference;
  }


}

