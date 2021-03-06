package com.valhallagame.characterserviceclient.message;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotBlank;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EquippedItemParameter {
	@NotBlank
	private String itemSlot;
	@NotBlank
	private String item; //Can be the string None but not null
	private String metaData;
} 