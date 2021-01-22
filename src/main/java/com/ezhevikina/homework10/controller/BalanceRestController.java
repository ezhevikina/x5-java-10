package com.ezhevikina.homework10.controller;

import com.ezhevikina.homework10.dao.exceptions.DaoException;
import com.ezhevikina.homework10.service.AccountManager;
import com.ezhevikina.homework10.service.exceptions.UnknownAccountException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceRestController {
    private final AccountManager manager;

    @Autowired
    public BalanceRestController(AccountManager manager) {
        this.manager = manager;
    }

    @GetMapping("/accounts/{id}/balance")
    @ResponseBody
    public ResponseEntity<?> getBalance(@PathVariable("id") int id) {
        HttpHeaders headers = new HttpHeaders();

        try {
            return ResponseEntity
                    .accepted()
                    .headers(headers)
                    .body(String.valueOf(manager.balance(id)));

        } catch (UnknownAccountException e) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body(String.format("Account #%d not found", id));

        } catch (DaoException e) {
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(e.getMessage());
        }
    }
}
