package trep.pswgextra.mod;

import net.fabricmc.api.ModInitializer;
import software.bernie.geckolib3.GeckoLib;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;
import trep.pswgextra.mod.block.ModBlocks;
import trep.pswgextra.mod.block.entity.ModBlockEntities;
import trep.pswgextra.mod.entity.ModEntities;
import trep.pswgextra.mod.entity.client.DroidgeneralRenderer;
import trep.pswgextra.mod.entity.client.armor.InquisitorArmorRenderer;
import trep.pswgextra.mod.items.ModItems;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import trep.pswgextra.mod.recipe.ModRecipes;
import trep.pswgextra.mod.util.ModRegistries;

public class PswgExtra implements ModInitializer {

	public static final String MOD_ID = "pswgextra";


	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("modid");

	@Override
	public void onInitialize() {

	ModItems.registerModItems();
	ModRegistries.registerModStuffs();
	ModBlocks.registerModBlocks();
	ModBlockEntities.registerAllBlockEntities();
	ModRecipes.registerRecipes();





	GeckoLib.initialize();


	}
}
