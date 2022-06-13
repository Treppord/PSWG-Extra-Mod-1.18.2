package trep.pswgextra.mod.entity.client.armor;

import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import trep.pswgextra.mod.PswgExtra;
import trep.pswgextra.mod.items.custom.BeskaralloyArmorItem;
import trep.pswgextra.mod.items.custom.TempleguardArmorItem;

public class BeskaralloyArmorModel extends AnimatedGeoModel<BeskaralloyArmorItem> {
    @Override
    public Identifier getModelLocation(BeskaralloyArmorItem object) {
        return new Identifier(PswgExtra.MOD_ID, "geo/beskar_armor.geo.json");
    }

    @Override
    public Identifier getTextureLocation(BeskaralloyArmorItem object) {
        return new Identifier(PswgExtra.MOD_ID, "textures/item/beskar_armor.png");
    }

    @Override
    public Identifier getAnimationFileLocation(BeskaralloyArmorItem animatable) {
        return new Identifier(PswgExtra.MOD_ID, "animations/armor.animation.json");
    }
}
