package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRLeasingItemAdministrativePlanRetrieveInputModelLeasingItemAdministrativePlanInstanceAnalysis
 */
public class CRLeasingItemAdministrativePlanRetrieveInputModelLeasingItemAdministrativePlanInstanceAnalysis   {
  private String leasingItemAdministrativePlanInstanceAnalysisReference = null;

  private String leasingItemAdministrativePlanInstanceAnalysisReportType = null;

  private String leasingItemAdministrativePlanInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return leasingItemAdministrativePlanInstanceAnalysisReference
  **/

  public String getLeasingItemAdministrativePlanInstanceAnalysisReference() {
    return leasingItemAdministrativePlanInstanceAnalysisReference;
  }

  public void setLeasingItemAdministrativePlanInstanceAnalysisReference(String leasingItemAdministrativePlanInstanceAnalysisReference) {
    this.leasingItemAdministrativePlanInstanceAnalysisReference = leasingItemAdministrativePlanInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return leasingItemAdministrativePlanInstanceAnalysisReportType
  **/

  public String getLeasingItemAdministrativePlanInstanceAnalysisReportType() {
    return leasingItemAdministrativePlanInstanceAnalysisReportType;
  }

  public void setLeasingItemAdministrativePlanInstanceAnalysisReportType(String leasingItemAdministrativePlanInstanceAnalysisReportType) {
    this.leasingItemAdministrativePlanInstanceAnalysisReportType = leasingItemAdministrativePlanInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return leasingItemAdministrativePlanInstanceAnalysisParameters
  **/

  public String getLeasingItemAdministrativePlanInstanceAnalysisParameters() {
    return leasingItemAdministrativePlanInstanceAnalysisParameters;
  }

  public void setLeasingItemAdministrativePlanInstanceAnalysisParameters(String leasingItemAdministrativePlanInstanceAnalysisParameters) {
    this.leasingItemAdministrativePlanInstanceAnalysisParameters = leasingItemAdministrativePlanInstanceAnalysisParameters;
  }


}

