package com.ezhevikina.homework10.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Account {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  @Setter
  @Column(nullable = false)
  private String holder;
  @Setter
  @Column(nullable = false)
  private int amount;
}

