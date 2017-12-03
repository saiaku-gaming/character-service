package com.valhallagame.characterserviceclient.message;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EquippedItem {
	String itemSlot;
	String armament;
	String armor;
} 