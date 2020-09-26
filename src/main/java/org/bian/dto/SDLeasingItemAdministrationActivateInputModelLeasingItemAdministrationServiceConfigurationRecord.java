package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDLeasingItemAdministrationActivateInputModelLeasingItemAdministrationServiceConfigurationRecordLeasingItemAdministrationServiceConfigurationSetup;

import javax.validation.Valid;
  
/**
 * SDLeasingItemAdministrationActivateInputModelLeasingItemAdministrationServiceConfigurationRecord
 */
public class SDLeasingItemAdministrationActivateInputModelLeasingItemAdministrationServiceConfigurationRecord   {
  private String leasingItemAdministrationServiceConfigurationSettingReference = null;

  private String leasingItemAdministrationServiceConfigurationSettingType = null;

  private SDLeasingItemAdministrationActivateInputModelLeasingItemAdministrationServiceConfigurationRecordLeasingItemAdministrationServiceConfigurationSetup leasingItemAdministrationServiceConfigurationSetup = null;


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

  public SDLeasingItemAdministrationActivateInputModelLeasingItemAdministrationServiceConfigurationRecordLeasingItemAdministrationServiceConfigurationSetup getLeasingItemAdministrationServiceConfigurationSetup() {
    return leasingItemAdministrationServiceConfigurationSetup;
  }

  public void setLeasingItemAdministrationServiceConfigurationSetup(SDLeasingItemAdministrationActivateInputModelLeasingItemAdministrationServiceConfigurationRecordLeasingItemAdministrationServiceConfigurationSetup leasingItemAdministrationServiceConfigurationSetup) {
    this.leasingItemAdministrationServiceConfigurationSetup = leasingItemAdministrationServiceConfigurationSetup;
  }


}

