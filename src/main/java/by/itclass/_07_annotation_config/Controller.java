package by.itclass._07_annotation_config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Controller {
    private Service service;

    @Autowired
    public void setService(Service service) {
        this.service = service;
    }

    @Override
    public String toString() {
        return "Controller class, Service: " + service;
    }
}
