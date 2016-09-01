package ro.bianca.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ApplicationController {

    @RequestMapping("/erp/it")
    @PreAuthorize("hasRole('ROLE_IT')")
    public String itView(Model model) {
        model.addAttribute("example", "this is an example");

        return "it";
    }

    @RequestMapping("/erp/hr")
    @PreAuthorize("hasRole('ROLE_HR')")
    public String hrView() {

        return "hr";
    }
}
