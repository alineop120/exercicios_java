package exercicios;

import modelo.Atendente;
import modelo.Fisica;

public class AtendenteComFisica {
    private Atendente atendente;
    private Fisica fisica;

    // Getters e Setters
    public Atendente getAtendente() {
        return atendente;
    }

    public void setAtendente(Atendente atendente) {
        this.atendente = atendente;
    }

    public Fisica getFisica() {
        return fisica;
    }

    public void setFisica(Fisica fisica) {
        this.fisica = fisica;
    }
    
    @Override
    public String toString() {
        return "\n\nTabelas - Atendente e Fisica" +
                "\n-- Dados da Pessoa Física --" + fisica +
                "\n" + atendente;
                
    }
}

