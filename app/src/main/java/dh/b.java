package dh;

import fm.p;
import mf.a0;
import pm.b0;
import pm.e0;
import tl.l;
import xl.d;
import zl.c;
import zl.e;
import zl.i;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: P
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* loaded from: classes2.dex */
public abstract class b<P, R> {

    /* renamed from: a */
    public final b0 f13032a;

    @e(c = "com.topstep.fitcloud.pro.shared.domain.UseCase", f = "UseCase.kt", l = {23}, m = "invoke")
    /* loaded from: classes2.dex */
    public static final class a extends c {

        /* renamed from: d */
        public b f13033d;

        /* renamed from: e */
        public /* synthetic */ Object f13034e;

        /* renamed from: f */
        public final /* synthetic */ b<P, R> f13035f;

        /* renamed from: g */
        public int f13036g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(b<? super P, R> bVar, d<? super a> dVar) {
            super(dVar);
            this.f13035f = bVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f13034e = obj;
            this.f13036g |= Integer.MIN_VALUE;
            return this.f13035f.b(null, this);
        }
    }

    @e(c = "com.topstep.fitcloud.pro.shared.domain.UseCase$invoke$2", f = "UseCase.kt", l = {24}, m = "invokeSuspend")
    /* renamed from: dh.b$b */
    /* loaded from: classes2.dex */
    public static final class C0222b extends i implements p<e0, d<? super R>, Object> {

        /* renamed from: e */
        public int f13037e;

        /* renamed from: f */
        public final /* synthetic */ b<P, R> f13038f;

        /* renamed from: g */
        public final /* synthetic */ P f13039g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0222b(b<? super P, R> bVar, P p10, d<? super C0222b> dVar) {
            super(2, dVar);
            this.f13038f = bVar;
            this.f13039g = p10;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, Object obj) {
            return ((C0222b) p(e0Var, (d) obj)).t(l.f28297a);
        }

        @Override // zl.a
        public final d<l> p(Object obj, d<?> dVar) {
            return new C0222b(this.f13038f, this.f13039g, dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f13037e;
            if (i10 == 0) {
                a0.k(obj);
                b<P, R> bVar = this.f13038f;
                P p10 = this.f13039g;
                this.f13037e = 1;
                obj = bVar.a(p10, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                a0.k(obj);
            }
            return obj;
        }
    }

    public b(b0 b0Var) {
        gm.l.f(b0Var, "coroutineDispatcher");
        this.f13032a = b0Var;
    }

    public abstract Object a(P p10, d<? super R> dVar);

    /* JADX WARN: Removed duplicated region for block: B:41:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(P r6, xl.d<? super R> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof dh.b.a
            if (r0 == 0) goto L13
            r0 = r7
            dh.b$a r0 = (dh.b.a) r0
            int r1 = r0.f13036g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13036g = r1
            goto L18
        L13:
            dh.b$a r0 = new dh.b$a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f13034e
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f13036g
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            dh.b r6 = r0.f13033d
            mf.a0.k(r7)     // Catch: java.lang.Exception -> L29
            goto L49
        L29:
            r7 = move-exception
            goto L4d
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            mf.a0.k(r7)
            pm.b0 r7 = r5.f13032a     // Catch: java.lang.Exception -> L4a
            dh.b$b r2 = new dh.b$b     // Catch: java.lang.Exception -> L4a
            r4 = 0
            r2.<init>(r5, r6, r4)     // Catch: java.lang.Exception -> L4a
            r0.f13033d = r5     // Catch: java.lang.Exception -> L4a
            r0.f13036g = r3     // Catch: java.lang.Exception -> L4a
            java.lang.Object r7 = bi.z0.s(r0, r7, r2)     // Catch: java.lang.Exception -> L4a
            if (r7 != r1) goto L49
            return r1
        L49:
            return r7
        L4a:
            r6 = move-exception
            r7 = r6
            r6 = r5
        L4d:
            do.a$b r0 = p000do.a.f13275a
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getSimpleName()
            r0.t(r6)
            r0.a(r7)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: dh.b.b(java.lang.Object, xl.d):java.lang.Object");
    }
}
