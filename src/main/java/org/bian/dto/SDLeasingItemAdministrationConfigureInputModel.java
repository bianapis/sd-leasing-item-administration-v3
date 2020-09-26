package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDLeasingItemAdministrationConfigureInputModelLeasingItemAdministrationServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDLeasingItemAdministrationConfigureInputModel
 */
public class SDLeasingItemAdministrationConfigureInputModel   {
  private Object leasingItemAdministrationConfigurationActionTaskRecord = null;

  private String leasingItemAdministrationServicingSessionReference = null;

  private String leasingItemAdministrationServiceReference = null;

  private SDLeasingItemAdministrationConfigureInputModelLeasingItemAdministrationServiceConfigurationRecord leasingItemAdministrationServiceConfigurationRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The configuration service call consolidated processing record 
   * @return leasingItemAdministrationConfigurationActionTaskRecord
  **/

  public Object getLeasingItemAdministrationConfigurationActionTaskRecord() {
    return leasingItemAdministrationConfigurationActionTaskRecord;
  }

  public void setLeasingItemAdministrationConfigurationActionTaskRecord(Object leasingItemAdministrationConfigurationActionTaskRecord) {
    this.leasingItemAdministrationConfigurationActionTaskRecord = leasingItemAdministrationConfigurationActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return leasingItemAdministrationServicingSessionReference
  **/

  public String getLeasingItemAdministrationServicingSessionReference() {
    return leasingItemAdministrationServicingSessionReference;
  }

  public void setLeasingItemAdministrationServicingSessionReference(String leasingItemAdministrationServicingSessionReference) {
    this.leasingItemAdministrationServicingSessionReference = leasingItemAdministrationServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service offered by the service center 
   * @return leasingItemAdministrationServiceReference
  **/

  public String getLeasingItemAdministrationServiceReference() {
    return leasingItemAdministrationServiceReference;
  }

  public void setLeasingItemAdministrationServiceReference(String leasingItemAdministrationServiceReference) {
    this.leasingItemAdministrationServiceReference = leasingItemAdministrationServiceReference;
  }


  /**
   * Get leasingItemAdministrationServiceConfigurationRecord
   * @return leasingItemAdministrationServiceConfigurationRecord
  **/

  public SDLeasingItemAdministrationConfigureInputModelLeasingItemAdministrationServiceConfigurationRecord getLeasingItemAdministrationServiceConfigurationRecord() {
    return leasingItemAdministrationServiceConfigurationRecord;
  }

  public void setLeasingItemAdministrationServiceConfigurationRecord(SDLeasingItemAdministrationConfigureInputModelLeasingItemAdministrationServiceConfigurationRecord leasingItemAdministrationServiceConfigurationRecord) {
    this.leasingItemAdministrationServiceConfigurationRecord = leasingItemAdministrationServiceConfigurationRecord;
  }


}

