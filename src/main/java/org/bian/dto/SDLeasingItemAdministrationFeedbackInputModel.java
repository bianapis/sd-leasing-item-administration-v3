package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDLeasingItemAdministrationFeedbackInputModelLeasingItemAdministrationFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDLeasingItemAdministrationFeedbackInputModel
 */
public class SDLeasingItemAdministrationFeedbackInputModel   {
  private Object leasingItemAdministrationFeedbackActionTaskRecord = null;

  private SDLeasingItemAdministrationFeedbackInputModelLeasingItemAdministrationFeedbackActionRecord leasingItemAdministrationFeedbackActionRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The feedback service call consolidated processing record 
   * @return leasingItemAdministrationFeedbackActionTaskRecord
  **/

  public Object getLeasingItemAdministrationFeedbackActionTaskRecord() {
    return leasingItemAdministrationFeedbackActionTaskRecord;
  }

  public void setLeasingItemAdministrationFeedbackActionTaskRecord(Object leasingItemAdministrationFeedbackActionTaskRecord) {
    this.leasingItemAdministrationFeedbackActionTaskRecord = leasingItemAdministrationFeedbackActionTaskRecord;
  }


  /**
   * Get leasingItemAdministrationFeedbackActionRecord
   * @return leasingItemAdministrationFeedbackActionRecord
  **/

  public SDLeasingItemAdministrationFeedbackInputModelLeasingItemAdministrationFeedbackActionRecord getLeasingItemAdministrationFeedbackActionRecord() {
    return leasingItemAdministrationFeedbackActionRecord;
  }

  public void setLeasingItemAdministrationFeedbackActionRecord(SDLeasingItemAdministrationFeedbackInputModelLeasingItemAdministrationFeedbackActionRecord leasingItemAdministrationFeedbackActionRecord) {
    this.leasingItemAdministrationFeedbackActionRecord = leasingItemAdministrationFeedbackActionRecord;
  }


}

