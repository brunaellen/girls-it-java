package com.grupo.estudos.Calculator.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.grupo.estudos.Calculator.dto.RequestCalculation;
import com.grupo.estudos.Calculator.service.CalculationService;

@Controller
public class CalculatorController {
  
  @Autowired
  private CalculationService calculationService;
  
  @GetMapping("/")
  public String home() {
    return "home";
  }
  
  @PostMapping("/")
  public ModelAndView calculation(RequestCalculation request) {
    ModelAndView modelAndView = new ModelAndView("home");
    BigDecimal result = null; 
    
    if(request.getOperator().equals("+")) {
      result = calculationService.add(request.getFirstOperand(), request.getSecondOperand());
    } else if(request.getOperator().equals("-")) {
      result = calculationService.subtract(request.getFirstOperand(), request.getSecondOperand());
    } else if(request.getOperator().equals("*")) {
      result = calculationService.multiply(request.getFirstOperand(), request.getSecondOperand());
    } else if(request.getOperator().equals("/")) {
      result = calculationService.divide(request.getFirstOperand(), request.getSecondOperand());
    } else {
      System.out.print("doing nothing");
      result = new BigDecimal(0.0);
    }
    modelAndView.addObject("result", result);
    return modelAndView;
  }
}
