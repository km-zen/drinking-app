package pl.markowski.konrad.drinkingapp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.markowski.konrad.drinkingapp.web.model.CatModel;
import pl.markowski.konrad.drinkingapp.web.model.DrinkerModel;

import java.util.logging.Logger;

@Controller
@RequestMapping(value = "/drinkers")
public class DrinkerController {
   private final Logger LOGGER = Logger.getLogger(DrinkerController.class.getName());

    // C - create
    @GetMapping(value = "/create")
    public String createDrinkerView() {
        LOGGER.info("createDrinkerView()");
        return "create-drinker";
    }

    @PostMapping(value = "/create")
    public String createDrinker(String name, String drinkerType){
     LOGGER.info("create: " + name + " of type: "+ drinkerType);
     return "redirect:/drinkers";
    }
    // R - read
    public void read() {
    }
    // U - update
    public void update() {
    }
    // D - delete
    public void delete() {
    }
    // L - list
    public void list() {
    }
}
