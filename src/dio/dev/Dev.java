package dio.dev;

import dio.bootcamp.Bootcamp;
import dio.conteudos.Conteudo;

import java.util.ArrayList;
import java.util.List;

public class Dev {
    private final List<Bootcamp> bootcamps;
    private final List<Conteudo> conteudos;
    private final String nome;
    private final String telefone;
    private final String email;
    private double xp;

    public Dev(String nome, String telefone, String email, List<Bootcamp> bootcamps, List<Conteudo> conteudos) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.bootcamps = bootcamps;
        this.conteudos = conteudos;
        this.xp = 0;
    }
    public Dev(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.bootcamps = new ArrayList<>();
        this.conteudos = new ArrayList<>();
        this.xp = 0;
    }

    @Override
    public String toString() {
        return "Dev{" +
                "bootcamps=" + bootcamps +
                ", conteudos=" + conteudos +
                ", nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", xp=" + xp +
                '}';
    }

    public Dev(String nome, String telefone, String email, List<Object> list) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        if(list.get(0) instanceof Bootcamp){
            this.bootcamps = new ArrayList<>();
            for(Object obj : list){
                if(obj instanceof Bootcamp){
                    this.bootcamps.add((Bootcamp) obj);
                }
            }
            this.conteudos = new ArrayList<>();
            for(Bootcamp bootcamp : this.bootcamps){
                this.conteudos.addAll(bootcamp.obterConteudos());
            }
        }else if(list.get(0) instanceof Conteudo){
            this.conteudos = new ArrayList<>();
            for(Object obj : list){
                if(obj instanceof Conteudo){
                    this.conteudos.add((Conteudo) obj);
                }
            }
            this.bootcamps = new ArrayList<>();
        }else{
            throw new IllegalArgumentException("Lista inválida");
        }
        this.xp = 0;
    }
    public void adicionarBootcamp(Bootcamp bootcamp){
        this.bootcamps.add(bootcamp);
        this.conteudos.addAll(bootcamp.obterConteudos());
    }
    public void adicionarConteudo(Conteudo conteudo){
        this.conteudos.add(conteudo);
    }
    public List<Bootcamp> obterBootcamps(){
        return bootcamps;
    }

    public List<Conteudo> obterConteudos(){
        return conteudos;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    public double getXp() {
        return xp;
    }

    public void addXp(double xp){
        this.xp += xp;
    }
}
