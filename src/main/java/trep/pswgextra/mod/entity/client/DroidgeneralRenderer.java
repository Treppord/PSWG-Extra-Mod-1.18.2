package trep.pswgextra.mod.entity.client;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;
import trep.pswgextra.mod.PswgExtra;
import trep.pswgextra.mod.entity.custom.DroidgeneralEntity;


public class DroidgeneralRenderer extends GeoEntityRenderer<DroidgeneralEntity> {
    public DroidgeneralRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new DroidgeneralModel());
    }

    @Override
    public Identifier getTextureLocation(DroidgeneralEntity instance) {
        return new Identifier(PswgExtra.MOD_ID, "textures/entity/droidgeneral/droidgeneral.png");
    }
}

