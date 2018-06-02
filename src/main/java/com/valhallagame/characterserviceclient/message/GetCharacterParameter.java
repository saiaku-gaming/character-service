package com.valhallagame.characterserviceclient.message;

import org.hibernate.validator.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetCharacterParameter {
	@NotBlank
	private String characterName;
}
