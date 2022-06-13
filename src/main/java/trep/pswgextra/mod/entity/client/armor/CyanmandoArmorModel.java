package trep.pswgextra.mod.entity.client.armor;

import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import trep.pswgextra.mod.PswgExtra;
import trep.pswgextra.mod.items.custom.BluemandoArmorItem;
import trep.pswgextra.mod.items.custom.CyanmandoArmorItem;

public class CyanmandoArmorModel extends AnimatedGeoModel<CyanmandoArmorItem> {
    @Override
    public Identifier getModelLocation(CyanmandoArmorItem object) {
        return new Identifier(PswgExtra.MOD_ID, "geo/cyanmando_armor.geo.json");
    }

    @Override
    public Identifier getTextureLocation(CyanmandoArmorItem object) {
        return new Identifier(PswgExtra.MOD_ID, "textures/item/cyanmando.png");
    }

    @Override
    public Identifier getAnimationFileLocation(CyanmandoArmorItem animatable) {
        return new Identifier(PswgExtra.MOD_ID, "animations/armor.animation.json");
    }
}
