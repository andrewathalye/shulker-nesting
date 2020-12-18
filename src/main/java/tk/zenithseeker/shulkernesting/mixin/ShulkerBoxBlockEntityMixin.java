package tk.zenithseeker.shulkernesting.mixin;

import net.minecraft.block.entity.ShulkerBoxBlockEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.Direction;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(ShulkerBoxBlockEntity.class)
public class ShulkerBoxBlockEntityMixin {
	@Overwrite
    	public boolean canInsert(int slot, ItemStack stack, Direction dir) {
      		return true; 
    	}
}
