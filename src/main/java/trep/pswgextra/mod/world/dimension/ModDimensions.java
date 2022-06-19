package trep.pswgextra.mod.world.dimension;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;
import trep.pswgextra.mod.PswgExtra;

public class ModDimensions {
    public static final RegistryKey<World> MANDALORE_DIMENSION_KEY = RegistryKey.of(Registry.WORLD_KEY,
            new Identifier(PswgExtra.MOD_ID, "mandalore"));
    public static final RegistryKey<DimensionType> MANDALORE_TYPE_KEY = RegistryKey.of(Registry.DIMENSION_TYPE_KEY, MANDALORE_DIMENSION_KEY.getValue());

    public static final RegistryKey<World> HOTH_DIMENSION_KEY = RegistryKey.of(Registry.WORLD_KEY,
            new Identifier(PswgExtra.MOD_ID, "hoth"));
    public static final RegistryKey<DimensionType> HOTH_TYPE_KEY = RegistryKey.of(Registry.DIMENSION_TYPE_KEY, HOTH_DIMENSION_KEY.getValue());

    public static void register() {
        PswgExtra.LOGGER.debug("Registering Dimensions for " + PswgExtra.MOD_ID);
    }


}
