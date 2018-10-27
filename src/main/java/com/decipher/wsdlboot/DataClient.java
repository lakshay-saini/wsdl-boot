package com.decipher.wsdlboot;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;
import wsdl.GetGreet;
import wsdl.GetGreetResponse;

import javax.xml.bind.JAXBElement;

public class DataClient extends WebServiceGatewaySupport {

    public GetGreetResponse getGreetMessage() {
        JAXBElement response = this.getResponse();
        return  (GetGreetResponse)response.getValue();
    }

    private JAXBElement getResponse() {
        return (JAXBElement) getWebServiceTemplate().marshalSendAndReceive("http://localhost:8080/isssue-handle-1.0-SNAPSHOT/ApplicationService", new GetGreet(), new SoapActionCallback(""));
    }
}
