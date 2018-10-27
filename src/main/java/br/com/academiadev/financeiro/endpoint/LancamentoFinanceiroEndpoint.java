package br.com.academiadev.financeiro.endpoint;

import br.com.academiadev.financeiro.model.LancamentoFinanceiro;
import br.com.academiadev.financeiro.repository.LancamentoFinanceiroRepository;
import br.com.academiadev.financeiro.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/lancamentoFinanceiro")
public class LancamentoFinanceiroEndpoint {

    @Autowired
    private LancamentoFinanceiroRepository lancamentoFinanceiroRepository;

    @PostMapping("/")
    public void save(@RequestBody LancamentoFinanceiro lancamentoFinanceiro) {
        lancamentoFinanceiroRepository.save(lancamentoFinanceiro);
    }

    @GetMapping("/")
    public List<LancamentoFinanceiro> list() {
        return Util.toList(lancamentoFinanceiroRepository.findAll());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        lancamentoFinanceiroRepository.deleteById(id);
    }

}
