package trep.pswgextra.mod.entity.client.armor;

import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;
import trep.pswgextra.mod.items.custom.BluemandoArmorItem;
import trep.pswgextra.mod.items.custom.CyanmandoArmorItem;

public class CyanmandoArmorRenderer extends GeoArmorRenderer<CyanmandoArmorItem> {
        public CyanmandoArmorRenderer() {
            super(new CyanmandoArmorModel());

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
