/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Administer;

@BianRestController
public class LeasingItemAdministrationApiController {

	@Autowired
	LeasingItemAdministrationApiService service;
	
	@Administer.Activate
	public BianResponse<SDLeasingItemAdministrationActivateOutputModel> activate(@RequestBody BianRequest<SDLeasingItemAdministrationActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@BQ("assurance")
	@Administer.Capture
	public BianResponse<BQAssuranceCaptureOutputModel> captureAssurance(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQAssuranceCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureAssurance(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("registration")
	@Administer.Capture
	public BianResponse<BQRegistrationCaptureOutputModel> captureRegistration(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQRegistrationCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureRegistration(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Administer.Capture
	public BianResponse<CRLeasingItemAdministrativePlanCaptureOutputModel> capture(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRLeasingItemAdministrativePlanCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.capture(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("valuation")
	@Administer.Capture
	public BianResponse<BQValuationCaptureOutputModel> captureValuation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQValuationCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureValuation(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Administer.Configure
	public BianResponse<SDLeasingItemAdministrationConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDLeasingItemAdministrationConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Administer.Control
	public BianResponse<CRLeasingItemAdministrativePlanControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRLeasingItemAdministrativePlanControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Administer.Exchange
	public BianResponse<CRLeasingItemAdministrativePlanExchangeOutputModel> exchange(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRLeasingItemAdministrativePlanExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchange(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Administer.Feedback
	public BianResponse<SDLeasingItemAdministrationFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDLeasingItemAdministrationFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Administer.Grant
	public BianResponse<CRLeasingItemAdministrativePlanGrantOutputModel> grant(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRLeasingItemAdministrativePlanGrantInputModel> bianRequest) {
		return BianResponse.forSuccess(service.grant(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Administer.Initiate
	public BianResponse<CRLeasingItemAdministrativePlanInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRLeasingItemAdministrativePlanInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("assurance")
	@Administer.Initiate
	public BianResponse<BQAssuranceInitiateOutputModel> initiateAssurance(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQAssuranceInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateAssurance(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("registration")
	@Administer.Initiate
	public BianResponse<BQRegistrationInitiateOutputModel> initiateRegistration(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQRegistrationInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateRegistration(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("valuation")
	@Administer.Initiate
	public BianResponse<BQValuationInitiateOutputModel> initiateValuation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQValuationInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateValuation(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Administer.Request
	public BianResponse<CRLeasingItemAdministrativePlanRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRLeasingItemAdministrativePlanRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Administer.Retrieve
	public BianResponse<CRLeasingItemAdministrativePlanRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Administer.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Administer.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Administer.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@BQ("assurance")
	@Administer.Retrieve
	public BianResponse<BQAssuranceRetrieveOutputModel> retrieveAssurance(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveAssurance(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("registration")
	@Administer.Retrieve
	public BianResponse<BQRegistrationRetrieveOutputModel> retrieveRegistration(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveRegistration(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("valuation")
	@Administer.Retrieve
	public BianResponse<BQValuationRetrieveOutputModel> retrieveValuation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveValuation(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Administer.RetrieveSD
	public BianResponse<SDLeasingItemAdministrationRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Administer.Update
	public BianResponse<CRLeasingItemAdministrativePlanUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRLeasingItemAdministrativePlanUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("assurance")
	@Administer.Update
	public BianResponse<BQAssuranceUpdateOutputModel> updateAssurance(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQAssuranceUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateAssurance(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("registration")
	@Administer.Update
	public BianResponse<BQRegistrationUpdateOutputModel> updateRegistration(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQRegistrationUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateRegistration(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("valuation")
	@Administer.Update
	public BianResponse<BQValuationUpdateOutputModel> updateValuation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQValuationUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateValuation(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
