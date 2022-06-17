package trep.pswgextra.mod.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import trep.pswgextra.mod.PswgExtra;
import trep.pswgextra.mod.entity.ModEntities;
import trep.pswgextra.mod.items.custom.*;

public class ModItems {

	public static final Item BANTHA_HIDE = registerItem("bantha_hide", 
		new Item(new FabricItemSettings().group(ModItemGroup.PSWGEXTRA)));

	public static final Item DROIDGENERAL_SPAWN_EGG = registerItem("droidgeneral_spawn_egg",
					new SpawnEggItem(ModEntities.DROIDGENERAL,0x558e8d, 0x2b1135,
						new FabricItemSettings().group(ModItemGroup.PSWGEXTRA).maxCount(1)));


	public static final Item BESKAR_ALLOY = registerItem("beskar_alloy", 
		new Item(new FabricItemSettings().group(ModItemGroup.PSWGEXTRA)));

	public static final Item BESKAR_SCRAPS = registerItem("beskar_scraps",
			new Item(new FabricItemSettings().group(ModItemGroup.PSWGEXTRA)));

	public static final Item BESKAR_LUMP = registerItem("beskar_lump",
			new Item(new FabricItemSettings().group(ModItemGroup.PSWGEXTRA)));


	public static final Item EMBLEM = registerItem("emblem",
			new Item(new FabricItemSettings().group(ModItemGroup.PSWGEXTRA)));

	public static final Item FETT_EMBLEM = registerItem("fett_emblem",
			new Item(new FabricItemSettings().group(ModItemGroup.PSWGEXTRA)));

	public static final Item DEATH_WATCH_EMBLEM = registerItem("death_watch_emblem",
			new Item(new FabricItemSettings().group(ModItemGroup.PSWGEXTRA)));

	public static final Item SUPER_COMMANDO_EMBLEM = registerItem("super_commando_emblem",
			new Item(new FabricItemSettings().group(ModItemGroup.PSWGEXTRA)));


	public static final Item BRONZE_CREDIT = registerItem("bronze_credit",
			new Item(new FabricItemSettings().group(ModItemGroup.PSWGEXTRA)));

	public static final Item SILVER_CREDIT = registerItem("silver_credit",
			new Item(new FabricItemSettings().group(ModItemGroup.PSWGEXTRA)));

	public static final Item GOLD_CREDIT = registerItem("gold_credit",
			new Item(new FabricItemSettings().group(ModItemGroup.PSWGEXTRA)));


	public static final Item BESKAR_HELMET = registerItem("beskar_helmet", 
		new BeskaralloyArmorItem(ModArmorMaterial.BESKAR, EquipmentSlot.HEAD,
			new FabricItemSettings().group(ModItemGroup.PSWGEXTRA)));
	public static final Item BESKAR_CHESTPLATE = registerItem("beskar_chestplate", 
		new BeskaralloyArmorItem(ModArmorMaterial.BESKAR, EquipmentSlot.CHEST,
			new FabricItemSettings().group(ModItemGroup.PSWGEXTRA)));
	public static final Item BESKAR_LEGGINGS = registerItem("beskar_leggings", 
		new BeskaralloyArmorItem(ModArmorMaterial.BESKAR, EquipmentSlot.LEGS,
			new FabricItemSettings().group(ModItemGroup.PSWGEXTRA)));
	public static final Item BESKAR_BOOTS = registerItem("beskar_boots", 
		new BeskaralloyArmorItem(ModArmorMaterial.BESKAR, EquipmentSlot.FEET,
			new FabricItemSettings().group(ModItemGroup.PSWGEXTRA)));									



