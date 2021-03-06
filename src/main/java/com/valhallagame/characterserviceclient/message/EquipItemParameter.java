package com.valhallagame.characterserviceclient.message;

import com.valhallagame.common.validation.CheckLowercase;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EquipItemParameter {
    @NotBlank
    @CheckLowercase
    private String characterName;

    @NotNull
    private EquippedItemParameter itemToEquip;
}
