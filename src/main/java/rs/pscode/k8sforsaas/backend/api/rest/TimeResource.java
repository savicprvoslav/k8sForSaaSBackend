package rs.pscode.k8sforsaas.backend.api.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import rs.pscode.k8sforsaas.backend.api.rest.model.TimeJson;

import java.util.Date;

@RestController
public class TimeResource {

    @GetMapping(value = "/time")
    public TimeJson getTime() {
        return new TimeJson(new Date());
    }
}
