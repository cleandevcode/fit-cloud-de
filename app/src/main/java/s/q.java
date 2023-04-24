package s;

import a0.b0;
import a0.c1;
import a0.f2;
import a0.g1;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import androidx.camera.core.e;
import androidx.camera.core.h;
import androidx.camera.core.n;
import androidx.camera.view.PreviewView;
import androidx.camera.view.c;
import d6.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import o5.y;
import org.json.JSONException;
import org.json.JSONObject;
import p0.c;
import s.a0;
import v5.e;
import x5.f;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f26130a;

    /* renamed from: b */
    public final /* synthetic */ Object f26131b;

    /* renamed from: c */
    public final /* synthetic */ Object f26132c;

    public /* synthetic */ q(Object obj, Object obj2, int i10) {
        this.f26130a = i10;
        this.f26131b = obj;
        this.f26132c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13 = false;
        switch (this.f26130a) {
            case 0:
                ((a0.j) this.f26131b).b((a0.s) this.f26132c);
                return;
            case 1:
                a0 a0Var = (a0) this.f26131b;
                a0Var.getClass();
                ArrayList arrayList = new ArrayList();
                boolean z14 = false;
                for (a0.e eVar : (List) this.f26132c) {
                    a0.f2 f2Var = a0Var.f25869a;
                    String d10 = eVar.d();
                    if (!f2Var.f58b.containsKey(d10)) {
                        z10 = false;
                    } else {
                        z10 = ((f2.a) f2Var.f58b.get(d10)).f61c;
                    }
                    if (z10) {
                        a0Var.f25869a.f58b.remove(eVar.d());
                        arrayList.add(eVar.d());
                        if (eVar.e() == androidx.camera.core.m.class) {
                            z14 = true;
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    StringBuilder a10 = android.support.v4.media.d.a("Use cases [");
                    a10.append(TextUtils.join(", ", arrayList));
                    a10.append("] now DETACHED for camera");
                    a0Var.q(a10.toString(), null);
                    if (z14) {
                        a0Var.f25876h.f26143h.getClass();
                    }
                    a0Var.n();
                    if (a0Var.f25869a.c().isEmpty()) {
                        a0Var.f25876h.f26147l.e(false);
                    } else {
                        a0Var.I();
                    }
                    if (a0Var.f25869a.b().isEmpty()) {
                        a0Var.f25876h.g();
                        a0Var.A();
                        a0Var.f25876h.p(false);
                        a0Var.f25881m = a0Var.v();
                        a0Var.q("Closing camera.", null);
                        int b10 = c0.b(a0Var.f25873e);
                        if (b10 != 1) {
                            if (b10 != 2) {
                                if (b10 != 3) {
                                    if (b10 != 5) {
                                        StringBuilder a11 = android.support.v4.media.d.a("close() ignored due to being in state: ");
                                        a11.append(b0.b(a0Var.f25873e));
                                        a0Var.q(a11.toString(), null);
                                        return;
                                    }
                                } else {
                                    a0Var.B(5);
                                    a0Var.o();
                                    return;
                                }
                            }
                            boolean a12 = a0Var.f25877i.a();
                            a0Var.B(5);
                            if (a12) {
                                h1.k(null, a0Var.u());
                                a0Var.r();
                                return;
                            }
                            return;
                        }
                        if (a0Var.f25879k == null) {
                            z13 = true;
                        }
                        h1.k(null, z13);
                        a0Var.B(1);
                        return;
                    }
                    a0Var.H();
                    a0Var.A();
                    if (a0Var.f25873e == 4) {
                        a0Var.x();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ((x.c) this.f26131b).b((c.a) this.f26132c);
                return;
            case 3:
                y.b bVar = (y.b) this.f26131b;
                bVar.getClass();
                ((c1.a) this.f26132c).a(bVar);
                return;
            case 4:
                androidx.camera.core.o oVar = (androidx.camera.core.o) this.f26132c;
                e.d dVar = androidx.camera.core.e.f1624q;
                ((androidx.camera.core.o) this.f26131b).a();
                if (oVar != null) {
                    oVar.a();
                    return;
                }
                return;
            case 5:
                Exception exc = (Exception) this.f26132c;
                String message = exc.getMessage();
                Throwable cause = exc.getCause();
                h.C0023h c0023h = androidx.camera.core.h.H;
                y.u0.b("ImageCapture", "Processing image failed! " + message);
                ((h.i) ((i0) ((n.e) this.f26131b)).f25998b).b(2, message, cause);
                return;
            case 6:
                ((j1.a) this.f26131b).accept(new androidx.camera.core.b(3, (Surface) this.f26132c));
                return;
            case 7:
                ((z.e) this.f26131b).getClass();
                throw null;
            case 8:
                g1.a aVar = (g1.a) this.f26131b;
                g1.b bVar2 = (g1.b) this.f26132c;
                PreviewView.g gVar = PreviewView.g.IDLE;
                if (aVar.f73a.get()) {
                    Throwable th2 = bVar2.f77b;
                    if (th2 == null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        Object obj = aVar.f74b;
                        if (th2 == null) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            T t10 = bVar2.f76a;
                            final androidx.camera.view.a aVar2 = (androidx.camera.view.a) obj;
                            aVar2.getClass();
                            b0.a aVar3 = (b0.a) t10;
                            if (aVar3 != b0.a.f23e && aVar3 != b0.a.f24f && aVar3 != b0.a.f25g && aVar3 != b0.a.f26h) {
                                if ((aVar3 == b0.a.f21c || aVar3 == b0.a.f22d || aVar3 == b0.a.f20b) && !aVar2.f1879f) {
                                    final a0.a0 a0Var2 = aVar2.f1874a;
                                    aVar2.a(gVar);
                                    final ArrayList arrayList2 = new ArrayList();
                                    d0.b h10 = d0.f.h(d0.d.b(p0.c.a(new c.InterfaceC0425c() { // from class: k0.c
                                        @Override // p0.c.InterfaceC0425c
                                        public final String g(c.a aVar4) {
                                            androidx.camera.view.a aVar5 = aVar2;
                                            y.n nVar = a0Var2;
                                            List list = arrayList2;
                                            aVar5.getClass();
                                            e eVar2 = new e(aVar4, nVar);
                                            list.add(eVar2);
                                            ((a0.a0) nVar).d(o8.b.i(), eVar2);
                                            return "waitForCaptureResult";
                                        }
                                    })).d(new d0.a() { // from class: k0.b
                                        @Override // d0.a
                                        public final na.a apply(Object obj2) {
                                            Void r22 = (Void) obj2;
                                            return androidx.camera.view.a.this.f1877d.g();
                                        }
                                    }, o8.b.i()), new q0(6, aVar2), o8.b.i());
                                    aVar2.f1878e = h10;
                                    d0.f.a(h10, new k0.d(a0Var2, aVar2, arrayList2), o8.b.i());
                                    aVar2.f1879f = true;
                                    return;
                                }
                                return;
                            }
                            aVar2.a(gVar);
                            if (aVar2.f1879f) {
                                aVar2.f1879f = false;
                                d0.d dVar2 = aVar2.f1878e;
                                if (dVar2 != null) {
                                    dVar2.cancel(false);
                                    aVar2.f1878e = null;
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        throw new IllegalStateException("Result contains an error. Does not contain a value.");
                    }
                    th2.getClass();
                    androidx.camera.view.a aVar4 = (androidx.camera.view.a) aVar.f74b;
                    d0.d dVar3 = aVar4.f1878e;
                    if (dVar3 != null) {
                        dVar3.cancel(false);
                        aVar4.f1878e = null;
                    }
                    aVar4.a(gVar);
                    return;
                }
                return;
            case 9:
            default:
                v5.e eVar2 = (v5.e) this.f26131b;
                Runnable runnable = (Runnable) this.f26132c;
                e.b bVar3 = v5.e.f29076s;
                if (!i6.a.b(v5.e.class)) {
                    try {
                        gm.l.f(eVar2, "this$0");
                        gm.l.f(runnable, "$queryPurchaseHistoryRunnable");
                        eVar2.d(new ArrayList(eVar2.f29099r), runnable);
                        return;
                    } catch (Throwable th3) {
                        i6.a.a(v5.e.class, th3);
                        return;
                    }
                }
                return;
            case 10:
                androidx.camera.view.f fVar = (androidx.camera.view.f) this.f26131b;
                androidx.camera.core.s sVar = (androidx.camera.core.s) this.f26132c;
                androidx.camera.core.s sVar2 = fVar.f1904h;
                if (sVar2 != null && sVar2 == sVar) {
                    fVar.f1904h = null;
                    fVar.f1903g = null;
                }
                c.a aVar5 = fVar.f1908l;
                if (aVar5 != null) {
                    ((j0.h) aVar5).b();
                    fVar.f1908l = null;
                    return;
                }
                return;
            case 11:
                Context context = (Context) this.f26131b;
                String str = (String) this.f26132c;
                o5.v vVar = o5.v.f22837a;
                gm.l.f(str, "$applicationId");
                o5.v vVar2 = o5.v.f22837a;
                gm.l.e(context, "applicationContext");
                vVar2.getClass();
                try {
                    if (!i6.a.b(vVar2)) {
                        try {
                            d6.b bVar4 = d6.b.f12632f;
                            d6.b a13 = b.a.a(context);
                            SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
                            String k10 = gm.l.k("ping", str);
                            long j10 = sharedPreferences.getLong(k10, 0L);
                            try {
                                HashMap hashMap = x5.f.f30298a;
                                JSONObject a14 = x5.f.a(f.a.MOBILE_INSTALL_EVENT, a13, gm.j.i(context), o5.v.f(context), context);
                                String format = String.format("%s/activities", Arrays.copyOf(new Object[]{str}, 1));
                                gm.l.e(format, "java.lang.String.format(format, *args)");
                                o5.v.f22855s.getClass();
                                String str2 = o5.y.f22858j;
                                o5.y h11 = y.c.h(null, format, a14, null);
                                if (j10 == 0 && h11.c().f22704c == null) {
                                    SharedPreferences.Editor edit = sharedPreferences.edit();
                                    edit.putLong(k10, System.currentTimeMillis());
                                    edit.apply();
                                    return;
                                }
                                return;
                            } catch (JSONException e10) {
                                throw new o5.p("An error occurred while publishing install.", e10);
                            }
                        } catch (Exception unused) {
                            d6.m0 m0Var = d6.m0.f12709a;
                            return;
                        }
                    }
                    return;
                } catch (Throwable th4) {
                    i6.a.a(vVar2, th4);
                    return;
                }
            case 12:
                p5.a aVar6 = (p5.a) this.f26131b;
                p5.t tVar = (p5.t) this.f26132c;
                String str3 = p5.i.f23913a;
                if (!i6.a.b(p5.i.class)) {
                    try {
                        gm.l.f(aVar6, "$accessTokenAppId");
                        gm.l.f(tVar, "$appEvents");
                        p5.j.a(aVar6, tVar);
                        return;
                    } catch (Throwable th5) {
                        i6.a.a(p5.i.class, th5);
                        return;
                    }
                }
                return;
            case 13:
                s5.g gVar2 = (s5.g) this.f26131b;
                TimerTask timerTask = (TimerTask) this.f26132c;
                String str4 = s5.g.f26608e;
                if (!i6.a.b(s5.g.class)) {
                    try {
                        gm.l.f(gVar2, "this$0");
                        gm.l.f(timerTask, "$indexingTask");
                        try {
                            Timer timer = gVar2.f26611c;
                            if (timer != null) {
                                timer.cancel();
                            }
                            gVar2.f26612d = null;
                            Timer timer2 = new Timer();
                            timer2.scheduleAtFixedRate(timerTask, 0L, 1000L);
                            gVar2.f26611c = timer2;
                            return;
                        } catch (Exception e11) {
                            Log.e(s5.g.f26608e, "Error scheduling indexing job", e11);
                            return;
                        }
                    } catch (Throwable th6) {
                        i6.a.a(s5.g.class, th6);
                        return;
                    }
                }
                return;
        }
    }
}
