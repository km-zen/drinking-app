package pl.markowski.konrad.drinkingapp.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.markowski.konrad.drinkingapp.web.repository.entity.ContainerEntity;
import pl.markowski.konrad.drinkingapp.web.repository.entity.DrinkerEntity;
import pl.markowski.konrad.drinkingapp.web.service.ContainerService;

import java.util.logging.Logger;

@Controller
@RequestMapping(value = "/containers")
public class ContainerController {
    private static final Logger LOGGER = Logger.getLogger(ContainerController.class.getName());
    private final ContainerService containerService;

    public ContainerController(ContainerService containerService) {
        this.containerService = containerService;
    }

    @GetMapping
    public String containersList(Model model) {
        model.addAttribute("containers", containerService.list());
        return "list-containers";
    }
    // C - create
    @GetMapping(value = "/create")
    public String createContainerView() {
        LOGGER.info("createContainerView()");
        return "create-container";
    }

    @PostMapping(value = "/create")
    public String createContainer(String name, String containerType) {
        LOGGER.info("create: " + name + " of type: " + containerType);
        containerService.create(name, containerType);
        return "redirect:/containers";
    }

    // R - read
    @GetMapping("/read/{id}")
    public String read(@PathVariable(name = "id") Long id, Model model) throws Exception {
        LOGGER.info("read(" + id + ")");
        ContainerEntity container = containerService.read(id);
        model.addAttribute("container", container);
        return "read-container";
    }



}
