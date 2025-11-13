package com.firsttodo.springboot.myfirsttodoapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
    // "say-hello" => "Hello! What are you learning today?"

    // @route /say-hello
    // @desc Returns a hello message
    // @method GET
    @RequestMapping("say-hello")
    @ResponseBody
    public String sayHello() {
        return "Hello! What are you learning today?";
    }   

    // @route /say-hello
    // @desc Returns a hello message
    // @method GET
    @RequestMapping("say-hello-html")
    @ResponseBody
    public String sayHelloHtml() {
        StringBuffer sb = new StringBuffer();

        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>My First HTML Page - Changed </title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("My First HTML Page with Body");
        sb.append("</body>");
        sb.append("</html>");
        return sb.toString();
    }   

    // src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp
    // @route /say-hello-jsp
    // @desc Returns a hello message
    // @method GET
    @RequestMapping("say-hello-jsp")
    public String sayHelloJsp() {
        return "sayHello";
    }   
}
