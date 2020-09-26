package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDLeasingItemAdministrationActivateInputModelLeasingItemAdministrationServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDLeasingItemAdministrationActivateInputModel
 */
public class SDLeasingItemAdministrationActivateInputModel   {
  private Object leasingItemAdministrationActivationActionTaskRecord = null;

  private String leasingItemAdministrationCenterReference = null;

  private String leasingItemAdministrationServiceReference = null;

  private SDLeasingItemAdministrationActivateInputModelLeasingItemAdministrationServiceConfigurationRecord leasingItemAdministrationServiceConfigurationRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service center/operational unit 
   * @return leasingItemAdministrationCenterReference
  **/

  public String getLeasingItemAdministrationCenterReference() {
    return leasingItemAdministrationCenterReference;
  }

  public void setLeasingItemAdministrationCenterReference(String leasingItemAdministrationCenterReference) {
    this.leasingItemAdministrationCenterReference = leasingItemAdministrationCenterReference;
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

  public SDLeasingItemAdministrationActivateInputModelLeasingItemAdministrationServiceConfigurationRecord getLeasingItemAdministrationServiceConfigurationRecord() {
    return leasingItemAdministrationServiceConfigurationRecord;
  }

  public void setLeasingItemAdministrationServiceConfigurationRecord(SDLeasingItemAdministrationActivateInputModelLeasingItemAdministrationServiceConfigurationRecord leasingItemAdministrationServiceConfigurationRecord) {
    this.leasingItemAdministrationServiceConfigurationRecord = leasingItemAdministrationServiceConfigurationRecord;
  }


}

