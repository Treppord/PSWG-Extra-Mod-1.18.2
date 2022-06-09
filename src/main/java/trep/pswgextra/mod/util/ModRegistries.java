package trep.pswgextra.mod.util;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import trep.pswgextra.mod.entity.ModEntities;
import trep.pswgextra.mod.entity.custom.DroidgeneralEntity;

public class ModRegistries {
    public static void registerModStuffs() {
        registerAttributes();
    }

    private static void registerAttributes() {
        FabricDefaultAttributeRegistry.register(ModEntities.DROIDGENERAL, DroidgeneralEntity.setAttributes());
    }
}