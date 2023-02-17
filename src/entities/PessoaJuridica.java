package entities;

public class PessoaJuridica extends Pessoa{

	private Integer nFuncionarios;
	
	public PessoaJuridica() {
		
	}
	
	
	
	
	
	public PessoaJuridica(String nome, Double rendaAnual, Integer nFuncionarios) {
		super(nome, rendaAnual);
		this.nFuncionarios = nFuncionarios;
	}



	

	public Integer getnFuncionarios() {
		return nFuncionarios;
	}





	public void setnFuncionarios(Integer nFuncionarios) {
		this.nFuncionarios = nFuncionarios;
	}





	@Override
	public double iR() {
		if (nFuncionarios <= 10) {
			return super.getRendaAnual()*0.16;
		}
		else {
			return super.getRendaAnual()*0.14;
		}
	}

}
