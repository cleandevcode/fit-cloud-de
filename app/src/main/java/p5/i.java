package p5;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.widget.r2;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import d6.c0;
import d6.m0;
import d6.v;
import d6.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import o5.e0;
import o5.g0;
import o5.y;
import p5.m;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a */
    public static final String f23913a;

    /* renamed from: b */
    public static final int f23914b;

    /* renamed from: c */
    public static volatile e f23915c;

    /* renamed from: d */
    public static final ScheduledExecutorService f23916d;

    /* renamed from: e */
    public static ScheduledFuture<?> f23917e;

    /* renamed from: f */
    public static final g f23918f;

    static {
        new i();
        f23913a = i.class.getName();
        f23914b = 100;
        f23915c = new e(0, 0);
        f23916d = Executors.newSingleThreadScheduledExecutor();
        f23918f = new g(0);
    }

    public static final y a(a aVar, t tVar, boolean z10, fb.a aVar2) {
        if (i6.a.b(i.class)) {
            return null;
        }
        try {
            String str = aVar.f23885a;
            boolean z11 = false;
            v f10 = w.f(str, false);
            String str2 = y.f22858j;
            String format = String.format("%s/activities", Arrays.copyOf(new Object[]{str}, 1));
            gm.l.e(format, "java.lang.String.format(format, *args)");
            y h10 = y.c.h(null, format, null, null);
            h10.f22869i = true;
            Bundle bundle = h10.f22864d;
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putString(Oauth2AccessToken.KEY_ACCESS_TOKEN, aVar.f23886b);
            synchronized (m.c()) {
                i6.a.b(m.class);
            }
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = m.f23923c;
            String c10 = m.a.c();
            if (c10 != null) {
                bundle.putString("install_referrer", c10);
            }
            h10.f22864d = bundle;
            if (f10 != null) {
                z11 = f10.f12795a;
            }
            int d10 = tVar.d(h10, o5.v.a(), z11, z10);
            if (d10 == 0) {
                return null;
            }
            aVar2.f14220b += d10;
            h10.j(new h(aVar, h10, tVar, aVar2, 0));
            return h10;
        } catch (Throwable th2) {
            i6.a.a(i.class, th2);
            return null;
        }
    }

    public static final ArrayList b(e eVar, fb.a aVar) {
        t tVar;
        if (i6.a.b(i.class)) {
            return null;
        }
        try {
            gm.l.f(eVar, "appEventCollection");
            boolean f10 = o5.v.f(o5.v.a());
            ArrayList arrayList = new ArrayList();
            for (a aVar2 : eVar.p()) {
                synchronized (eVar) {
                    gm.l.f(aVar2, "accessTokenAppIdPair");
                    tVar = (t) ((HashMap) eVar.f23905a).get(aVar2);
                }
                if (tVar != null) {
                    y a10 = a(aVar2, tVar, f10, aVar);
                    if (a10 != null) {
                        arrayList.add(a10);
                        r5.d.f25245a.getClass();
                        if (r5.d.f25247c) {
                            HashSet<Integer> hashSet = r5.f.f25262a;
                            m0.M(new androidx.activity.h(5, a10));
                        }
                    }
                } else {
                    throw new IllegalStateException("Required value was null.".toString());
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            i6.a.a(i.class, th2);
            return null;
        }
    }

    public static final void c(p pVar) {
        if (i6.a.b(i.class)) {
            return;
        }
        try {
            f23916d.execute(new r2(9, pVar));
        } catch (Throwable th2) {
            i6.a.a(i.class, th2);
        }
    }

    public static final void d(p pVar) {
        if (i6.a.b(i.class)) {
            return;
        }
        try {
            f23915c.i(f.a());
            try {
                fb.a f10 = f(pVar, f23915c);
                if (f10 != null) {
                    Intent intent = new Intent("com.facebook.sdk.APP_EVENTS_FLUSHED");
                    intent.putExtra("com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED", f10.f14220b);
                    intent.putExtra("com.facebook.sdk.APP_EVENTS_FLUSH_RESULT", (q) f10.f14219a);
                    g2.a.a(o5.v.a()).c(intent);
                }
            } catch (Exception e10) {
                Log.w(f23913a, "Caught unexpected exception while flushing app events: ", e10);
            }
        } catch (Throwable th2) {
            i6.a.a(i.class, th2);
        }
    }

    public static final void e(y yVar, e0 e0Var, a aVar, t tVar, fb.a aVar2) {
        q qVar;
        q qVar2 = q.NO_CONNECTIVITY;
        if (i6.a.b(i.class)) {
            return;
        }
        try {
            o5.s sVar = e0Var.f22704c;
            q qVar3 = q.SUCCESS;
            boolean z10 = true;
            if (sVar != null) {
                if (sVar.f22823b == -1) {
                    qVar = qVar2;
                } else {
                    gm.l.e(String.format("Failed:\n  Response: %s\n  Error %s", Arrays.copyOf(new Object[]{e0Var.toString(), sVar.toString()}, 2)), "java.lang.String.format(format, *args)");
                    qVar = q.SERVER_ERROR;
                }
            } else {
                qVar = qVar3;
            }
            o5.v vVar = o5.v.f22837a;
            o5.v.i(g0.APP_EVENTS);
            if (sVar == null) {
                z10 = false;
            }
            tVar.b(z10);
            if (qVar == qVar2) {
                o5.v.c().execute(new s.q(aVar, tVar, 12));
            }
            if (qVar != qVar3 && ((q) aVar2.f14219a) != qVar2) {
                aVar2.f14219a = qVar;
            }
        } catch (Throwable th2) {
            i6.a.a(i.class, th2);
        }
    }

    public static final fb.a f(p pVar, e eVar) {
        if (i6.a.b(i.class)) {
            return null;
        }
        try {
            gm.l.f(eVar, "appEventCollection");
            fb.a aVar = new fb.a();
            ArrayList b10 = b(eVar, aVar);
            if (!(!b10.isEmpty())) {
                return null;
            }
            c0.a aVar2 = c0.f12645d;
            g0 g0Var = g0.APP_EVENTS;
            String str = f23913a;
            pVar.toString();
            gm.l.f(str, "tag");
            o5.v.i(g0Var);
            Iterator it = b10.iterator();
            while (it.hasNext()) {
                ((y) it.next()).c();
            }
            return aVar;
        } catch (Throwable th2) {
            i6.a.a(i.class, th2);
            return null;
        }
    }
}
