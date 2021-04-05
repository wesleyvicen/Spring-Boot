package com.wesleyvicen.cursomc.resources.exception;

import java.io.Serializable;

public class FieldMessage implements Serializable {
	private static final long serialVersionUID = 1L;

	private String fidldName;
	private String message;

	public FieldMessage() {

	}

	public FieldMessage(String fidldName, String message) {
		super();
		this.fidldName = fidldName;
		this.message = message;
	}

	public String getFidldName() {
		return fidldName;
	}

	public void setFidldName(String fidldName) {
		this.fidldName = fidldName;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
