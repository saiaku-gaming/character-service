package com.valhallagame.characterserviceclient.message;

import com.valhallagame.common.validation.CheckLowercase;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SaveEquippedItemsParameter {
	@NotNull
	@CheckLowercase
	private String username;
	
	@NotNull
	private String characterName;
	
	@NotNull
	private List<EquippedItemParameter> equippedItems;
}
