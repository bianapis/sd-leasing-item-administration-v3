package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDLeasingItemAdministrationActivateInputModelLeasingItemAdministrationServiceConfigurationRecordLeasingItemAdministrationServiceConfigurationSetup
 */
public class SDLeasingItemAdministrationActivateInputModelLeasingItemAdministrationServiceConfigurationRecordLeasingItemAdministrationServiceConfigurationSetup   {
  private String leasingItemAdministrationServiceConfigurationParameter = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The default activation setting for the offered service configuration parameter  
   * @return leasingItemAdministrationServiceConfigurationParameter
  **/

  public String getLeasingItemAdministrationServiceConfigurationParameter() {
    return leasingItemAdministrationServiceConfigurationParameter;
  }

  public void setLeasingItemAdministrationServiceConfigurationParameter(String leasingItemAdministrationServiceConfigurationParameter) {
    this.leasingItemAdministrationServiceConfigurationParameter = leasingItemAdministrationServiceConfigurationParameter;
  }


}

