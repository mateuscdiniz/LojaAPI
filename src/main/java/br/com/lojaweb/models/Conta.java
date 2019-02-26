package br.com.lojaweb.models;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="CONTA")
public class Conta implements Serializable {
	

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@JoinColumn(name="CARTAO", unique=true)
	@OneToOne
	private Cartao cartao;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="conta")
	@JoinColumn(name="ITEM_VENDA")
	private List<ItemVenda> itensVendido;
	
	@Column(name= "TOTAL_VENDAS")
	private float totalVenda;
	
	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name= "DATA_VENDA")
	private Timestamp dataVenda;
	
	@Column(name="TOTAL_PAGO")
	private float totalPago;
	
	@JoinColumn(name="CLIENTE")
	@OneToOne
	private Cliente cliente;
	
	@JoinColumn(name="USUARIO")
	@OneToOne
	private Usuario usuario;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Cartao getCartao() {
		return cartao;
	}

	public void setCartao(Cartao cartao) {
		this.cartao = cartao;
	}

	public List<ItemVenda> getItensVendido() {
		return itensVendido;
	}

	public void setItensVendido(List<ItemVenda> itensVendido) {
		this.itensVendido = itensVendido;
	}

	public float getTotalVenda() {
		return totalVenda;
	}

	public void setTotalVenda(float totalVenda) {
		this.totalVenda = totalVenda;
	}

	public Timestamp getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(Timestamp dataVenda) {
		this.dataVenda = dataVenda;
	}

	public float getTotalPago() {
		return totalPago;
	}

	public void setTotalPago(float totalPago) {
		this.totalPago = totalPago;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
