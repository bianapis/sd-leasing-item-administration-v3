package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRegistrationRetrieveInputModelRegistrationInstanceAnalysis;
import org.bian.dto.BQRegistrationRetrieveInputModelRegistrationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQRegistrationRetrieveInputModel
 */
public class BQRegistrationRetrieveInputModel   {
  private Object registrationRetrieveActionTaskRecord = null;

  private String registrationRetrieveActionRequest = null;

  private BQRegistrationRetrieveInputModelRegistrationInstanceReport registrationInstanceReport = null;

  private BQRegistrationRetrieveInputModelRegistrationInstanceAnalysis registrationInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return registrationRetrieveActionTaskRecord
  **/

  public Object getRegistrationRetrieveActionTaskRecord() {
    return registrationRetrieveActionTaskRecord;
  }

  public void setRegistrationRetrieveActionTaskRecord(Object registrationRetrieveActionTaskRecord) {
    this.registrationRetrieveActionTaskRecord = registrationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return registrationRetrieveActionRequest
  **/

  public String getRegistrationRetrieveActionRequest() {
    return registrationRetrieveActionRequest;
  }

  public void setRegistrationRetrieveActionRequest(String registrationRetrieveActionRequest) {
    this.registrationRetrieveActionRequest = registrationRetrieveActionRequest;
  }


  /**
   * Get registrationInstanceReport
   * @return registrationInstanceReport
  **/

  public BQRegistrationRetrieveInputModelRegistrationInstanceReport getRegistrationInstanceReport() {
    return registrationInstanceReport;
  }

  public void setRegistrationInstanceReport(BQRegistrationRetrieveInputModelRegistrationInstanceReport registrationInstanceReport) {
    this.registrationInstanceReport = registrationInstanceReport;
  }


  /**
   * Get registrationInstanceAnalysis
   * @return registrationInstanceAnalysis
  **/

  public BQRegistrationRetrieveInputModelRegistrationInstanceAnalysis getRegistrationInstanceAnalysis() {
    return registrationInstanceAnalysis;
  }

  public void setRegistrationInstanceAnalysis(BQRegistrationRetrieveInputModelRegistrationInstanceAnalysis registrationInstanceAnalysis) {
    this.registrationInstanceAnalysis = registrationInstanceAnalysis;
  }


}

