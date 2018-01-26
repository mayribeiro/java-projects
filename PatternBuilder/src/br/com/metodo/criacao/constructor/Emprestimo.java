package br.com.metodo.criacao.constructor;
import java.util.Date;

public class Emprestimo {

	private Estrategia estrategia;

	private double obrigacao;

	private double paraSaldar;

	private int escalaDeRisco;

	private Date vencimento;

	private Date expiracao;

	public Emprestimo() {}

	public Emprestimo(Estrategia estrategia, double obrigacao, double paraSaldar, int escalaDeRisco, Date vencimento,
			Date expiracao) {
		
		this.estrategia = estrategia;
		this.obrigacao = obrigacao;
		this.paraSaldar = paraSaldar;
		this.escalaDeRisco = escalaDeRisco;
		this.vencimento = vencimento;
		this.expiracao = expiracao;

		if (estrategia == null) {

			if(expiracao == null) {
				this.estrategia = new EstrategiaTempoLimitado();
			} else if( vencimento == null ){
				this.estrategia = new EstrategiaRecorrente();
			} else {
				this.estrategia = new EstrategiaRecorrenteTempoLimitado();
			}
		}
	}

	public static Emprestimo criarTempoLimitado(int obrigacao, int escalaDeRisco, Date vencimento) {
		return (new Emprestimo(null, obrigacao, 0.0, escalaDeRisco, vencimento, null));
	}

	public static Emprestimo criarRecorrente(double obrigacao, int escalaDeRisco, Date expiracao) {
		return (new Emprestimo(null, obrigacao, 0.0, escalaDeRisco, null, expiracao));
	}
	
	public static Emprestimo criarRecorrenteTempoLimitado(double obrigacao, int escalaDeRisco, Date vencimento, Date expiracao) {
		return (new Emprestimo(null, obrigacao, 0.0, escalaDeRisco, vencimento, expiracao));
	}
	
	public static Emprestimo criar(Estrategia estrategia, double obrigacao, int escalaDeRisco, Date vencimento, Date expiracao) {
		return (new Emprestimo(estrategia, obrigacao, 0, escalaDeRisco, vencimento, expiracao));
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

	@Override
	public String toString() {
		return "Emprestimo [estrategia=" + estrategia + ", obrigacao=" + obrigacao + ", paraSaldar=" + paraSaldar
				+ ", escalaDeRisco=" + escalaDeRisco + ", vencimento=" + vencimento + ", expiracao=" + expiracao + "]";
	}
	
}
