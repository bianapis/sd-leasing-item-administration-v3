package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDLeasingItemAdministrationActivateInputModelLeasingItemAdministrationServiceConfigurationRecordLeasingItemAdministrationServiceConfigurationSetup;
import org.bian.dto.SDLeasingItemAdministrationActivateOutputModelLeasingItemAdministrationServiceConfigurationRecordLeasingItemAdministrationServiceAgreement;
import org.bian.dto.SDLeasingItemAdministrationActivateOutputModelLeasingItemAdministrationServiceConfigurationRecordLeasingItemAdministrationServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDLeasingItemAdministrationActivateOutputModelLeasingItemAdministrationServiceConfigurationRecord
 */
public class SDLeasingItemAdministrationActivateOutputModelLeasingItemAdministrationServiceConfigurationRecord   {
  private String leasingItemAdministrationServiceConfigurationSettingReference = null;

  private String leasingItemAdministrationServiceConfigurationSettingDescription = null;

  private SDLeasingItemAdministrationActivateInputModelLeasingItemAdministrationServiceConfigurationRecordLeasingItemAdministrationServiceConfigurationSetup leasingItemAdministrationServiceConfigurationSetup = null;

  private SDLeasingItemAdministrationActivateOutputModelLeasingItemAdministrationServiceConfigurationRecordLeasingItemAdministrationServiceSubscription leasingItemAdministrationServiceSubscription = null;

  private SDLeasingItemAdministrationActivateOutputModelLeasingItemAdministrationServiceConfigurationRecordLeasingItemAdministrationServiceAgreement leasingItemAdministrationServiceAgreement = null;

  private String leasingItemAdministrationServiceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the service configuration parameter for the service 
   * @return leasingItemAdministrationServiceConfigurationSettingReference
  **/

  public String getLeasingItemAdministrationServiceConfigurationSettingReference() {
    return leasingItemAdministrationServiceConfigurationSettingReference;
  }

  public void setLeasingItemAdministrationServiceConfigurationSettingReference(String leasingItemAdministrationServiceConfigurationSettingReference) {
    this.leasingItemAdministrationServiceConfigurationSettingReference = leasingItemAdministrationServiceConfigurationSettingReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the configuration parameter, allowed values and processing impact 
   * @return leasingItemAdministrationServiceConfigurationSettingDescription
  **/

  public String getLeasingItemAdministrationServiceConfigurationSettingDescription() {
    return leasingItemAdministrationServiceConfigurationSettingDescription;
  }

  public void setLeasingItemAdministrationServiceConfigurationSettingDescription(String leasingItemAdministrationServiceConfigurationSettingDescription) {
    this.leasingItemAdministrationServiceConfigurationSettingDescription = leasingItemAdministrationServiceConfigurationSettingDescription;
  }


  /**
   * Get leasingItemAdministrationServiceConfigurationSetup
   * @return leasingItemAdministrationServiceConfigurationSetup
  **/

  public SDLeasingItemAdministrationActivateInputModelLeasingItemAdministrationServiceConfigurationRecordLeasingItemAdministrationServiceConfigurationSetup getLeasingItemAdministrationServiceConfigurationSetup() {
    return leasingItemAdministrationServiceConfigurationSetup;
  }

  public void setLeasingItemAdministrationServiceConfigurationSetup(SDLeasingItemAdministrationActivateInputModelLeasingItemAdministrationServiceConfigurationRecordLeasingItemAdministrationServiceConfigurationSetup leasingItemAdministrationServiceConfigurationSetup) {
    this.leasingItemAdministrationServiceConfigurationSetup = leasingItemAdministrationServiceConfigurationSetup;
  }


  /**
   * Get leasingItemAdministrationServiceSubscription
   * @return leasingItemAdministrationServiceSubscription
  **/

  public SDLeasingItemAdministrationActivateOutputModelLeasingItemAdministrationServiceConfigurationRecordLeasingItemAdministrationServiceSubscription getLeasingItemAdministrationServiceSubscription() {
    return leasingItemAdministrationServiceSubscription;
  }

  public void setLeasingItemAdministrationServiceSubscription(SDLeasingItemAdministrationActivateOutputModelLeasingItemAdministrationServiceConfigurationRecordLeasingItemAdministrationServiceSubscription leasingItemAdministrationServiceSubscription) {
    this.leasingItemAdministrationServiceSubscription = leasingItemAdministrationServiceSubscription;
  }


  /**
   * Get leasingItemAdministrationServiceAgreement
   * @return leasingItemAdministrationServiceAgreement
  **/

  public SDLeasingItemAdministrationActivateOutputModelLeasingItemAdministrationServiceConfigurationRecordLeasingItemAdministrationServiceAgreement getLeasingItemAdministrationServiceAgreement() {
    return leasingItemAdministrationServiceAgreement;
  }

  public void setLeasingItemAdministrationServiceAgreement(SDLeasingItemAdministrationActivateOutputModelLeasingItemAdministrationServiceConfigurationRecordLeasingItemAdministrationServiceAgreement leasingItemAdministrationServiceAgreement) {
    this.leasingItemAdministrationServiceAgreement = leasingItemAdministrationServiceAgreement;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the offered service (e.g. active, suspended, idle) 
   * @return leasingItemAdministrationServiceStatus
  **/

  public String getLeasingItemAdministrationServiceStatus() {
    return leasingItemAdministrationServiceStatus;
  }

  public void setLeasingItemAdministrationServiceStatus(String leasingItemAdministrationServiceStatus) {
    this.leasingItemAdministrationServiceStatus = leasingItemAdministrationServiceStatus;
  }


}

