package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAssuranceRetrieveInputModelAssuranceInstanceAnalysis;
import org.bian.dto.BQAssuranceRetrieveInputModelAssuranceInstanceReport;

import javax.validation.Valid;
  
/**
 * BQAssuranceRetrieveInputModel
 */
public class BQAssuranceRetrieveInputModel   {
  private Object assuranceRetrieveActionTaskRecord = null;

  private String assuranceRetrieveActionRequest = null;

  private BQAssuranceRetrieveInputModelAssuranceInstanceReport assuranceInstanceReport = null;

  private BQAssuranceRetrieveInputModelAssuranceInstanceAnalysis assuranceInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return assuranceRetrieveActionTaskRecord
  **/

  public Object getAssuranceRetrieveActionTaskRecord() {
    return assuranceRetrieveActionTaskRecord;
  }

  public void setAssuranceRetrieveActionTaskRecord(Object assuranceRetrieveActionTaskRecord) {
    this.assuranceRetrieveActionTaskRecord = assuranceRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return assuranceRetrieveActionRequest
  **/

  public String getAssuranceRetrieveActionRequest() {
    return assuranceRetrieveActionRequest;
  }

  public void setAssuranceRetrieveActionRequest(String assuranceRetrieveActionRequest) {
    this.assuranceRetrieveActionRequest = assuranceRetrieveActionRequest;
  }


  /**
   * Get assuranceInstanceReport
   * @return assuranceInstanceReport
  **/

  public BQAssuranceRetrieveInputModelAssuranceInstanceReport getAssuranceInstanceReport() {
    return assuranceInstanceReport;
  }

  public void setAssuranceInstanceReport(BQAssuranceRetrieveInputModelAssuranceInstanceReport assuranceInstanceReport) {
    this.assuranceInstanceReport = assuranceInstanceReport;
  }


  /**
   * Get assuranceInstanceAnalysis
   * @return assuranceInstanceAnalysis
  **/

  public BQAssuranceRetrieveInputModelAssuranceInstanceAnalysis getAssuranceInstanceAnalysis() {
    return assuranceInstanceAnalysis;
  }

  public void setAssuranceInstanceAnalysis(BQAssuranceRetrieveInputModelAssuranceInstanceAnalysis assuranceInstanceAnalysis) {
    this.assuranceInstanceAnalysis = assuranceInstanceAnalysis;
  }


}

