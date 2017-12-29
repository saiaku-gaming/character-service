package com.valhallagame.characterserviceclient.message;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EquippedItemParameter {
	@NotNull
	String itemSlot;
	@NotNull
	String armament; //Can be the string None but not null
	@NotNull
	String armor; //Can be the string None but not null
} 