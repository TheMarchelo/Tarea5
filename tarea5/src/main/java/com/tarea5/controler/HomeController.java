import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private NombreRepository nombreRepository;
    private ApellidoRepository apellidoRepository;

    public HomeController(NombreRepository nombresRepository, ApellidoRepository apellidosRepository) {
        this.nombreRepository = nombresRepository;
        this.apellidoRepository = apellidosRepository;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("nombre", nombreRepository.findAll());
        model.addAttribute("apellido", apellidoRepository.findAll());
        return "index";
    }
    
}

