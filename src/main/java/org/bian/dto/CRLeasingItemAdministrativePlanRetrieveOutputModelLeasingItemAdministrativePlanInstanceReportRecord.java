package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRLeasingItemAdministrativePlanRetrieveOutputModelLeasingItemAdministrativePlanInstanceReportRecord
 */
public class CRLeasingItemAdministrativePlanRetrieveOutputModelLeasingItemAdministrativePlanInstanceReportRecord   {
  private String leasingItemAdministrativePlanInstanceReportData = null;

  private String leasingItemAdministrativePlanInstanceReportType = null;

  private Object leasingItemAdministrativePlanInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return leasingItemAdministrativePlanInstanceReportData
  **/

  public String getLeasingItemAdministrativePlanInstanceReportData() {
    return leasingItemAdministrativePlanInstanceReportData;
  }

  public void setLeasingItemAdministrativePlanInstanceReportData(String leasingItemAdministrativePlanInstanceReportData) {
    this.leasingItemAdministrativePlanInstanceReportData = leasingItemAdministrativePlanInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return leasingItemAdministrativePlanInstanceReportType
  **/

  public String getLeasingItemAdministrativePlanInstanceReportType() {
    return leasingItemAdministrativePlanInstanceReportType;
  }

  public void setLeasingItemAdministrativePlanInstanceReportType(String leasingItemAdministrativePlanInstanceReportType) {
    this.leasingItemAdministrativePlanInstanceReportType = leasingItemAdministrativePlanInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return leasingItemAdministrativePlanInstanceReport
  **/

  public Object getLeasingItemAdministrativePlanInstanceReport() {
    return leasingItemAdministrativePlanInstanceReport;
  }

  public void setLeasingItemAdministrativePlanInstanceReport(Object leasingItemAdministrativePlanInstanceReport) {
    this.leasingItemAdministrativePlanInstanceReport = leasingItemAdministrativePlanInstanceReport;
  }


}

