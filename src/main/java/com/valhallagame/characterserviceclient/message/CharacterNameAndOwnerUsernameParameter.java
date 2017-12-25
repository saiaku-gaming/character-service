package com.valhallagame.characterserviceclient.message;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CharacterNameAndOwnerUsernameParameter {
	@NotNull
	private String characterName;
	@NotNull
	private String ownerUsername;
}
