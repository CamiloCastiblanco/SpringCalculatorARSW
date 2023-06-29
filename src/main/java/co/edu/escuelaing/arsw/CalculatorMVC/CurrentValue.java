package co.edu.escuelaing.arsw.CalculatorMVC;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

/**
 * Clase creada para guardar variables en memoria
 */
@Component
@SessionScope
public class CurrentValue {
    private static CurrentValue currentValue = new CurrentValue();
    private double currentval = 0;
    public CurrentValue(){}
    public static CurrentValue getInstance(){
        return currentValue;
    }
    public double getCurrentValue(){
        return currentval;
    }
    public void setCurrentValue(double newVal){
        currentval = newVal;

    }
}
