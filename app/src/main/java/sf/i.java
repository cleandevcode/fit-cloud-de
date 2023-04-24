package sf;

import android.content.Context;
import androidx.lifecycle.f0;
import androidx.lifecycle.u;
import bi.z0;
import com.topstep.fitcloud.pro.function.NLSWorker;
import f3.c;
import f3.r;
import java.util.concurrent.TimeUnit;
import og.j1;
import og.x0;
import pm.e0;
import sf.i;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a */
    public final Context f26931a;

    /* renamed from: b */
    public final e0 f26932b;

    /* renamed from: c */
    public final og.t f26933c;

    /* renamed from: d */
    public final dk.a<n> f26934d;

    /* renamed from: e */
    public final dk.a<j1> f26935e;

    /* renamed from: f */
    public final ug.b f26936f;

    /* renamed from: g */
    public final ah.a f26937g;

    /* renamed from: h */
    public boolean f26938h;

    /* renamed from: i */
    public final v f26939i;

    public i(Context context, e0 e0Var, og.t tVar, dk.a aVar, dk.a aVar2, ug.c cVar, ah.e eVar) {
        gm.l.f(e0Var, "applicationScope");
        gm.l.f(tVar, "deviceManager");
        gm.l.f(aVar, "findPhoneManager");
        gm.l.f(aVar2, "notificationRepository");
        this.f26931a = context;
        this.f26932b = e0Var;
        this.f26933c = tVar;
        this.f26934d = aVar;
        this.f26935e = aVar2;
        this.f26936f = cVar;
        this.f26937g = eVar;
        this.f26939i = new v(context, of.o.a(context).a(), new e(this));
        z0.g(e0Var, null, 0, new a(this, null), 3);
        z0.g(e0Var, null, 0, new b(this, null), 3);
        z0.g(e0Var, null, 0, new c(this, null), 3);
        z0.g(e0Var, null, 0, new d(this, null), 3);
        f0.f2713i.f2719f.a(new androidx.lifecycle.g() { // from class: com.topstep.fitcloud.pro.function.CoreMonitor$5
            @Override // androidx.lifecycle.g
            public final /* synthetic */ void c(u uVar) {
            }

            @Override // androidx.lifecycle.g
            public final /* synthetic */ void onDestroy(u uVar) {
            }

            @Override // androidx.lifecycle.g
            public final /* synthetic */ void onPause(u uVar) {
            }

            @Override // androidx.lifecycle.g
            public final /* synthetic */ void onResume(u uVar) {
            }

            @Override // androidx.lifecycle.g
            public final void onStart(u uVar) {
                i.this.f26939i.a();
                i iVar = i.this;
                if (iVar.f26938h) {
                    iVar.f26936f.d();
                }
                if (x0.b(i.this.f26933c)) {
                    i.this.f26933c.r(false);
                }
            }

            @Override // androidx.lifecycle.g
            public final void onStop(u uVar) {
            }
        });
        f3.c cVar2 = new f3.c(new c.a());
        TimeUnit timeUnit = TimeUnit.MINUTES;
        r.a aVar3 = (r.a) new r.a(NLSWorker.class, 15L, timeUnit).e(60L, TimeUnit.SECONDS).d(2, 3L, timeUnit);
        aVar3.f14117c.f22634j = cVar2;
        g3.l.d(context).b("NLSWorker", aVar3.a());
    }
}
