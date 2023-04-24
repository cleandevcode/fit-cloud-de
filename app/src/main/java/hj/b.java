package hj;

import android.app.Application;
import android.content.Context;
import dj.b;
import kc.c0;
import kc.o0;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a */
    public final xi.a f16117a;

    /* renamed from: b */
    public final o0 f16118b;

    /* renamed from: c */
    public final tl.i f16119c;

    /* renamed from: d */
    public final tl.i f16120d;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        public final Application f16121a;

        /* renamed from: b */
        public boolean f16122b;

        /* renamed from: c */
        public jj.a f16123c;

        public a(Application application) {
            this.f16121a = application;
        }
    }

    /* renamed from: hj.b$b */
    /* loaded from: classes2.dex */
    public static final class C0284b extends gm.m implements fm.a<hj.a> {

        /* renamed from: c */
        public final /* synthetic */ a f16125c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0284b(a aVar) {
            super(0);
            b.this = r1;
            this.f16125c = aVar;
        }

        @Override // fm.a
        public final hj.a m() {
            xi.a aVar = b.this.f16117a;
            a aVar2 = this.f16125c;
            return new p(aVar, aVar2.f16123c, aVar2.f16122b);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends gm.m implements fm.a<dj.b> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c() {
            super(0);
            b.this = r1;
        }

        @Override // fm.a
        public final dj.b m() {
            xi.a aVar = b.this.f16117a;
            b.C0226b c0226b = new b.C0226b(aVar.f30586b, (vi.d) aVar.f30587c.getValue(), aVar.a(), (vi.c) aVar.f30590f.getValue());
            c0226b.f13098e = new hj.c();
            c0226b.f13099f = new d();
            return new dj.f(c0226b);
        }
    }

    public b(a aVar) {
        Application application = aVar.f16121a;
        Context applicationContext = application.getApplicationContext();
        applicationContext.getClass();
        o0 o0Var = new c0(applicationContext).E.get();
        gm.l.e(o0Var, "builder.rxBleClient ?: R…eate(builder.application)");
        xi.a aVar2 = new xi.a(application, o0Var);
        this.f16117a = aVar2;
        this.f16118b = aVar2.f30586b;
        this.f16119c = new tl.i(new c());
        this.f16120d = new tl.i(new C0284b(aVar));
    }

    public final hj.a a() {
        return (hj.a) this.f16120d.getValue();
    }
}
