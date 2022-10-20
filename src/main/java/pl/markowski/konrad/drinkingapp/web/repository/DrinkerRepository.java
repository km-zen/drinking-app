package pl.markowski.konrad.drinkingapp.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.markowski.konrad.drinkingapp.web.repository.entity.DrinkerEntity;

public interface DrinkerRepository extends JpaRepository<DrinkerEntity, Long> {
}
