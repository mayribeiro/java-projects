package br.com.encadear.constructor;
import java.util.Date;

public class EmprestimoOld {

	private Estrategia estrategia;

	private double obrigacao;

	private double paraSaldar;

	private int escalaDeRisco;

	private Date vencimento;

	private Date expiracao;

	public EmprestimoOld() {}

	public EmprestimoOld(double obrigacao, int escalaDeRisco, Date vencimento) {
		
		this(obrigacao, 0.0, escalaDeRisco, vencimento, null);
		
		this.obrigacao = obrigacao;
		this.escalaDeRisco = escalaDeRisco;
		this.vencimento = vencimento;
	}

	public EmprestimoOld(double obrigacao, int escalaDeRisco, Date vencimento, Date expiracao) {

		this(obrigacao, 0.0, escalaDeRisco, vencimento, expiracao);
		
		this.obrigacao = obrigacao;
		this.escalaDeRisco = escalaDeRisco;
		this.vencimento = vencimento;
		this.expiracao = expiracao;
	}

	public EmprestimoOld(double obrigacao, double paraSaldar, int escalaDeRisco, Date vencimento, Date expiracao) {

		this(null, obrigacao, paraSaldar, escalaDeRisco, vencimento, expiracao);
		
		this.obrigacao = obrigacao;
		this.paraSaldar = paraSaldar;
		this.escalaDeRisco = escalaDeRisco;
		this.vencimento = vencimento;
		this.expiracao = expiracao;
		
	}

	public EmprestimoOld(Estrategia estrategia, double obrigacao, int escalaDeRisco, Date vencimento, Date expiracao) {
		
		this(estrategia, obrigacao, 0.0, escalaDeRisco, vencimento, expiracao);
		
		this.estrategia = estrategia;
		this.obrigacao = obrigacao;
		this.escalaDeRisco = escalaDeRisco;
		this.vencimento = vencimento;
		this.expiracao = expiracao;
	}

	public EmprestimoOld(Estrategia estrategia, double obrigacao, double paraSaldar, int escalaDeRisco, Date vencimento,
			Date expiracao) {
		
		this.estrategia = estrategia;
		this.obrigacao = obrigacao;
		this.paraSaldar = paraSaldar;
		this.escalaDeRisco = escalaDeRisco;
		this.vencimento = vencimento;
		this.expiracao = expiracao;
	}

	public Estrategia getEstrategia() {
		return estrategia;
	}

	public void setEstrategia(Estrategia estrategia) {
		this.estrategia = estrategia;
	}

	public double getObrigacao() {
		return obrigacao;
	}

	public void setObrigacao(double obrigacao) {
		this.obrigacao = obrigacao;
	}

	public double getParaSaldar() {
		return paraSaldar;
	}

	public void setParaSaldar(double paraSaldar) {
		this.paraSaldar = paraSaldar;
	}

	public int getEscalaDeRisco() {
		return escalaDeRisco;
	}

	public void setEscalaDeRisco(int escalaDeRisco) {
		this.escalaDeRisco = escalaDeRisco;
	}

	public Date getVencimento() {
		return vencimento;
	}

	public void setVencimento(Date vencimento) {
		this.vencimento = vencimento;
	}

	public Date getExpiracao() {
		return expiracao;
	}

	public void setExpiracao(Date expiracao) {
		this.expiracao = expiracao;
	}
	
}
