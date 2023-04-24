package y3;

import java.lang.reflect.Field;
import java.util.Iterator;
import y3.b0;
import y3.w0;

/* loaded from: classes.dex */
public abstract class u<S extends b0> {

    /* renamed from: a */
    public final l2.k0 f31076a;

    /* renamed from: b */
    public final pm.e0 f31077b;

    /* renamed from: c */
    public final d0<S> f31078c;

    /* renamed from: d */
    public final w0<S> f31079d;

    @zl.e(c = "com.airbnb.mvrx.MavericksRepository$1", f = "MavericksRepository.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public final /* synthetic */ u<S> f31080e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(u<S> uVar, xl.d<? super a> dVar) {
            super(2, dVar);
            this.f31080e = uVar;
        }

        @Override // fm.p
        public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((a) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new a(this.f31080e, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:195:0x00b7  */
        /* JADX WARN: Removed duplicated region for block: B:267:0x0221  */
        /* JADX WARN: Removed duplicated region for block: B:291:0x01ff A[SYNTHETIC] */
        @Override // zl.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object t(java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 572
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: y3.u.a.t(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends gm.m implements fm.l<S, S> {

        /* renamed from: b */
        public final /* synthetic */ fm.l<S, S> f31081b;

        /* renamed from: c */
        public final /* synthetic */ u<S> f31082c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(fm.l<? super S, ? extends S> lVar, u<S> uVar) {
            super(1);
            this.f31081b = lVar;
            this.f31082c = uVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // fm.l
        public final Object k(Object obj) {
            boolean z10;
            nm.g hVar;
            Object obj2;
            boolean z11;
            b0 b0Var = (b0) obj;
            gm.l.f(b0Var, "$this$set");
            b0 b0Var2 = (b0) this.f31081b.k(b0Var);
            b0 b0Var3 = (b0) this.f31081b.k(b0Var);
            boolean z12 = false;
            if (!gm.l.a(b0Var2, b0Var3)) {
                Field[] declaredFields = b0Var2.getClass().getDeclaredFields();
                gm.l.e(declaredFields, "firstState::class.java.declaredFields");
                if (declaredFields.length == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    hVar = nm.d.f22475a;
                } else {
                    hVar = new ul.h(declaredFields);
                }
                Iterator it = hVar.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        ((Field) obj2).setAccessible(true);
                        tl.l lVar = tl.l.f28297a;
                        Field field = (Field) obj2;
                        try {
                            z11 = !gm.l.a(field.get(b0Var2), field.get(b0Var3));
                            continue;
                        } catch (Throwable unused) {
                            z11 = false;
                            continue;
                        }
                        if (z11) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                Field field2 = (Field) obj2;
                StringBuilder a10 = android.support.v4.media.d.a("Impure reducer set on ");
                a10.append(this.f31082c.getClass().getSimpleName());
                if (field2 != null) {
                    a10.append("! ");
                    a10.append(field2.getName());
                    a10.append(" changed from ");
                    a10.append(field2.get(b0Var2));
                    a10.append(" to ");
                    a10.append(field2.get(b0Var3));
                    a10.append(". Ensure that your state properties properly implement hashCode.");
                    throw new IllegalArgumentException(a10.toString());
                }
                a10.append("! Differing states were provided by the same reducer.Ensure that your state properties properly implement hashCode. First state: ");
                a10.append(b0Var2);
                a10.append(" -> Second state: ");
                a10.append(b0Var3);
                throw new IllegalArgumentException(a10.toString());
            }
            w0<S> w0Var = this.f31082c.f31079d;
            if (w0Var != null) {
                gm.l.f(b0Var2, "newState");
                w0.a<S> aVar = w0Var.f31088b;
                if (aVar.f31090b == aVar.hashCode()) {
                    z12 = true;
                }
                if (z12) {
                    w0Var.f31088b = new w0.a<>(b0Var2);
                } else {
                    throw new IllegalArgumentException((aVar.f31089a.getClass().getSimpleName() + " was mutated. State classes should be immutable.").toString());
                }
            }
            return b0Var2;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends gm.m implements fm.a<String> {

        /* renamed from: b */
        public final /* synthetic */ u<S> f31083b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(u<S> uVar) {
            super(0);
            this.f31083b = uVar;
        }

        @Override // fm.a
        public final String m() {
            return this.f31083b.getClass().getSimpleName();
        }
    }

    public u(l2.k0 k0Var) {
        w0<S> w0Var;
        this.f31076a = k0Var;
        pm.e0 e0Var = (pm.e0) k0Var.f19044d;
        this.f31077b = e0Var;
        Object obj = k0Var.f19043c;
        this.f31078c = (d0) obj;
        new tl.i(new c(this));
        if (k0Var.f19041a) {
            w0Var = new w0<>(((d0) obj).d());
        } else {
            w0Var = null;
        }
        this.f31079d = w0Var;
        if (k0Var.f19041a) {
            bi.z0.g(e0Var, pm.o0.f24381a, 0, new a(this, null), 2);
        }
    }

    public final void a(fm.l<? super S, ? extends S> lVar) {
        if (this.f31076a.f19041a) {
            this.f31078c.c(new b(lVar, this));
        } else {
            this.f31078c.c(lVar);
        }
    }

    public final String toString() {
        return getClass().getSimpleName() + ' ' + this.f31078c.d();
    }
}
