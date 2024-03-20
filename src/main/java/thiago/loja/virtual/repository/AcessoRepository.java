package thiago.loja.virtual.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import thiago.loja.virtual.model.acesso;

@Repository
@Transactional
public interface AcessoRepository extends JpaRepository<acesso, Long> {

}
