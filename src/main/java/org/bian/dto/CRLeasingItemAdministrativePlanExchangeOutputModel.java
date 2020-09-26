package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRLeasingItemAdministrativePlanExchangeOutputModel
 */
public class CRLeasingItemAdministrativePlanExchangeOutputModel   {
  private String leasingItemAdministrativePlanBudgetType = null;

  private String leasingItemAdministrativePlanAssignment = null;

  private String leasingItemAdministrativePlanPlan = null;

  private String leasingItemAdministrativePlanExchangeActionTaskReference = null;

  private Object leasingItemAdministrativePlanExchangeActionTaskRecord = null;

  private String leasingItemAdministrativePlanExchangeActionResponse = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Leasing Item Administrative Plan instance exchange service call 
   * @return leasingItemAdministrativePlanExchangeActionTaskReference
  **/

  public String getLeasingItemAdministrativePlanExchangeActionTaskReference() {
    return leasingItemAdministrativePlanExchangeActionTaskReference;
  }

  public void setLeasingItemAdministrativePlanExchangeActionTaskReference(String leasingItemAdministrativePlanExchangeActionTaskReference) {
    this.leasingItemAdministrativePlanExchangeActionTaskReference = leasingItemAdministrativePlanExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return leasingItemAdministrativePlanExchangeActionTaskRecord
  **/

  public Object getLeasingItemAdministrativePlanExchangeActionTaskRecord() {
    return leasingItemAdministrativePlanExchangeActionTaskRecord;
  }

  public void setLeasingItemAdministrativePlanExchangeActionTaskRecord(Object leasingItemAdministrativePlanExchangeActionTaskRecord) {
    this.leasingItemAdministrativePlanExchangeActionTaskRecord = leasingItemAdministrativePlanExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return leasingItemAdministrativePlanExchangeActionResponse
  **/

  public String getLeasingItemAdministrativePlanExchangeActionResponse() {
    return leasingItemAdministrativePlanExchangeActionResponse;
  }

  public void setLeasingItemAdministrativePlanExchangeActionResponse(String leasingItemAdministrativePlanExchangeActionResponse) {
    this.leasingItemAdministrativePlanExchangeActionResponse = leasingItemAdministrativePlanExchangeActionResponse;
  }


}

