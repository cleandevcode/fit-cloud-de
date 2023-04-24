package ch;

import com.topstep.fitcloud.pro.shared.data.work.CloudSyncWorker;
import f3.c;
import f3.r;
import fm.p;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import mf.a0;
import p000do.a;
import pm.e0;
import sm.f1;
import sm.g;
import tl.l;
import zl.i;

@zl.e(c = "com.topstep.fitcloud.pro.shared.data.work.WorkRepositoryImpl$1", f = "WorkRepository.kt", l = {27}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class e extends i implements p<e0, xl.d<? super l>, Object> {

    /* renamed from: e */
    public int f4699e;

    /* renamed from: f */
    public final /* synthetic */ f f4700f;

    /* loaded from: classes2.dex */
    public static final class a<T> implements g {

        /* renamed from: a */
        public final /* synthetic */ f f4701a;

        public a(f fVar) {
            this.f4701a = fVar;
        }

        @Override // sm.g
        public final Object n(Object obj, xl.d dVar) {
            Long l10 = (Long) obj;
            if (l10 != null && !hh.b.f(l10.longValue())) {
                f fVar = this.f4701a;
                long longValue = l10.longValue();
                fVar.getClass();
                a.b bVar = p000do.a.f13275a;
                bVar.t("WorkRepository");
                bVar.h("executeDataSyncWorker:%d", Long.valueOf(longValue));
                c.a aVar = new c.a();
                r.a aVar2 = new r.a(CloudSyncWorker.class, 12L, TimeUnit.HOURS);
                aVar2.f14117c.f22634j = new f3.c(aVar);
                r.a e10 = aVar2.e(30L, TimeUnit.SECONDS);
                HashMap hashMap = new HashMap();
                hashMap.put("userId", Long.valueOf(longValue));
                androidx.work.b bVar2 = new androidx.work.b(hashMap);
                androidx.work.b.b(bVar2);
                e10.f14117c.f22629e = bVar2;
                r a10 = e10.a();
                gm.l.e(a10, "PeriodicWorkRequestBuild…d())\n            .build()");
                g3.l.d(fVar.f4702a).b("CloudSyncWorker", a10);
            } else {
                f fVar2 = this.f4701a;
                fVar2.getClass();
                a.b bVar3 = p000do.a.f13275a;
                bVar3.t("WorkRepository");
                bVar3.h("cancelDataSyncWorker", new Object[0]);
                g3.l d10 = g3.l.d(fVar2.f4702a);
                d10.getClass();
                ((r3.b) d10.f14896d).a(new p3.b(d10, "CloudSyncWorker", true));
            }
            return l.f28297a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, xl.d<? super e> dVar) {
        super(2, dVar);
        this.f4700f = fVar;
    }

    @Override // fm.p
    public final Object A(e0 e0Var, xl.d<? super l> dVar) {
        ((e) p(e0Var, dVar)).t(l.f28297a);
        return yl.a.COROUTINE_SUSPENDED;
    }

    @Override // zl.a
    public final xl.d<l> p(Object obj, xl.d<?> dVar) {
        return new e(this.f4700f, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f4699e;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.k(obj);
        } else {
            a0.k(obj);
            f1<Long> h10 = this.f4700f.f4704c.h();
            a aVar2 = new a(this.f4700f);
            this.f4699e = 1;
            if (h10.a(aVar2, this) == aVar) {
                return aVar;
            }
        }
        throw new u2.b();
    }
}
