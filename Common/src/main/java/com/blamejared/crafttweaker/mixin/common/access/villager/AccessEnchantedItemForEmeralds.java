package com.blamejared.crafttweaker.mixin.common.access.villager;

import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(VillagerTrades.EnchantedItemForEmeralds.class)
public interface AccessEnchantedItemForEmeralds {
    
    @Accessor
    ItemStack getItemStack();
    
}