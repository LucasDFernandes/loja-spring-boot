package com.alura.loja.controller.dto;

public class EnderecoDTO {

	private String rua;
	private String nmero;
	private String estado;

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNmero() {
		return nmero;
	}

	public void setNmero(String nmero) {
		this.nmero = nmero;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "EnderecoDTO [rua=" + rua + ", nmero=" + nmero + ", estado=" + estado + "]";
	}

}