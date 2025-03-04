package IEscola.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Aluno extends Usuario {
    NivelEnsino nivel;
    Map<Disciplina, List<Double>> notas;

    public Aluno(String nome, String documento, NivelEnsino nivel) {
        super(nome, documento);
        this.nivel = nivel;
    }

    void adicionarNota(Disciplina disciplina, double nota) {
        notas.putIfAbsent(disciplina, new ArrayList<>());
        notas.get(disciplina).add(nota);
    }

    public double calcularMedia(Disciplina disciplina) {
        for (List<Double> valor : notas.values()) {
            System.out.println(valor);
        }
        return 0;
    }

    public NivelEnsino getNivel() {
        return nivel;
    }

    public void setNivel(NivelEnsino nivel) {
        this.nivel = nivel;
    }
}
