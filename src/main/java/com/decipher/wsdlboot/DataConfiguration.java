package com.decipher.wsdlboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class DataConfiguration {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("wsdl");
        return marshaller;
    }

    @Bean
    public DataClient dataClient(Jaxb2Marshaller marshaller) {
        DataClient client = new DataClient();
        client.setDefaultUri("http://localhost:8080/isssue-handle-1.0-SNAPSHOT/ApplicationService");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
}
