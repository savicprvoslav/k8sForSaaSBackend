package rs.pscode.k8sforsaas.backend.api.rest.model;

import java.util.Date;

public class TimeJson {
    private final Date time;

    public TimeJson(Date time) {
        this.time = time;
    }

    public Date getTime() {
        return time;
    }
}