	public static final Item REDMANDO_HELMET = registerItem("redmando_helmet", 
		new RedmandoArmorItem(ModArmorMaterial.REDMANDO, EquipmentSlot.HEAD,
			new FabricItemSettings().group(ModItemGroup.PSWGEXTRA)));
	public static final Item REDMANDO_CHESTPLATE = registerItem("redmando_chestplate", 
		new RedmandoArmorItem(ModArmorMaterial.REDMANDO, EquipmentSlot.CHEST,
			new FabricItemSettings().group(ModItemGroup.PSWGEXTRA)));
	public static final Item REDMANDO_LEGGINGS = registerItem("redmando_leggings", 
		new RedmandoArmorItem(ModArmorMaterial.REDMANDO, EquipmentSlot.LEGS,
			new FabricItemSettings().group(ModItemGroup.PSWGEXTRA)));
	public static final Item REDMANDO_BOOTS = registerItem("redmando_boots", 
		new RedmandoArmorItem(ModArmorMaterial.REDMANDO, EquipmentSlot.FEET,
			new FabricItemSettings().group(ModItemGroup.PSWGEXTRA)));						



	public static final Item JEDI_HELMET = registerItem("jedi_helmet", 
		new ArmorItem(ModArmorMaterial.JEDI, EquipmentSlot.HEAD,
			new FabricItemSettings().group(ModItemGroup.PSWGEXTRA)));
	public static final Item JEDI_CHESTPLATE = registerItem("jedi_chestplate", 
		new ArmorItem(ModArmorMaterial.JEDI, EquipmentSlot.CHEST,
			new FabricItemSettings().group(ModItemGroup.PSWGEXTRA)));
	public static final Item JEDI_LEGGINGS = registerItem("jedi_leggings", 
		new ArmorItem(ModArmorMaterial.JEDI, EquipmentSlot.LEGS,
			new FabricItemSettings().group(ModItemGroup.PSWGEXTRA)));
	public static final Item JEDI_BOOTS = registerItem("jedi_boots", 
		new ArmorItem(ModArmorMaterial.JEDI, EquipmentSlot.FEET,
			new FabricItemSettings().group(ModItemGroup.PSWGEXTRA)));	






	public static final Item SITH_HELMET = registerItem("sith_helmet", 
		new ArmorItem(ModArmorMaterial.SITH, EquipmentSlot.HEAD,
			new FabricItemSettings().group(ModItemGroup.PSWGEXTRA)));
	public static final Item SITH_CHESTPLATE = registerItem("sith_chestplate", 
		new ArmorItem(ModArmorMaterial.SITH, EquipmentSlot.CHEST,
			new FabricItemSettings().group(ModItemGroup.PSWGEXTRA)));
	public static final Item SITH_LEGGINGS = registerItem("sith_leggings", 
		new ArmorItem(ModArmorMaterial.SITH, EquipmentSlot.LEGS,
			new FabricItemSettings().group(ModItemGroup.PSWGEXTRA)));
	public static final Item SITH_BOOTS = registerItem("sith_boots", 
		new ArmorItem(ModArmorMaterial.SITH, EquipmentSlot.FEET,
			new FabricItemSettings().group(ModItemGroup.PSWGEXTRA)));				







	public static final Item BLUEMANDO_HELMET = registerItem("bluemando_helmet", 
		new BluemandoArmorItem(ModArmorMaterial.BLUEMANDO, EquipmentSlot.HEAD,
			new FabricItemSettings().group(ModItemGroup.PSWGEXTRA)));
	public static final Item BLUEMANDO_CHESTPLATE = registerItem("bluemando_chestplate", 
		new BluemandoArmorItem(ModArmorMaterial.BLUEMANDO, EquipmentSlot.CHEST,
			new FabricItemSettings().group(ModItemGroup.PSWGEXTRA)));
	public static final Item BLUEMANDO_LEGGINGS = registerItem("bluemando_leggings", 
		new BluemandoArmorItem(ModArmorMaterial.BLUEMANDO, EquipmentSlot.LEGS,
			new FabricItemSettings().group(ModItemGroup.PSWGEXTRA)));
	public static final Item BLUEMANDO_BOOTS = registerItem("bluemando_boots", 
		new BluemandoArmorItem(ModArmorMaterial.BLUEMANDO, EquipmentSlot.FEET,
			new FabricItemSettings().group(ModItemGroup.PSWGEXTRA)));						






