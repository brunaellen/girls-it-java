package com.grupo.estudos.Calculator.dto;

import java.math.BigDecimal;

public class RequestCalculation {
  private BigDecimal firstOperand;
  private BigDecimal secondOperand;
  private String operator;
  
  public BigDecimal getFirstOperand() {
    return firstOperand;
  }
  
  public void setFirstOperand(BigDecimal firstOperand) {
    this.firstOperand = firstOperand;
  }
  
  public BigDecimal getSecondOperand() {
    return secondOperand;
  }
  
  public void setSecondOperand(BigDecimal secondOperand) {
    this.secondOperand = secondOperand;
  }
  
  public String getOperator() {
    return operator;
  }
  
  public void setOperator(String operator) {
    this.operator = operator;
  }
}
