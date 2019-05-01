package com.maxisun.capas.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

@SuppressWarnings("deprecation")
public class Product {
	
	@NotEmpty(message = "ingrese un nombre")
	@Size(message = "La longitud maxima es de 30 caracteres",min = 0, max = 30)
	private String nombre;
	@NotEmpty(message = "ingrese una marca")
	@Size(message = "La longitud maxima es de 30 caracteres",min = 0, max = 30)
	private String marca;
	@NotEmpty(message = "ingrese una descripcion")
	@Size(message = "La longitud maxima es de 30 caracteres",min = 0, max = 30)
	private String descripcion;
	@NotNull(message="ingrese un precio")
	@PositiveOrZero(message = "El precio debe ser un numero positivo o zero")
	@Digits(message = "una cantidad de dinero valida", integer = 30, fraction = 2)
	private BigDecimal precio;
	@NotNull(message = "ingrese una fecha valida")
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Date fechaVencimiento;
	/*
	//@NotEmpty(message = "ingrese la fecha de vencimiento")
	@Pattern(message="ingrese una fecha valida", regexp = "(((0[1-9]|[12][0-9]|3[01])([/])(0[13578]|10|12)([/])(\\d{4}))|(([0][1-9]|[12][0-9]|30)([/])(0[469]|11)([/])(\\d{4}))|((0[1-9]|1[0-9]|2[0-8])([/])(02)([/])(\\d{4}))|((29)(\\.|-|\\/)(02)([/])([02468][048]00))|((29)([/])(02)([/])([13579][26]00))|((29)([/])(02)([/])([0-9][0-9][0][48]))|((29)([/])(02)([/])([0-9][0-9][2468][048]))|((29)([/])(02)([/])([0-9][0-9][13579][26])))", flags = Flag.UNICODE_CASE)
	private String fechaVencimiento;*/
	
	
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
	/*
	public String getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}*/
	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	
	
}
