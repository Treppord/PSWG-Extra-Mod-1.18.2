package trep.pswgextra.mod.entity.client.armor;

import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;
import trep.pswgextra.mod.items.custom.BeskaralloyArmorItem;
import trep.pswgextra.mod.items.custom.BluemandoArmorItem;

public class BluemandoArmorRenderer extends GeoArmorRenderer<BluemandoArmorItem> {
        public BluemandoArmorRenderer() {
            super(new BluemandoArmorModel());

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
