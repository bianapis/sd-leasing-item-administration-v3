package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAssuranceRetrieveOutputModelAssuranceInstanceReport
 */
public class BQAssuranceRetrieveOutputModelAssuranceInstanceReport   {
  private Object assuranceInstanceReportRecord = null;

  private String assuranceInstanceReportType = null;

  private String assuranceInstanceReportParameters = null;

  private Object assuranceInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return assuranceInstanceReportRecord
  **/

  public Object getAssuranceInstanceReportRecord() {
    return assuranceInstanceReportRecord;
  }

  public void setAssuranceInstanceReportRecord(Object assuranceInstanceReportRecord) {
    this.assuranceInstanceReportRecord = assuranceInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return assuranceInstanceReportType
  **/

  public String getAssuranceInstanceReportType() {
    return assuranceInstanceReportType;
  }

  public void setAssuranceInstanceReportType(String assuranceInstanceReportType) {
    this.assuranceInstanceReportType = assuranceInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return assuranceInstanceReportParameters
  **/

  public String getAssuranceInstanceReportParameters() {
    return assuranceInstanceReportParameters;
  }

  public void setAssuranceInstanceReportParameters(String assuranceInstanceReportParameters) {
    this.assuranceInstanceReportParameters = assuranceInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return assuranceInstanceReport
  **/

  public Object getAssuranceInstanceReport() {
    return assuranceInstanceReport;
  }

  public void setAssuranceInstanceReport(Object assuranceInstanceReport) {
    this.assuranceInstanceReport = assuranceInstanceReport;
  }


}

