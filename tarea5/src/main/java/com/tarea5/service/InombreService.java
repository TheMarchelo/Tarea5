

import java.util.List;

/**
 *
 * @author Marcelo
 */
public interface InombreService {

    public List<Nombre> getAllNombre();

    public Nombre getNombreById(long id);

    public void saveNombre(Nombre nombre);

    public void delete(long id);
}
