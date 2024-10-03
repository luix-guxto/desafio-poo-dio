package dio.conteudos;

import java.util.ArrayList;
import java.util.List;

public class Questionario extends Conteudo{
    private int quantidadeAcertos;
    private int quantidadeErros;
    private final List<Questao> questoes;
    private int questaoAtual;

    public Questionario(String titulo, String descricao) {
        super(titulo, descricao);
        this.questoes = new ArrayList<>();
        this.questaoAtual = 0;
    }

    public void adicionarQuestao(Questao questao){
        this.questoes.add(questao);
    }

    public Questao obterQuestaoAtual(){
        return this.questoes.get(questaoAtual);
    }

    public void responderQuestao(char resposta){
        Questao questao = obterQuestaoAtual();
        if(questao.validarResposta(resposta)){
            quantidadeAcertos++;
        }else{
            quantidadeErros++;
        }
        if(questaoAtual < questoes.size()){
            questaoAtual++;
        }
    }

    public int obterQuantidadeAcertos(){
        return quantidadeAcertos;
    }

    public int obterQuantidadeErros(){
        return quantidadeErros;
    }

    public int obterQuantidadeQuestoes(){
        return questoes.size();
    }

    public boolean finalizado(){
        return questaoAtual == questoes.size();
    }

    public void reiniciar(){
        quantidadeAcertos = 0;
        quantidadeErros = 0;
        questaoAtual = 0;
    }

    public void pularQuestao(){
        if(questaoAtual < questoes.size()){
            questaoAtual++;
        }
    }

    public void voltarQuestao(){
        if(questaoAtual > 0){
            questaoAtual--;
        }
    }

    @Override
    public double calcularXP() {
        if(quantidadeAcertos >= questoes.size() * 0.7){
            return XP_PADRAO * (quantidadeAcertos * 0.5);
        }
        else
            return 0;
    }

    @Override
    public String toString() {
        return "Questionario{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", quantidadeAcertos=" + quantidadeAcertos +
                ", quantidadeErros=" + quantidadeErros +
                ", questoes=" + questoes +
                ", questaoAtual=" + questaoAtual +
                '}';
    }
}
