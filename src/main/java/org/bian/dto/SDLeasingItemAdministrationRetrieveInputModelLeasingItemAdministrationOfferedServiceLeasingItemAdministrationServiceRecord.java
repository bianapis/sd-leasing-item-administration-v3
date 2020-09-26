package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDLeasingItemAdministrationRetrieveInputModelLeasingItemAdministrationOfferedServiceLeasingItemAdministrationServiceRecord
 */
public class SDLeasingItemAdministrationRetrieveInputModelLeasingItemAdministrationOfferedServiceLeasingItemAdministrationServiceRecord   {
  private String leasingItemAdministrationServiceVersion = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The version details of the service when appropriate 
   * @return leasingItemAdministrationServiceVersion
  **/

  public String getLeasingItemAdministrationServiceVersion() {
    return leasingItemAdministrationServiceVersion;
  }

  public void setLeasingItemAdministrationServiceVersion(String leasingItemAdministrationServiceVersion) {
    this.leasingItemAdministrationServiceVersion = leasingItemAdministrationServiceVersion;
  }


}

