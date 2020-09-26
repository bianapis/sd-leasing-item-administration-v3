package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRLeasingItemAdministrativePlanRetrieveOutputModelLeasingItemAdministrativePlanInstanceAnalysis;
import org.bian.dto.CRLeasingItemAdministrativePlanRetrieveOutputModelLeasingItemAdministrativePlanInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRLeasingItemAdministrativePlanRetrieveOutputModel
 */
public class CRLeasingItemAdministrativePlanRetrieveOutputModel   {
  private String leasingItemAdministrativePlanBudgetType = null;

  private String leasingItemAdministrativePlanAssignment = null;

  private String leasingItemAdministrativePlanPlan = null;

  private String leasingItemAdministrativePlanReference = null;

  private String leasingItemAdministrativePlanRetrieveActionTaskReference = null;

  private Object leasingItemAdministrativePlanRetrieveActionTaskRecord = null;

  private String leasingItemAdministrativePlanRetrieveActionResponse = null;

  private CRLeasingItemAdministrativePlanRetrieveOutputModelLeasingItemAdministrativePlanInstanceReportRecord leasingItemAdministrativePlanInstanceReportRecord = null;

  private CRLeasingItemAdministrativePlanRetrieveOutputModelLeasingItemAdministrativePlanInstanceAnalysis leasingItemAdministrativePlanInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value that distinguishes between Budgets within Leasing Item Administrative Plan according to the type of resource and/or activity that is budgetted 
   * @return leasingItemAdministrativePlanBudgetType
  **/

  public String getLeasingItemAdministrativePlanBudgetType() {
    return leasingItemAdministrativePlanBudgetType;
  }

  public void setLeasingItemAdministrativePlanBudgetType(String leasingItemAdministrativePlanBudgetType) {
    this.leasingItemAdministrativePlanBudgetType = leasingItemAdministrativePlanBudgetType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The allocation of someone or something which is specified for Leasing Item Administrative Plan 
   * @return leasingItemAdministrativePlanAssignment
  **/

  public String getLeasingItemAdministrativePlanAssignment() {
    return leasingItemAdministrativePlanAssignment;
  }

  public void setLeasingItemAdministrativePlanAssignment(String leasingItemAdministrativePlanAssignment) {
    this.leasingItemAdministrativePlanAssignment = leasingItemAdministrativePlanAssignment;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A plan that defines clerical support for LeasingItem 
   * @return leasingItemAdministrativePlanPlan
  **/

  public String getLeasingItemAdministrativePlanPlan() {
    return leasingItemAdministrativePlanPlan;
  }

  public void setLeasingItemAdministrativePlanPlan(String leasingItemAdministrativePlanPlan) {
    this.leasingItemAdministrativePlanPlan = leasingItemAdministrativePlanPlan;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Party who is involved in Leasing Item Administrative Plan 
   * @return leasingItemAdministrativePlanReference
  **/

  public String getLeasingItemAdministrativePlanReference() {
    return leasingItemAdministrativePlanReference;
  }

  public void setLeasingItemAdministrativePlanReference(String leasingItemAdministrativePlanReference) {
    this.leasingItemAdministrativePlanReference = leasingItemAdministrativePlanReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Leasing Item Administrative Plan instance retrieve service call 
   * @return leasingItemAdministrativePlanRetrieveActionTaskReference
  **/

  public String getLeasingItemAdministrativePlanRetrieveActionTaskReference() {
    return leasingItemAdministrativePlanRetrieveActionTaskReference;
  }

  public void setLeasingItemAdministrativePlanRetrieveActionTaskReference(String leasingItemAdministrativePlanRetrieveActionTaskReference) {
    this.leasingItemAdministrativePlanRetrieveActionTaskReference = leasingItemAdministrativePlanRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return leasingItemAdministrativePlanRetrieveActionResponse
  **/

  public String getLeasingItemAdministrativePlanRetrieveActionResponse() {
    return leasingItemAdministrativePlanRetrieveActionResponse;
  }

  public void setLeasingItemAdministrativePlanRetrieveActionResponse(String leasingItemAdministrativePlanRetrieveActionResponse) {
    this.leasingItemAdministrativePlanRetrieveActionResponse = leasingItemAdministrativePlanRetrieveActionResponse;
  }


  /**
   * Get leasingItemAdministrativePlanInstanceReportRecord
   * @return leasingItemAdministrativePlanInstanceReportRecord
  **/

  public CRLeasingItemAdministrativePlanRetrieveOutputModelLeasingItemAdministrativePlanInstanceReportRecord getLeasingItemAdministrativePlanInstanceReportRecord() {
    return leasingItemAdministrativePlanInstanceReportRecord;
  }

  public void setLeasingItemAdministrativePlanInstanceReportRecord(CRLeasingItemAdministrativePlanRetrieveOutputModelLeasingItemAdministrativePlanInstanceReportRecord leasingItemAdministrativePlanInstanceReportRecord) {
    this.leasingItemAdministrativePlanInstanceReportRecord = leasingItemAdministrativePlanInstanceReportRecord;
  }


  /**
   * Get leasingItemAdministrativePlanInstanceAnalysis
   * @return leasingItemAdministrativePlanInstanceAnalysis
  **/

  public CRLeasingItemAdministrativePlanRetrieveOutputModelLeasingItemAdministrativePlanInstanceAnalysis getLeasingItemAdministrativePlanInstanceAnalysis() {
    return leasingItemAdministrativePlanInstanceAnalysis;
  }

  public void setLeasingItemAdministrativePlanInstanceAnalysis(CRLeasingItemAdministrativePlanRetrieveOutputModelLeasingItemAdministrativePlanInstanceAnalysis leasingItemAdministrativePlanInstanceAnalysis) {
    this.leasingItemAdministrativePlanInstanceAnalysis = leasingItemAdministrativePlanInstanceAnalysis;
  }


}

