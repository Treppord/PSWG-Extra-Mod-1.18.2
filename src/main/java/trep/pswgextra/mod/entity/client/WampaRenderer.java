package trep.pswgextra.mod.entity.client;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;
import trep.pswgextra.mod.PswgExtra;
import trep.pswgextra.mod.entity.client.DroidgeneralModel;
import trep.pswgextra.mod.entity.custom.DroidgeneralEntity;
import trep.pswgextra.mod.entity.custom.WampaEntity;


public class WampaRenderer extends GeoEntityRenderer<WampaEntity> {
    public WampaRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new WampaModel());
    }

    @Override
    public Identifier getTextureLocation(WampaEntity instance) {
        return new Identifier(PswgExtra.MOD_ID, "textures/entity/wampa/wampa.png");
    }
}

