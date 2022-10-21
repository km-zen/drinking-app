package pl.markowski.konrad.drinkingapp.web.service;

import org.springframework.stereotype.Service;
import pl.markowski.konrad.drinkingapp.web.repository.ContainerTypeRepository;
import pl.markowski.konrad.drinkingapp.web.repository.entity.ContainerTypeEntity;

import java.util.List;

@Service
public class ContainerTypeService {
    private final ContainerTypeRepository containerTypeRepository;

    public ContainerTypeService(ContainerTypeRepository containerTypeRepository) {
        this.containerTypeRepository = containerTypeRepository;
    }

    //L - list
    public List<ContainerTypeEntity> list(){
        return containerTypeRepository.findAll();
    }
}
