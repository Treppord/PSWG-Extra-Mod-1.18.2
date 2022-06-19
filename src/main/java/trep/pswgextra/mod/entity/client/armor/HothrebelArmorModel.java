package trep.pswgextra.mod.entity.client.armor;

import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import trep.pswgextra.mod.PswgExtra;
import trep.pswgextra.mod.items.custom.BeskaralloyArmorItem;
import trep.pswgextra.mod.items.custom.HothrebelArmorItem;

public class HothrebelArmorModel extends AnimatedGeoModel<HothrebelArmorItem> {
    @Override
    public Identifier getModelLocation(HothrebelArmorItem object) {
        return new Identifier(PswgExtra.MOD_ID, "geo/hothrebel.geo.json");
    }

    @Override
    public Identifier getTextureLocation(HothrebelArmorItem object) {
        return new Identifier(PswgExtra.MOD_ID, "textures/item/hothrebel.png");
    }

    @Override
    public Identifier getAnimationFileLocation(HothrebelArmorItem animatable) {
        return new Identifier(PswgExtra.MOD_ID, "animations/armor.animation.json");
    }
}
