package androidx.lifecycle;

import androidx.lifecycle.c;
import androidx.lifecycle.k;
import java.util.List;

@Deprecated
/* loaded from: classes.dex */
public class ReflectiveGenericLifecycleObserver implements s {

    /* renamed from: a */
    public final Object f2655a;

    /* renamed from: b */
    public final c.a f2656b;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f2655a = obj;
        this.f2656b = c.f2695c.b(obj.getClass());
    }

    @Override // androidx.lifecycle.s
    public final void d(u uVar, k.b bVar) {
        c.a aVar = this.f2656b;
        Object obj = this.f2655a;
        c.a.a((List) aVar.f2698a.get(bVar), uVar, bVar, obj);
        c.a.a((List) aVar.f2698a.get(k.b.ON_ANY), uVar, bVar, obj);
    }
}
