package trep.pswgextra.mod.entity.client;

import net.minecraft.util.Identifier;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;
import trep.pswgextra.mod.PswgExtra;
import trep.pswgextra.mod.entity.custom.DroidgeneralEntity;
import trep.pswgextra.mod.entity.custom.WampaEntity;

public class WampaModel extends AnimatedGeoModel<WampaEntity> {
    @Override
    public Identifier getModelLocation(WampaEntity object) {
        return new Identifier(PswgExtra.MOD_ID, "geo/wampa.geo.json");
    }

    @Override
    public Identifier getTextureLocation(WampaEntity object) {
        return new Identifier(PswgExtra.MOD_ID, "textures/entity/wampa/wampa.png");
    }

    @Override
    public Identifier getAnimationFileLocation(WampaEntity animatable) {
        return new Identifier(PswgExtra.MOD_ID, "animations/wampa.animation.json");
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public void setLivingAnimations(WampaEntity entity, Integer uniqueID, AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        IBone head = this.getAnimationProcessor().getBone("head");

        EntityModelData extraData = (EntityModelData) customPredicate.getExtraDataOfType(EntityModelData.class).get(0);
        if (head != null) {
            head.setRotationX(extraData.headPitch * ((float) Math.PI / 180F));
            head.setRotationY(extraData.netHeadYaw * ((float) Math.PI / 180F));
        }
    }

}
