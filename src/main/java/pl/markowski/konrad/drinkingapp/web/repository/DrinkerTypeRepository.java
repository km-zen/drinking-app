package pl.markowski.konrad.drinkingapp.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.markowski.konrad.drinkingapp.web.repository.entity.DrinkerTypeEnity;

public interface DrinkerTypeRepository extends JpaRepository<DrinkerTypeEnity, Long> {
}
