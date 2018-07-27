package com.valhallagame.characterserviceclient.message;

import com.valhallagame.common.validation.CheckLowercase;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateCharacterParameter {
	@NotNull
	private String displayCharacterName;

	@NotNull
	@CheckLowercase
	private String username;

    @NotNull
    private String startingClass;
}
