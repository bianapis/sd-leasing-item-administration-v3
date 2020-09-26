package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDLeasingItemAdministrationRetrieveOutputModelLeasingItemAdministrationOfferedServiceLeasingItemAdministrationServiceRecordLeasingItemAdministrationServicePoliciesandGuidelines
 */
public class SDLeasingItemAdministrationRetrieveOutputModelLeasingItemAdministrationOfferedServiceLeasingItemAdministrationServiceRecordLeasingItemAdministrationServicePoliciesandGuidelines   {
  private String leasingItemAdministrationServiceEligibility = null;

  private String leasingItemAdministrationServiceIntendedUses = null;

  private String leasingItemAdministrationServicePricingandTerms = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Policies and rules governing access to the offered service, includes eligibility and qualifications 
   * @return leasingItemAdministrationServiceEligibility
  **/

  public String getLeasingItemAdministrationServiceEligibility() {
    return leasingItemAdministrationServiceEligibility;
  }

  public void setLeasingItemAdministrationServiceEligibility(String leasingItemAdministrationServiceEligibility) {
    this.leasingItemAdministrationServiceEligibility = leasingItemAdministrationServiceEligibility;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Guidelines covering allowed, intended use of the service 
   * @return leasingItemAdministrationServiceIntendedUses
  **/

  public String getLeasingItemAdministrationServiceIntendedUses() {
    return leasingItemAdministrationServiceIntendedUses;
  }

  public void setLeasingItemAdministrationServiceIntendedUses(String leasingItemAdministrationServiceIntendedUses) {
    this.leasingItemAdministrationServiceIntendedUses = leasingItemAdministrationServiceIntendedUses;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms, prices, penalties associated with use of the service 
   * @return leasingItemAdministrationServicePricingandTerms
  **/

  public String getLeasingItemAdministrationServicePricingandTerms() {
    return leasingItemAdministrationServicePricingandTerms;
  }

  public void setLeasingItemAdministrationServicePricingandTerms(String leasingItemAdministrationServicePricingandTerms) {
    this.leasingItemAdministrationServicePricingandTerms = leasingItemAdministrationServicePricingandTerms;
  }


}

