package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDLeasingItemAdministrationConfigureInputModelLeasingItemAdministrationServiceConfigurationRecordLeasingItemAdministrationServiceAgreement;
import org.bian.dto.SDLeasingItemAdministrationConfigureInputModelLeasingItemAdministrationServiceConfigurationRecordLeasingItemAdministrationServiceConfigurationSetup;
import org.bian.dto.SDLeasingItemAdministrationConfigureInputModelLeasingItemAdministrationServiceConfigurationRecordLeasingItemAdministrationServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDLeasingItemAdministrationConfigureOutputModelLeasingItemAdministrationServiceConfigurationRecord
 */
public class SDLeasingItemAdministrationConfigureOutputModelLeasingItemAdministrationServiceConfigurationRecord   {
  private String leasingItemAdministrationServiceConfigurationSettingDescription = null;

  private SDLeasingItemAdministrationConfigureInputModelLeasingItemAdministrationServiceConfigurationRecordLeasingItemAdministrationServiceConfigurationSetup leasingItemAdministrationServiceConfigurationSetup = null;

  private SDLeasingItemAdministrationConfigureInputModelLeasingItemAdministrationServiceConfigurationRecordLeasingItemAdministrationServiceSubscription leasingItemAdministrationServiceSubscription = null;

  private SDLeasingItemAdministrationConfigureInputModelLeasingItemAdministrationServiceConfigurationRecordLeasingItemAdministrationServiceAgreement leasingItemAdministrationServiceAgreement = null;

  private String leasingItemAdministrationServiceStatus = null;


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

  public SDLeasingItemAdministrationConfigureInputModelLeasingItemAdministrationServiceConfigurationRecordLeasingItemAdministrationServiceConfigurationSetup getLeasingItemAdministrationServiceConfigurationSetup() {
    return leasingItemAdministrationServiceConfigurationSetup;
  }

  public void setLeasingItemAdministrationServiceConfigurationSetup(SDLeasingItemAdministrationConfigureInputModelLeasingItemAdministrationServiceConfigurationRecordLeasingItemAdministrationServiceConfigurationSetup leasingItemAdministrationServiceConfigurationSetup) {
    this.leasingItemAdministrationServiceConfigurationSetup = leasingItemAdministrationServiceConfigurationSetup;
  }


  /**
   * Get leasingItemAdministrationServiceSubscription
   * @return leasingItemAdministrationServiceSubscription
  **/

  public SDLeasingItemAdministrationConfigureInputModelLeasingItemAdministrationServiceConfigurationRecordLeasingItemAdministrationServiceSubscription getLeasingItemAdministrationServiceSubscription() {
    return leasingItemAdministrationServiceSubscription;
  }

  public void setLeasingItemAdministrationServiceSubscription(SDLeasingItemAdministrationConfigureInputModelLeasingItemAdministrationServiceConfigurationRecordLeasingItemAdministrationServiceSubscription leasingItemAdministrationServiceSubscription) {
    this.leasingItemAdministrationServiceSubscription = leasingItemAdministrationServiceSubscription;
  }


  /**
   * Get leasingItemAdministrationServiceAgreement
   * @return leasingItemAdministrationServiceAgreement
  **/

  public SDLeasingItemAdministrationConfigureInputModelLeasingItemAdministrationServiceConfigurationRecordLeasingItemAdministrationServiceAgreement getLeasingItemAdministrationServiceAgreement() {
    return leasingItemAdministrationServiceAgreement;
  }

  public void setLeasingItemAdministrationServiceAgreement(SDLeasingItemAdministrationConfigureInputModelLeasingItemAdministrationServiceConfigurationRecordLeasingItemAdministrationServiceAgreement leasingItemAdministrationServiceAgreement) {
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

