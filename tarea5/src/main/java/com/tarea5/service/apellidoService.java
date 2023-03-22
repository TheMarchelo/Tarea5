
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class apellidoService {

    @Autowired
    private ApellidoRepository apellidoRepository;

    public List<Apellido> getAllApellidos() {
        return (List<Apellido>) apellidoRepository.findAll();
    }

    public Apellido saveApellido(Apellido apellido) {
        return apellidoRepository.save(apellido);
    }

    public Optional<Apellido> getApellidoById(Long id) {
        return apellidoRepository.findById(id);
    }

    public void deleteApellidoById(Long id) {
        apellidoRepository.deleteById(id);
    }
}

