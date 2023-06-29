package co.edu.escuelaing.arsw.CalculatorMVC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class CalculatorController {
    @Autowired
    CurrentValue val;
    @GetMapping("/add")
    public String add(@RequestParam( name = "number", required = true, defaultValue = "0") String value, Model model){
        val.setCurrentValue(val.getCurrentValue() + Double.parseDouble(value));
        model.addAttribute("currentVal", val.getCurrentValue());
        return "calculator";
    }
    @GetMapping("/mult")
    public String mult(@RequestParam( name = "number", required = true, defaultValue = "0") String value, Model model){
        val.setCurrentValue(val.getCurrentValue() * Double.parseDouble(value));
        model.addAttribute("currentVal", val.getCurrentValue());
        return "calculator";
    }
    @GetMapping("/resta")
    public String resta(@RequestParam( name = "number", required = true, defaultValue = "0") String value, Model model){
        val.setCurrentValue(val.getCurrentValue() - Double.parseDouble(value));
        model.addAttribute("currentVal", val.getCurrentValue());
        return "calculator";
    }
    @GetMapping("/div")
    public String div(@RequestParam( name = "number", required = true, defaultValue = "0") String value, Model model){
        val.setCurrentValue(val.getCurrentValue() / Double.parseDouble(value));
        model.addAttribute("currentVal", val.getCurrentValue());
        return "calculator";
    }
    @GetMapping("/ac")
    public String allClear(Model model){
        val.setCurrentValue(0);
        model.addAttribute("currentVal", val.getCurrentValue());
        return "calculator";
    }
    @GetMapping("/calc")
    public String defaultCalc(Model model){
        model.addAttribute(0);
        return "calculator";
    }
}

