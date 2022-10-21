package pl.markowski.konrad.drinkingapp.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.markowski.konrad.drinkingapp.web.model.ContainerModel;
import pl.markowski.konrad.drinkingapp.web.model.DrinkerModel;
import pl.markowski.konrad.drinkingapp.web.repository.entity.ContainerEntity;
import pl.markowski.konrad.drinkingapp.web.repository.entity.DrinkerEntity;
import pl.markowski.konrad.drinkingapp.web.service.ContainerService;
import pl.markowski.konrad.drinkingapp.web.service.DrinkerService;

import java.util.List;
import java.util.logging.Logger;

@Controller
@RequestMapping(value = "/drink")
public class DrinkingController {
    private static final Logger LOGGER = Logger.getLogger(DrinkingController.class.getName());
    private final ContainerService containerService;
    private final DrinkerService drinkerService;

    public DrinkingController(ContainerService containerService, DrinkerService drinkerService) {
        this.containerService = containerService;
        this.drinkerService = drinkerService;
    }

    @GetMapping
    public String matchDashboardView(ModelMap modelMap) {
        List<ContainerEntity> containers = containerService.list();
        List<DrinkerEntity> drinkers = drinkerService.list();

      modelMap.addAttribute("containers", containers);
       modelMap.addAttribute("drinkers", drinkers);
        return "drink-dashboard";
    }
//    @PostMapping
//    public String drinkDashboard(String containerId, String drinkerId) {
//        ContainerEntity containerEntity = containerService.read(containerId);
//        DrinkerEntity drinkerEntity = drinkerService.read(drinkerId);
//        // let matchModel = matchService.match(containerModel, drinkerModel);
//
//        Drinking drinking = (drinker, containerModel, volume) -> System.out.println();
//        matchService.match((drinker, containerModel, volume) -> System.out.println(),
//                new DrinkerModel("", 1),
//                new ContainerModel("", 1),
//                1);
//
//        // List<MatchModel> matches = matchService.list();
//        // modelMap.addAttribute("matches", matches);
//        return "dashboard.html";
//    }
}
