package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRLeasingItemAdministrativePlanRetrieveInputModelLeasingItemAdministrativePlanInstanceAnalysis;
import org.bian.dto.CRLeasingItemAdministrativePlanRetrieveInputModelLeasingItemAdministrativePlanInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRLeasingItemAdministrativePlanRetrieveInputModel
 */
public class CRLeasingItemAdministrativePlanRetrieveInputModel   {
  private Object leasingItemAdministrativePlanRetrieveActionTaskRecord = null;

  private String leasingItemAdministrativePlanRetrieveActionRequest = null;

  private CRLeasingItemAdministrativePlanRetrieveInputModelLeasingItemAdministrativePlanInstanceReportRecord leasingItemAdministrativePlanInstanceReportRecord = null;

  private CRLeasingItemAdministrativePlanRetrieveInputModelLeasingItemAdministrativePlanInstanceAnalysis leasingItemAdministrativePlanInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return leasingItemAdministrativePlanRetrieveActionTaskRecord
  **/

  public Object getLeasingItemAdministrativePlanRetrieveActionTaskRecord() {
    return leasingItemAdministrativePlanRetrieveActionTaskRecord;
  }

  public void setLeasingItemAdministrativePlanRetrieveActionTaskRecord(Object leasingItemAdministrativePlanRetrieveActionTaskRecord) {
    this.leasingItemAdministrativePlanRetrieveActionTaskRecord = leasingItemAdministrativePlanRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return leasingItemAdministrativePlanRetrieveActionRequest
  **/

  public String getLeasingItemAdministrativePlanRetrieveActionRequest() {
    return leasingItemAdministrativePlanRetrieveActionRequest;
  }

  public void setLeasingItemAdministrativePlanRetrieveActionRequest(String leasingItemAdministrativePlanRetrieveActionRequest) {
    this.leasingItemAdministrativePlanRetrieveActionRequest = leasingItemAdministrativePlanRetrieveActionRequest;
  }


  /**
   * Get leasingItemAdministrativePlanInstanceReportRecord
   * @return leasingItemAdministrativePlanInstanceReportRecord
  **/

  public CRLeasingItemAdministrativePlanRetrieveInputModelLeasingItemAdministrativePlanInstanceReportRecord getLeasingItemAdministrativePlanInstanceReportRecord() {
    return leasingItemAdministrativePlanInstanceReportRecord;
  }

  public void setLeasingItemAdministrativePlanInstanceReportRecord(CRLeasingItemAdministrativePlanRetrieveInputModelLeasingItemAdministrativePlanInstanceReportRecord leasingItemAdministrativePlanInstanceReportRecord) {
    this.leasingItemAdministrativePlanInstanceReportRecord = leasingItemAdministrativePlanInstanceReportRecord;
  }


  /**
   * Get leasingItemAdministrativePlanInstanceAnalysis
   * @return leasingItemAdministrativePlanInstanceAnalysis
  **/

  public CRLeasingItemAdministrativePlanRetrieveInputModelLeasingItemAdministrativePlanInstanceAnalysis getLeasingItemAdministrativePlanInstanceAnalysis() {
    return leasingItemAdministrativePlanInstanceAnalysis;
  }

  public void setLeasingItemAdministrativePlanInstanceAnalysis(CRLeasingItemAdministrativePlanRetrieveInputModelLeasingItemAdministrativePlanInstanceAnalysis leasingItemAdministrativePlanInstanceAnalysis) {
    this.leasingItemAdministrativePlanInstanceAnalysis = leasingItemAdministrativePlanInstanceAnalysis;
  }


}

