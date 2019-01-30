package com.valhallagame.characterserviceclient.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

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
	private String headItem;

	@NotNull
	private String beardItem;

	@NotNull
    private String chestItem;

	@NotNull
	private String handsItem;

	@NotNull
	private String legsItem;

	@NotNull
	private String feetItem;

	@NotNull
    private String mainhandArmament;
    
	@NotNull
    private String offHandArmament;
}
