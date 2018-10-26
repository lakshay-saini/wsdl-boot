package com.decipher.wsdlboot;

import hello.wsdl.GetGreet;
import hello.wsdl.GetGreetResponse;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

public class DataClient extends WebServiceGatewaySupport {

    public GetGreetResponse getMessage() {

        GetGreet request = new GetGreet();

        return (GetGreetResponse) getWebServiceTemplate()
                .marshalSendAndReceive("http://localhost:8080/isssue-handle-1.0-SNAPSHOT/ComplaintService", request,
                        new SoapActionCallback(
                                "http://issuehandling.decipher.com/getGreet/"));
    }
}
