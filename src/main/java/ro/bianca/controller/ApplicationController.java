package ro.bianca.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ApplicationController {

    @RequestMapping("/erp/it")
    @PreAuthorize("hasRole('ROLE_IT')")
    public String itView() {

        return "it";
    }

    @RequestMapping("/erp/hr")
    @PreAuthorize("hasRole('ROLE_IT')")
    public String hrView() {

        return "hr";
    }
}
