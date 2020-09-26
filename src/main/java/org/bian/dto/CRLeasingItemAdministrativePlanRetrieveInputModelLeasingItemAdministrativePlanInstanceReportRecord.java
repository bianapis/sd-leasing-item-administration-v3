package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRLeasingItemAdministrativePlanRetrieveInputModelLeasingItemAdministrativePlanInstanceReportRecord
 */
public class CRLeasingItemAdministrativePlanRetrieveInputModelLeasingItemAdministrativePlanInstanceReportRecord   {
  private String leasingItemAdministrativePlanInstanceReportReference = null;

  private String leasingItemAdministrativePlanInstanceReportType = null;

  private String leasingItemAdministrativePlanInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return leasingItemAdministrativePlanInstanceReportReference
  **/

  public String getLeasingItemAdministrativePlanInstanceReportReference() {
    return leasingItemAdministrativePlanInstanceReportReference;
  }

  public void setLeasingItemAdministrativePlanInstanceReportReference(String leasingItemAdministrativePlanInstanceReportReference) {
    this.leasingItemAdministrativePlanInstanceReportReference = leasingItemAdministrativePlanInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return leasingItemAdministrativePlanInstanceReportType
  **/

  public String getLeasingItemAdministrativePlanInstanceReportType() {
    return leasingItemAdministrativePlanInstanceReportType;
  }

  public void setLeasingItemAdministrativePlanInstanceReportType(String leasingItemAdministrativePlanInstanceReportType) {
    this.leasingItemAdministrativePlanInstanceReportType = leasingItemAdministrativePlanInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return leasingItemAdministrativePlanInstanceReportParameters
  **/

  public String getLeasingItemAdministrativePlanInstanceReportParameters() {
    return leasingItemAdministrativePlanInstanceReportParameters;
  }

  public void setLeasingItemAdministrativePlanInstanceReportParameters(String leasingItemAdministrativePlanInstanceReportParameters) {
    this.leasingItemAdministrativePlanInstanceReportParameters = leasingItemAdministrativePlanInstanceReportParameters;
  }


}

