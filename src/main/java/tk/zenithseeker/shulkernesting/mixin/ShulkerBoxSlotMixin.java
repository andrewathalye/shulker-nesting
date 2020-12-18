package tk.zenithseeker.shulkernesting.mixin;

import net.minecraft.item.ItemStack;
import net.minecraft.screen.slot.ShulkerBoxSlot;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(ShulkerBoxSlot.class)
public class ShulkerBoxSlotMixin {
	@Overwrite
	public boolean canInsert(ItemStack stack) {
		return true;
	}
}
