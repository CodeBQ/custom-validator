package com.codebq.customvalidator.controller;

import com.codebq.customvalidator.model.ListEntity;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class validatorExamples {

  @PostMapping(path = "list")
  String postList(@RequestBody @Valid ListEntity listEntity) {
    return "It worked, I got the items with id" + listEntity.getId();
  }
}
