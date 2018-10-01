package com.prakash.hystrix.Observer;

import com.prakash.hystrix.Observable.ObservableValue;

import java.util.Observable;
import java.util.Observer;

public class StringObserver implements Observer {
    private ObservableValue observableValue = null;

    public StringObserver(ObservableValue observableValue) {
        this.observableValue = observableValue;
    }

    public void update(Observable o, Object arg) {
        if(o == observableValue && observableValue.getValue() < 18){
            System.out.println("StringObserver Says "+ observableValue.getValue() );
        }

    }
}
