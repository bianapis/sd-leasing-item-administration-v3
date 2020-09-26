package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRLeasingItemAdministrativePlanGrantOutputModelGrantRequestResponseRecord;

import javax.validation.Valid;
  
/**
 * CRLeasingItemAdministrativePlanGrantOutputModel
 */
public class CRLeasingItemAdministrativePlanGrantOutputModel   {
  private String leasingItemAdministrativePlanBudgetType = null;

  private String leasingItemAdministrativePlanAssignment = null;

  private String leasingItemAdministrativePlanPlan = null;

  private String leasingItemAdministrativePlanGrantActionTaskReference = null;

  private Object leasingItemAdministrativePlanGrantActionTaskRecord = null;

  private String grantRequestRecordReference = null;

  private CRLeasingItemAdministrativePlanGrantOutputModelGrantRequestResponseRecord grantRequestResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Leasing Item Administrative Plan instance grant service call 
   * @return leasingItemAdministrativePlanGrantActionTaskReference
  **/

  public String getLeasingItemAdministrativePlanGrantActionTaskReference() {
    return leasingItemAdministrativePlanGrantActionTaskReference;
  }

  public void setLeasingItemAdministrativePlanGrantActionTaskReference(String leasingItemAdministrativePlanGrantActionTaskReference) {
    this.leasingItemAdministrativePlanGrantActionTaskReference = leasingItemAdministrativePlanGrantActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the grant request record 
   * @return grantRequestRecordReference
  **/

  public String getGrantRequestRecordReference() {
    return grantRequestRecordReference;
  }

  public void setGrantRequestRecordReference(String grantRequestRecordReference) {
    this.grantRequestRecordReference = grantRequestRecordReference;
  }


  /**
   * Get grantRequestResponseRecord
   * @return grantRequestResponseRecord
  **/

  public CRLeasingItemAdministrativePlanGrantOutputModelGrantRequestResponseRecord getGrantRequestResponseRecord() {
    return grantRequestResponseRecord;
  }

  public void setGrantRequestResponseRecord(CRLeasingItemAdministrativePlanGrantOutputModelGrantRequestResponseRecord grantRequestResponseRecord) {
    this.grantRequestResponseRecord = grantRequestResponseRecord;
  }


}

