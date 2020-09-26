package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRLeasingItemAdministrativePlanRetrieveOutputModelLeasingItemAdministrativePlanInstanceAnalysis
 */
public class CRLeasingItemAdministrativePlanRetrieveOutputModelLeasingItemAdministrativePlanInstanceAnalysis   {
  private String leasingItemAdministrativePlanInstanceAnalysisData = null;

  private String leasingItemAdministrativePlanInstanceAnalysisReportType = null;

  private Object leasingItemAdministrativePlanInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return leasingItemAdministrativePlanInstanceAnalysisData
  **/

  public String getLeasingItemAdministrativePlanInstanceAnalysisData() {
    return leasingItemAdministrativePlanInstanceAnalysisData;
  }

  public void setLeasingItemAdministrativePlanInstanceAnalysisData(String leasingItemAdministrativePlanInstanceAnalysisData) {
    this.leasingItemAdministrativePlanInstanceAnalysisData = leasingItemAdministrativePlanInstanceAnalysisData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return leasingItemAdministrativePlanInstanceAnalysisReport
  **/

  public Object getLeasingItemAdministrativePlanInstanceAnalysisReport() {
    return leasingItemAdministrativePlanInstanceAnalysisReport;
  }

  public void setLeasingItemAdministrativePlanInstanceAnalysisReport(Object leasingItemAdministrativePlanInstanceAnalysisReport) {
    this.leasingItemAdministrativePlanInstanceAnalysisReport = leasingItemAdministrativePlanInstanceAnalysisReport;
  }


}

