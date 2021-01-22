package com.ezhevikina.homework10.servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Servlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    resp.getWriter().write("Я совсем не знаю как поженить этот сервлет хоть с одним методом AccountService\n" +
            ".jsp всегда not found, halp");
  }
}
