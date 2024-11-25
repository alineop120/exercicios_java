package exercicios;

import modelo.Atendente;
import modelo.Juridica;

public class AtendenteComJuridica {
    private Atendente atendente;
    private Juridica juridica;

    // Construtor vazio
    public AtendenteComJuridica() {}

    // Getters e setters para Atendente
    public Atendente getAtendente() {
        return atendente;
    }

    public void setAtendente(Atendente atendente) {
        this.atendente = atendente;
    }

    // Getters e setters para Juridica
    public Juridica getJuridica() {
        return juridica;
    }

    public void setJuridica(Juridica juridica) {
        this.juridica = juridica;
    }

    @Override
    public String toString() {
        return "Atendente: " + atendente.getNome() + ", CNPJ: " + juridica.getCnpj() + ", Idade: " + juridica.getIdade();
    }
}
