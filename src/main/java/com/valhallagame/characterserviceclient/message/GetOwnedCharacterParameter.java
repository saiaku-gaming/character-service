package com.valhallagame.characterserviceclient.message;

import org.hibernate.validator.constraints.NotBlank;

import com.valhallagame.common.validation.CheckLowercase;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetOwnedCharacterParameter {
	@CheckLowercase
	@NotBlank
	private String characterName;
	@NotBlank
	@CheckLowercase
	private String username;
}
