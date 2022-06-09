package trep.pswgextra.mod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;
import trep.pswgextra.mod.entity.ModEntities;
import trep.pswgextra.mod.entity.client.DroidGeneralRenderer;
import trep.pswgextra.mod.entity.client.armor.InquisitorArmorRenderer;
import trep.pswgextra.mod.items.ModItems;

public class PswgExtraClientMod implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        GeoArmorRenderer.registerArmorRenderer(new InquisitorArmorRenderer(), ModItems.INQUISITOR_BOOTS,
                ModItems.INQUISITOR_LEGGINGS, ModItems.INQUISITOR_CHESTPLATE, ModItems.INQUISITOR_HELMET);

        EntityRendererRegistry.register(ModEntities.DROIDGENERAL, DroidGeneralRenderer::new);



    }
}
