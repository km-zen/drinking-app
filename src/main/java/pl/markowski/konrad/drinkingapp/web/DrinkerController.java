package pl.markowski.konrad.drinkingapp.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.markowski.konrad.drinkingapp.web.model.DrinkerModel;
import pl.markowski.konrad.drinkingapp.web.repository.entity.DrinkerEntity;
import pl.markowski.konrad.drinkingapp.web.service.DrinkerService;


import java.util.logging.Logger;

@Controller
@RequestMapping(value = "/drinkers")
public class DrinkerController {
    private final Logger LOGGER = Logger.getLogger(DrinkerController.class.getName());
    private DrinkerService drinkerService;

    public DrinkerController(DrinkerService drinkerService) {
        this.drinkerService = drinkerService;
    }

    // L - list
    @GetMapping
    public String drinkersList(Model model) {
        model.addAttribute("drinkers", drinkerService.list());
        return "list-drinkers";
    }

    // C - create
    @GetMapping(value = "/create")
    public String createDrinkerView() {
        LOGGER.info("createDrinkerView()");
        return "create-drinker";
    }

    @PostMapping(value = "/create")
    public String createDrinker(String name, String drinkerType) {
        LOGGER.info("create: " + name + " of type: " + drinkerType);
        drinkerService.create(name, drinkerType);
        return "redirect:/drinkers";
    }

    // R - read
    public void read() {
    }

    // U - update
    @GetMapping(value = "/update/{id}")
    public String updateView(@PathVariable (name = "id") Long id, Model model) throws Exception {
    LOGGER.info("upadateDrinker(" + id + ")");
    DrinkerEntity drinkerEntity = drinkerService.read(id);
        model.addAttribute("drinker", drinkerEntity);
        return "update-drinker";
    }

    @PostMapping(value = "/update")
    public String update(DrinkerModel drinkerModel) throws Exception {
        LOGGER.info("update(" + drinkerModel + ")");
        drinkerService.update(drinkerModel);
        return "redirect:/drinkers";
    }

    // D - delete
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable(name = "id") Long id) throws Exception {
        LOGGER.info("delete(" + id + ")");
        drinkerService.delete(id);
        return "redirect:/drinkers";
    }
}
