package com.luis.patterns.observer;

import java.util.ArrayDeque;
import java.util.Deque;

public class MessageStream extends Subject
{

  private Deque<String> messageHistory = new ArrayDeque<>();
  @Override
  void setState(final String message) {
    messageHistory.add(message);
    this.notifyObservers();
  }

  @Override
  String getState() {
    return messageHistory.getLast();
  }
}
