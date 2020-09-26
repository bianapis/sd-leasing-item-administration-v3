package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRegistrationRetrieveOutputModelRegistrationInstanceAnalysis
 */
public class BQRegistrationRetrieveOutputModelRegistrationInstanceAnalysis   {
  private Object registrationInstanceAnalysisRecord = null;

  private String registrationInstanceAnalysisReportType = null;

  private String registrationInstanceAnalysisParameters = null;

  private Object registrationInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return registrationInstanceAnalysisRecord
  **/

  public Object getRegistrationInstanceAnalysisRecord() {
    return registrationInstanceAnalysisRecord;
  }

  public void setRegistrationInstanceAnalysisRecord(Object registrationInstanceAnalysisRecord) {
    this.registrationInstanceAnalysisRecord = registrationInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return registrationInstanceAnalysisReportType
  **/

  public String getRegistrationInstanceAnalysisReportType() {
    return registrationInstanceAnalysisReportType;
  }

  public void setRegistrationInstanceAnalysisReportType(String registrationInstanceAnalysisReportType) {
    this.registrationInstanceAnalysisReportType = registrationInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return registrationInstanceAnalysisParameters
  **/

  public String getRegistrationInstanceAnalysisParameters() {
    return registrationInstanceAnalysisParameters;
  }

  public void setRegistrationInstanceAnalysisParameters(String registrationInstanceAnalysisParameters) {
    this.registrationInstanceAnalysisParameters = registrationInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return registrationInstanceAnalysisReport
  **/

  public Object getRegistrationInstanceAnalysisReport() {
    return registrationInstanceAnalysisReport;
  }

  public void setRegistrationInstanceAnalysisReport(Object registrationInstanceAnalysisReport) {
    this.registrationInstanceAnalysisReport = registrationInstanceAnalysisReport;
  }


}

