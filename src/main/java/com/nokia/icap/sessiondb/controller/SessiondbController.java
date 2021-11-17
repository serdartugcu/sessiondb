package com.nokia.icap.sessiondb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by serdartugcu on 09/11/2016.
 */
@Controller
public class SessiondbController {

    @RequestMapping("/{parental}/{subId}")
    public String handleSessionDb(@PathVariable("parental") String parental, @PathVariable("subId") String subscriberId, Model model) {

        return null;
    }
}
