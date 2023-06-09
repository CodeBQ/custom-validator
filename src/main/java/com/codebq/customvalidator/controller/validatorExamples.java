package com.codebq.customvalidator.controller;

import com.codebq.customvalidator.enums.NeedNames;
import com.codebq.customvalidator.enums.Vasyas;
import com.codebq.customvalidator.model.ListEntity;
import jakarta.validation.Valid;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class validatorExamples {

  @PostMapping(path = "list")
  String postList(@RequestBody @Valid ListEntity listEntity)
      throws NoSuchFieldException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {

    List<Field> fields = Arrays.stream(Vasyas.class.getDeclaredFields()).collect(Collectors.toList());

    List<Method> methods =   Arrays.stream(Vasyas.class.getMethods()).toList();

//    Field f = Vasyas.class.getDeclaredField("$VALUES");
//
//    String  mdf =  Modifier.toString(f.getModifiers());
//
//    Arrays.stream(Vasyas.values()).map(v->v.name);

    List<String> names =  Arrays.stream(Vasyas.values()).map(v->v.name).collect(Collectors.toList());

    Method method = Vasyas.class.getDeclaredMethod("values");
    Object obj = method.invoke(null);

    String str =  Arrays.toString((Object[]) obj);

    Class<? extends Enum<?>> vs = Vasyas.class;




    return "It worked, I got the items with id" + listEntity.getId();
  }
}
