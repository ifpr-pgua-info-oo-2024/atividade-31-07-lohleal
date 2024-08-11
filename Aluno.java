import java.text.SimpleDateFormat;
import java.util.Date;

public class Aluno{

    private String nome;
    private String nivel;
    private Date dataNascimento;
    private String genero;
    private double altura;
    private double peso;


    public Aluno(String nome, String nivel, Date dataNascimento, String genero, double altura, double peso){
        this.nome = nome;
        this.nivel = nivel;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
        this.altura = altura;
        this.peso = peso;
    }

    public Aluno(String nome, String nivel, Date dataNascimento){
        this(nome, nivel, dataNascimento, "", 0, 0);
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNivel(){
        return nivel;
    }
    public void setNivel(String nivel){
        this.nivel = nivel;
    }

    public Date getDataNascimento(){
        return dataNascimento;
    }
    public void setDataNascimento(Date dataNascimento){
        this.dataNascimento = dataNascimento;
    }

    public String getGenero(){
        return genero;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }

    public Double getAltura(){
        return altura;
    }
    public void setAltura(Double altura){
        this.altura = altura;
    }

    public Double getPeso(){
        return peso;
    }
    public void setPeso(Double peso){
        this.peso = peso;
    }

    @Override
    public String toString(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return ("Cadastro\nNome: "+nome+" \nNivel: "+nivel+" \nData de nascimento: "+simpleDateFormat.format(dataNascimento)+" \nGênero: "+genero+" \nAltura: "+altura+" \nPeso: "+peso+"");
    }

}
