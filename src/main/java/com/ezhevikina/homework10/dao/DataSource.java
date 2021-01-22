package com.ezhevikina.homework10.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DataSource {
  private static final EntityManagerFactory entityManagerFactory =
      Persistence.createEntityManagerFactory("persistenceUnit");

  private DataSource() {}

  public static EntityManager getEntityManager() {
    return entityManagerFactory.createEntityManager();
  }
}
