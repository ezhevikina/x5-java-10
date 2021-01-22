package com.ezhevikina.homework10.controller;

import com.ezhevikina.homework10.service.AccountManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DepositController {
    private final AccountManager manager;

    @Autowired
    public DepositController(AccountManager manager) {
        this.manager = manager;
    }

    @GetMapping("/accounts/{id}/deposit")
    public ModelAndView deposit(@PathVariable(value = "id") int id) {
        ModelAndView model = new ModelAndView("deposit");
        model.addObject("id", id);
        return model;
    }

    @PostMapping("/accounts/{id}/deposit")
    public ModelAndView deposit(@PathVariable(value = "id") int id,
                                @RequestParam("amount") int amount) {
        ModelAndView model = new ModelAndView();

        try {
            manager.deposit(id, amount);
            model.setViewName("success");
            return model;

        } catch (Exception e) {
            model.setViewName("exception");
            model.addObject("message", e.getMessage());
            return model;
        }
    }
}
