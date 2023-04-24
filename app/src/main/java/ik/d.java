package ik;

import android.app.Activity;
import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import androidx.lifecycle.v0;
import ih.v;
import java.util.Map;
import java.util.Set;
import of.l;

/* loaded from: classes2.dex */
public final class d implements v0.b {

    /* renamed from: a */
    public final Set<String> f17100a;

    /* renamed from: b */
    public final v0.b f17101b;

    /* renamed from: c */
    public final c f17102c;

    /* loaded from: classes2.dex */
    public interface a {
        Set<String> d();

        l m();
    }

    /* loaded from: classes2.dex */
    public interface b {
        Map<String, sl.a<s0>> a();
    }

    public d(Set set, v0.b bVar, hk.a aVar) {
        this.f17100a = set;
        this.f17101b = bVar;
        this.f17102c = new c(aVar);
    }

    public static d c(Activity activity, p0 p0Var) {
        a aVar = (a) v.f(activity, a.class);
        return new d(aVar.d(), p0Var, aVar.m());
    }

    @Override // androidx.lifecycle.v0.b
    public final s0 a(Class cls, d2.c cVar) {
        return this.f17100a.contains(cls.getName()) ? this.f17102c.a(cls, cVar) : this.f17101b.a(cls, cVar);
    }

    @Override // androidx.lifecycle.v0.b
    public final <T extends s0> T b(Class<T> cls) {
        return this.f17100a.contains(cls.getName()) ? (T) this.f17102c.b(cls) : (T) this.f17101b.b(cls);
    }
}
