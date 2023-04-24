package vm;

import fm.p;
import gm.f;
import gm.m;
import java.util.concurrent.atomic.AtomicReference;
import mf.a0;
import rm.r;
import rm.t;
import tk.n;
import tl.l;
import zl.e;
import zl.i;

@e(c = "kotlinx.coroutines.rx3.RxConvertKt$asFlow$1", f = "RxConvert.kt", l = {95}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class d extends i implements p<t<Object>, xl.d<? super l>, Object> {

    /* renamed from: e */
    public int f29474e;

    /* renamed from: f */
    public /* synthetic */ Object f29475f;

    /* renamed from: g */
    public final /* synthetic */ tk.l<Object> f29476g;

    /* loaded from: classes2.dex */
    public static final class a extends m implements fm.a<l> {

        /* renamed from: b */
        public final /* synthetic */ AtomicReference<uk.c> f29477b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AtomicReference<uk.c> atomicReference) {
            super(0);
            this.f29477b = atomicReference;
        }

        @Override // fm.a
        public final l m() {
            uk.c andSet = this.f29477b.getAndSet(xk.c.INSTANCE);
            if (andSet != null) {
                andSet.c();
            }
            return l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements n<Object> {

        /* renamed from: a */
        public final /* synthetic */ t<Object> f29478a;

        /* renamed from: b */
        public final /* synthetic */ AtomicReference<uk.c> f29479b;

        public b(t<Object> tVar, AtomicReference<uk.c> atomicReference) {
            this.f29478a = tVar;
            this.f29479b = atomicReference;
        }

        @Override // tk.n
        public final void a(uk.c cVar) {
            boolean z10;
            AtomicReference<uk.c> atomicReference = this.f29479b;
            while (true) {
                if (!atomicReference.compareAndSet(null, cVar)) {
                    if (atomicReference.get() != null) {
                        z10 = false;
                        break;
                    }
                } else {
                    z10 = true;
                    break;
                }
            }
            if (z10) {
                return;
            }
            cVar.c();
        }

        @Override // tk.n
        public final void b(Object obj) {
            try {
                f.h(this.f29478a, obj);
            } catch (InterruptedException unused) {
            }
        }

        @Override // tk.n
        public final void onComplete() {
            this.f29478a.o(null);
        }

        @Override // tk.n
        public final void onError(Throwable th2) {
            this.f29478a.o(th2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(tk.l<Object> lVar, xl.d<? super d> dVar) {
        super(2, dVar);
        this.f29476g = lVar;
    }

    @Override // fm.p
    public final Object A(t<Object> tVar, xl.d<? super l> dVar) {
        return ((d) p(tVar, dVar)).t(l.f28297a);
    }

    @Override // zl.a
    public final xl.d<l> p(Object obj, xl.d<?> dVar) {
        d dVar2 = new d(this.f29476g, dVar);
        dVar2.f29475f = obj;
        return dVar2;
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f29474e;
        if (i10 == 0) {
            a0.k(obj);
            t tVar = (t) this.f29475f;
            AtomicReference atomicReference = new AtomicReference();
            this.f29476g.d(new b(tVar, atomicReference));
            a aVar2 = new a(atomicReference);
            this.f29474e = 1;
            if (r.a(tVar, aVar2, this) == aVar) {
                return aVar;
            }
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            a0.k(obj);
        }
        return l.f28297a;
    }
}
