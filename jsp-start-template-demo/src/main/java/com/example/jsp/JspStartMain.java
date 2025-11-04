package com.example.jsp;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import org.apache.catalina.webresources.DirResourceSet;
import org.apache.catalina.webresources.StandardRoot;

import java.io.File;

public class JspStartMain {

    public static void main(String[] args) throws LifecycleException {
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8181);
        tomcat.getConnector();

        // 웹앱 컨텍스트 설정
        String webappDirLocation = "src/main/webapp/";
        Context ctx = tomcat.addWebapp("", new File(webappDirLocation).getAbsolutePath());

        // JSP 컴파일을 위한 클래스패스 설정
        File additionWebInfClasses = new File("target/classes");
        StandardRoot resources = new StandardRoot(ctx);
        resources.addPreResources(new DirResourceSet(resources, "/WEB-INF/classes",
                additionWebInfClasses.getAbsolutePath(), "/"));
        ctx.setResources(resources);

        tomcat.start();
        tomcat.getServer().await();
    }
}