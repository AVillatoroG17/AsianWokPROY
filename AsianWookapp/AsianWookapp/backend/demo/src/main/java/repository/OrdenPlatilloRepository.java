package repository;

import entity.OrdenPlatillo;
import enums.EstadoPreparacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface OrdenPlatilloRepository extends JpaRepository<OrdenPlatillo, Integer> {
    List<OrdenPlatillo> findByEstadoPreparacion(EstadoPreparacion estadoPreparacion);
    List<OrdenPlatillo> findByOrdenId(Integer ordenId);
}
