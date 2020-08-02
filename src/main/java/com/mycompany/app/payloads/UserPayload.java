package com.mycompany.app.payloads;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;


@Getter
@Setter
@Accessors(fluent = true)
public class UserPayload {

	@SerializedName("password")
	private String password;

	@SerializedName("email")
	private String email;

	@SerializedName("username")
	private String username;

	@SerializedName("firstName")
	private String firstName;

	@SerializedName("lastName")
	private String lastName;

}