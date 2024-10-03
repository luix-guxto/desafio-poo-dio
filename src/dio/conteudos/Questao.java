package dio.conteudos;

import java.util.Map;

public class Questao {
    private final String pergunta;
    private final char alternativaCorreta;
    private final Map<Character, String> alternativas;

    public Questao(String pergunta, Character alternativaCorreta, Map<Character, String> alternativas) {
        if(pergunta == null || alternativaCorreta == null || pergunta.isEmpty() || alternativas.isEmpty()) throw new NullPointerException("Pergunta e alternativa correta são obrigatórios");
        if(!alternativas.containsKey(alternativaCorreta)) throw new IllegalArgumentException("Alternativa correta deve estar entre as alternativas");
        this.pergunta = pergunta;
        this.alternativaCorreta = alternativaCorreta;
        this.alternativas = alternativas;
    }

    public String getPergunta() {
        return pergunta;
    }

    public char getAlternativaCorreta() {
        return alternativaCorreta;
    }

    public Map<Character, String> getAlternativas() {
        return alternativas;
    }

    public boolean validarResposta(char resposta) {
        return resposta == alternativaCorreta;
    }

    public String toString() {
        return pergunta + "\n" + alternativas;
    }
}
