package com.nhnacademy.springmvc.controller;

import java.util.Map;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
//    @GetMapping("/")             // test /test2/aaa
//    public String index(ModelMap modelMap){
//        modelMap.put("hello", "Hello world !!!!!!");
//        return "index";
//    }
//
//    @GetMapping("/") // Controller 에서 view로 데이터를 넘기기 위해서 사용하는 것
//    public String index(Map<String, String> map){
//        map.put("hello", "Hello world");
//        return "index";
//    }

//    @GetMapping
//    public ModelAndView index(){
//        ModelAndView mav = new ModelAndView("index");
//        mav.addObject("hello", "Hello, World !!!!");
//
//        return mav;
//    }

//    @GetMapping("/aaaa")
//    public ModelAndView index(@RequestParam("name") String name){
//        ModelAndView mav = new ModelAndView("index");
//        mav.addObject("hello", "xxxxxx");
//
//        return mav;
//    }

    @GetMapping("/aaaa")
    public ModelAndView index(@RequestParam(value = "") String name){
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("hello", "xxxxxx");

        return mav;
    }


//    @PostMapping
//    public String text(){
//        // ....f
//        return "";
//    }
//
//    @GetMapping(value = "/test", params = "id") // GET /test?id= 있는 경우에만 사용하는 것, 파라미터 없을 시 "!id"를 사용하기.
//    public String test(){
//
//    }
//
//    @GetMapping("/test")
//    public String test() {
//        return "test";
//    }
//
//    @RequestMapping(value = "", method = RequestMethod.GET) // value를 생략 할 수 없다.
////    @RequestMapping(method = RequestMethod.GET, value="/test2")
//    @RequestMapping(value="/test2") // value가 생략 할 수 있다/
//    public String test2(){
//        return "test2";
//    }
//
//
//    public String test(HttpServletResponse response, Map<String, String> map){
//        map.put("name", "charlie");
//        model.addAttribute("name", "charlie");
//
//    }
}
