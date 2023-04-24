package o2;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import lg.h0;
import m2.m;
import tl.l;

/* loaded from: classes.dex */
public final class b extends m.c {

    /* renamed from: b */
    public final fm.a<l> f22602b;

    /* renamed from: c */
    public final AtomicBoolean f22603c;

    public b(String[] strArr, h0.a aVar) {
        super(strArr);
        this.f22602b = aVar;
        this.f22603c = new AtomicBoolean(false);
    }

    @Override // m2.m.c
    public final void a(Set<String> set) {
        gm.l.f(set, "tables");
        this.f22602b.m();
    }
}
