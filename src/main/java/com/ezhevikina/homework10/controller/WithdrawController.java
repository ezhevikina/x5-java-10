package com.ezhevikina.homework10.controller;

import com.ezhevikina.homework10.dao.exceptions.DaoException;
import com.ezhevikina.homework10.service.AccountManager;
import com.ezhevikina.homework10.service.exceptions.NotEnoughMoneyException;
import com.ezhevikina.homework10.service.exceptions.UnknownAccountException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WithdrawController {
    private final AccountManager manager;

    @Autowired
    public WithdrawController(AccountManager manager) {
        this.manager = manager;
    }

    @GetMapping("/accounts/{id}/withdraw")
    public ModelAndView withdraw(@PathVariable(value = "id") int id) {
        ModelAndView model = new ModelAndView("withdraw");
        model.addObject("id", id);
        return model;
    }

    @PostMapping("/accounts/{id}/withdraw")
    public ModelAndView withdraw(@PathVariable(value = "id") int id,
                                 @RequestParam("amount") int amount) {
        ModelAndView model = new ModelAndView();

        try {
            manager.withdraw(id, amount);
            model.setViewName("success");
            return model;

        } catch (NotEnoughMoneyException | UnknownAccountException | DaoException e) {
            model.setViewName("exception");
            model.addObject("message", e.getMessage());
            return model;
        }
    }
}
