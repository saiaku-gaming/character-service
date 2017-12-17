package com.valhallagame.characterserviceclient.message;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Character {
	private String ownerUsername;
	
	private String displayCharacterName;
	
	private String characterName;
	
    private String chestItem;

    private String mainhandArmament;
    
    private String offHandArmament;
}
