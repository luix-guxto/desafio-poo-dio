package dio.bootcamp;

import dio.conteudos.Conteudo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicio;
    private final LocalDate dataFim;

    @Override
    public String toString() {
        return "Bootcamp{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", dataInicio=" + dataInicio +
                ", dataFim=" + dataFim +
                ", patrocinador='" + patrocinador + '\'' +
                ", conteudos=" + conteudos +
                '}';
    }

    private String patrocinador;
    private final List<Conteudo> conteudos;

    public Bootcamp(String nome, String descricao, LocalDate inicio, LocalDate fim, String patrocinador, List<Conteudo> conteudos) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicio = inicio;
        this.dataFim = fim;
        this.patrocinador = patrocinador;
        this.conteudos = new ArrayList<>();
        this.conteudos.addAll(conteudos);
    }
    public Bootcamp(String nome, String descricao, LocalDate inicio, LocalDate fim, String patrocinador) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicio = inicio;
        this.dataFim = fim;
        this.patrocinador = patrocinador;
        this.conteudos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public String getPatrocinador() {
        return patrocinador;
    }

    public void setPatrocinador(String patrocinador) {
        this.patrocinador = patrocinador;
    }

    public void adicionarConteudo(Conteudo conteudo){
        this.conteudos.add(conteudo);
    }

    public void removerConteudo(Conteudo conteudo){
        this.conteudos.remove(conteudo);
    }

    public List<Conteudo> obterConteudos(){
        return conteudos;
    }

    public double calcularXP(){
        return conteudos.stream().mapToDouble(Conteudo::calcularXP).sum();
    }
}
