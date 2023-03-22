
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NombreRepository extends CrudRepository<Nombre, Long> {

}