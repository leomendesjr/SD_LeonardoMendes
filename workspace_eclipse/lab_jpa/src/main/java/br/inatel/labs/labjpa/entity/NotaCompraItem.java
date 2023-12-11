package br.inatel.labs.labjpa.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.Objects;

@Entity
public class NotaCompraItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private BigDecimal valorCompraProduto;

    @NotNull
    private Integer quantidade;

    @NotNull
    @ManyToOne
    private NotaCompra notaCompra;

    @NotNull
    @ManyToOne
    private Produto produto;

    //construtores
    public NotaCompraItem() {}

    public NotaCompraItem(NotaCompra notaCompra, Produto produto, BigDecimal valorCompraProduto, Integer quantidade) {
        super();
        this.notaCompra = notaCompra;
        this.produto = produto;
        this.valorCompraProduto = valorCompraProduto;
        this.quantidade = quantidade;
    }

    public BigDecimal getCalculoTotalItem() {
        return valorCompraProduto.multiply(BigDecimal.valueOf(quantidade));
    }

    //acessores
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getValorCompraProduto() {
        return valorCompraProduto;
    }

    public void setValorCompraProduto(BigDecimal valorCompraProduto) {
        this.valorCompraProduto = valorCompraProduto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public NotaCompra getNotaCompra() {
        return notaCompra;
    }

    public void setNotaCompra(NotaCompra notaCompra) {
        this.notaCompra = notaCompra;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NotaCompraItem that = (NotaCompraItem) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "NotaCompraItem[" +
                "id=" + id +
                ", valorCompraProduto=" + valorCompraProduto +
                ", quantidade=" + quantidade +
                ", notaCompra=" + notaCompra +
                ", produto=" + produto +
                ']';
    }
}