package ao;

import ao.f;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* loaded from: classes2.dex */
public final class a extends f.a {

    /* renamed from: a */
    public boolean f3748a = true;

    /* renamed from: ao.a$a */
    /* loaded from: classes2.dex */
    public static final class C0041a implements ao.f<zm.c0, zm.c0> {

        /* renamed from: a */
        public static final C0041a f3749a = new C0041a();

        @Override // ao.f
        public final zm.c0 a(zm.c0 c0Var) {
            zm.c0 c0Var2 = c0Var;
            try {
                return h0.a(c0Var2);
            } finally {
                c0Var2.close();
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements ao.f<zm.z, zm.z> {

        /* renamed from: a */
        public static final b f3750a = new b();

        @Override // ao.f
        public final zm.z a(zm.z zVar) {
            return zVar;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements ao.f<zm.c0, zm.c0> {

        /* renamed from: a */
        public static final c f3751a = new c();

        @Override // ao.f
        public final zm.c0 a(zm.c0 c0Var) {
            return c0Var;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d implements ao.f<Object, String> {

        /* renamed from: a */
        public static final d f3752a = new d();

        @Override // ao.f
        public final String a(Object obj) {
            return obj.toString();
        }
    }

    /* loaded from: classes2.dex */
    public static final class e implements ao.f<zm.c0, tl.l> {

        /* renamed from: a */
        public static final e f3753a = new e();

        @Override // ao.f
        public final tl.l a(zm.c0 c0Var) {
            c0Var.close();
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f implements ao.f<zm.c0, Void> {

        /* renamed from: a */
        public static final f f3754a = new f();

        @Override // ao.f
        public final Void a(zm.c0 c0Var) {
            c0Var.close();
            return null;
        }
    }

    @Override // ao.f.a
    public final ao.f a(Type type, Annotation[] annotationArr) {
        if (zm.z.class.isAssignableFrom(h0.f(type))) {
            return b.f3750a;
        }
        return null;
    }

    @Override // ao.f.a
    public final ao.f<zm.c0, ?> b(Type type, Annotation[] annotationArr, d0 d0Var) {
        if (type == zm.c0.class) {
            return h0.i(annotationArr, co.w.class) ? c.f3751a : C0041a.f3749a;
        } else if (type == Void.class) {
            return f.f3754a;
        } else {
            if (this.f3748a && type == tl.l.class) {
                try {
                    return e.f3753a;
                } catch (NoClassDefFoundError unused) {
                    this.f3748a = false;
                    return null;
                }
            }
            return null;
        }
    }
}
