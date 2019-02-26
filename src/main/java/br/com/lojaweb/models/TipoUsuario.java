package br.com.lojaweb.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="TIPO_USUARIO")
public class TipoUsuario implements Serializable {
	

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Column(name="TIPO")
	private String tipo;
	
	private boolean gerencia;
	
	private boolean caixa;
	
	private boolean pdv;
	
	private boolean controleCliente;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public boolean isGerencia() {
		return gerencia;
	}

	public void setGerencia(boolean gerencia) {
		this.gerencia = gerencia;
	}

	public boolean isCaixa() {
		return caixa;
	}

	public void setCaixa(boolean caixa) {
		this.caixa = caixa;
	}

	public boolean isPdv() {
		return pdv;
	}

	public void setPdv(boolean pdv) {
		this.pdv = pdv;
	}

	public boolean isControleCliente() {
		return controleCliente;
	}

	public void setControleCliente(boolean controleCliente) {
		this.controleCliente = controleCliente;
	}
	
	

}
