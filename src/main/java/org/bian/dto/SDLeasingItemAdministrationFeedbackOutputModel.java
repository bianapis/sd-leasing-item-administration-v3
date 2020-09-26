package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDLeasingItemAdministrationFeedbackOutputModelLeasingItemAdministrationFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDLeasingItemAdministrationFeedbackOutputModel
 */
public class SDLeasingItemAdministrationFeedbackOutputModel   {
  private String leasingItemAdministrationFeedbackActionTaskReference = null;

  private Object leasingItemAdministrationFeedbackActionTaskRecord = null;

  private SDLeasingItemAdministrationFeedbackOutputModelLeasingItemAdministrationFeedbackActionRecord leasingItemAdministrationFeedbackActionRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a feedback service call 
   * @return leasingItemAdministrationFeedbackActionTaskReference
  **/

  public String getLeasingItemAdministrationFeedbackActionTaskReference() {
    return leasingItemAdministrationFeedbackActionTaskReference;
  }

  public void setLeasingItemAdministrationFeedbackActionTaskReference(String leasingItemAdministrationFeedbackActionTaskReference) {
    this.leasingItemAdministrationFeedbackActionTaskReference = leasingItemAdministrationFeedbackActionTaskReference;
  }


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

  public SDLeasingItemAdministrationFeedbackOutputModelLeasingItemAdministrationFeedbackActionRecord getLeasingItemAdministrationFeedbackActionRecord() {
    return leasingItemAdministrationFeedbackActionRecord;
  }

  public void setLeasingItemAdministrationFeedbackActionRecord(SDLeasingItemAdministrationFeedbackOutputModelLeasingItemAdministrationFeedbackActionRecord leasingItemAdministrationFeedbackActionRecord) {
    this.leasingItemAdministrationFeedbackActionRecord = leasingItemAdministrationFeedbackActionRecord;
  }


}

