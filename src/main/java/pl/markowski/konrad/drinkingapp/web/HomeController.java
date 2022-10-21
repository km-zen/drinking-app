package pl.markowski.konrad.drinkingapp.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.markowski.konrad.drinkingapp.web.service.DrinkingService;


@Controller
@RequestMapping(value = "/home")
public class HomeController {
    /*
Task: It is necessary to implement the interaction
of the classes Man and Bottle, which describes the
process of drinking liquid, taking into account the
state of its volume for both objects, and also expand
this interaction using the intermediate class controller
and interfaces for objects in order to expand them,
for example: Man -> Cat, Glass - > bowl and so on,
don't forget to validate input parameters.
Please use MVC pattern and SOLID principal
     */
private final DrinkingService drinkingService;

    public HomeController(DrinkingService drinkingService) {
        this.drinkingService = drinkingService;
    }

    @GetMapping
    public String homeView(Model model){
        model.addAttribute("drinks",drinkingService.list());
        return "home";
    }





}
