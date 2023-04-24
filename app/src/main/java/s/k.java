package s;

import aj.a;
import android.content.Context;
import android.hardware.camera2.CameraCaptureSession;
import android.os.Bundle;
import android.view.Surface;
import com.topstep.fitcloud.pro.ui.sport.SportingActivity;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import n6.p;
import org.json.JSONObject;
import s.r;
import t.g;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f26005a;

    /* renamed from: b */
    public final /* synthetic */ Object f26006b;

    /* renamed from: c */
    public final /* synthetic */ Object f26007c;

    /* renamed from: d */
    public final /* synthetic */ Object f26008d;

    public /* synthetic */ k(Object obj, Object obj2, Object obj3, int i10) {
        this.f26005a = i10;
        this.f26006b = obj;
        this.f26007c = obj2;
        this.f26008d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f26005a) {
            case 0:
                a0.j jVar = (a0.j) this.f26008d;
                r.a aVar = ((r) this.f26006b).f26159x;
                aVar.f26160a.add(jVar);
                aVar.f26161b.put(jVar, (Executor) this.f26007c);
                return;
            case 1:
                t.b.a(((g.c) this.f26006b).f27415a, (CameraCaptureSession) this.f26007c, (Surface) this.f26008d);
                return;
            case 2:
                String str = (String) this.f26006b;
                Context context = (Context) this.f26007c;
                String str2 = (String) this.f26008d;
                d6.u uVar = d6.u.f12789a;
                gm.l.f(str, "$applicationId");
                gm.l.f(context, "$context");
                gm.l.f(str2, "$gateKeepersKey");
                d6.u.f12789a.getClass();
                JSONObject a10 = d6.u.a();
                if (a10.length() != 0) {
                    d6.u.d(str, a10);
                    context.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(str2, a10.toString()).apply();
                    d6.u.f12793e = Long.valueOf(System.currentTimeMillis());
                }
                d6.u.e();
                d6.u.f12790b.set(false);
                return;
            case 3:
                n6.b bVar = (n6.b) this.f26006b;
                p.d dVar = (p.d) this.f26007c;
                Bundle bundle = (Bundle) this.f26008d;
                gm.l.f(bVar, "this$0");
                gm.l.f(dVar, "$request");
                gm.l.f(bundle, "$values");
                try {
                    bVar.j(bundle, dVar);
                    bVar.r(dVar, bundle, null);
                    return;
                } catch (o5.p e10) {
                    bVar.r(dVar, null, e10);
                    return;
                }
            case 4:
                n6.z zVar = (n6.z) this.f26006b;
                p.d dVar2 = (p.d) this.f26007c;
                Bundle bundle2 = (Bundle) this.f26008d;
                gm.l.f(zVar, "this$0");
                gm.l.f(dVar2, "$request");
                gm.l.f(bundle2, "$extras");
                try {
                    zVar.j(bundle2, dVar2);
                    zVar.s(bundle2, dVar2);
                    return;
                } catch (o5.x e11) {
                    o5.s sVar = e11.f22857b;
                    zVar.r(dVar2, sVar.f22825d, sVar.a(), String.valueOf(sVar.f22823b));
                    return;
                } catch (o5.p e12) {
                    zVar.r(dVar2, null, e12.getMessage(), null);
                    return;
                }
            case 5:
                SportingActivity sportingActivity = (SportingActivity) this.f26006b;
                y6.f fVar = (y6.f) this.f26007c;
                y6.e eVar = (y6.e) this.f26008d;
                int i10 = com.topstep.fitcloud.pro.ui.sport.a.f12194c;
                gm.l.f(sportingActivity, "this$0");
                gm.l.f(fVar, "$latLng");
                gm.l.f(eVar, "$basic");
                z6.g gVar = sportingActivity.F;
                if (gVar != null) {
                    z6.f fVar2 = gVar.f32007b;
                    fVar2.f32001i.add(fVar);
                    fVar2.d();
                }
                SportingActivity.N(sportingActivity, eVar);
                return;
            default:
                aj.a aVar2 = (aj.a) this.f26006b;
                ej.b bVar2 = (ej.b) this.f26007c;
                tk.o oVar = (tk.o) this.f26008d;
                AtomicLong atomicLong = aj.a.f589d;
                gm.l.f(aVar2, "this$0");
                gm.l.f(bVar2, "$semaphore");
                gm.l.f(oVar, "$subscribeScheduler");
                aVar2.f590a.b(bVar2).F(oVar).d(new a.C0012a(aVar2));
                return;
        }
    }
}
