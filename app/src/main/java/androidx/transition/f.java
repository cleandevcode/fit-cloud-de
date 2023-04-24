package androidx.transition;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class f extends j {

    /* renamed from: a */
    public final /* synthetic */ Object f3405a;

    /* renamed from: b */
    public final /* synthetic */ ArrayList f3406b;

    /* renamed from: c */
    public final /* synthetic */ Object f3407c = null;

    /* renamed from: d */
    public final /* synthetic */ ArrayList f3408d = null;

    /* renamed from: e */
    public final /* synthetic */ Object f3409e;

    /* renamed from: f */
    public final /* synthetic */ ArrayList f3410f;

    /* renamed from: g */
    public final /* synthetic */ e f3411g;

    public f(e eVar, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f3411g = eVar;
        this.f3405a = obj;
        this.f3406b = arrayList;
        this.f3409e = obj2;
        this.f3410f = arrayList2;
    }

    @Override // androidx.transition.j, androidx.transition.i.d
    public final void b(i iVar) {
        Object obj = this.f3405a;
        if (obj != null) {
            this.f3411g.s(obj, this.f3406b, null);
        }
        Object obj2 = this.f3407c;
        if (obj2 != null) {
            this.f3411g.s(obj2, this.f3408d, null);
        }
        Object obj3 = this.f3409e;
        if (obj3 != null) {
            this.f3411g.s(obj3, this.f3410f, null);
        }
    }

    @Override // androidx.transition.i.d
    public final void d(i iVar) {
        iVar.z(this);
    }
}
