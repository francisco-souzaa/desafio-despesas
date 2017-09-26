package com.desafio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.desafio.resource.ContaResource;
 
@SpringBootApplication
@ComponentScan(basePackageClasses = ContaResource.class)
public class MainAplicacao {
 
  public static void main(String[] args) throws Exception {
    SpringApplication.run(MainAplicacao.class, args);
  }
 
}
