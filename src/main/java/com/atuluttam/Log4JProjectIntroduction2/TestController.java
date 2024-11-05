package com.atuluttam.Log4JProjectIntroduction2;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TestController {

@RequestMapping("/home")
    public String homepage()
 {
       log.warn("It is a warning MSG!!!!");
       log.error("An Error MSG!!!");
       log.info("An Info MSG!!!!");
       log.debug("A Debug MSG!!!!");


       return "YOUR LOG OUTPUTS!!!!";
 }

}
