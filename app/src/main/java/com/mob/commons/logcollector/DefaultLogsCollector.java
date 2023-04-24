package com.mob.commons.logcollector;

import com.mob.tools.log.LogCollector;
import com.mob.tools.log.NLog;
import com.mob.tools.proguard.PublicMemberKeeper;
import java.util.HashMap;

@Deprecated
/* loaded from: classes.dex */
public class DefaultLogsCollector implements LogCollector, PublicMemberKeeper {

    /* renamed from: a */
    private static DefaultLogsCollector f8443a;

    /* renamed from: b */
    private final HashMap<String, Integer> f8444b = new HashMap<>();

    private DefaultLogsCollector() {
    }

    public static synchronized DefaultLogsCollector get() {
        DefaultLogsCollector defaultLogsCollector;
        synchronized (DefaultLogsCollector.class) {
            if (f8443a == null) {
                f8443a = new DefaultLogsCollector();
            }
            defaultLogsCollector = f8443a;
        }
        return defaultLogsCollector;
    }

    public void addSDK(String str, int i10) {
        synchronized (this.f8444b) {
            this.f8444b.put(str, Integer.valueOf(i10));
        }
    }

    @Override // com.mob.tools.log.LogCollector
    public final void log(String str, int i10, int i11, String str2, String str3) {
        Integer num = this.f8444b.get(str);
        if (num == null) {
            num = -1;
        }
        NLog.getInstance(str, num.intValue(), str).log(i10, str3, new Object[0]);
    }
}
