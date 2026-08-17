package com.lldcoding.designpatterns.eventobservers;

public interface Subject {
void registerObserver(Observer observer);
void removeObserver(Observer observer);
void notifyObservers();
}
