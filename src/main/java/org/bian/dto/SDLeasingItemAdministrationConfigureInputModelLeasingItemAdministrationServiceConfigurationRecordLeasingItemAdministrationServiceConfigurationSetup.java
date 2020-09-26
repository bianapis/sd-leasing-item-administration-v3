package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDLeasingItemAdministrationConfigureInputModelLeasingItemAdministrationServiceConfigurationRecordLeasingItemAdministrationServiceConfigurationSetup
 */
public class SDLeasingItemAdministrationConfigureInputModelLeasingItemAdministrationServiceConfigurationRecordLeasingItemAdministrationServiceConfigurationSetup   {
  private String leasingItemAdministrationServiceConfigurationParameter = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The requested and current activation values for the service configuration parameter  
   * @return leasingItemAdministrationServiceConfigurationParameter
  **/

  public String getLeasingItemAdministrationServiceConfigurationParameter() {
    return leasingItemAdministrationServiceConfigurationParameter;
  }

  public void setLeasingItemAdministrationServiceConfigurationParameter(String leasingItemAdministrationServiceConfigurationParameter) {
    this.leasingItemAdministrationServiceConfigurationParameter = leasingItemAdministrationServiceConfigurationParameter;
  }


}

