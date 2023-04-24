package dagger.hilt.android.internal.managers;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.s0;
import androidx.lifecycle.v0;
import ih.v;

/* loaded from: classes2.dex */
public final class c implements lk.b<fk.a> {

    /* renamed from: a */
    public final v0 f12954a;

    /* renamed from: b */
    public volatile fk.a f12955b;

    /* renamed from: c */
    public final Object f12956c = new Object();

    /* loaded from: classes2.dex */
    public interface a {
        of.c f();
    }

    /* loaded from: classes2.dex */
    public static final class b extends s0 {

        /* renamed from: d */
        public final fk.a f12957d;

        public b(of.d dVar) {
            this.f12957d = dVar;
        }

        @Override // androidx.lifecycle.s0
        public final void c() {
            ((ik.f) ((InterfaceC0221c) v.f(this.f12957d, InterfaceC0221c.class)).a()).a();
        }
    }

    /* renamed from: dagger.hilt.android.internal.managers.c$c */
    /* loaded from: classes2.dex */
    public interface InterfaceC0221c {
        ek.a a();
    }

    public c(ComponentActivity componentActivity) {
        this.f12954a = new v0(componentActivity, new dagger.hilt.android.internal.managers.b(componentActivity));
    }

    @Override // lk.b
    public final fk.a h() {
        if (this.f12955b == null) {
            synchronized (this.f12956c) {
                if (this.f12955b == null) {
                    this.f12955b = ((b) this.f12954a.a(b.class)).f12957d;
                }
            }
        }
        return this.f12955b;
    }
}
