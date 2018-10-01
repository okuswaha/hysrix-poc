package com.prakash.hystrix;

import com.prakash.hystrix.Observable.ObservableValue;
import com.prakash.hystrix.Observer.StringObserver;
import com.prakash.hystrix.Observer.TextObserver;
import org.junit.Test;

public class ObserverPatternTest {
    @Test
    public void testObserver(){
        ObservableValue observableValue = new ObservableValue(0);
        TextObserver textObserver = new TextObserver(observableValue);
        StringObserver stringObserver = new StringObserver(observableValue);
        observableValue.addObserver(textObserver);
        observableValue.addObserver(stringObserver);
        observableValue.setValue(19);
    }
}
