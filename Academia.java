import java.util.List;
import java.util.ArrayList;

public class Academia {
    
    public static Object aluno;
    private String nome;
    private String endereco;
    private String telefone;

    List<Aluno> alunos;

    public Academia(String nome, String telefone, String endereco){
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        alunos = new ArrayList<>();
    }

    public String getTelefone(){
    return telefone;
    }
    public void setTelefone(String telefone){
    this.telefone = telefone;
    }

    public String getNome(){
    return nome;
    }
    public void setNome(String nome){
    this.nome = nome;
    }

    public String getEndereco(){
    return endereco; 
    }
    public void setEndereco(String endereco){
    this.endereco = endereco;
    }

    public String toString(){
        return ("Nome: "+nome+" \nEndereço: "+endereco+" \nTelefone: "+telefone+"");
    }
    
    public List<Aluno> getAlunos(){
        return alunos;
    }
}
