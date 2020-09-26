package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAssuranceCaptureOutputModel
 */
public class BQAssuranceCaptureOutputModel   {
  private String assurancePreconditions = null;

  private String assuranceBusinessUnitEmployeeReference = null;

  private String assuranceWorkSchedule = null;

  private String collateralItemAssurance = null;

  private String assurancePostconditions = null;

  private String assuranceCollateralItemAssuranceServiceType = null;

  private String assuranceCollateralItemAssuranceServiceDescription = null;

  private String assuranceCollateralItemAssuranceServiceInputsandOuputs = null;

  private String assuranceCollateralItemAssuranceServiceWorkProduct = null;

  private String assuranceCaptureActionTaskReference = null;

  private Object assuranceCaptureActionTaskRecord = null;

  private String assuranceCaptureRecordReference = null;

  private Object captureResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation before the routine can be undertaken 
   * @return assurancePreconditions
  **/

  public String getAssurancePreconditions() {
    return assurancePreconditions;
  }

  public void setAssurancePreconditions(String assurancePreconditions) {
    this.assurancePreconditions = assurancePreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The operating unit/employee responsible for performing the routine 
   * @return assuranceBusinessUnitEmployeeReference
  **/

  public String getAssuranceBusinessUnitEmployeeReference() {
    return assuranceBusinessUnitEmployeeReference;
  }

  public void setAssuranceBusinessUnitEmployeeReference(String assuranceBusinessUnitEmployeeReference) {
    this.assuranceBusinessUnitEmployeeReference = assuranceBusinessUnitEmployeeReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in completing the routine 
   * @return assuranceWorkSchedule
  **/

  public String getAssuranceWorkSchedule() {
    return assuranceWorkSchedule;
  }

  public void setAssuranceWorkSchedule(String assuranceWorkSchedule) {
    this.assuranceWorkSchedule = assuranceWorkSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Leasing Item Administrative Plan specific Business Service 
   * @return collateralItemAssurance
  **/

  public String getCollateralItemAssurance() {
    return collateralItemAssurance;
  }

  public void setCollateralItemAssurance(String collateralItemAssurance) {
    this.collateralItemAssurance = collateralItemAssurance;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status once the routine has been completed (note the need to fulfill a routine may recur frequently) 
   * @return assurancePostconditions
  **/

  public String getAssurancePostconditions() {
    return assurancePostconditions;
  }

  public void setAssurancePostconditions(String assurancePostconditions) {
    this.assurancePostconditions = assurancePostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return assuranceCollateralItemAssuranceServiceType
  **/

  public String getAssuranceCollateralItemAssuranceServiceType() {
    return assuranceCollateralItemAssuranceServiceType;
  }

  public void setAssuranceCollateralItemAssuranceServiceType(String assuranceCollateralItemAssuranceServiceType) {
    this.assuranceCollateralItemAssuranceServiceType = assuranceCollateralItemAssuranceServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return assuranceCollateralItemAssuranceServiceDescription
  **/

  public String getAssuranceCollateralItemAssuranceServiceDescription() {
    return assuranceCollateralItemAssuranceServiceDescription;
  }

  public void setAssuranceCollateralItemAssuranceServiceDescription(String assuranceCollateralItemAssuranceServiceDescription) {
    this.assuranceCollateralItemAssuranceServiceDescription = assuranceCollateralItemAssuranceServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return assuranceCollateralItemAssuranceServiceInputsandOuputs
  **/

  public String getAssuranceCollateralItemAssuranceServiceInputsandOuputs() {
    return assuranceCollateralItemAssuranceServiceInputsandOuputs;
  }

  public void setAssuranceCollateralItemAssuranceServiceInputsandOuputs(String assuranceCollateralItemAssuranceServiceInputsandOuputs) {
    this.assuranceCollateralItemAssuranceServiceInputsandOuputs = assuranceCollateralItemAssuranceServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return assuranceCollateralItemAssuranceServiceWorkProduct
  **/

  public String getAssuranceCollateralItemAssuranceServiceWorkProduct() {
    return assuranceCollateralItemAssuranceServiceWorkProduct;
  }

  public void setAssuranceCollateralItemAssuranceServiceWorkProduct(String assuranceCollateralItemAssuranceServiceWorkProduct) {
    this.assuranceCollateralItemAssuranceServiceWorkProduct = assuranceCollateralItemAssuranceServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Assurance instance capture service call 
   * @return assuranceCaptureActionTaskReference
  **/

  public String getAssuranceCaptureActionTaskReference() {
    return assuranceCaptureActionTaskReference;
  }

  public void setAssuranceCaptureActionTaskReference(String assuranceCaptureActionTaskReference) {
    this.assuranceCaptureActionTaskReference = assuranceCaptureActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record 
   * @return assuranceCaptureActionTaskRecord
  **/

  public Object getAssuranceCaptureActionTaskRecord() {
    return assuranceCaptureActionTaskRecord;
  }

  public void setAssuranceCaptureActionTaskRecord(Object assuranceCaptureActionTaskRecord) {
    this.assuranceCaptureActionTaskRecord = assuranceCaptureActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Assurance structured input transaction/record 
   * @return assuranceCaptureRecordReference
  **/

  public String getAssuranceCaptureRecordReference() {
    return assuranceCaptureRecordReference;
  }

  public void setAssuranceCaptureRecordReference(String assuranceCaptureRecordReference) {
    this.assuranceCaptureRecordReference = assuranceCaptureRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the capture action service response 
   * @return captureResponseRecord
  **/

  public Object getCaptureResponseRecord() {
    return captureResponseRecord;
  }

  public void setCaptureResponseRecord(Object captureResponseRecord) {
    this.captureResponseRecord = captureResponseRecord;
  }


}

