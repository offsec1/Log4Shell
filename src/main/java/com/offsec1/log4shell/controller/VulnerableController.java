package com.offsec1.log4shell.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;


@Controller
public class VulnerableController {

    public static final Logger LOG = LogManager.getLogger(VulnerableController.class);

    @GetMapping("/vulnerable")
    public ResponseEntity simpleGetRequest(@RequestHeader(value = "User-Agent") String userAgent) {
        LOG.info("Received request with User-Agent: {}", userAgent);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/vulnerable")
    public ResponseEntity simplePostRequest(@RequestHeader(value = "User-Agent") String userAgent) {
        LOG.info("Received request with User-Agent: {}", userAgent);
        return ResponseEntity.ok().build();
    }
}
