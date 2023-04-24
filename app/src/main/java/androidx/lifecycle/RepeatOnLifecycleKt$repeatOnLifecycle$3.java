package androidx.lifecycle;

import androidx.lifecycle.k;
import bi.z0;
import pm.p1;

@zl.e(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", f = "RepeatOnLifecycle.kt", l = {84}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class RepeatOnLifecycleKt$repeatOnLifecycle$3 extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f2657e;

    /* renamed from: f */
    public /* synthetic */ Object f2658f;

    /* renamed from: g */
    public final /* synthetic */ k f2659g;

    /* renamed from: h */
    public final /* synthetic */ k.c f2660h;

    /* renamed from: i */
    public final /* synthetic */ fm.p<pm.e0, xl.d<? super tl.l>, Object> f2661i;

    @zl.e(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", f = "RepeatOnLifecycle.kt", l = {166}, m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public gm.a0 f2662e;

        /* renamed from: f */
        public gm.a0 f2663f;

        /* renamed from: g */
        public pm.e0 f2664g;

        /* renamed from: h */
        public fm.p f2665h;

        /* renamed from: i */
        public int f2666i;

        /* renamed from: j */
        public final /* synthetic */ k f2667j;

        /* renamed from: k */
        public final /* synthetic */ k.c f2668k;

        /* renamed from: l */
        public final /* synthetic */ pm.e0 f2669l;

        /* renamed from: m */
        public final /* synthetic */ fm.p<pm.e0, xl.d<? super tl.l>, Object> f2670m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(k kVar, k.c cVar, pm.e0 e0Var, fm.p<? super pm.e0, ? super xl.d<? super tl.l>, ? extends Object> pVar, xl.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.f2667j = kVar;
            this.f2668k = cVar;
            this.f2669l = e0Var;
            this.f2670m = pVar;
        }

        @Override // fm.p
        public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((AnonymousClass1) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new AnonymousClass1(this.f2667j, this.f2668k, this.f2669l, this.f2670m, dVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:107:0x00bd  */
        /* JADX WARN: Removed duplicated region for block: B:110:0x00c7  */
        /* JADX WARN: Type inference failed for: r12v0, types: [androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1, T, androidx.lifecycle.t] */
        @Override // zl.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object t(java.lang.Object r14) {
            /*
                Method dump skipped, instructions count: 205
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3.AnonymousClass1.t(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RepeatOnLifecycleKt$repeatOnLifecycle$3(k kVar, k.c cVar, fm.p<? super pm.e0, ? super xl.d<? super tl.l>, ? extends Object> pVar, xl.d<? super RepeatOnLifecycleKt$repeatOnLifecycle$3> dVar) {
        super(2, dVar);
        this.f2659g = kVar;
        this.f2660h = cVar;
        this.f2661i = pVar;
    }

    @Override // fm.p
    public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((RepeatOnLifecycleKt$repeatOnLifecycle$3) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        RepeatOnLifecycleKt$repeatOnLifecycle$3 repeatOnLifecycleKt$repeatOnLifecycle$3 = new RepeatOnLifecycleKt$repeatOnLifecycle$3(this.f2659g, this.f2660h, this.f2661i, dVar);
        repeatOnLifecycleKt$repeatOnLifecycle$3.f2658f = obj;
        return repeatOnLifecycleKt$repeatOnLifecycle$3;
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f2657e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            pm.e0 e0Var = (pm.e0) this.f2658f;
            wm.c cVar = pm.o0.f24381a;
            p1 q02 = um.q.f28935a.q0();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f2659g, this.f2660h, e0Var, this.f2661i, null);
            this.f2657e = 1;
            if (z0.s(this, q02, anonymousClass1) == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
