package by.itclass._07_annotation_config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Service {
    private Dao dao;

    @Autowired
    public void setDao(Dao dao) {
        this.dao = dao;
    }

    @Override
    public String toString() {
        return "Service class, Dao: " + dao;
    }
}
