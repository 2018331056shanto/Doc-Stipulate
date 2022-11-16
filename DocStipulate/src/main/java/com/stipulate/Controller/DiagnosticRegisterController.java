package com.stipulate.Controller;

import com.stipulate.Entity.DiagnosticRegistration;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@RestController
public class DiagnosticRegisterController {

    @GetMapping(value = "register/diagnostic")
    public ModelAndView diagnosticRegisterView()
    {
        return  new ModelAndView("user/Diagnostic");
    }

    @PostMapping(value = "register/diagnostic")
    public void registerDiagnostic(@Validated @ModelAttribute("registerDiagnostic")DiagnosticRegistration diagnosticRegistration, BindingResult bindingResult, ModelMap modelMap, RedirectAttributes redirectAttributes){
        System.out.println("hello how are you");
//        return  new ModelAndView("Home/HomePage");
    }

}