	public static final Item CYANMANDO_HELMET = registerItem("cyanmando_helmet", 
		new CyanmandoArmorItem(ModArmorMaterial.CYANMANDO, EquipmentSlot.HEAD,
			new FabricItemSettings().group(ModItemGroup.PSWGEXTRA)));
	public static final Item CYANMANDO_CHESTPLATE = registerItem("cyanmando_chestplate", 
		new CyanmandoArmorItem(ModArmorMaterial.CYANMANDO, EquipmentSlot.CHEST,
			new FabricItemSettings().group(ModItemGroup.PSWGEXTRA)));
	public static final Item CYANMANDO_LEGGINGS = registerItem("cyanmando_leggings", 
		new CyanmandoArmorItem(ModArmorMaterial.CYANMANDO, EquipmentSlot.LEGS,
			new FabricItemSettings().group(ModItemGroup.PSWGEXTRA)));
	public static final Item CYANMANDO_BOOTS = registerItem("cyanmando_boots", 
		new CyanmandoArmorItem(ModArmorMaterial.CYANMANDO, EquipmentSlot.FEET,
			new FabricItemSettings().group(ModItemGroup.PSWGEXTRA)));


	public static final Item INQUISITOR_HELMET = registerItem("inquisitor_helmet",
			new InquisitorArmorItem(ModArmorMaterial.INQUISITOR, EquipmentSlot.HEAD,
					new FabricItemSettings().group(ModItemGroup.PSWGEXTRA)));
	public static final Item INQUISITOR_CHESTPLATE = registerItem("inquisitor_chestplate",
			new InquisitorArmorItem(ModArmorMaterial.INQUISITOR, EquipmentSlot.CHEST,
					new FabricItemSettings().group(ModItemGroup.PSWGEXTRA)));
	public static final Item INQUISITOR_LEGGINGS = registerItem("inquisitor_leggings",
			new InquisitorArmorItem(ModArmorMaterial.INQUISITOR, EquipmentSlot.LEGS,
					new FabricItemSettings().group(ModItemGroup.PSWGEXTRA)));
	public static final Item INQUISITOR_BOOTS = registerItem("inquisitor_boots",
			new InquisitorArmorItem(ModArmorMaterial.INQUISITOR, EquipmentSlot.FEET,
					new FabricItemSettings().group(ModItemGroup.PSWGEXTRA)));

	public static final Item TEMPLEGUARD_HELMET = registerItem("templeguard_helmet",
			new TempleguardArmorItem(ModArmorMaterial.TEMPLEGUARD, EquipmentSlot.HEAD,
					new FabricItemSettings().group(ModItemGroup.PSWGEXTRA)));
	public static final Item TEMPLEGUARD_CHESTPLATE = registerItem("templeguard_chestplate",
			new TempleguardArmorItem(ModArmorMaterial.TEMPLEGUARD, EquipmentSlot.CHEST,
					new FabricItemSettings().group(ModItemGroup.PSWGEXTRA)));
	public static final Item TEMPLEGUARD_LEGGINGS = registerItem("templeguard_leggings",
			new TempleguardArmorItem(ModArmorMaterial.TEMPLEGUARD, EquipmentSlot.LEGS,
					new FabricItemSettings().group(ModItemGroup.PSWGEXTRA)));
	public static final Item TEMPLEGUARD_BOOTS = registerItem("templeguard_boots",
			new TempleguardArmorItem(ModArmorMaterial.TEMPLEGUARD, EquipmentSlot.FEET,
					new FabricItemSettings().group(ModItemGroup.PSWGEXTRA)));







	private static Item registerItem(String name, Item item) {
		return Registry.register(Registry.ITEM, new Identifier(PswgExtra.MOD_ID, name), item);


	}

	public static void registerModItems() {
		System.out.println("Registering Mod Items for " + PswgExtra.MOD_ID);


	}


}
