package com.grupo.estudos.Calculator.service;

import java.math.BigDecimal;
import java.math.MathContext;

import org.springframework.stereotype.Service;

@Service
public class CalculationService {
  private BigDecimal initialResult;
  private MathContext maxQuantityOfDigits;
  
  public CalculationService() {
    initialResult = new BigDecimal(0.0);
    maxQuantityOfDigits = new MathContext(50);
  }
  
  
  public BigDecimal add(BigDecimal num1, BigDecimal num2) {
    if(validateNumbersAreNotNull(num1, num2)) {
      return num1.add(num2, maxQuantityOfDigits);
    } else {
      System.out.print("\n numbers inserted are null, ask the user to insert a number");
      return initialResult;
    }
  }

  public BigDecimal subtract(BigDecimal num1, BigDecimal num2) {
    if(validateNumbersAreNotNull(num1, num2)) {
      return num1.subtract(num2, maxQuantityOfDigits);
    } else {
      System.out.print("\n numbers inserted are null, ask the user to insert a number");
      return initialResult;
    }
  }

  public BigDecimal multiply(BigDecimal num1, BigDecimal num2) {
    if(validateNumbersAreNotNull(num1, num2)) {
      return num1.multiply(num2, maxQuantityOfDigits);
    } else {
      System.out.print("\n numbers inserted are null, ask the user to insert a number");
      return initialResult;
    }
  }

  public BigDecimal divide(BigDecimal num1, BigDecimal num2) {
    if(validateNumbersAreNotNull(num1, num2)) {
      return num1.divide(num2, maxQuantityOfDigits);
    } else {
      System.out.print("\n numbers inserted are null, ask the user to insert a number");
      return initialResult;
    } 
  }

  public boolean validateNumbersAreNotNull(BigDecimal num1, BigDecimal num2) {
    if(num1 != null && num2 != null) {
      return true;
    } else {
      return false;
    }    
  }
}
