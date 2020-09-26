package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDLeasingItemAdministrationConfigureInputModelLeasingItemAdministrationServiceConfigurationRecordLeasingItemAdministrationServiceAgreement
 */
public class SDLeasingItemAdministrationConfigureInputModelLeasingItemAdministrationServiceConfigurationRecordLeasingItemAdministrationServiceAgreement   {
  private String leasingItemAdministrationServiceAgreementReference = null;

  private String leasingItemAdministrationServiceUserReference = null;

  private String leasingItemAdministrationServiceAgreementTermsandConditions = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the offered service agreement 
   * @return leasingItemAdministrationServiceAgreementReference
  **/

  public String getLeasingItemAdministrationServiceAgreementReference() {
    return leasingItemAdministrationServiceAgreementReference;
  }

  public void setLeasingItemAdministrationServiceAgreementReference(String leasingItemAdministrationServiceAgreementReference) {
    this.leasingItemAdministrationServiceAgreementReference = leasingItemAdministrationServiceAgreementReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the user covered by the contract 
   * @return leasingItemAdministrationServiceUserReference
  **/

  public String getLeasingItemAdministrationServiceUserReference() {
    return leasingItemAdministrationServiceUserReference;
  }

  public void setLeasingItemAdministrationServiceUserReference(String leasingItemAdministrationServiceUserReference) {
    this.leasingItemAdministrationServiceUserReference = leasingItemAdministrationServiceUserReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms and conditions covering the service agreement 
   * @return leasingItemAdministrationServiceAgreementTermsandConditions
  **/

  public String getLeasingItemAdministrationServiceAgreementTermsandConditions() {
    return leasingItemAdministrationServiceAgreementTermsandConditions;
  }

  public void setLeasingItemAdministrationServiceAgreementTermsandConditions(String leasingItemAdministrationServiceAgreementTermsandConditions) {
    this.leasingItemAdministrationServiceAgreementTermsandConditions = leasingItemAdministrationServiceAgreementTermsandConditions;
  }


}

