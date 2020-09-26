package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRLeasingItemAdministrativePlanInitiateOutputModel
 */
public class CRLeasingItemAdministrativePlanInitiateOutputModel   {
  private String leasingItemAdministrativePlanInstanceReference = null;

  private String leasingItemAdministrativePlanInitiateActionReference = null;

  private Object leasingItemAdministrativePlanInitiateActionRecord = null;

  private String leasingItemAdministrativePlanInstanceStatus = null;

  private String leasingItemAdministrativePlanBudgetType = null;

  private String leasingItemAdministrativePlanAssignment = null;

  private String leasingItemAdministrativePlanPlan = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Leasing Item Administrative Plan instance 
   * @return leasingItemAdministrativePlanInstanceReference
  **/

  public String getLeasingItemAdministrativePlanInstanceReference() {
    return leasingItemAdministrativePlanInstanceReference;
  }

  public void setLeasingItemAdministrativePlanInstanceReference(String leasingItemAdministrativePlanInstanceReference) {
    this.leasingItemAdministrativePlanInstanceReference = leasingItemAdministrativePlanInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return leasingItemAdministrativePlanInitiateActionReference
  **/

  public String getLeasingItemAdministrativePlanInitiateActionReference() {
    return leasingItemAdministrativePlanInitiateActionReference;
  }

  public void setLeasingItemAdministrativePlanInitiateActionReference(String leasingItemAdministrativePlanInitiateActionReference) {
    this.leasingItemAdministrativePlanInitiateActionReference = leasingItemAdministrativePlanInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return leasingItemAdministrativePlanInitiateActionRecord
  **/

  public Object getLeasingItemAdministrativePlanInitiateActionRecord() {
    return leasingItemAdministrativePlanInitiateActionRecord;
  }

  public void setLeasingItemAdministrativePlanInitiateActionRecord(Object leasingItemAdministrativePlanInitiateActionRecord) {
    this.leasingItemAdministrativePlanInitiateActionRecord = leasingItemAdministrativePlanInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Leasing Item Administrative Plan instance (e.g. initialised, pending, active) 
   * @return leasingItemAdministrativePlanInstanceStatus
  **/

  public String getLeasingItemAdministrativePlanInstanceStatus() {
    return leasingItemAdministrativePlanInstanceStatus;
  }

  public void setLeasingItemAdministrativePlanInstanceStatus(String leasingItemAdministrativePlanInstanceStatus) {
    this.leasingItemAdministrativePlanInstanceStatus = leasingItemAdministrativePlanInstanceStatus;
  }


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


}

