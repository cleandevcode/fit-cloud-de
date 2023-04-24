package androidx.work;

import android.content.Context;
import androidx.work.ListenableWorker;
import bi.m0;
import bi.r;
import bi.z0;
import f3.g;
import fm.p;
import kotlin.Metadata;
import mf.a0;
import pm.e0;
import pm.j1;
import pm.o0;
import q3.a;
import tl.l;
import um.f;
import xl.d;
import xl.f;
import zl.e;
import zl.i;

@Metadata
/* loaded from: classes.dex */
public abstract class CoroutineWorker extends ListenableWorker {

    /* renamed from: f */
    public final j1 f3610f;

    /* renamed from: g */
    public final q3.c<ListenableWorker.a> f3611g;

    /* renamed from: h */
    public final wm.c f3612h;

    /* loaded from: classes.dex */
    public static final class a implements Runnable {
        public a() {
            CoroutineWorker.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (CoroutineWorker.this.f3611g.f24518a instanceof a.b) {
                CoroutineWorker.this.f3610f.h(null);
            }
        }
    }

    @e(c = "androidx.work.CoroutineWorker$getForegroundInfoAsync$1", f = "CoroutineWorker.kt", l = {134}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends i implements p<e0, d<? super l>, Object> {

        /* renamed from: e */
        public f3.l f3614e;

        /* renamed from: f */
        public int f3615f;

        /* renamed from: g */
        public final /* synthetic */ f3.l<g> f3616g;

        /* renamed from: h */
        public final /* synthetic */ CoroutineWorker f3617h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(f3.l<g> lVar, CoroutineWorker coroutineWorker, d<? super b> dVar) {
            super(2, dVar);
            this.f3616g = lVar;
            this.f3617h = coroutineWorker;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, d<? super l> dVar) {
            return ((b) p(e0Var, dVar)).t(l.f28297a);
        }

        @Override // zl.a
        public final d<l> p(Object obj, d<?> dVar) {
            return new b(this.f3616g, this.f3617h, dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            int i10 = this.f3615f;
            if (i10 != 0) {
                if (i10 == 1) {
                    f3.l lVar = this.f3614e;
                    a0.k(obj);
                    lVar.f14092b.i(obj);
                    return l.f28297a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.k(obj);
            f3.l<g> lVar2 = this.f3616g;
            CoroutineWorker coroutineWorker = this.f3617h;
            this.f3614e = lVar2;
            this.f3615f = 1;
            coroutineWorker.getClass();
            throw new IllegalStateException("Not implemented");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        gm.l.f(context, "appContext");
        gm.l.f(workerParameters, "params");
        this.f3610f = m0.b();
        q3.c<ListenableWorker.a> cVar = new q3.c<>();
        this.f3611g = cVar;
        cVar.a(new a(), ((r3.b) this.f3619b.f3632f).f25195a);
        this.f3612h = o0.f24381a;
    }

    @Override // androidx.work.ListenableWorker
    public final na.a<g> a() {
        j1 b10 = m0.b();
        wm.c cVar = this.f3612h;
        cVar.getClass();
        f b11 = r.b(f.a.a(cVar, b10));
        f3.l lVar = new f3.l(b10);
        z0.g(b11, null, 0, new b(lVar, this, null), 3);
        return lVar;
    }

    @Override // androidx.work.ListenableWorker
    public final void c() {
        this.f3611g.cancel(false);
    }

    @Override // androidx.work.ListenableWorker
    public final q3.c d() {
        z0.g(r.b(this.f3612h.s(this.f3610f)), null, 0, new f3.e(this, null), 3);
        return this.f3611g;
    }

    public abstract Object h(d<? super ListenableWorker.a> dVar);
}
