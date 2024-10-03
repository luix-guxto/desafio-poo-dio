package dio.conteudos;

public class Mentoria extends Conteudo{
    private String mentor;
    private String data;
    private String hora;
    private String link;

    public Mentoria(String titulo, String descricao, String mentor, String data, String hora, String link) {
        super(titulo, descricao);
        this.mentor = mentor;
        this.data = data;
        this.hora = hora;
        this.link = link;
    }

    public String getMentor() {
        return mentor;
    }

    public void setMentor(String mentor) {
        this.mentor = mentor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO * 2;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", mentor='" + mentor + '\'' +
                ", data='" + data + '\'' +
                ", hora='" + hora + '\'' +
                ", link='" + link + '\'' +
                '}';
    }
}
