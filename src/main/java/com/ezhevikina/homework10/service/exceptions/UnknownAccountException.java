package com.ezhevikina.homework10.service.exceptions;

public class UnknownAccountException extends Exception {
  public UnknownAccountException(String message, Throwable cause) {
    super(message, cause);
  }
}
