import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Academia academiaA = new Academia("SportCenter", "+55(41)99976-9906", "Matinhos-PR");
        Academia academiaB = new Academia("IronWork", "+55(41)99880-9088", "Pontal do Paraná-PR");

        System.out.println("Academia A");
        System.out.println(academiaA);
        
        System.out.println("\nAcademia B");
        System.out.println(academiaB);

        System.out.print("\nAcademia A");
        System.out.print("\nNome: ");
        academiaA.setNome(teclado.nextLine());
        System.out.print("Endereço: ");
        academiaA.setEndereco(teclado.nextLine());
        System.out.print("Telefone: ");
        academiaA.setTelefone(teclado.nextLine());

        System.out.print("\nAcademia B");
        System.out.print("\nNome: ");
        academiaB.setNome(teclado.nextLine());
        System.out.print("Endereço: ");
        academiaB.setEndereco(teclado.nextLine());
        System.out.print("Telefone: ");
        academiaB.setTelefone(teclado.nextLine());

        System.out.println("\nAcademia A atualizada");
        System.out.println(academiaA);

        System.out.println("\nAcademia B atualizada");
        System.out.println(academiaB);
       
        teclado.close();
    }
}
       