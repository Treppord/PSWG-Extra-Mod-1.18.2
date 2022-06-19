package trep.pswgextra.mod.entity.client.armor;

import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;
import trep.pswgextra.mod.items.custom.BeskaralloyArmorItem;
import trep.pswgextra.mod.items.custom.SnowtrooperArmorItem;

public class SnowtrooperArmorRenderer extends GeoArmorRenderer<SnowtrooperArmorItem> {
        public SnowtrooperArmorRenderer() {
            super(new SnowtrooperArmorModel());

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
