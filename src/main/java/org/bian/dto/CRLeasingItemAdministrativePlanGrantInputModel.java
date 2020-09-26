package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRLeasingItemAdministrativePlanGrantInputModelGrantRequestInputRecord;

import javax.validation.Valid;
  
/**
 * CRLeasingItemAdministrativePlanGrantInputModel
 */
public class CRLeasingItemAdministrativePlanGrantInputModel   {
  private String leasingItemAdministrationServicingSessionReference = null;

  private String leasingItemAdministrativePlanInstanceReference = null;

  private String leasingItemAdministrativePlanBudgetType = null;

  private String leasingItemAdministrativePlanAssignment = null;

  private String leasingItemAdministrativePlanPlan = null;

  private String leasingItemAdministrativePlanReference = null;

  private Object leasingItemAdministrativePlanGrantActionTaskRecord = null;

  private String grantRequestRecordType = null;

  private CRLeasingItemAdministrativePlanGrantInputModelGrantRequestInputRecord grantRequestInputRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return leasingItemAdministrationServicingSessionReference
  **/

  public String getLeasingItemAdministrationServicingSessionReference() {
    return leasingItemAdministrationServicingSessionReference;
  }

  public void setLeasingItemAdministrationServicingSessionReference(String leasingItemAdministrationServicingSessionReference) {
    this.leasingItemAdministrationServicingSessionReference = leasingItemAdministrationServicingSessionReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The grant service call consolidated processing record 
   * @return leasingItemAdministrativePlanGrantActionTaskRecord
  **/

  public Object getLeasingItemAdministrativePlanGrantActionTaskRecord() {
    return leasingItemAdministrativePlanGrantActionTaskRecord;
  }

  public void setLeasingItemAdministrativePlanGrantActionTaskRecord(Object leasingItemAdministrativePlanGrantActionTaskRecord) {
    this.leasingItemAdministrativePlanGrantActionTaskRecord = leasingItemAdministrativePlanGrantActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Grant request type (e.g. access permission) 
   * @return grantRequestRecordType
  **/

  public String getGrantRequestRecordType() {
    return grantRequestRecordType;
  }

  public void setGrantRequestRecordType(String grantRequestRecordType) {
    this.grantRequestRecordType = grantRequestRecordType;
  }


  /**
   * Get grantRequestInputRecord
   * @return grantRequestInputRecord
  **/

  public CRLeasingItemAdministrativePlanGrantInputModelGrantRequestInputRecord getGrantRequestInputRecord() {
    return grantRequestInputRecord;
  }

  public void setGrantRequestInputRecord(CRLeasingItemAdministrativePlanGrantInputModelGrantRequestInputRecord grantRequestInputRecord) {
    this.grantRequestInputRecord = grantRequestInputRecord;
  }


}

