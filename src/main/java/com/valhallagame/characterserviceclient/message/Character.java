package com.valhallagame.characterserviceclient.message;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Character {
	
	@NotNull
	private String ownerUsername;
	
	@NotNull
	private String displayCharacterName;
	
	@NotNull
	private String characterName;
	
	@NotNull
    private String chestItem;

	@NotNull
    private String mainhandArmament;
    
	@NotNull
    private String offHandArmament;
}
