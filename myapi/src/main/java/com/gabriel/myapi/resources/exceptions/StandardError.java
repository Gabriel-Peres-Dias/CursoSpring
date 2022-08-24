package com.gabriel.myapi.resources.exceptions;

import java.time.LocalDateTime;

public class StandardError {

	private Integer status;
	private LocalDateTime horario;
	private String message;

	public StandardError() {
		super();
	}

	public StandardError(Integer status, LocalDateTime horario, String message) {
		super();
		this.status = status;
		this.horario = horario;
		this.message = message;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public LocalDateTime gethorario() {
		return horario;
	}

	public void sethorario(LocalDateTime horario) {
		this.horario = horario;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
