package trep.pswgextra.mod.entity.client.armor;

import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import trep.pswgextra.mod.PswgExtra;
import trep.pswgextra.mod.items.custom.BluemandoArmorItem;
import trep.pswgextra.mod.items.custom.RedmandoArmorItem;

public class RedmandoArmorModel extends AnimatedGeoModel<RedmandoArmorItem> {
    @Override
    public Identifier getModelLocation(RedmandoArmorItem object) {
        return new Identifier(PswgExtra.MOD_ID, "geo/redmando_armor.geo.json");
    }

    @Override
    public Identifier getTextureLocation(RedmandoArmorItem object) {
        return new Identifier(PswgExtra.MOD_ID, "textures/item/redmando.png");
    }

    @Override
    public Identifier getAnimationFileLocation(RedmandoArmorItem animatable) {
        return new Identifier(PswgExtra.MOD_ID, "animations/armor.animation.json");
    }
}
