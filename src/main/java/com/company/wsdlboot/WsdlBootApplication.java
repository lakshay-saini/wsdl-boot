package com.company.wsdlboot;

import com.company.wsdlboot.wsdl.UpdateOrderStatusRequest;
import com.company.wsdlboot.wsdl.WFMCreateWORequest;
import com.company.wsdlboot.wsdl.WFMCreateWOResponse;
import com.company.wsdlboot.wsdl.WFMUpdateStatusRequest;
import com.company.wsdlboot.wsdl.WFMUpdateStatusResponse;
import com.company.wsdlboot.wsdl.WFMUpdateWORequest;
import com.company.wsdlboot.wsdl.WFMUpdateWOResponse;
import com.company.wsdlboot.wsdl.UpdateOrderStatusResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WsdlBootApplication {

	private DataClient dataClient;

	public static void main(String[] args) {
		SpringApplication.run(WsdlBootApplication.class, args);
	}

	@Bean
	public DataClient lookup(DataClient quoteClient) {
		this.dataClient  = quoteClient;
		return quoteClient;
	}

	@RequestMapping("/getUpdateOrderStatusResponse")
	public UpdateOrderStatusResponse getUpdateOrderStatusResponse() {
		return dataClient.getUpdateOrderStatusResponse(new UpdateOrderStatusRequest());
	}

	@RequestMapping("/getWFMCreateWOResponse")
	public WFMCreateWOResponse getWFMCreateWOResponse() {
		return dataClient.getWFMCreateWOResponse(new WFMCreateWORequest());
	}

	@RequestMapping("/getWFMUpdateStatusResponse")
	public WFMUpdateStatusResponse getWFMUpdateStatusResponse() {
		return dataClient.getWFMUpdateStatusResponse(new WFMUpdateStatusRequest());
	}

	@RequestMapping("/getWFMUpdateWOResponse")
	public WFMUpdateWOResponse getWFMUpdateWOResponse() {
		return dataClient.getWFMUpdateWOResponse(new WFMUpdateWORequest());
	}
}
