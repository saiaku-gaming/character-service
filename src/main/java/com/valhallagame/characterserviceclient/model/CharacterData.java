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

	@NotBlank
	private String headItem;

	private String headItemMetaData;

	@NotBlank
	private String beardItem;

	private String beardItemMetaData;

	@NotNull
    private String chestItem;

	private String chestItemMetaData;

	@NotBlank
	private String handsItem;

	private String handsItemMetaData;

	@NotBlank
	private String legsItem;

	private String legsItemMetaData;

	@NotBlank
	private String feetItem;

	private String feetItemMetaData;

	@NotNull
    private String mainhandArmament;

	private String mainhandArmamentMetaData;

	@NotBlank
	private String offHandArmament;

	private String offHandArmamentMetaData;
}
