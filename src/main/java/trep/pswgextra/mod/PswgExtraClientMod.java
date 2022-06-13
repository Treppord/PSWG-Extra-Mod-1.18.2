package trep.pswgextra.mod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.minecraft.client.render.RenderLayer;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;
import trep.pswgextra.mod.block.ModBlocks;
import trep.pswgextra.mod.entity.ModEntities;
import trep.pswgextra.mod.entity.client.DroidgeneralRenderer;
import trep.pswgextra.mod.entity.client.armor.*;
import trep.pswgextra.mod.items.ModItems;
import trep.pswgextra.mod.screen.ArmorStationScreen;
import trep.pswgextra.mod.screen.ModScreenHandlers;

public class PswgExtraClientMod implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        GeoArmorRenderer.registerArmorRenderer(new InquisitorArmorRenderer(), ModItems.INQUISITOR_BOOTS,
                ModItems.INQUISITOR_LEGGINGS, ModItems.INQUISITOR_CHESTPLATE, ModItems.INQUISITOR_HELMET);

        GeoArmorRenderer.registerArmorRenderer(new TempleguardArmorRenderer(), ModItems.TEMPLEGUARD_BOOTS,
                ModItems.TEMPLEGUARD_LEGGINGS, ModItems.TEMPLEGUARD_CHESTPLATE, ModItems.TEMPLEGUARD_HELMET);

        GeoArmorRenderer.registerArmorRenderer(new BeskaralloyArmorRenderer(), ModItems.BESKAR_BOOTS,
                ModItems.BESKAR_LEGGINGS, ModItems.BESKAR_CHESTPLATE, ModItems.BESKAR_HELMET);

        GeoArmorRenderer.registerArmorRenderer(new BluemandoArmorRenderer(), ModItems.BLUEMANDO_BOOTS,
                ModItems.BLUEMANDO_LEGGINGS, ModItems.BLUEMANDO_CHESTPLATE, ModItems.BLUEMANDO_HELMET);

        GeoArmorRenderer.registerArmorRenderer(new CyanmandoArmorRenderer(), ModItems.CYANMANDO_BOOTS,
                ModItems.CYANMANDO_LEGGINGS, ModItems.CYANMANDO_CHESTPLATE, ModItems.CYANMANDO_HELMET);

        GeoArmorRenderer.registerArmorRenderer(new RedmandoArmorRenderer(), ModItems.REDMANDO_BOOTS,
                ModItems.REDMANDO_LEGGINGS, ModItems.REDMANDO_CHESTPLATE, ModItems.REDMANDO_HELMET);


        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ARMOR_STATION, RenderLayer.getCutout());


        EntityRendererRegistry.register(ModEntities.DROIDGENERAL, DroidgeneralRenderer::new);

        ScreenRegistry.register(ModScreenHandlers.ARMOR_STATION_SCREEN_HANDLER, ArmorStationScreen::new);



    }
}
