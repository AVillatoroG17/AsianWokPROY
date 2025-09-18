package repository;


import entity.Usuario;
import enums.RolUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    List<Usuario> findByRol(RolUsuario rol);
    Usuario findByNombreUsuario(String nombreUsuario);
}