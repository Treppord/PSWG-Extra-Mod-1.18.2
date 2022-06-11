package trep.pswgextra.mod.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import trep.pswgextra.mod.PswgExtra;

public class ModScreenHandlers {
    public static ScreenHandlerType<ArmorStationScreenHandler> ARMOR_STATION_SCREEN_HANDLER =
            ScreenHandlerRegistry.registerSimple(new Identifier(PswgExtra.MOD_ID, "armor_station"),
                    ArmorStationScreenHandler::new);
}
