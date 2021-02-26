package com.intec.jokes;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/")
@Slf4j
public class MainController {

     @GetMapping("/")
     @ResponseBody
     public String index(HttpServletRequest request) {
          log.info("in home control     local: " + request.getLocalAddr());
          log.info("in home control    remote: " + request.getRemoteAddr());
          return "hello";
     }
}
