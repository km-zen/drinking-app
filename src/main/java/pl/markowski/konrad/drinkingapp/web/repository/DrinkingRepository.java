package pl.markowski.konrad.drinkingapp.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.markowski.konrad.drinkingapp.web.repository.entity.DrinkingEntity;

public interface DrinkingRepository extends JpaRepository<DrinkingEntity, Long> {
}
