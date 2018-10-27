package br.com.academiadev.financeiro.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class LancamentoFinanceiro {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    @ManyToOne(optional = false)
    private Usuario usuario;

    private TipoLancamento tipolancamento;
    private Status status;
    private LocalDate dataEmissao;
    private LocalDate dataVencimento;
    private LocalDate dataCriacao;
    private String recebedorPagador;


    private BigDecimal valor;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public TipoLancamento getTipolancamento() {
        return tipolancamento;
    }

    public void setTipolancamento(TipoLancamento tipolancamento) {
        this.tipolancamento = tipolancamento;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDate getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(LocalDate dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getRecebedorPagador() {
        return recebedorPagador;
    }

    public void setRecebedorPagador(String recebedorPagador) {
        this.recebedorPagador = recebedorPagador;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

}