package rb;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import h8.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: b */
    public static final ConcurrentHashMap f25458b = new ConcurrentHashMap(16);

    /* renamed from: c */
    public static final Object f25459c = new Object();

    /* renamed from: a */
    public a f25460a;

    public b(Context context, GrsBaseInfo grsBaseInfo) {
        d(context);
        ConcurrentHashMap concurrentHashMap = f25458b;
        concurrentHashMap.put(context.getPackageName() + grsBaseInfo.uniqueCode(), this);
    }

    public static b c(String str, GrsBaseInfo grsBaseInfo) {
        ConcurrentHashMap concurrentHashMap = f25458b;
        StringBuilder a10 = android.support.v4.media.d.a(str);
        a10.append(grsBaseInfo.uniqueCode());
        return (b) concurrentHashMap.get(a10.toString());
    }

    public static void f(Context context, GrsBaseInfo grsBaseInfo) {
        b c10 = c(context.getPackageName(), grsBaseInfo);
        if (c10 != null) {
            Logger.i("LocalManagerProxy", "appGrs is not null and clear services.");
            synchronized (f25459c) {
                a aVar = c10.f25460a;
                r rVar = aVar.f25451a;
                if (rVar != null) {
                    Map map = (Map) rVar.f16016c;
                    if (map != null) {
                        map.clear();
                    }
                    aVar.f25456f = true;
                }
            }
        }
    }

    public final String a(Context context, qb.a aVar, GrsBaseInfo grsBaseInfo, String str, String str2) {
        synchronized (f25459c) {
            String c10 = this.f25460a.c(context, aVar, grsBaseInfo, str, str2);
            if (TextUtils.isEmpty(c10) && this.f25460a.f25456f) {
                d(context);
                e(grsBaseInfo);
                ConcurrentHashMap concurrentHashMap = f25458b;
                concurrentHashMap.put(context.getPackageName() + grsBaseInfo.uniqueCode(), this);
                return this.f25460a.c(context, aVar, grsBaseInfo, str, str2);
            }
            return c10;
        }
    }

    public final Map b(Context context, GrsBaseInfo grsBaseInfo, qb.a aVar, String str, boolean z10) {
        synchronized (f25459c) {
            Map e10 = this.f25460a.e(context, grsBaseInfo, aVar, str, z10);
            if ((e10 == null || e10.isEmpty()) && this.f25460a.f25456f) {
                d(context);
                e(grsBaseInfo);
                ConcurrentHashMap concurrentHashMap = f25458b;
                concurrentHashMap.put(context.getPackageName() + grsBaseInfo.uniqueCode(), this);
                return this.f25460a.e(context, grsBaseInfo, aVar, str, z10);
            }
            return e10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x0111, code lost:
        if (r5 == 0) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(android.content.Context r14) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: rb.b.d(android.content.Context):void");
    }

    public final void e(GrsBaseInfo grsBaseInfo) {
        a aVar = this.f25460a;
        aVar.f25453c.put("no_route_country", "no-country");
        ArrayList arrayList = aVar.f25452b;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = aVar.f25452b.iterator();
            while (it.hasNext()) {
                xb.a aVar2 = (xb.a) it.next();
                if (aVar2.f30460b.contains(grsBaseInfo.getIssueCountry())) {
                    aVar.f25453c.put(grsBaseInfo.getIssueCountry(), aVar2.f30459a);
                }
                if (aVar2.f30460b.contains(grsBaseInfo.getRegCountry())) {
                    aVar.f25453c.put(grsBaseInfo.getRegCountry(), aVar2.f30459a);
                }
                if (aVar2.f30460b.contains(grsBaseInfo.getSerCountry())) {
                    aVar.f25453c.put(grsBaseInfo.getSerCountry(), aVar2.f30459a);
                }
            }
            aVar.f25452b = null;
        }
    }
}
