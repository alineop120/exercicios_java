package herancaAssociacaoPessoa;

public class TestaPessoa {

    public static void main(String[] args) {
        Marceneiro M = new Marceneiro("Marcelo", "99/999.999.99-09", "Mardeira", 
            new Encomenda("Descrição", "05/09/2024", 200.0, 
                    new Material("Materia", 30, 
                            new Fornecedor("12.345.678/0001-95", "Jorge"))));
        System.out.println(M);
        
        Engenheiro E = new Engenheiro("Marcus", "123456/RO", 
                new Obra("Descrição", "QND 2 casa 30", 
                        new Material("Concreto", 50, 
                                new Fornecedor("87.484.614/0020-89", "Mariana")), 
                        new Cliente("Olivia", "894.511.284-51", "Avendia Graça da Luz")));
        System.out.println(E);
    }
    
}
