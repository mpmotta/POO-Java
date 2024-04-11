package escola;
public class Escola {
    public static void main(String[] args) {
        Professor prof1 = new Professor(12, "(51)8407-4070", "Adalto", 40, "123.456.789-00");
        prof1.info();
        System.out.println("");
        Aluno aluno1 = new Aluno(998877, "ADS", "Manhã", "Juquinha", 19, "333.444.555-66");
       aluno1.dadosAluno();
    }
    
}
