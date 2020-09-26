/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface LeasingItemAdministrationApiService {

	SDLeasingItemAdministrationActivateOutputModel activate(SDLeasingItemAdministrationActivateInputModel request);
	
	BQAssuranceCaptureOutputModel captureAssurance(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAssuranceCaptureInputModel request);
	
	BQRegistrationCaptureOutputModel captureRegistration(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRegistrationCaptureInputModel request);
	
	CRLeasingItemAdministrativePlanCaptureOutputModel capture(String sdReferenceId, String crReferenceId, CRLeasingItemAdministrativePlanCaptureInputModel request);
	
	BQValuationCaptureOutputModel captureValuation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQValuationCaptureInputModel request);
	
	SDLeasingItemAdministrationConfigureOutputModel configure(String sdReferenceId, SDLeasingItemAdministrationConfigureInputModel request);
	
	CRLeasingItemAdministrativePlanControlOutputModel control(String sdReferenceId, String crReferenceId, CRLeasingItemAdministrativePlanControlInputModel request);
	
	CRLeasingItemAdministrativePlanExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRLeasingItemAdministrativePlanExchangeInputModel request);
	
	SDLeasingItemAdministrationFeedbackOutputModel feedback(String sdReferenceId, SDLeasingItemAdministrationFeedbackInputModel request);
	
	CRLeasingItemAdministrativePlanGrantOutputModel grant(String sdReferenceId, String crReferenceId, CRLeasingItemAdministrativePlanGrantInputModel request);
	
	CRLeasingItemAdministrativePlanInitiateOutputModel initiate(String sdReferenceId, CRLeasingItemAdministrativePlanInitiateInputModel request);
	
	BQAssuranceInitiateOutputModel initiateAssurance(String sdReferenceId, String crReferenceId, BQAssuranceInitiateInputModel request);
	
	BQRegistrationInitiateOutputModel initiateRegistration(String sdReferenceId, String crReferenceId, BQRegistrationInitiateInputModel request);
	
	BQValuationInitiateOutputModel initiateValuation(String sdReferenceId, String crReferenceId, BQValuationInitiateInputModel request);
	
	CRLeasingItemAdministrativePlanRequestOutputModel request(String sdReferenceId, String crReferenceId, CRLeasingItemAdministrativePlanRequestInputModel request);
	
	CRLeasingItemAdministrativePlanRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	BQAssuranceRetrieveOutputModel retrieveAssurance(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQRegistrationRetrieveOutputModel retrieveRegistration(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQValuationRetrieveOutputModel retrieveValuation(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	SDLeasingItemAdministrationRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRLeasingItemAdministrativePlanUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRLeasingItemAdministrativePlanUpdateInputModel request);
	
	BQAssuranceUpdateOutputModel updateAssurance(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAssuranceUpdateInputModel request);
	
	BQRegistrationUpdateOutputModel updateRegistration(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRegistrationUpdateInputModel request);
	
	BQValuationUpdateOutputModel updateValuation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQValuationUpdateInputModel request);
	
}
