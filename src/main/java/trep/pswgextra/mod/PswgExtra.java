package trep.pswgextra.mod;

import net.fabricmc.api.ModInitializer;
import software.bernie.geckolib3.GeckoLib;
import trep.pswgextra.mod.block.ModBlocks;
import trep.pswgextra.mod.block.entity.ModBlockEntities;
import trep.pswgextra.mod.items.ModItems;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import trep.pswgextra.mod.recipe.ModRecipes;
import trep.pswgextra.mod.screen.ModScreenHandlers;
import trep.pswgextra.mod.util.ModRegistries;
import trep.pswgextra.mod.villager.ModVillagers;
import trep.pswgextra.mod.world.dimension.ModDimensions;
import trep.pswgextra.mod.world.structure.ModStructures;

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

	ModDimensions.register();
	ModStructures.registerStructureFeatures();
	ModVillagers.setupPOIs();
	ModScreenHandlers.registerAllScreenHandlers();





	GeckoLib.initialize();



	}
}
