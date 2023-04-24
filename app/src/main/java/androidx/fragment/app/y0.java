package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k1.i2;
import k1.o0;

/* loaded from: classes.dex */
public final class y0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f2619a;

    /* renamed from: b */
    public final /* synthetic */ ArrayList f2620b;

    /* renamed from: c */
    public final /* synthetic */ ArrayList f2621c;

    /* renamed from: d */
    public final /* synthetic */ ArrayList f2622d;

    /* renamed from: e */
    public final /* synthetic */ ArrayList f2623e;

    public y0(int i10, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f2619a = i10;
        this.f2620b = arrayList;
        this.f2621c = arrayList2;
        this.f2622d = arrayList3;
        this.f2623e = arrayList4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (int i10 = 0; i10 < this.f2619a; i10++) {
            WeakHashMap<View, i2> weakHashMap = k1.o0.f18161a;
            o0.i.v((View) this.f2620b.get(i10), (String) this.f2621c.get(i10));
            o0.i.v((View) this.f2622d.get(i10), (String) this.f2623e.get(i10));
        }
    }
}
