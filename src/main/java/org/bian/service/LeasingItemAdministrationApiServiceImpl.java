/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class LeasingItemAdministrationApiServiceImpl implements LeasingItemAdministrationApiService {

	public SDLeasingItemAdministrationActivateOutputModel activate(SDLeasingItemAdministrationActivateInputModel request){
		return JsonReader.read("activate-SDLeasingItemAdministrationActivateOutputModel.json",new TypeReference<SDLeasingItemAdministrationActivateOutputModel>(){});
	}
	
	public BQAssuranceCaptureOutputModel captureAssurance(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAssuranceCaptureInputModel request){
		return JsonReader.read("capture-BQAssuranceCaptureOutputModel.json",new TypeReference<BQAssuranceCaptureOutputModel>(){});
	}
	
	public BQRegistrationCaptureOutputModel captureRegistration(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRegistrationCaptureInputModel request){
		return JsonReader.read("capture-BQRegistrationCaptureOutputModel.json",new TypeReference<BQRegistrationCaptureOutputModel>(){});
	}
	
	public CRLeasingItemAdministrativePlanCaptureOutputModel capture(String sdReferenceId, String crReferenceId, CRLeasingItemAdministrativePlanCaptureInputModel request){
		return JsonReader.read("capture-CRLeasingItemAdministrativePlanCaptureOutputModel.json",new TypeReference<CRLeasingItemAdministrativePlanCaptureOutputModel>(){});
	}
	
	public BQValuationCaptureOutputModel captureValuation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQValuationCaptureInputModel request){
		return JsonReader.read("capture-BQValuationCaptureOutputModel.json",new TypeReference<BQValuationCaptureOutputModel>(){});
	}
	
	public SDLeasingItemAdministrationConfigureOutputModel configure(String sdReferenceId, SDLeasingItemAdministrationConfigureInputModel request){
		return JsonReader.read("configure-SDLeasingItemAdministrationConfigureOutputModel.json",new TypeReference<SDLeasingItemAdministrationConfigureOutputModel>(){});
	}
	
	public CRLeasingItemAdministrativePlanControlOutputModel control(String sdReferenceId, String crReferenceId, CRLeasingItemAdministrativePlanControlInputModel request){
		return JsonReader.read("control-CRLeasingItemAdministrativePlanControlOutputModel.json",new TypeReference<CRLeasingItemAdministrativePlanControlOutputModel>(){});
	}
	
	public CRLeasingItemAdministrativePlanExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRLeasingItemAdministrativePlanExchangeInputModel request){
		return JsonReader.read("exchange-CRLeasingItemAdministrativePlanExchangeOutputModel.json",new TypeReference<CRLeasingItemAdministrativePlanExchangeOutputModel>(){});
	}
	
	public SDLeasingItemAdministrationFeedbackOutputModel feedback(String sdReferenceId, SDLeasingItemAdministrationFeedbackInputModel request){
		return JsonReader.read("feedback-SDLeasingItemAdministrationFeedbackOutputModel.json",new TypeReference<SDLeasingItemAdministrationFeedbackOutputModel>(){});
	}
	
	public CRLeasingItemAdministrativePlanGrantOutputModel grant(String sdReferenceId, String crReferenceId, CRLeasingItemAdministrativePlanGrantInputModel request){
		return JsonReader.read("grant-CRLeasingItemAdministrativePlanGrantOutputModel.json",new TypeReference<CRLeasingItemAdministrativePlanGrantOutputModel>(){});
	}
	
	public CRLeasingItemAdministrativePlanInitiateOutputModel initiate(String sdReferenceId, CRLeasingItemAdministrativePlanInitiateInputModel request){
		return JsonReader.read("initiate-CRLeasingItemAdministrativePlanInitiateOutputModel.json",new TypeReference<CRLeasingItemAdministrativePlanInitiateOutputModel>(){});
	}
	
	public BQAssuranceInitiateOutputModel initiateAssurance(String sdReferenceId, String crReferenceId, BQAssuranceInitiateInputModel request){
		return JsonReader.read("initiate-BQAssuranceInitiateOutputModel.json",new TypeReference<BQAssuranceInitiateOutputModel>(){});
	}
	
	public BQRegistrationInitiateOutputModel initiateRegistration(String sdReferenceId, String crReferenceId, BQRegistrationInitiateInputModel request){
		return JsonReader.read("initiate-BQRegistrationInitiateOutputModel.json",new TypeReference<BQRegistrationInitiateOutputModel>(){});
	}
	
	public BQValuationInitiateOutputModel initiateValuation(String sdReferenceId, String crReferenceId, BQValuationInitiateInputModel request){
		return JsonReader.read("initiate-BQValuationInitiateOutputModel.json",new TypeReference<BQValuationInitiateOutputModel>(){});
	}
	
	public CRLeasingItemAdministrativePlanRequestOutputModel request(String sdReferenceId, String crReferenceId, CRLeasingItemAdministrativePlanRequestInputModel request){
		return JsonReader.read("request-CRLeasingItemAdministrativePlanRequestOutputModel.json",new TypeReference<CRLeasingItemAdministrativePlanRequestOutputModel>(){});
	}
	
	public CRLeasingItemAdministrativePlanRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRLeasingItemAdministrativePlanRetrieveOutputModel.json",new TypeReference<CRLeasingItemAdministrativePlanRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQAssuranceRetrieveOutputModel retrieveAssurance(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQAssuranceRetrieveOutputModel.json",new TypeReference<BQAssuranceRetrieveOutputModel>(){});
	}
	
	public BQRegistrationRetrieveOutputModel retrieveRegistration(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQRegistrationRetrieveOutputModel.json",new TypeReference<BQRegistrationRetrieveOutputModel>(){});
	}
	
	public BQValuationRetrieveOutputModel retrieveValuation(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQValuationRetrieveOutputModel.json",new TypeReference<BQValuationRetrieveOutputModel>(){});
	}
	
	public SDLeasingItemAdministrationRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDLeasingItemAdministrationRetrieveOutputModel.json",new TypeReference<SDLeasingItemAdministrationRetrieveOutputModel>(){});
	}
	
	public CRLeasingItemAdministrativePlanUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRLeasingItemAdministrativePlanUpdateInputModel request){
		return JsonReader.read("update-CRLeasingItemAdministrativePlanUpdateOutputModel.json",new TypeReference<CRLeasingItemAdministrativePlanUpdateOutputModel>(){});
	}
	
	public BQAssuranceUpdateOutputModel updateAssurance(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAssuranceUpdateInputModel request){
		return JsonReader.read("update-BQAssuranceUpdateOutputModel.json",new TypeReference<BQAssuranceUpdateOutputModel>(){});
	}
	
	public BQRegistrationUpdateOutputModel updateRegistration(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRegistrationUpdateInputModel request){
		return JsonReader.read("update-BQRegistrationUpdateOutputModel.json",new TypeReference<BQRegistrationUpdateOutputModel>(){});
	}
	
	public BQValuationUpdateOutputModel updateValuation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQValuationUpdateInputModel request){
		return JsonReader.read("update-BQValuationUpdateOutputModel.json",new TypeReference<BQValuationUpdateOutputModel>(){});
	}
	
}
