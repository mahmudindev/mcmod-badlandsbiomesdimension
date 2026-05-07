package com.github.mahmudindev.mcmod.badlandsbiomesdimension;

import com.github.mahmudindev.mcmod.badlandsbiomesdimension.platform.Services;
import com.github.mahmudindev.mcmod.badlandsbiomesdimension.platform.services.IPlatformHelper;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public final class BadlandsBiomesDimension {
    public static final String MOD_ID = "badlandsbiomesdimension";
    public static final Logger LOGGER = LogUtils.getLogger();
    public static final IPlatformHelper PLATFORM = Services.PLATFORM;

    public static void init() {
        // Write common init code here.
    }
}
