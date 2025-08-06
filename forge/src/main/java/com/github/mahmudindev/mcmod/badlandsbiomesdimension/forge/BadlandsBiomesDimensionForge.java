package com.github.mahmudindev.mcmod.badlandsbiomesdimension.forge;

import com.github.mahmudindev.mcmod.badlandsbiomesdimension.BadlandsBiomesDimension;
import net.minecraftforge.fml.common.Mod;

@Mod(BadlandsBiomesDimension.MOD_ID)
public final class BadlandsBiomesDimensionForge {
    public BadlandsBiomesDimensionForge() {
        // Run our common setup.
        BadlandsBiomesDimension.init();
    }
}
