package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDLeasingItemAdministrationRetrieveOutputModelLeasingItemAdministrationOfferedServiceLeasingItemAdministrationServiceRecordLeasingItemAdministrationServicePoliciesandGuidelines;

import javax.validation.Valid;
  
/**
 * SDLeasingItemAdministrationRetrieveOutputModelLeasingItemAdministrationOfferedServiceLeasingItemAdministrationServiceRecord
 */
public class SDLeasingItemAdministrationRetrieveOutputModelLeasingItemAdministrationOfferedServiceLeasingItemAdministrationServiceRecord   {
  private String leasingItemAdministrationServiceType = null;

  private String leasingItemAdministrationServiceVersion = null;

  private String leasingItemAdministrationServiceDescription = null;

  private SDLeasingItemAdministrationRetrieveOutputModelLeasingItemAdministrationOfferedServiceLeasingItemAdministrationServiceRecordLeasingItemAdministrationServicePoliciesandGuidelines leasingItemAdministrationServicePoliciesandGuidelines = null;

  private String leasingItemAdministrationServiceSchedule = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Refers to the different types of services offered 
   * @return leasingItemAdministrationServiceType
  **/

  public String getLeasingItemAdministrationServiceType() {
    return leasingItemAdministrationServiceType;
  }

  public void setLeasingItemAdministrationServiceType(String leasingItemAdministrationServiceType) {
    this.leasingItemAdministrationServiceType = leasingItemAdministrationServiceType;
  }


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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the offered service  
   * @return leasingItemAdministrationServiceDescription
  **/

  public String getLeasingItemAdministrationServiceDescription() {
    return leasingItemAdministrationServiceDescription;
  }

  public void setLeasingItemAdministrationServiceDescription(String leasingItemAdministrationServiceDescription) {
    this.leasingItemAdministrationServiceDescription = leasingItemAdministrationServiceDescription;
  }


  /**
   * Get leasingItemAdministrationServicePoliciesandGuidelines
   * @return leasingItemAdministrationServicePoliciesandGuidelines
  **/

  public SDLeasingItemAdministrationRetrieveOutputModelLeasingItemAdministrationOfferedServiceLeasingItemAdministrationServiceRecordLeasingItemAdministrationServicePoliciesandGuidelines getLeasingItemAdministrationServicePoliciesandGuidelines() {
    return leasingItemAdministrationServicePoliciesandGuidelines;
  }

  public void setLeasingItemAdministrationServicePoliciesandGuidelines(SDLeasingItemAdministrationRetrieveOutputModelLeasingItemAdministrationOfferedServiceLeasingItemAdministrationServiceRecordLeasingItemAdministrationServicePoliciesandGuidelines leasingItemAdministrationServicePoliciesandGuidelines) {
    this.leasingItemAdministrationServicePoliciesandGuidelines = leasingItemAdministrationServicePoliciesandGuidelines;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Schedule defining when the accessed service is available 
   * @return leasingItemAdministrationServiceSchedule
  **/

  public String getLeasingItemAdministrationServiceSchedule() {
    return leasingItemAdministrationServiceSchedule;
  }

  public void setLeasingItemAdministrationServiceSchedule(String leasingItemAdministrationServiceSchedule) {
    this.leasingItemAdministrationServiceSchedule = leasingItemAdministrationServiceSchedule;
  }


}

