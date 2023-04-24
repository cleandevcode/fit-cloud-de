package sf;

import android.content.Context;
import com.topstep.fitcloud.pro.shared.data.work.WeatherWorker;
import f3.c;
import f3.r;
import java.util.concurrent.TimeUnit;
import mf.a0;
import p000do.a;
import pm.e0;

@zl.e(c = "com.topstep.fitcloud.pro.function.CoreMonitor$2", f = "CoreMonitor.kt", l = {83}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class b extends zl.i implements fm.p<e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f26911e;

    /* renamed from: f */
    public final /* synthetic */ i f26912f;

    /* loaded from: classes2.dex */
    public static final class a<T> implements sm.g {

        /* renamed from: a */
        public final /* synthetic */ i f26913a;

        public a(i iVar) {
            this.f26913a = iVar;
        }

        @Override // sm.g
        public final Object n(Object obj, xl.d dVar) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            a.b bVar = p000do.a.f13275a;
            bVar.t("CoreMonitor");
            bVar.h("flowWeatherRequire:%b", Boolean.valueOf(booleanValue));
            i iVar = this.f26913a;
            iVar.f26938h = booleanValue;
            if (booleanValue) {
                Context context = iVar.f26931a;
                gm.l.f(context, "context");
                bVar.t("Weather");
                bVar.h("executePeriodic", new Object[0]);
                c.a aVar = new c.a();
                aVar.f14074a = f3.n.CONNECTED;
                f3.c cVar = new f3.c(aVar);
                TimeUnit timeUnit = TimeUnit.MINUTES;
                r.a aVar2 = new r.a(WeatherWorker.class, 15L, timeUnit);
                aVar2.f14118d.add("WeatherPeriodic");
                r.a aVar3 = (r.a) aVar2.e(120L, TimeUnit.SECONDS).d(2, 2L, timeUnit);
                aVar3.f14117c.f22634j = cVar;
                g3.l.d(context).b("WeatherPeriodic", aVar3.a());
                WeatherWorker.a.a(this.f26913a.f26931a);
            } else {
                Context context2 = iVar.f26931a;
                gm.l.f(context2, "context");
                g3.l d10 = g3.l.d(context2);
                d10.getClass();
                ((r3.b) d10.f14896d).a(new p3.b(d10, "WeatherPeriodic", true));
                g3.l d11 = g3.l.d(context2);
                d11.getClass();
                ((r3.b) d11.f14896d).a(new p3.b(d11, "WeatherOnce", true));
            }
            return tl.l.f28297a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(i iVar, xl.d<? super b> dVar) {
        super(2, dVar);
        this.f26912f = iVar;
    }

    @Override // fm.p
    public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((b) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new b(this.f26912f, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f26911e;
        if (i10 != 0) {
            if (i10 == 1) {
                a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            a0.k(obj);
            tm.j k10 = this.f26912f.f26933c.k();
            a aVar2 = new a(this.f26912f);
            this.f26911e = 1;
            if (k10.a(aVar2, this) == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
