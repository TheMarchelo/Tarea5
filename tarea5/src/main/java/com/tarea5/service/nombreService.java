import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Marcelo
 */
@Service
public class nombreService implements InombreService {

    @Autowired
    private NombreRepository NombreRepository;

    @Override
    public List<Nombre> getAllNombre() {
        return (List<Nombre>) NombreRepository.findAll();
    }

    @Override
    public Nombre getNombreById(long id) {
       return NombreRepository.findById(id) .orElse(null);
    }

    @Override
    public void saveNombre(Nombre nombre) {
        NombreRepository.save(nombre);
    }

    @Override
    public void delete(long id) {
       NombreRepository.deleteById(id);
    }


}
