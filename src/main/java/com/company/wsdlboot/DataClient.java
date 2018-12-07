package com.company.wsdlboot;

import com.company.wsdlboot.wsdl.UpdateOrderStatusRequest;
import com.company.wsdlboot.wsdl.WFMCreateWOResponse;
import com.company.wsdlboot.wsdl.WFMUpdateStatusRequest;
import com.company.wsdlboot.wsdl.WFMUpdateWORequest;
import com.company.wsdlboot.wsdl.WFMUpdateWOResponse;
import com.company.wsdlboot.wsdl.UpdateOrderStatusResponse;
import com.company.wsdlboot.wsdl.WFMCreateWORequest;
import com.company.wsdlboot.wsdl.WFMUpdateStatusResponse;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

public class DataClient extends WebServiceGatewaySupport {

    private static final String URI = "http://localhost:8080/ws";

    /**
     * Purpose : Method to get UpdateOrderStatusResponse from SOAP service
     * @param request : UpdateOrderStatusRequest
     * @return UpdateOrderStatusResponse
     */
    public UpdateOrderStatusResponse getUpdateOrderStatusResponse(UpdateOrderStatusRequest request) {
        return (UpdateOrderStatusResponse) getWebServiceTemplate().marshalSendAndReceive(URI, request, new SoapActionCallback(""));
    }

    /**
     * Purpose : Method to get WFMCreateWOResponse from SOAP service
     * @param request : WFMCreateWORequest
     * @return WFMCreateWOResponse
     */
    public WFMCreateWOResponse getWFMCreateWOResponse(WFMCreateWORequest request) {
        return (WFMCreateWOResponse) getWebServiceTemplate().marshalSendAndReceive(URI, request, new SoapActionCallback(""));
    }

    /**
     * Purpose : Method to get WFMUpdateStatusResponse from SOAP service
     * @param request : WFMUpdateStatusRequest
     * @return WFMUpdateStatusResponse
     */
    public WFMUpdateStatusResponse getWFMUpdateStatusResponse(WFMUpdateStatusRequest request){
        return (WFMUpdateStatusResponse) getWebServiceTemplate().marshalSendAndReceive(URI, request, new SoapActionCallback(""));
    }

    /**
     * Purpose : Method to get WFMUpdateWOResponse from SOAP service
     * @param request : WFMUpdateWORequest
     * @return WFMUpdateWOResponse
     */
    public WFMUpdateWOResponse getWFMUpdateWOResponse(WFMUpdateWORequest request) {
        return (WFMUpdateWOResponse) getWebServiceTemplate().marshalSendAndReceive(URI, request, new SoapActionCallback(""));
    }
}
