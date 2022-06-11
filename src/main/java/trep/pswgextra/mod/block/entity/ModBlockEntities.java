package trep.pswgextra.mod.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import trep.pswgextra.mod.PswgExtra;
import trep.pswgextra.mod.block.ModBlocks;

public class ModBlockEntities {
    public static BlockEntityType<ArmorStationBlockEntity> ARMOR_STATION;

    public static void registerAllBlockEntities() {
        ARMOR_STATION = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                new Identifier(PswgExtra.MOD_ID, "armor_station"),
                FabricBlockEntityTypeBuilder.create(ArmorStationBlockEntity::new,
                        ModBlocks.ARMOR_STATION).build(null));
    }
}
