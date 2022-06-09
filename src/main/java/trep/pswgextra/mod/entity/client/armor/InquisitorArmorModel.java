package trep.pswgextra.mod.entity.client.armor;

import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import trep.pswgextra.mod.PswgExtra;
import trep.pswgextra.mod.items.custom.InquisitorArmorItem;

public class InquisitorArmorModel extends AnimatedGeoModel<InquisitorArmorItem> {
    @Override
    public Identifier getModelLocation(InquisitorArmorItem object) {
        return new Identifier(PswgExtra.MOD_ID, "geo/inquisitor_armor.geo.json");
    }

    @Override
    public Identifier getTextureLocation(InquisitorArmorItem object) {
        return new Identifier(PswgExtra.MOD_ID, "textures/models/armor/inquisitor_armor_texture.png");
    }

    @Override
    public Identifier getAnimationFileLocation(InquisitorArmorItem animatable) {
        return new Identifier(PswgExtra.MOD_ID, "animations/armor.animation.json");
    }
}
