import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static Date convertStringtoDate(String nascimento) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        return formato.parse(nascimento);
    }
    
    public static void main(String[] args) throws ParseException {

        Academia academiaA = new Academia("SportCenter", "+55(41)99976-9906", "Matinhos-PR");
        Academia academiaB = new Academia("IronWork", "+55(41)99880-9088", "Pontal do Paraná-PR");

        System.out.println("Academia A");
        System.out.println(academiaA);

        academiaA.setNome("Smart Fit");
        academiaA.setTelefone("+55(41)99368-8336");
        academiaA.setEndereco("Curitiba-PR");
        System.out.println("\nAcademia A atualizada");
        System.out.println(academiaA);

        
        System.out.println("\nAcademia B");
        System.out.println(academiaB);

        academiaB.setNome("Liana Aqua Fit");
        academiaB.setTelefone("+55(41)99027-7720");
        academiaB.setEndereco("Guaratuba-PR");
        System.out.println("\nAcademia B atualizada");
        System.out.println(academiaB);

        academiaA.alunos.add(new Aluno("Kamilly", "avançado", convertStringtoDate("18/06/2007"), "feminino", 1.60, 50.00));
        academiaA.alunos.add(new Aluno("Ana", "iniciante", convertStringtoDate("20/08/2007"), "feminino", 1.57, 45.00));
        academiaA.alunos.add(new Aluno("Heloisa", "intermediário", convertStringtoDate("04/10/2007"), "feminino", 1.59, 55.00));
       
       for (Aluno aluno : academiaA.getAlunos()) {
            System.out.println("\n");
            System.out.println(aluno.toString());
       }

       academiaB.alunos.add(new Aluno("André", "avançado", convertStringtoDate("12/11/2005"), "masculino", 1.65, 65.00));
       academiaB.alunos.add(new Aluno("Nilton", "intermediário", convertStringtoDate("23/05/2006"), "masculino", 1.80, 75.00));
       academiaB.alunos.add(new Aluno("Rhuan", "intermediário", convertStringtoDate("30/01/2007"), "masculino", 1.70, 70.00));
       
       for (Aluno aluno : academiaB.getAlunos()) {
            System.out.println("\n");
            System.out.println(aluno.toString());
       }

    }
}
    