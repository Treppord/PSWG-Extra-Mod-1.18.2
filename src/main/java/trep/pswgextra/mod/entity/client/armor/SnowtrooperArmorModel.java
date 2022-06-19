package trep.pswgextra.mod.entity.client.armor;

import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import trep.pswgextra.mod.PswgExtra;
import trep.pswgextra.mod.items.custom.BeskaralloyArmorItem;
import trep.pswgextra.mod.items.custom.SnowtrooperArmorItem;

public class SnowtrooperArmorModel extends AnimatedGeoModel<SnowtrooperArmorItem> {
    @Override
    public Identifier getModelLocation(SnowtrooperArmorItem object) {
        return new Identifier(PswgExtra.MOD_ID, "geo/snowtrooper.geo.json");
    }

    @Override
    public Identifier getTextureLocation(SnowtrooperArmorItem object) {
        return new Identifier(PswgExtra.MOD_ID, "textures/item/snowtrooper.png");
    }

    @Override
    public Identifier getAnimationFileLocation(SnowtrooperArmorItem animatable) {
        return new Identifier(PswgExtra.MOD_ID, "animations/armor.animation.json");
    }
}
