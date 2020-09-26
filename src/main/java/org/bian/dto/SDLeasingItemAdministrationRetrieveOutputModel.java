package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDLeasingItemAdministrationRetrieveOutputModelLeasingItemAdministrationOfferedService;
import org.bian.dto.SDLeasingItemAdministrationRetrieveOutputModelLeasingItemAdministrationRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDLeasingItemAdministrationRetrieveOutputModel
 */
public class SDLeasingItemAdministrationRetrieveOutputModel   {
  private String leasingItemAdministrationRetrieveActionTaskReference = null;

  private Object leasingItemAdministrationRetrieveActionTaskRecord = null;

  private String leasingItemAdministrationRetrieveActionResponse = null;

  private SDLeasingItemAdministrationRetrieveOutputModelLeasingItemAdministrationRetrieveActionRecord leasingItemAdministrationRetrieveActionRecord = null;

  private SDLeasingItemAdministrationRetrieveOutputModelLeasingItemAdministrationOfferedService leasingItemAdministrationOfferedService = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a retrieve service call 
   * @return leasingItemAdministrationRetrieveActionTaskReference
  **/

  public String getLeasingItemAdministrationRetrieveActionTaskReference() {
    return leasingItemAdministrationRetrieveActionTaskReference;
  }

  public void setLeasingItemAdministrationRetrieveActionTaskReference(String leasingItemAdministrationRetrieveActionTaskReference) {
    this.leasingItemAdministrationRetrieveActionTaskReference = leasingItemAdministrationRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return leasingItemAdministrationRetrieveActionTaskRecord
  **/

  public Object getLeasingItemAdministrationRetrieveActionTaskRecord() {
    return leasingItemAdministrationRetrieveActionTaskRecord;
  }

  public void setLeasingItemAdministrationRetrieveActionTaskRecord(Object leasingItemAdministrationRetrieveActionTaskRecord) {
    this.leasingItemAdministrationRetrieveActionTaskRecord = leasingItemAdministrationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return leasingItemAdministrationRetrieveActionResponse
  **/

  public String getLeasingItemAdministrationRetrieveActionResponse() {
    return leasingItemAdministrationRetrieveActionResponse;
  }

  public void setLeasingItemAdministrationRetrieveActionResponse(String leasingItemAdministrationRetrieveActionResponse) {
    this.leasingItemAdministrationRetrieveActionResponse = leasingItemAdministrationRetrieveActionResponse;
  }


  /**
   * Get leasingItemAdministrationRetrieveActionRecord
   * @return leasingItemAdministrationRetrieveActionRecord
  **/

  public SDLeasingItemAdministrationRetrieveOutputModelLeasingItemAdministrationRetrieveActionRecord getLeasingItemAdministrationRetrieveActionRecord() {
    return leasingItemAdministrationRetrieveActionRecord;
  }

  public void setLeasingItemAdministrationRetrieveActionRecord(SDLeasingItemAdministrationRetrieveOutputModelLeasingItemAdministrationRetrieveActionRecord leasingItemAdministrationRetrieveActionRecord) {
    this.leasingItemAdministrationRetrieveActionRecord = leasingItemAdministrationRetrieveActionRecord;
  }


  /**
   * Get leasingItemAdministrationOfferedService
   * @return leasingItemAdministrationOfferedService
  **/

  public SDLeasingItemAdministrationRetrieveOutputModelLeasingItemAdministrationOfferedService getLeasingItemAdministrationOfferedService() {
    return leasingItemAdministrationOfferedService;
  }

  public void setLeasingItemAdministrationOfferedService(SDLeasingItemAdministrationRetrieveOutputModelLeasingItemAdministrationOfferedService leasingItemAdministrationOfferedService) {
    this.leasingItemAdministrationOfferedService = leasingItemAdministrationOfferedService;
  }


}

