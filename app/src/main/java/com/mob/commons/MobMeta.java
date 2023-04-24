package com.mob.commons;

import android.os.Looper;
import com.mob.tools.MobLog;
import com.mob.tools.log.NLog;
import com.mob.tools.proguard.PublicMemberKeeper;

/* loaded from: classes.dex */
public class MobMeta implements PublicMemberKeeper {
    public static <T> T get(MobProduct mobProduct, String str, Class<T> cls, T t10) {
        T t11;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            NLog mobLog = MobLog.getInstance();
            mobLog.w("WARNING: gt mta in main: key = " + str);
            return t10;
        }
        try {
            Object a10 = n.a(str, cls, mobProduct);
            if (a10 == null) {
                try {
                    a10 = n.a(str);
                } catch (Throwable th2) {
                    th = th2;
                    t10 = t11;
                    MobLog.getInstance().d(th);
                    return t10;
                }
            }
            return a10 == null ? t10 : (T) a10;
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
