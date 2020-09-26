package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRLeasingItemAdministrativePlanControlOutputModel
 */
public class CRLeasingItemAdministrativePlanControlOutputModel   {
  private String leasingItemAdministrativePlanBudgetType = null;

  private String leasingItemAdministrativePlanAssignment = null;

  private String leasingItemAdministrativePlanPlan = null;

  private String leasingItemAdministrativePlanControlActionTaskReference = null;

  private Object leasingItemAdministrativePlanControlActionTaskRecord = null;

  private String leasingItemAdministrativePlanControlActionResponse = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Leasing Item Administrative Plan instance control processing service call 
   * @return leasingItemAdministrativePlanControlActionTaskReference
  **/

  public String getLeasingItemAdministrativePlanControlActionTaskReference() {
    return leasingItemAdministrativePlanControlActionTaskReference;
  }

  public void setLeasingItemAdministrativePlanControlActionTaskReference(String leasingItemAdministrativePlanControlActionTaskReference) {
    this.leasingItemAdministrativePlanControlActionTaskReference = leasingItemAdministrativePlanControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return leasingItemAdministrativePlanControlActionTaskRecord
  **/

  public Object getLeasingItemAdministrativePlanControlActionTaskRecord() {
    return leasingItemAdministrativePlanControlActionTaskRecord;
  }

  public void setLeasingItemAdministrativePlanControlActionTaskRecord(Object leasingItemAdministrativePlanControlActionTaskRecord) {
    this.leasingItemAdministrativePlanControlActionTaskRecord = leasingItemAdministrativePlanControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return leasingItemAdministrativePlanControlActionResponse
  **/

  public String getLeasingItemAdministrativePlanControlActionResponse() {
    return leasingItemAdministrativePlanControlActionResponse;
  }

  public void setLeasingItemAdministrativePlanControlActionResponse(String leasingItemAdministrativePlanControlActionResponse) {
    this.leasingItemAdministrativePlanControlActionResponse = leasingItemAdministrativePlanControlActionResponse;
  }


}

