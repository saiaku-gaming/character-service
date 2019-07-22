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
	private String armament; //Can be the string None but not null
	@NotBlank
	private String armor; //Can be the string None but not null
	private String metaData;
} 