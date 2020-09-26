package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDLeasingItemAdministrationRetrieveInputModelLeasingItemAdministrationOfferedServiceLeasingItemAdministrationServiceRecord;

import javax.validation.Valid;
  
/**
 * SDLeasingItemAdministrationRetrieveInputModelLeasingItemAdministrationOfferedService
 */
public class SDLeasingItemAdministrationRetrieveInputModelLeasingItemAdministrationOfferedService   {
  private String leasingItemAdministrationServiceReference = null;

  private SDLeasingItemAdministrationRetrieveInputModelLeasingItemAdministrationOfferedServiceLeasingItemAdministrationServiceRecord leasingItemAdministrationServiceRecord = null;


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

  public SDLeasingItemAdministrationRetrieveInputModelLeasingItemAdministrationOfferedServiceLeasingItemAdministrationServiceRecord getLeasingItemAdministrationServiceRecord() {
    return leasingItemAdministrationServiceRecord;
  }

  public void setLeasingItemAdministrationServiceRecord(SDLeasingItemAdministrationRetrieveInputModelLeasingItemAdministrationOfferedServiceLeasingItemAdministrationServiceRecord leasingItemAdministrationServiceRecord) {
    this.leasingItemAdministrationServiceRecord = leasingItemAdministrationServiceRecord;
  }


}

