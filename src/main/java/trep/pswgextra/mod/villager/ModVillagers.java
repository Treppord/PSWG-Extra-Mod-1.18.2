package trep.pswgextra.mod.villager;

import com.google.common.collect.ImmutableSet;
import net.fabricmc.fabric.mixin.object.builder.PointOfInterestTypeAccessor;
import net.fabricmc.fabric.mixin.object.builder.VillagerProfessionAccessor;
import net.minecraft.block.Block;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterest;
import net.minecraft.world.poi.PointOfInterestType;
import trep.pswgextra.mod.PswgExtra;
import trep.pswgextra.mod.block.ModBlocks;

public class ModVillagers {
    public static final PointOfInterestType ARMOR_POI = registerPOI("armorpoi", ModBlocks.ARMOR_STATION);
    public static final VillagerProfession ARMOR_MASTER = registerProfession("armormaster", ARMOR_POI);


    public static VillagerProfession registerProfession(String name, PointOfInterestType type) {
        return Registry.register(Registry.VILLAGER_PROFESSION, new Identifier(PswgExtra.MOD_ID, name),
                VillagerProfessionAccessor.create(name, type, ImmutableSet.of(), ImmutableSet.of(),
                        SoundEvents.ENTITY_VILLAGER_WORK_ARMORER));
    }

    public static PointOfInterestType registerPOI(String name, Block block) {
        return Registry.register(Registry.POINT_OF_INTEREST_TYPE, new Identifier(PswgExtra.MOD_ID, name),
                PointOfInterestTypeAccessor.callCreate(name,
                        ImmutableSet.copyOf(block.getStateManager().getStates()), 1, 1));
    }

    public static void setupPOIs() {
        PointOfInterestTypeAccessor.callSetup(ARMOR_POI);
    }
}