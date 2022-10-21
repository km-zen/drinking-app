package pl.markowski.konrad.drinkingapp.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.markowski.konrad.drinkingapp.web.model.DrinkerModel;
import pl.markowski.konrad.drinkingapp.web.model.DrinkerTypeModel;
import pl.markowski.konrad.drinkingapp.web.repository.entity.DrinkerEntity;
import pl.markowski.konrad.drinkingapp.web.repository.entity.DrinkerTypeEnity;
import pl.markowski.konrad.drinkingapp.web.service.DrinkerService;
import pl.markowski.konrad.drinkingapp.web.service.DrinkerTypeService;


import java.util.List;
import java.util.logging.Logger;

@Controller
@RequestMapping(value = "/drinkers")
public class DrinkerController {
    private final Logger LOGGER = Logger.getLogger(DrinkerController.class.getName());
    private final DrinkerService drinkerService;
    private final DrinkerTypeService drinkerTypeService;

    public DrinkerController(DrinkerService drinkerService, DrinkerTypeService drinkerTypeService) {
        this.drinkerService = drinkerService;
        this.drinkerTypeService = drinkerTypeService;
    }

    // L - list
    @GetMapping
    public String drinkersList(Model model) {
        model.addAttribute("drinkers", drinkerService.list());
        return "list-drinkers";
    }

    // C - create
    @GetMapping(value = "/create")
    public String createDrinkerView(ModelMap modelMap) {
        LOGGER.info("createDrinkerView()");
        List<DrinkerTypeEnity> drinkerTypeEnities = drinkerTypeService.list();
        modelMap.addAttribute("drinkerTypes",drinkerTypeEnities );
        return "create-drinker";
    }

    @PostMapping(value = "/create")
    public String createDrinker(String name, String drinkerTypeId) throws Exception {
        LOGGER.info("create: " + name + " and  type id: " + drinkerTypeId );
        drinkerService.create(name, drinkerTypeId);
        return "redirect:/drinkers";
    }

    // R - read
    @GetMapping("/read/{id}")
    public String read(@PathVariable (name = "id") Long id, Model model) throws Exception {
        LOGGER.info("read(" + id + ")");
        DrinkerEntity drinker = drinkerService.read(id);
        model.addAttribute("drinker",drinker);
        return "read-drinker";
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
