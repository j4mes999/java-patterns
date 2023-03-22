package com.luis.patterns.memento;

import java.util.Stack;

//caretaker
public class Caretaker
{
  private Stack<EmployeeMemento> employeeHistory = new Stack<>();
  public void save(Employee e){
    employeeHistory.push(e.save());
  }

  public void revert(Employee e){
    e.revert(employeeHistory.pop());
  }
}
