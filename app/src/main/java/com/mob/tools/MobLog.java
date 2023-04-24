package com.mob.tools;

import com.mob.MobSDK;
import com.mob.commons.i;
import com.mob.tools.log.NLog;
import com.mob.tools.proguard.EverythingKeeper;

/* loaded from: classes.dex */
public class MobLog implements EverythingKeeper {
    public static synchronized NLog getInstance() {
        NLog nLog;
        synchronized (MobLog.class) {
            nLog = NLog.getInstance("MobSDK", MobSDK.SDK_VERSION_CODE, i.a("009n?gehegnPf2gegegfhi"));
        }
        return nLog;
    }
}
