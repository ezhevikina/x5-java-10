package com.ezhevikina.homework10.controller;

import com.ezhevikina.homework10.dao.exceptions.DaoException;
import com.ezhevikina.homework10.service.AccountManager;
import com.ezhevikina.homework10.service.exceptions.UnknownAccountException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class MainController {
    private final AccountManager manager;

    @Autowired
    public MainController(AccountManager manager) {
        this.manager = manager;
    }

    @GetMapping(value = "/")
    public ModelAndView main() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @GetMapping("/accounts/{id}")
    public ModelAndView accountActions(@PathVariable(value = "id") int id) {
        ModelAndView model = new ModelAndView("actions");
        model.addObject("id", id);
        return model;
    }

    @GetMapping(value = "/account")
    public ModelAndView account(@RequestParam("id") int id) {
        ModelAndView model = new ModelAndView();
        RedirectView redirectView;

        try {
            redirectView = new RedirectView("/accounts/{id}");
            manager.balance(id);
            redirectView.getAttributesMap().put("id", id);
            model.setView(redirectView);
            return model;

        } catch (UnknownAccountException | DaoException e) {
            model.setViewName("exception");
            model.addObject("message", e.getMessage());
            return model;
        }
    }
}