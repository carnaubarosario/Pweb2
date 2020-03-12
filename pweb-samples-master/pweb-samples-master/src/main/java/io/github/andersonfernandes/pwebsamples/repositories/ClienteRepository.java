package io.github.andersonfernandes.pwebsamples.repositories;

import io.github.andersonfernandes.pwebsamples.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
