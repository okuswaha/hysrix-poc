package com.prakash.hystrix.Observer;

import com.prakash.hystrix.Observable.ObservableValue;

import java.util.Observable;
import java.util.Observer;

public class TextObserver  implements Observer {
    private ObservableValue observableValue =  null;

    public TextObserver(ObservableValue observableValue) {
        this.observableValue = observableValue;
    }

    public void update(Observable o, Object arg) {
        if(o == observableValue && observableValue.getValue() > 18){
            System.out.println("TextObserver Says "+ observableValue.getValue() );
        }

    }
}
