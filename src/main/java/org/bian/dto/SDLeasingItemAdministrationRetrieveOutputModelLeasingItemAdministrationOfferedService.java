package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDLeasingItemAdministrationRetrieveOutputModelLeasingItemAdministrationOfferedServiceLeasingItemAdministrationServiceRecord;

import javax.validation.Valid;
  
/**
 * SDLeasingItemAdministrationRetrieveOutputModelLeasingItemAdministrationOfferedService
 */
public class SDLeasingItemAdministrationRetrieveOutputModelLeasingItemAdministrationOfferedService   {
  private String leasingItemAdministrationServiceReference = null;

  private SDLeasingItemAdministrationRetrieveOutputModelLeasingItemAdministrationOfferedServiceLeasingItemAdministrationServiceRecord leasingItemAdministrationServiceRecord = null;


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
   * Get leasingItemAdministrationServiceRecord
   * @return leasingItemAdministrationServiceRecord
  **/

  public SDLeasingItemAdministrationRetrieveOutputModelLeasingItemAdministrationOfferedServiceLeasingItemAdministrationServiceRecord getLeasingItemAdministrationServiceRecord() {
    return leasingItemAdministrationServiceRecord;
  }

  public void setLeasingItemAdministrationServiceRecord(SDLeasingItemAdministrationRetrieveOutputModelLeasingItemAdministrationOfferedServiceLeasingItemAdministrationServiceRecord leasingItemAdministrationServiceRecord) {
    this.leasingItemAdministrationServiceRecord = leasingItemAdministrationServiceRecord;
  }


}

