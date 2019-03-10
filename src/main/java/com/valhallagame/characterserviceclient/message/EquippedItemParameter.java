package com.valhallagame.characterserviceclient.message;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EquippedItemParameter {
	@NotNull
	private String itemSlot;
	@NotNull
	private String armament; //Can be the string None but not null
	@NotNull
	private String armor; //Can be the string None but not null
	private String metaData;
} 