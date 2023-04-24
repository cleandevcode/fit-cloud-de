package com.huawei.hms.ml.common.utils;

import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes.dex */
public final class StreamUtils {
    private StreamUtils() {
    }

    public static void closeStreams(Closeable... closeableArr) {
        String str;
        if (closeableArr == null) {
            return;
        }
        for (Closeable closeable : closeableArr) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException unused) {
                    str = "IOException closeStreams";
                    SmartLog.w("StreamUtils", str);
                } catch (RuntimeException unused2) {
                    str = "RuntimeException closeStreams";
                    SmartLog.w("StreamUtils", str);
                }
            }
        }
    }
}
