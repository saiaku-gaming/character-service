package com.valhallagame.characterserviceclient.message;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.valhallagame.common.validation.CheckLowercase;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EqippedItemsParameter {
	@NotNull
	@CheckLowercase
	String characterName;
	@NotNull
	List<EquippedItemParameter> equippedItems;
}
