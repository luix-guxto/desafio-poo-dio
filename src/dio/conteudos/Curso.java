package dio.conteudos;

public class Curso extends Conteudo{

    private int duracaoHoras;
    private final String material;
    private String professor;
    private final Questionario questionario;

    public Curso(String titulo, String descricao, int duracaoHoras, String material, String professor, Questionario questionario) {
        super(titulo, descricao);
        if(duracaoHoras <= 0) throw new IllegalArgumentException("A duração do curso deve ser maior que zero");
        if(material == null || material.isEmpty()) throw new NullPointerException("Material é obrigatório");
        this.duracaoHoras = duracaoHoras;
        this.material = material;
        this.professor = professor;
        this.questionario = questionario;
    }

    public int getDuracaoHoras() {
        return duracaoHoras;
    }

    public void setDuracaoHoras(int duracaoHoras) {
        this.duracaoHoras = duracaoHoras;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", duracaoHoras=" + duracaoHoras +
                ", material='" + material + '\'' +
                ", professor='" + professor + '\'' +
                ", questionario=" + questionario +
                '}';
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public Questionario getQuestionario() {
        return questionario;
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO * duracaoHoras;
    }
}
