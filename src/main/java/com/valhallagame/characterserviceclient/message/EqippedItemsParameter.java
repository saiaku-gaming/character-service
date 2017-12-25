package com.valhallagame.characterserviceclient.message;

import java.util.List;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EqippedItemsParameter {
	@NotNull
	String characterName;
	@NotNull
	List<EquippedItem> equippedItems;
}
