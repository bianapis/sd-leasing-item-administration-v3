package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAssuranceRetrieveOutputModelAssuranceInstanceAnalysis
 */
public class BQAssuranceRetrieveOutputModelAssuranceInstanceAnalysis   {
  private Object assuranceInstanceAnalysisRecord = null;

  private String assuranceInstanceAnalysisReportType = null;

  private String assuranceInstanceAnalysisParameters = null;

  private Object assuranceInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return assuranceInstanceAnalysisRecord
  **/

  public Object getAssuranceInstanceAnalysisRecord() {
    return assuranceInstanceAnalysisRecord;
  }

  public void setAssuranceInstanceAnalysisRecord(Object assuranceInstanceAnalysisRecord) {
    this.assuranceInstanceAnalysisRecord = assuranceInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return assuranceInstanceAnalysisReportType
  **/

  public String getAssuranceInstanceAnalysisReportType() {
    return assuranceInstanceAnalysisReportType;
  }

  public void setAssuranceInstanceAnalysisReportType(String assuranceInstanceAnalysisReportType) {
    this.assuranceInstanceAnalysisReportType = assuranceInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return assuranceInstanceAnalysisParameters
  **/

  public String getAssuranceInstanceAnalysisParameters() {
    return assuranceInstanceAnalysisParameters;
  }

  public void setAssuranceInstanceAnalysisParameters(String assuranceInstanceAnalysisParameters) {
    this.assuranceInstanceAnalysisParameters = assuranceInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return assuranceInstanceAnalysisReport
  **/

  public Object getAssuranceInstanceAnalysisReport() {
    return assuranceInstanceAnalysisReport;
  }

  public void setAssuranceInstanceAnalysisReport(Object assuranceInstanceAnalysisReport) {
    this.assuranceInstanceAnalysisReport = assuranceInstanceAnalysisReport;
  }


}

