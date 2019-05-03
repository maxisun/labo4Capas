package com.maxisun.capas.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@SuppressWarnings("deprecation")
public class Product {
	
	@NotEmpty(message = "please insert a product name")
	@Size(message = "maximun lenght is 30 characters",min = 0, max = 30)
	private String nombre;
	@NotEmpty(message = "please insert a product brand")
	@Size(message = "maximun lenght is 30 characters",min = 0, max = 30)
	private String marca;
	@NotEmpty(message = "please insert a product description")
	@Size(message = "maximun lenght is 30 characters",min = 0, max = 30)
	private String descripcion;
	@NotNull(message="please insert a product price")
	@PositiveOrZero(message = "price must be a positive number or zero")
	@Digits(message = "insert a valid product price", integer = 30, fraction = 2)
	private BigDecimal precio;
	@NotNull(message = "insert a date")
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date fechaVencimiento;

	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public BigDecimal getPrecio() {
		return precio;
	}
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	
	
}
