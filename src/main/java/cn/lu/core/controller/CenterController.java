package cn.lu.core.controller;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.support.WebBindingInitializer;
import org.springframework.web.context.request.WebRequest;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by lufenglong on 2017/5/14.
 */

@Controller
public class CenterController implements WebBindingInitializer{

    @RequestMapping(value="/test/springmvc.do")
    public String test(String name ,Date birthday){
        System.out.println(name+"----"+birthday );
        return "";
    }

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder, WebRequest webRequest) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        webDataBinder.registerCustomEditor(Date.class,new CustomDateEditor(dateFormat,true));
    }
}
