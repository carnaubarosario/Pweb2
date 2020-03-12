package io.github.andersonfernandes.pwebsamples.repositories;

import io.github.andersonfernandes.pwebsamples.models.Venda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendaRepository extends JpaRepository<Venda, Long> {
}
