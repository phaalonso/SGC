package br.edu.ifsp.pep.modelo;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "produto")
@DiscriminatorValue(value = "produto")
@NamedQueries({
    @NamedQuery(name = "Produto.findByCodigo",
            query = "SELECT p FROM Produto p WHERE p.codigo = :codigo"),
    @NamedQuery(name = "Produto.findByDesc",
            query = "SELECT p FROM Produto p WHERE p.descricao LIKE :desc")
})
public class Produto extends Item{        
    @Column(name = "estoque", nullable = false)
    private Integer estoque;

    public Produto() {
    }

    public Produto(String descricao, double preco, Integer estoque) {
        super(descricao, preco);
        this.estoque = estoque;
    }

    public Integer getEstoque() {
        return estoque;
    }

    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }    
    
    @Override
    public boolean verificaEstoque(int qtd){
        if(this.estoque < qtd || this.estoque <= 0)
            return false;
        return true;
    }
    
}
