package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRegistrationInitiateOutputModel
 */
public class BQRegistrationInitiateOutputModel   {
  private String registrationInstanceReference = null;

  private String registrationInitiateActionReference = null;

  private Object registrationInitiateActionRecord = null;

  private String registrationInstanceStatus = null;

  private String registrationPreconditions = null;

  private String registrationBusinessUnitEmployeeReference = null;

  private String registrationWorkSchedule = null;

  private String collateralRegistration = null;

  private String registrationPostconditions = null;

  private String registrationCollateralRegistrationServiceType = null;

  private String registrationCollateralRegistrationServiceDescription = null;

  private String registrationCollateralRegistrationServiceInputsandOuputs = null;

  private String registrationCollateralRegistrationServiceWorkProduct = null;

  private String registrationCollateralRegistrationServiceName = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Registration instance 
   * @return registrationInstanceReference
  **/

  public String getRegistrationInstanceReference() {
    return registrationInstanceReference;
  }

  public void setRegistrationInstanceReference(String registrationInstanceReference) {
    this.registrationInstanceReference = registrationInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return registrationInitiateActionReference
  **/

  public String getRegistrationInitiateActionReference() {
    return registrationInitiateActionReference;
  }

  public void setRegistrationInitiateActionReference(String registrationInitiateActionReference) {
    this.registrationInitiateActionReference = registrationInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return registrationInitiateActionRecord
  **/

  public Object getRegistrationInitiateActionRecord() {
    return registrationInitiateActionRecord;
  }

  public void setRegistrationInitiateActionRecord(Object registrationInitiateActionRecord) {
    this.registrationInitiateActionRecord = registrationInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Registration instance (e.g. initialised, pending, active) 
   * @return registrationInstanceStatus
  **/

  public String getRegistrationInstanceStatus() {
    return registrationInstanceStatus;
  }

  public void setRegistrationInstanceStatus(String registrationInstanceStatus) {
    this.registrationInstanceStatus = registrationInstanceStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation before the routine can be undertaken 
   * @return registrationPreconditions
  **/

  public String getRegistrationPreconditions() {
    return registrationPreconditions;
  }

  public void setRegistrationPreconditions(String registrationPreconditions) {
    this.registrationPreconditions = registrationPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The operating unit/employee responsible for performing the routine 
   * @return registrationBusinessUnitEmployeeReference
  **/

  public String getRegistrationBusinessUnitEmployeeReference() {
    return registrationBusinessUnitEmployeeReference;
  }

  public void setRegistrationBusinessUnitEmployeeReference(String registrationBusinessUnitEmployeeReference) {
    this.registrationBusinessUnitEmployeeReference = registrationBusinessUnitEmployeeReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in completing the routine 
   * @return registrationWorkSchedule
  **/

  public String getRegistrationWorkSchedule() {
    return registrationWorkSchedule;
  }

  public void setRegistrationWorkSchedule(String registrationWorkSchedule) {
    this.registrationWorkSchedule = registrationWorkSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Leasing Item Administrative Plan specific Business Service 
   * @return collateralRegistration
  **/

  public String getCollateralRegistration() {
    return collateralRegistration;
  }

  public void setCollateralRegistration(String collateralRegistration) {
    this.collateralRegistration = collateralRegistration;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status once the routine has been completed (note the need to fulfill a routine may recur frequently) 
   * @return registrationPostconditions
  **/

  public String getRegistrationPostconditions() {
    return registrationPostconditions;
  }

  public void setRegistrationPostconditions(String registrationPostconditions) {
    this.registrationPostconditions = registrationPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return registrationCollateralRegistrationServiceType
  **/

  public String getRegistrationCollateralRegistrationServiceType() {
    return registrationCollateralRegistrationServiceType;
  }

  public void setRegistrationCollateralRegistrationServiceType(String registrationCollateralRegistrationServiceType) {
    this.registrationCollateralRegistrationServiceType = registrationCollateralRegistrationServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return registrationCollateralRegistrationServiceDescription
  **/

  public String getRegistrationCollateralRegistrationServiceDescription() {
    return registrationCollateralRegistrationServiceDescription;
  }

  public void setRegistrationCollateralRegistrationServiceDescription(String registrationCollateralRegistrationServiceDescription) {
    this.registrationCollateralRegistrationServiceDescription = registrationCollateralRegistrationServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return registrationCollateralRegistrationServiceInputsandOuputs
  **/

  public String getRegistrationCollateralRegistrationServiceInputsandOuputs() {
    return registrationCollateralRegistrationServiceInputsandOuputs;
  }

  public void setRegistrationCollateralRegistrationServiceInputsandOuputs(String registrationCollateralRegistrationServiceInputsandOuputs) {
    this.registrationCollateralRegistrationServiceInputsandOuputs = registrationCollateralRegistrationServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return registrationCollateralRegistrationServiceWorkProduct
  **/

  public String getRegistrationCollateralRegistrationServiceWorkProduct() {
    return registrationCollateralRegistrationServiceWorkProduct;
  }

  public void setRegistrationCollateralRegistrationServiceWorkProduct(String registrationCollateralRegistrationServiceWorkProduct) {
    this.registrationCollateralRegistrationServiceWorkProduct = registrationCollateralRegistrationServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return registrationCollateralRegistrationServiceName
  **/

  public String getRegistrationCollateralRegistrationServiceName() {
    return registrationCollateralRegistrationServiceName;
  }

  public void setRegistrationCollateralRegistrationServiceName(String registrationCollateralRegistrationServiceName) {
    this.registrationCollateralRegistrationServiceName = registrationCollateralRegistrationServiceName;
  }


}

