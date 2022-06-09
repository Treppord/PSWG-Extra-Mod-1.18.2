package trep.pswgextra.mod;

import net.fabricmc.api.ClientModInitializer;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;
import trep.pswgextra.mod.entity.client.armor.InquisitorArmorRenderer;
import trep.pswgextra.mod.items.ModItems;

public class PswgExtraClientMod implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        GeoArmorRenderer.registerArmorRenderer(new InquisitorArmorRenderer(), ModItems.INQUISITOR_BOOTS,
                ModItems.INQUISITOR_LEGGINGS, ModItems.INQUISITOR_CHESTPLATE, ModItems.INQUISITOR_HELMET);



    }
}
