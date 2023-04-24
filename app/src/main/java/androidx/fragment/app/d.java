package androidx.fragment.app;

import androidx.fragment.app.f1;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ List f2336a;

    /* renamed from: b */
    public final /* synthetic */ f1.b f2337b;

    /* renamed from: c */
    public final /* synthetic */ m f2338c;

    public d(m mVar, ArrayList arrayList, f1.b bVar) {
        this.f2338c = mVar;
        this.f2336a = arrayList;
        this.f2337b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f2336a.contains(this.f2337b)) {
            this.f2336a.remove(this.f2337b);
            m mVar = this.f2338c;
            f1.b bVar = this.f2337b;
            mVar.getClass();
            i1.a(bVar.f2367a, bVar.f2369c.H);
        }
    }
}
