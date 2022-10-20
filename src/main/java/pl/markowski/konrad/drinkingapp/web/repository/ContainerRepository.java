package pl.markowski.konrad.drinkingapp.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.markowski.konrad.drinkingapp.web.repository.entity.ContainerEntity;

public interface ContainerRepository extends JpaRepository<ContainerEntity, Long> {
}
