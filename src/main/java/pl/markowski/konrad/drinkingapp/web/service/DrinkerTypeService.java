package pl.markowski.konrad.drinkingapp.web.service;

import org.springframework.stereotype.Service;
import pl.markowski.konrad.drinkingapp.web.repository.DrinkerTypeRepository;
import pl.markowski.konrad.drinkingapp.web.repository.entity.DrinkerTypeEnity;

import java.util.List;

@Service
public class DrinkerTypeService {

    private final DrinkerTypeRepository drinkerTypeRepository;

    public DrinkerTypeService(DrinkerTypeRepository drinkerTypeRepository) {
        this.drinkerTypeRepository = drinkerTypeRepository;
    }

    // L - List
    public List<DrinkerTypeEnity> list(){
       return drinkerTypeRepository.findAll();
    }
}
