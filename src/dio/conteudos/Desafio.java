package dio.conteudos;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Desafio extends Conteudo{

    private final LocalTime horarioInicio;
    private LocalTime horarioFim;
    private LocalTime duracao;
    private int nivel;
    private final List<String> desafiosEnunciado;

    public Desafio(String titulo, String descricao, int nivel) {
        super(titulo, descricao);
        this.horarioInicio = LocalTime.now();
        this.nivel = nivel;
        this.desafiosEnunciado = new ArrayList<>();
    }
    public Desafio(String titulo, String descricao, int nivel, String[] enunciados) {
        super(titulo, descricao);
        this.horarioInicio = LocalTime.now();
        this.nivel = nivel;
        desafiosEnunciado = new ArrayList<>();
        this.desafiosEnunciado.addAll(Arrays.asList(enunciados));
    }

    public LocalTime getHorarioInicio() {
        return horarioInicio;
    }

    public LocalTime getHorarioFim() {
        return horarioFim;
    }

    public void setHorarioFim(LocalTime horarioFim) {
        this.horarioFim = horarioFim;
    }

    public LocalTime getDuracao() {
        return duracao;
    }

    public void setDuracao(LocalTime duracao) {
        this.duracao = duracao;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public List<String> getDesafiosEnunciado() {
        return desafiosEnunciado;
    }

    public void finalizarDesafio(){
        horarioFim = LocalTime.now();
        duracao = LocalTime.of(horarioFim.getHour() - horarioInicio.getHour(), horarioFim.getMinute() - horarioInicio.getMinute(), horarioFim.getSecond() - horarioInicio.getSecond());
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO * nivel;
    }

    @Override
    public String toString() {
        return "Desafio{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", horarioInicio=" + horarioInicio +
                ", horarioFim=" + horarioFim +
                ", duracao=" + duracao +
                ", nivel=" + nivel +
                ", desafiosEnunciado=" + desafiosEnunciado +
                '}';
    }
}
