package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDLeasingItemAdministrationConfigureInputModelLeasingItemAdministrationServiceConfigurationRecordLeasingItemAdministrationServiceSubscription
 */
public class SDLeasingItemAdministrationConfigureInputModelLeasingItemAdministrationServiceConfigurationRecordLeasingItemAdministrationServiceSubscription   {
  private String leasingItemAdministrationServiceSubscriberReference = null;

  private String leasingItemAdministrationServiceSubscriberAccessProfile = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Maintains reference to allowed users or subscribers to the service which can be any known party 
   * @return leasingItemAdministrationServiceSubscriberReference
  **/

  public String getLeasingItemAdministrationServiceSubscriberReference() {
    return leasingItemAdministrationServiceSubscriberReference;
  }

  public void setLeasingItemAdministrationServiceSubscriberReference(String leasingItemAdministrationServiceSubscriberReference) {
    this.leasingItemAdministrationServiceSubscriberReference = leasingItemAdministrationServiceSubscriberReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The allowed service access for a user or subscriber to the service which can be any known party 
   * @return leasingItemAdministrationServiceSubscriberAccessProfile
  **/

  public String getLeasingItemAdministrationServiceSubscriberAccessProfile() {
    return leasingItemAdministrationServiceSubscriberAccessProfile;
  }

  public void setLeasingItemAdministrationServiceSubscriberAccessProfile(String leasingItemAdministrationServiceSubscriberAccessProfile) {
    this.leasingItemAdministrationServiceSubscriberAccessProfile = leasingItemAdministrationServiceSubscriberAccessProfile;
  }


}

