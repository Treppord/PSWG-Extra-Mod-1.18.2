package trep.pswgextra.mod.recipe;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import trep.pswgextra.mod.PswgExtra;

public class ModRecipes {
    public static void registerRecipes() {
        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(PswgExtra.MOD_ID, ArmorStationRecipe.Serializer.ID),
                ArmorStationRecipe.Serializer.INSTANCE);
        Registry.register(Registry.RECIPE_TYPE, new Identifier(PswgExtra.MOD_ID, ArmorStationRecipe.Type.ID),
                ArmorStationRecipe.Type.INSTANCE);
    }
}