package com.middleware360.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by awentzell on 2015-10-23.
 */
@Component
public class LogRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        //from("jms:invoices").to("file:/invoices");
        from("timer://simpleTimer?period=10000")
                .log("Fired Timer -> ${header.firedTime}");
            //.setBody(simple("Hello from timer at ${header.firedTime}"))
            //.to("stream:out");

    }
}
