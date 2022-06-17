package trep.pswgextra.mod.util;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import trep.pswgextra.mod.entity.ModEntities;
import trep.pswgextra.mod.entity.custom.DroidgeneralEntity;
import trep.pswgextra.mod.items.ModItems;
import trep.pswgextra.mod.villager.ModVillagers;

public class ModRegistries {
    public static void registerModStuffs() {
        registerCustomTrades();
        registerAttributes();
    }

    private static void registerAttributes() {
        FabricDefaultAttributeRegistry.register(ModEntities.DROIDGENERAL, DroidgeneralEntity.setAttributes());
    }

    private static void registerCustomTrades() {
        TradeOfferHelper.registerVillagerOffers(ModVillagers.ARMOR_MASTER,1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.GOLD_CREDIT, 1),
                            new ItemStack(ModItems.BESKAR_ALLOY, 3),
                            12,7,0.08f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.BESKAR_LUMP, 1),
                            new ItemStack(ModItems.SILVER_CREDIT, 2),
                            12,7,0.08f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.BRONZE_CREDIT, 10),
                            new ItemStack(ModItems.EMBLEM, 1),
                            12,7,0.08f));
                });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.ARMOR_MASTER,2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.GOLD_CREDIT, 2),
                            new ItemStack(ModItems.BESKAR_BOOTS, 1),
                            12,7,0.08f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.GOLD_CREDIT, 3),
                            new ItemStack(ModItems.BESKAR_CHESTPLATE, 1),
                            12,7,0.08f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.BRONZE_CREDIT, 30),
                            new ItemStack(ModItems.FETT_EMBLEM, 1),
                            12,7,0.08f));
                });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.ARMOR_MASTER,3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.SILVER_CREDIT, 4),
                            new ItemStack(ModItems.SUPER_COMMANDO_EMBLEM, 1),
                            12,7,0.08f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.BESKAR_ALLOY, 4),
                            new ItemStack(ModItems.GOLD_CREDIT, 1),
                            12,7,0.08f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.BRONZE_CREDIT, 26),
                            new ItemStack(ModItems.DEATH_WATCH_EMBLEM, 1),
                            12,7,0.08f));
                });

    }

}