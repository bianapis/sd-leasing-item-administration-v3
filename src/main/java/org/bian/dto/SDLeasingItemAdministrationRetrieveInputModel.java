package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDLeasingItemAdministrationRetrieveInputModelLeasingItemAdministrationOfferedService;
import org.bian.dto.SDLeasingItemAdministrationRetrieveInputModelLeasingItemAdministrationRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDLeasingItemAdministrationRetrieveInputModel
 */
public class SDLeasingItemAdministrationRetrieveInputModel   {
  private Object leasingItemAdministrationRetrieveActionTaskRecord = null;

  private String leasingItemAdministrationRetrieveActionRequest = null;

  private SDLeasingItemAdministrationRetrieveInputModelLeasingItemAdministrationRetrieveActionRecord leasingItemAdministrationRetrieveActionRecord = null;

  private SDLeasingItemAdministrationRetrieveInputModelLeasingItemAdministrationOfferedService leasingItemAdministrationOfferedService = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return leasingItemAdministrationRetrieveActionRequest
  **/

  public String getLeasingItemAdministrationRetrieveActionRequest() {
    return leasingItemAdministrationRetrieveActionRequest;
  }

  public void setLeasingItemAdministrationRetrieveActionRequest(String leasingItemAdministrationRetrieveActionRequest) {
    this.leasingItemAdministrationRetrieveActionRequest = leasingItemAdministrationRetrieveActionRequest;
  }


  /**
   * Get leasingItemAdministrationRetrieveActionRecord
   * @return leasingItemAdministrationRetrieveActionRecord
  **/

  public SDLeasingItemAdministrationRetrieveInputModelLeasingItemAdministrationRetrieveActionRecord getLeasingItemAdministrationRetrieveActionRecord() {
    return leasingItemAdministrationRetrieveActionRecord;
  }

  public void setLeasingItemAdministrationRetrieveActionRecord(SDLeasingItemAdministrationRetrieveInputModelLeasingItemAdministrationRetrieveActionRecord leasingItemAdministrationRetrieveActionRecord) {
    this.leasingItemAdministrationRetrieveActionRecord = leasingItemAdministrationRetrieveActionRecord;
  }


  /**
   * Get leasingItemAdministrationOfferedService
   * @return leasingItemAdministrationOfferedService
  **/

  public SDLeasingItemAdministrationRetrieveInputModelLeasingItemAdministrationOfferedService getLeasingItemAdministrationOfferedService() {
    return leasingItemAdministrationOfferedService;
  }

  public void setLeasingItemAdministrationOfferedService(SDLeasingItemAdministrationRetrieveInputModelLeasingItemAdministrationOfferedService leasingItemAdministrationOfferedService) {
    this.leasingItemAdministrationOfferedService = leasingItemAdministrationOfferedService;
  }


}

