package com.mob.tools;

import com.mob.commons.u;
import com.mob.tools.proguard.PublicMemberKeeper;
import com.mob.tools.utils.e;
import java.util.ArrayList;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class MDP implements PublicMemberKeeper {

    /* renamed from: a */
    private static Object f8580a = new Object();

    private static Object a(String str, BlockingQueue blockingQueue) {
        return blockingQueue.poll(("gia".equals(str) || "gal".equals(str) || "gsl".equals(str)) ? 30000 : "glctn".equals(str) ? 60000 : "rgwsr".equals(str) ? 10000 : 3000, TimeUnit.MILLISECONDS);
    }

    public static Object get(String str, ArrayList<Object> arrayList) {
        return get(str, arrayList, false, 0);
    }

    public static Object get(String str, ArrayList<Object> arrayList, int i10) {
        return get(str, arrayList, false, i10);
    }

    public static Object get(String str, ArrayList<Object> arrayList, boolean z10) {
        return get(str, arrayList, z10, 0);
    }

    public static Object get(final String str, final ArrayList<Object> arrayList, boolean z10, int i10) {
        if (z10) {
            return com.mob.tools.b.a.a(str, arrayList);
        }
        final LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        u.f8518e.execute(new e() { // from class: com.mob.tools.MDP.1
            @Override // com.mob.tools.utils.e
            public void a() {
                Object a10 = com.mob.tools.b.a.a(str, arrayList);
                if (a10 == null) {
                    a10 = MDP.f8580a;
                }
                linkedBlockingQueue.offer(a10);
            }
        });
        try {
            Object a10 = i10 <= 0 ? a(str, linkedBlockingQueue) : linkedBlockingQueue.poll(i10, TimeUnit.MILLISECONDS);
            if (a10 == f8580a) {
                return null;
            }
            return a10;
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            return null;
        }
    }
}
