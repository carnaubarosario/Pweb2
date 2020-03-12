package io.github.andersonfernandes.pwebsamples.repositories;

import io.github.andersonfernandes.pwebsamples.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
