package aula20201015.modeloOOMercado;

public class Fisica extends Pessoa{

	private String cpf;

    public Fisica(String nome, String cpf) {
        super(nome);
		this.cpf = cpf;
    }
    
    public String getCpf() {
        return cpf;
    }    

}