package com.techouts;

import org.apache.catalina.Context;
import org.apache.catalina.startup.Tomcat;

import java.io.File;

public class App {
    public static void main(String[] args) throws Exception {

        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);
        tomcat.setBaseDir("temp");
        tomcat.getConnector();

        Context context = tomcat.addContext("/", new File(".").getAbsolutePath());

        Tomcat.addServlet(context,"exampleServlet",new ExampleServlet());
        context.addServletMappingDecoded("/fi rst","exampleServlet");

        Tomcat.addServlet(context,"secondServlet",new SecondServlet());
        context.addServletMappingDecoded("/second","secondServlet");
        tomcat.start();
        tomcat.getServer().await();
    }
}
