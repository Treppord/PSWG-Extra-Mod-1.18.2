package trep.pswgextra.mod.entity.client.armor;

import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;
import trep.pswgextra.mod.items.custom.InquisitorArmorItem;

public class InquisitorArmorRenderer extends GeoArmorRenderer<InquisitorArmorItem> {
    public InquisitorArmorRenderer() {
        super(new InquisitorArmorModel());

        this.headBone = "armorHead";
        this.bodyBone = "armorBody";
        this.rightArmBone = "armorRightArm";
        this.leftArmBone = "armorLeftArm";
        this.rightLegBone = "armorRightLeg";
        this.leftLegBone = "armorLeftLeg";
        this.rightBootBone = "armorRightBoot";
        this.leftBootBone = "armorLeftBoot";

    }
}
