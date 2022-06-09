package trep.pswgextra.mod.items;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import trep.pswgextra.mod.PswgExtra;

public class ModItemGroup {
    public static final ItemGroup PSWGEXTRA = FabricItemGroupBuilder.build(new Identifier(PswgExtra.MOD_ID, "pswgextra"),
        () -> new ItemStack(ModItems.BESKAR_ALLOY));
    
}
