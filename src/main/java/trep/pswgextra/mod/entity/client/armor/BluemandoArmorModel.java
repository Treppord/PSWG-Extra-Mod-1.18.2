package trep.pswgextra.mod.entity.client.armor;

import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import trep.pswgextra.mod.PswgExtra;
import trep.pswgextra.mod.items.custom.BeskaralloyArmorItem;
import trep.pswgextra.mod.items.custom.BluemandoArmorItem;

public class BluemandoArmorModel extends AnimatedGeoModel<BluemandoArmorItem> {
    @Override
    public Identifier getModelLocation(BluemandoArmorItem object) {
        return new Identifier(PswgExtra.MOD_ID, "geo/bluemando_armor.geo.json");
    }

    @Override
    public Identifier getTextureLocation(BluemandoArmorItem object) {
        return new Identifier(PswgExtra.MOD_ID, "textures/item/bluemando.png");
    }

    @Override
    public Identifier getAnimationFileLocation(BluemandoArmorItem animatable) {
        return new Identifier(PswgExtra.MOD_ID, "animations/armor.animation.json");
    }
}
