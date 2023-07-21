package com.peasenet.mod;

import com.peasenet.mods.render.ModNoOverlay;
import com.peasenet.main.GavinsMod;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NoOverlayMod implements ModInitializer {

    /**
     * Runs the mod initializer.
     */
    @Override
    public void onInitialize() {
        GavinsMod.addMod(new ModNoOverlay());
    }
}
