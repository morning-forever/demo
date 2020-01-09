package com.example.demo.string;

import org.apache.commons.lang3.StringEscapeUtils;

/**
 * @description: hewer
 * @author: guochaoyong
 * @date: 2019-12-21 15:43
 **/
public class Hello {

    public static void main(String args[]){
        String a = "status 500 reading MonolithFeignMapper#invokerPostService(Object); content:\n" +
                "{\"code\":\"error\",\"data\":\"\",\"message\":\"/ by zerojava.lang.ArithmeticException: / by zero\\r\\n\\tat com.etcj.monolith.sample.controller.HomeController.homeDemo(HomeController.java:33)\\r\\n\\tat sun.reflect.GeneratedMethodAccessor75.invoke(Unknown Source)\\r\\n\\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\\r\\n\\tat java.lang.reflect.Method.invoke(Method.java:498)\\r\\n\\tat org.springframework.web.method.support.InvocableHandlerMethod.doInvoke(InvocableHandlerMethod.java:189)\\r\\n\\tat org.springframework.web.method.support.InvocableHandlerMethod.invokeForRequest(InvocableHandlerMethod.java:138)\\r\\n\\tat org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod.invokeAndHandle(ServletInvocableHandlerMethod.java:102)\\r\\n\\tat org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.invokeHandlerMethod(RequestMappingHandlerAdapter.java:895)\\r\\n\\tat org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.handleInternal(RequestMappingHandlerAdapter.java:800)\\r\\n\\tat org.springframework.web.servlet.mvc.method.AbstractHandlerMethodAdapter.handle(AbstractHandlerMethodAdapter.java:87)\\r\\n\\tat org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:1038)\\r\\n\\tat org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:942)\\r\\n\\tat org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:1005)\\r\\n\\tat org.springframework.web.servlet.FrameworkServlet.doPost(FrameworkServlet.java:908)\\r\\n\\tat javax.servlet.http.HttpServlet.service(HttpServlet.java:660)\\r\\n\\tat org.springframework.web.servlet.FrameworkServlet.service(FrameworkServlet.java:882)\\r\\n\\tat javax.servlet.http.HttpServlet.service(HttpServlet.java:741)\\r\\n\\tat org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:231)\\r\\n\\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166)\\r\\n\\tat org.apache.tomcat.websocket.server.WsFilter.doFilter(WsFilter.java:53)\\r\\n\\tat org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193)\\r\\n\\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166)\\r\\n\\tat org.springframework.boot.actuate.web.trace.servlet.HttpTraceFilter.doFilterInternal(HttpTraceFilter.java:90)\\r\\n\\tat org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:107)\\r\\n\\tat org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193)\\r\\n\\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166)\\r\\n\\tat org.springframework.web.filter.RequestContextFilter.doFilterInternal(RequestContextFilter.java:99)\\r\\n\\tat org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:107)\\r\\n\\tat org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193)\\r\\n\\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166)\\r\\n\\tat org.springframework.web.filter.FormContentFilter.doFilterInternal(FormContentFilter.java:92)\\r\\n\\tat org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:107)\\r\\n\\tat org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193)\\r\\n\\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166)\\r\\n\\tat org.springframework.web.filter.HiddenHttpMethodFilter.doFilterInternal(HiddenHttpMethodFilter.java:93)\\r\\n\\tat org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:107)\\r\\n\\tat org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193)\\r\\n\\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166)\\r\\n\\tat org.springframework.boot.actuate.metrics.web.servlet.WebMvcMetricsFilter.filterAndRecordMetrics(WebMvcMetricsFilter.java:117)\\r\\n\\tat org.springframework.boot.actuate.metrics.web.servlet.WebMvcMetricsFilter.doFilterInternal(WebMvcMetricsFilter.java:106)\\r\\n\\tat org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:107)\\r\\n\\tat org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193)\\r\\n\\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166)\\r\\n\\tat org.springframework.web.filter.CharacterEncodingFilter.doFilterInternal(CharacterEncodingFilter.java:200)\\r\\n\\tat org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:107)\\r\\n\\tat org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193)\\r\\n\\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166)\\r\\n\\tat com.alibaba.csp.sentinel.adapter.servlet.CommonFilter.doFilter(CommonFilter.java:76)\\r\\n\\tat org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193)\\r\\n\\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166)\\r\\n\\tat org.apache.catalina.core.StandardWrapperValve.invoke(StandardWrapperValve.java:199)\\r\\n\\tat org.apache.catalina.core.StandardContextValve.invoke(StandardContextValve.java:96)\\r\\n\\tat org.apache.catalina.authenticator.AuthenticatorBase.invoke(AuthenticatorBase.java:490)\\r\\n\\tat org.apache.catalina.core.StandardHostValve.invoke(StandardHostValve.java:139)\\r\\n\\tat org.apache.catalina.valves.ErrorReportValve.invoke(ErrorReportValve.java:92)\\r\\n\\tat org.apache.catalina.core.StandardEngineValve.invoke(StandardEngineValve.java:74)\\r\\n\\tat org.apache.catalina.connector.CoyoteAdapter.service(CoyoteAdapter.java:343)\\r\\n\\tat org.apache.coyote.http11.Http11Processor.service(Http11Processor.java:408)\\r\\n\\tat org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:66)\\r\\n\\tat org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:834)\\r\\n\\tat org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1417)\\r\\n\\tat org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:49)\\r\\n\\tat java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)\\r\\n\\tat java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)\\r\\n\\tat org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:61)\\r\\n\\tat java.lang.Thread.run(Thread.java:748)\\r\\n\"}";
        String s = StringEscapeUtils.unescapeJava(a);


        System.out.println(s);
    }
}