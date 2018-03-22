package com.locadorael.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "automovel")
public class Automovel {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String ano;
	private String chassi;
	
	@ManyToOne
	@JoinColumn(name="marca_id")
	private Marca marca;
	
	@ManyToOne
	@JoinColumn(name="modelo_id")
	private modelo modelo;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	public modelo getModelo() {
		return modelo;
	}
	public void setModelo(modelo modelo) {
		this.modelo = modelo;
	}
	
	
	
}
