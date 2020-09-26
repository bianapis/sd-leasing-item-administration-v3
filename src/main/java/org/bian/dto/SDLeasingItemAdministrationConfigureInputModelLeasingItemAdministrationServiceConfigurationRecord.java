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
 * SDLeasingItemAdministrationConfigureInputModelLeasingItemAdministrationServiceConfigurationRecord
 */
public class SDLeasingItemAdministrationConfigureInputModelLeasingItemAdministrationServiceConfigurationRecord   {
  private String leasingItemAdministrationServiceConfigurationSettingReference = null;

  private String leasingItemAdministrationServiceConfigurationSettingType = null;

  private SDLeasingItemAdministrationConfigureInputModelLeasingItemAdministrationServiceConfigurationRecordLeasingItemAdministrationServiceConfigurationSetup leasingItemAdministrationServiceConfigurationSetup = null;

  private SDLeasingItemAdministrationConfigureInputModelLeasingItemAdministrationServiceConfigurationRecordLeasingItemAdministrationServiceSubscription leasingItemAdministrationServiceSubscription = null;

  private SDLeasingItemAdministrationConfigureInputModelLeasingItemAdministrationServiceConfigurationRecordLeasingItemAdministrationServiceAgreement leasingItemAdministrationServiceAgreement = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of service configuration parameter 
   * @return leasingItemAdministrationServiceConfigurationSettingType
  **/

  public String getLeasingItemAdministrationServiceConfigurationSettingType() {
    return leasingItemAdministrationServiceConfigurationSettingType;
  }

  public void setLeasingItemAdministrationServiceConfigurationSettingType(String leasingItemAdministrationServiceConfigurationSettingType) {
    this.leasingItemAdministrationServiceConfigurationSettingType = leasingItemAdministrationServiceConfigurationSettingType;
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


}

