package com.valhallagame.characterserviceclient.message;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.valhallagame.common.validation.CheckLowercase;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SaveEquippedItemsParameter {
	@NotNull
	@CheckLowercase
	String username;
	
	@NotNull
	String characterName;
	
	@NotNull
	List<EquippedItemParameter> equippedItems;
}
