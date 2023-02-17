package entities;

public class PessoaFisica extends Pessoa {
	
	private Double despesasSaude;
	
	public PessoaFisica() {
		
	}
	
	
	
	

	public PessoaFisica(String nome, Double rendaAnual, Double despesasSaude) {
		super(nome, rendaAnual);
		this.despesasSaude = despesasSaude;
	}








	public Double getDespesasSaude() {
		return despesasSaude;
	}



	public void setDespesasSaude(Double despesasSaude) {
		this.despesasSaude = despesasSaude;
	}




	@Override
	public double iR() {
		if (super.getRendaAnual() < 20000) {
			return super.getRendaAnual()*0.15 - 0.5*despesasSaude;
			
		}
		else {
			return super.getRendaAnual()*0.25 - 0.5*despesasSaude;
			
		}
		
		
		
	}
	

}
