package com.valhallagame.characterserviceclient.model;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CharacterData {
	
	@NotBlank
	private String ownerUsername;
	
	@NotBlank
	private String displayCharacterName;
	
	@NotBlank
	private String characterName;
	
	@NotNull
    private String chestItem;

	@NotNull
    private String mainhandArmament;
    
	@NotNull
    private String offHandArmament;
}
