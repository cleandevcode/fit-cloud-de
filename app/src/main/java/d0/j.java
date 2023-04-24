package d0;

import java.util.List;
import p0.c;
import s.h1;

/* loaded from: classes.dex */
public final class j implements c.InterfaceC0425c<List<Object>> {

    /* renamed from: a */
    public final /* synthetic */ m f12589a;

    public j(m mVar) {
        this.f12589a = mVar;
    }

    @Override // p0.c.InterfaceC0425c
    public final String g(c.a aVar) {
        h1.k("The result can only set once!", this.f12589a.f12599f == null);
        this.f12589a.f12599f = aVar;
        return "ListFuture[" + this + "]";
    }
}
