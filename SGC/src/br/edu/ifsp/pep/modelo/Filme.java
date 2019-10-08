package br.edu.ifsp.pep.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "filme")
@NamedQueries({
        @NamedQuery(name = "Filme.findAll", 
                query = "SELECT f FROM Filme f"),
        @NamedQuery(name = "Filme.findByCodigo", 
                query = "SELECT f FROM Filme f WHERE f.codigo = :codigo")
})
public class Filme implements Serializable {
    @Id
    @Column(name = "codigo")
    /// @GeneratedValue(strategy = GenerationType.IDENTITY)
    /// Habilitar depois
    private Integer codigo;
    
    @Column(name = "titulo", length = 100, nullable = false)
    private String titulo;
    
    @Column(name = "descricao", length = 500)
    private String descricao;
    
    @Column(name="data_estreia", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dataEstreia;
    
    @Column(name="duracao", nullable = false)
    private Integer duracao; 
    // em minutos, arredondado para cima 
    // 120 minutos e 1 segundo viram 121 minutos
    
    @Column(name="direcao", length = 80, nullable = false)
    private String direcao;
    
    @Column(name="idade_minima", nullable = false)
    private Integer idadeMinima;
    
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "filme_genero",
            joinColumns = @JoinColumn(name = "filme_id"),
            inverseJoinColumns = @JoinColumn(name = "genero_id")
    )
    private List<Genero> generos; 

    public Filme() {
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setDataEstreia(Date dataEstreia) {
        this.dataEstreia = dataEstreia;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    public void setDirecao(String direcao) {
        this.direcao = direcao;
    }

    public void setIdadeMinima(Integer idadeMinima) {
        this.idadeMinima = idadeMinima;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public Date getDataEstreia() {
        return dataEstreia;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public String getDirecao() {
        return direcao;
    }

    public Integer getIdadeMinima() {
        return idadeMinima;
    }

    public List<Genero> getGeneros() {
        return generos;
    }

    public void setGeneros(List<Genero> generos) {
        this.generos = generos;
    }
    
    
    

}