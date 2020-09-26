package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDLeasingItemAdministrationConfigureOutputModelLeasingItemAdministrationServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDLeasingItemAdministrationConfigureOutputModel
 */
public class SDLeasingItemAdministrationConfigureOutputModel   {
  private String leasingItemAdministrationConfigurationActionTaskReference = null;

  private Object leasingItemAdministrationConfigurationActionTaskRecord = null;

  private SDLeasingItemAdministrationConfigureOutputModelLeasingItemAdministrationServiceConfigurationRecord leasingItemAdministrationServiceConfigurationRecord = null;

  private String leasingItemAdministrationServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service configuration service call 
   * @return leasingItemAdministrationConfigurationActionTaskReference
  **/

  public String getLeasingItemAdministrationConfigurationActionTaskReference() {
    return leasingItemAdministrationConfigurationActionTaskReference;
  }

  public void setLeasingItemAdministrationConfigurationActionTaskReference(String leasingItemAdministrationConfigurationActionTaskReference) {
    this.leasingItemAdministrationConfigurationActionTaskReference = leasingItemAdministrationConfigurationActionTaskReference;
  }


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
   * Get leasingItemAdministrationServiceConfigurationRecord
   * @return leasingItemAdministrationServiceConfigurationRecord
  **/

  public SDLeasingItemAdministrationConfigureOutputModelLeasingItemAdministrationServiceConfigurationRecord getLeasingItemAdministrationServiceConfigurationRecord() {
    return leasingItemAdministrationServiceConfigurationRecord;
  }

  public void setLeasingItemAdministrationServiceConfigurationRecord(SDLeasingItemAdministrationConfigureOutputModelLeasingItemAdministrationServiceConfigurationRecord leasingItemAdministrationServiceConfigurationRecord) {
    this.leasingItemAdministrationServiceConfigurationRecord = leasingItemAdministrationServiceConfigurationRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current operating status of the overall servicing session 
   * @return leasingItemAdministrationServicingSessionStatus
  **/

  public String getLeasingItemAdministrationServicingSessionStatus() {
    return leasingItemAdministrationServicingSessionStatus;
  }

  public void setLeasingItemAdministrationServicingSessionStatus(String leasingItemAdministrationServicingSessionStatus) {
    this.leasingItemAdministrationServicingSessionStatus = leasingItemAdministrationServicingSessionStatus;
  }


}

