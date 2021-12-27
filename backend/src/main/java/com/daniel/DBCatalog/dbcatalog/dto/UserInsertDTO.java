package com.daniel.DBCatalog.dbcatalog.dto;

import java.io.Serializable;

import javax.validation.constraints.Pattern;

import com.daniel.DBCatalog.dbcatalog.services.validationExceptions.UserInsertValid;

@UserInsertValid
public class UserInsertDTO extends UserDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Pattern(regexp = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{4,8}$", message="Campo deve conter letra maiuscula, letra menuscula e numeros")
	private String password;

	public UserInsertDTO() {
      super();
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
}
