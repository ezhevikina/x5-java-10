package com.ezhevikina.homework10.service;

import com.ezhevikina.homework10.dao.exceptions.DaoException;
import com.ezhevikina.homework10.service.exceptions.NotEnoughMoneyException;
import com.ezhevikina.homework10.service.exceptions.UnknownAccountException;

public interface AccountService {
  void withdraw(int accountId, int amount) throws
      NotEnoughMoneyException, UnknownAccountException, DaoException;

  int balance(int accountId) throws UnknownAccountException, DaoException;

  void deposit(int accountId, int amount) throws UnknownAccountException, DaoException;

  void transfer(int from, int to, int amount) throws
      NotEnoughMoneyException, UnknownAccountException, DaoException;
}
