package ik;

import androidx.fragment.app.h1;
import androidx.lifecycle.l0;
import androidx.lifecycle.s0;
import ih.v;
import ik.d;
import java.io.Closeable;
import java.util.LinkedHashSet;
import of.l;
import of.m;

/* loaded from: classes2.dex */
public final class c extends androidx.lifecycle.a {

    /* renamed from: d */
    public final /* synthetic */ hk.a f17099d;

    public c(hk.a aVar) {
        this.f17099d = aVar;
    }

    @Override // androidx.lifecycle.a
    public final <T extends s0> T d(String str, Class<T> cls, l0 l0Var) {
        final f fVar = new f();
        l lVar = (l) this.f17099d;
        lVar.getClass();
        l0Var.getClass();
        lVar.getClass();
        lVar.getClass();
        sl.a<s0> aVar = ((d.b) v.f(new m(lVar.f23173a, lVar.f23174b, l0Var), d.b.class)).a().get(cls.getName());
        if (aVar != null) {
            T t10 = (T) aVar.get();
            Closeable closeable = new Closeable() { // from class: ik.b
                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    f.this.a();
                }
            };
            LinkedHashSet linkedHashSet = t10.f2781b;
            if (linkedHashSet != null) {
                synchronized (linkedHashSet) {
                    t10.f2781b.add(closeable);
                }
            }
            return t10;
        }
        throw new IllegalStateException(h1.a(cls, android.support.v4.media.d.a("Expected the @HiltViewModel-annotated class '"), "' to be available in the multi-binding of @HiltViewModelMap but none was found."));
    }
}
