package org.zigmoi.ketchup.demo.basicspringboot.ketchupdemobasicspringboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.atomic.AtomicInteger;

@Controller
public class MainController {
    //test4
    private final static Logger logger = LoggerFactory.getLogger(MainController.class);

    private static final AtomicInteger seq = new AtomicInteger(0);

    @RequestMapping("/")
    public @ResponseBody
    String base() {
        int i = seq.incrementAndGet();
        String msg = "Hit id : " + i;
        logger.info(msg);
        return msg;
    }
}
