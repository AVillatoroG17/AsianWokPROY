package repository;

import entity.CategoriaPlatillo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaPlatilloRepository extends JpaRepository<CategoriaPlatillo, Integer> {
}