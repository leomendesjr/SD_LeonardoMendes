package br.inatel.labs.labjpa.dto;

import java.math.BigDecimal;

public class TotalCompraPorFornecedorDTO {

	private String fornecedorRazaoSocial;
	private BigDecimal totalComprado;
	
	public TotalCompraPorFornecedorDTO(String fornecedorRazaoSocial, BigDecimal totalComprado) {
		super();
		this.fornecedorRazaoSocial = fornecedorRazaoSocial;
		this.totalComprado = totalComprado;
	}

	public String getFornecedorRazaoSocial() {
		return fornecedorRazaoSocial;
	}

	public BigDecimal getTotalComprado() {
		return totalComprado;
	}

	@Override
	public String toString() {
		return "TotalCompraPorFornecedorDTO [fornecedorRazaoSocial=" + fornecedorRazaoSocial + ", totalComprado="
				+ totalComprado + "]";
	}

	

}
