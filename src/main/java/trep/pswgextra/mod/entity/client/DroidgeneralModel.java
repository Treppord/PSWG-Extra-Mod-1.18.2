package trep.pswgextra.mod.entity.client;

import net.minecraft.util.Identifier;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;
import trep.pswgextra.mod.PswgExtra;
import trep.pswgextra.mod.entity.custom.DroidgeneralEntity;

public class DroidgeneralModel extends AnimatedGeoModel<DroidgeneralEntity> {
    @Override
    public Identifier getModelLocation(DroidgeneralEntity object) {
        return new Identifier(PswgExtra.MOD_ID, "geo/droidgeneral.geo.json");
    }

    @Override
    public Identifier getTextureLocation(DroidgeneralEntity object) {
        return new Identifier(PswgExtra.MOD_ID, "textures/entity/droidgeneral/droidgeneral.png");
    }

    @Override
    public Identifier getAnimationFileLocation(DroidgeneralEntity animatable) {
        return new Identifier(PswgExtra.MOD_ID, "animations/droidgeneral.animation.json");
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public void setLivingAnimations(DroidgeneralEntity entity, Integer uniqueID, AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        IBone head = this.getAnimationProcessor().getBone("head");

        EntityModelData extraData = (EntityModelData) customPredicate.getExtraDataOfType(EntityModelData.class).get(0);
        if (head != null) {
            head.setRotationX(extraData.headPitch * ((float) Math.PI / 180F));
            head.setRotationY(extraData.netHeadYaw * ((float) Math.PI / 180F));
        }
    }

}
