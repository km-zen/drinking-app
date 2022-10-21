package pl.markowski.konrad.drinkingapp.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.markowski.konrad.drinkingapp.web.repository.entity.ContainerTypeEntity;

public interface ContainerTypeRepository extends JpaRepository<ContainerTypeEntity, Long> {
}
