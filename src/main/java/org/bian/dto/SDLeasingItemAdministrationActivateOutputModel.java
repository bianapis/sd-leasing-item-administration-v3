package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDLeasingItemAdministrationActivateOutputModelLeasingItemAdministrationServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDLeasingItemAdministrationActivateOutputModel
 */
public class SDLeasingItemAdministrationActivateOutputModel   {
  private String leasingItemAdministrationActivationActionTaskReference = null;

  private Object leasingItemAdministrationActivationActionTaskRecord = null;

  private String leasingItemAdministrationServicingSessionReference = null;

  private Object leasingItemAdministrationServicingSessionRecord = null;

  private SDLeasingItemAdministrationActivateOutputModelLeasingItemAdministrationServiceConfigurationRecord leasingItemAdministrationServiceConfigurationRecord = null;

  private String leasingItemAdministrationServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service activation service call 
   * @return leasingItemAdministrationActivationActionTaskReference
  **/

  public String getLeasingItemAdministrationActivationActionTaskReference() {
    return leasingItemAdministrationActivationActionTaskReference;
  }

  public void setLeasingItemAdministrationActivationActionTaskReference(String leasingItemAdministrationActivationActionTaskReference) {
    this.leasingItemAdministrationActivationActionTaskReference = leasingItemAdministrationActivationActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The activation service call consolidated processing record 
   * @return leasingItemAdministrationActivationActionTaskRecord
  **/

  public Object getLeasingItemAdministrationActivationActionTaskRecord() {
    return leasingItemAdministrationActivationActionTaskRecord;
  }

  public void setLeasingItemAdministrationActivationActionTaskRecord(Object leasingItemAdministrationActivationActionTaskRecord) {
    this.leasingItemAdministrationActivationActionTaskRecord = leasingItemAdministrationActivationActionTaskRecord;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Consolidated information record for the servicing session 
   * @return leasingItemAdministrationServicingSessionRecord
  **/

  public Object getLeasingItemAdministrationServicingSessionRecord() {
    return leasingItemAdministrationServicingSessionRecord;
  }

  public void setLeasingItemAdministrationServicingSessionRecord(Object leasingItemAdministrationServicingSessionRecord) {
    this.leasingItemAdministrationServicingSessionRecord = leasingItemAdministrationServicingSessionRecord;
  }


  /**
   * Get leasingItemAdministrationServiceConfigurationRecord
   * @return leasingItemAdministrationServiceConfigurationRecord
  **/

  public SDLeasingItemAdministrationActivateOutputModelLeasingItemAdministrationServiceConfigurationRecord getLeasingItemAdministrationServiceConfigurationRecord() {
    return leasingItemAdministrationServiceConfigurationRecord;
  }

  public void setLeasingItemAdministrationServiceConfigurationRecord(SDLeasingItemAdministrationActivateOutputModelLeasingItemAdministrationServiceConfigurationRecord leasingItemAdministrationServiceConfigurationRecord) {
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

