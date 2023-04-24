package p3;

import androidx.work.impl.WorkDatabase;

/* loaded from: classes.dex */
public final class p implements f3.h {

    /* renamed from: a */
    public final r3.a f23840a;

    /* renamed from: b */
    public final n3.a f23841b;

    /* renamed from: c */
    public final o3.q f23842c;

    static {
        f3.m.e("WMFgUpdater");
    }

    public p(WorkDatabase workDatabase, n3.a aVar, r3.a aVar2) {
        this.f23841b = aVar;
        this.f23840a = aVar2;
        this.f23842c = workDatabase.w();
    }
}
