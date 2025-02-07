package DEmpresa.test;

import DEmpresa.dominio.Empregado;

public class EmpregadoTest01 {
    public static void main(String[] args) {
        Empregado empregado = new Empregado("José", "Fernando", 8000);
        Empregado empregado01 = new Empregado("Carlos", "Fernandes", 5000);

        System.out.println(empregado);
        System.out.println(empregado01);

        empregado.aumentoSalarial();
        empregado01.aumentoSalarial();

    }
}
