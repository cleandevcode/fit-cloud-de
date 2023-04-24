package xi;

import android.app.Application;
import gm.l;
import gm.m;
import kc.o0;
import p000do.a;
import tl.i;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a */
    public final Application f30585a;

    /* renamed from: b */
    public final o0 f30586b;

    /* renamed from: c */
    public final i f30587c;

    /* renamed from: d */
    public final i f30588d;

    /* renamed from: e */
    public final i f30589e;

    /* renamed from: f */
    public final i f30590f;

    /* renamed from: xi.a$a */
    /* loaded from: classes2.dex */
    public static final class C0561a extends m implements fm.a<f> {

        /* renamed from: b */
        public static final C0561a f30591b = new C0561a();

        public C0561a() {
            super(0);
        }

        @Override // fm.a
        public final f m() {
            return new f();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends m implements fm.a<xi.d> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b() {
            super(0);
            a.this = r1;
        }

        @Override // fm.a
        public final xi.d m() {
            return new xi.d(a.this.f30585a);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends m implements fm.a<e> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c() {
            super(0);
            a.this = r1;
        }

        @Override // fm.a
        public final e m() {
            return new e(a.this.f30585a);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends m implements fm.a<g> {

        /* renamed from: b */
        public static final d f30594b = new d();

        public d() {
            super(0);
        }

        @Override // fm.a
        public final g m() {
            return new g();
        }
    }

    public a(Application application, o0 o0Var) {
        l.f(application, "application");
        this.f30585a = application;
        this.f30586b = o0Var;
        this.f30587c = new i(d.f30594b);
        this.f30588d = new i(new b());
        this.f30589e = new i(C0561a.f30591b);
        this.f30590f = new i(new c());
        a.b bVar = p000do.a.f13275a;
        bVar.t("Fc#Core");
        bVar.h("Init", new Object[0]);
    }

    public final vi.b a() {
        return (vi.b) this.f30588d.getValue();
    }
}
