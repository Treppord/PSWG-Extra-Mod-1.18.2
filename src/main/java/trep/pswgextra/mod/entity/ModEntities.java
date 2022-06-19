package trep.pswgextra.mod.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import trep.pswgextra.mod.PswgExtra;
import trep.pswgextra.mod.entity.custom.DroidgeneralEntity;
import trep.pswgextra.mod.entity.custom.WampaEntity;


public class ModEntities {
    public static final EntityType<DroidgeneralEntity> DROIDGENERAL = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(PswgExtra.MOD_ID, "droidgeneral"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, DroidgeneralEntity::new)
                    .dimensions(EntityDimensions.fixed(0.5f, 1.5f)).build());


    public static final EntityType<WampaEntity> WAMPA = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(PswgExtra.MOD_ID, "wampa"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, WampaEntity::new)
                    .dimensions(EntityDimensions.fixed(0.5f, 1.5f)).build());

}
