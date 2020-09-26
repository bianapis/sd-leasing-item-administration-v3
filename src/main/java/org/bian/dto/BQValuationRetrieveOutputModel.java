package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQValuationRetrieveOutputModelValuationInstanceAnalysis;
import org.bian.dto.BQValuationRetrieveOutputModelValuationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQValuationRetrieveOutputModel
 */
public class BQValuationRetrieveOutputModel   {
  private String valuationPreconditions = null;

  private String valuationBusinessUnitEmployeeReference = null;

  private String valuationWorkSchedule = null;

  private String businessService = null;

  private String valuationPostconditions = null;

  private String valuationServiceType = null;

  private String valuationServiceDescription = null;

  private String valuationServiceInputsandOuputs = null;

  private String valuationServiceWorkProduct = null;

  private String valuationServiceName = null;

  private String valuationRetrieveActionTaskReference = null;

  private Object valuationRetrieveActionTaskRecord = null;

  private String valuationRetrieveActionResponse = null;

  private BQValuationRetrieveOutputModelValuationInstanceReport valuationInstanceReport = null;

  private BQValuationRetrieveOutputModelValuationInstanceAnalysis valuationInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation before the routine can be undertaken 
   * @return valuationPreconditions
  **/

  public String getValuationPreconditions() {
    return valuationPreconditions;
  }

  public void setValuationPreconditions(String valuationPreconditions) {
    this.valuationPreconditions = valuationPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The operating unit/employee responsible for performing the routine 
   * @return valuationBusinessUnitEmployeeReference
  **/

  public String getValuationBusinessUnitEmployeeReference() {
    return valuationBusinessUnitEmployeeReference;
  }

  public void setValuationBusinessUnitEmployeeReference(String valuationBusinessUnitEmployeeReference) {
    this.valuationBusinessUnitEmployeeReference = valuationBusinessUnitEmployeeReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in completing the routine 
   * @return valuationWorkSchedule
  **/

  public String getValuationWorkSchedule() {
    return valuationWorkSchedule;
  }

  public void setValuationWorkSchedule(String valuationWorkSchedule) {
    this.valuationWorkSchedule = valuationWorkSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Leasing Item Administrative Plan specific Business Service 
   * @return businessService
  **/

  public String getBusinessService() {
    return businessService;
  }

  public void setBusinessService(String businessService) {
    this.businessService = businessService;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status once the routine has been completed (note the need to fulfill a routine may recur frequently) 
   * @return valuationPostconditions
  **/

  public String getValuationPostconditions() {
    return valuationPostconditions;
  }

  public void setValuationPostconditions(String valuationPostconditions) {
    this.valuationPostconditions = valuationPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return valuationServiceType
  **/

  public String getValuationServiceType() {
    return valuationServiceType;
  }

  public void setValuationServiceType(String valuationServiceType) {
    this.valuationServiceType = valuationServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return valuationServiceDescription
  **/

  public String getValuationServiceDescription() {
    return valuationServiceDescription;
  }

  public void setValuationServiceDescription(String valuationServiceDescription) {
    this.valuationServiceDescription = valuationServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return valuationServiceInputsandOuputs
  **/

  public String getValuationServiceInputsandOuputs() {
    return valuationServiceInputsandOuputs;
  }

  public void setValuationServiceInputsandOuputs(String valuationServiceInputsandOuputs) {
    this.valuationServiceInputsandOuputs = valuationServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return valuationServiceWorkProduct
  **/

  public String getValuationServiceWorkProduct() {
    return valuationServiceWorkProduct;
  }

  public void setValuationServiceWorkProduct(String valuationServiceWorkProduct) {
    this.valuationServiceWorkProduct = valuationServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return valuationServiceName
  **/

  public String getValuationServiceName() {
    return valuationServiceName;
  }

  public void setValuationServiceName(String valuationServiceName) {
    this.valuationServiceName = valuationServiceName;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Valuation instance retrieve service call 
   * @return valuationRetrieveActionTaskReference
  **/

  public String getValuationRetrieveActionTaskReference() {
    return valuationRetrieveActionTaskReference;
  }

  public void setValuationRetrieveActionTaskReference(String valuationRetrieveActionTaskReference) {
    this.valuationRetrieveActionTaskReference = valuationRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return valuationRetrieveActionTaskRecord
  **/

  public Object getValuationRetrieveActionTaskRecord() {
    return valuationRetrieveActionTaskRecord;
  }

  public void setValuationRetrieveActionTaskRecord(Object valuationRetrieveActionTaskRecord) {
    this.valuationRetrieveActionTaskRecord = valuationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return valuationRetrieveActionResponse
  **/

  public String getValuationRetrieveActionResponse() {
    return valuationRetrieveActionResponse;
  }

  public void setValuationRetrieveActionResponse(String valuationRetrieveActionResponse) {
    this.valuationRetrieveActionResponse = valuationRetrieveActionResponse;
  }


  /**
   * Get valuationInstanceReport
   * @return valuationInstanceReport
  **/

  public BQValuationRetrieveOutputModelValuationInstanceReport getValuationInstanceReport() {
    return valuationInstanceReport;
  }

  public void setValuationInstanceReport(BQValuationRetrieveOutputModelValuationInstanceReport valuationInstanceReport) {
    this.valuationInstanceReport = valuationInstanceReport;
  }


  /**
   * Get valuationInstanceAnalysis
   * @return valuationInstanceAnalysis
  **/

  public BQValuationRetrieveOutputModelValuationInstanceAnalysis getValuationInstanceAnalysis() {
    return valuationInstanceAnalysis;
  }

  public void setValuationInstanceAnalysis(BQValuationRetrieveOutputModelValuationInstanceAnalysis valuationInstanceAnalysis) {
    this.valuationInstanceAnalysis = valuationInstanceAnalysis;
  }


}

