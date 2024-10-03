package dio.conteudos;

public class Projeto extends Conteudo{
    private String linkEntrega;
    private String descricaoEntrega;

    public Projeto(String titulo, String descricao, String linkEntrega, String descricaoEntrega) {
        super(titulo, descricao);
        this.linkEntrega = linkEntrega;
        this.descricaoEntrega = descricaoEntrega;
    }

    public String getLinkEntrega() {
        return linkEntrega;
    }

    public void setLinkEntrega(String linkEntrega) {
        this.linkEntrega = linkEntrega;
    }

    public String getDescricaoEntrega() {
        return descricaoEntrega;
    }

    public void setDescricaoEntrega(String descricaoEntrega) {
        this.descricaoEntrega = descricaoEntrega;
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO * 3;
    }

    @Override
    public String toString() {
        return "Projeto{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", linkEntrega='" + linkEntrega + '\'' +
                ", descricaoEntrega='" + descricaoEntrega + '\'' +
                '}';
    }
}
