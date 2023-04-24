package androidx.lifecycle;

import androidx.lifecycle.k;
import java.util.HashMap;

/* loaded from: classes.dex */
public class CompositeGeneratedAdaptersObserver implements s {

    /* renamed from: a */
    public final h[] f2629a;

    public CompositeGeneratedAdaptersObserver(h[] hVarArr) {
        this.f2629a = hVarArr;
    }

    @Override // androidx.lifecycle.s
    public final void d(u uVar, k.b bVar) {
        new HashMap();
        for (h hVar : this.f2629a) {
            hVar.a();
        }
        for (h hVar2 : this.f2629a) {
            hVar2.a();
        }
    }
}
