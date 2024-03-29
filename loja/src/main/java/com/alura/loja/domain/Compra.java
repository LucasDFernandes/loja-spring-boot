package com.alura.loja.domain;

public class Compra {

	private Long pedidoId;
	private Integer tempoDePreparo;
	private String enderecoDestino;

	public Compra(Long pedidoId, Integer tempoDePreparo, String enderecoDestino) {
		super();
		this.pedidoId = pedidoId;
		this.tempoDePreparo = tempoDePreparo;
		this.enderecoDestino = enderecoDestino;
	}

	public Long getPedidoId() {
		return pedidoId;
	}

	public void setPedidoId(Long pedidoId) {
		this.pedidoId = pedidoId;
	}

	public Integer getTempoDePreparo() {
		return tempoDePreparo;
	}

	public void setTempoDePreparo(Integer tempoDePreparo) {
		this.tempoDePreparo = tempoDePreparo;
	}

	public String getEnderecoDestino() {
		return enderecoDestino;
	}

	public void setEnderecoDestino(String enderecoDestino) {
		this.enderecoDestino = enderecoDestino;
	}

}
