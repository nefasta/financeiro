package br.com.academiadev.financeiro.endpoint;

import br.com.academiadev.financeiro.model.Usuario;
import br.com.academiadev.financeiro.repository.UsuarioRepository;
import br.com.academiadev.financeiro.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class UsuarioEndpoint {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping("/usuario")
    public void save(@RequestBody Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    @GetMapping("/usuario")
    public List<Usuario> list() {
        return Util.toList(usuarioRepository.findAll());
    }

    @DeleteMapping("/usuario/{id}")
    public void delete(@PathVariable Long id) {
        usuarioRepository.deleteById(id);
    }


}
