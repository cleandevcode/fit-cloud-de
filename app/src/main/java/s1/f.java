package s1;

import java.io.Serializable;
import java.util.Iterator;
import s1.h;

@zl.e(c = "androidx.datastore.core.DataMigrationInitializer$Companion", f = "DataMigrationInitializer.kt", l = {42, 57}, m = "runMigrations")
/* loaded from: classes.dex */
public final class f<T> extends zl.c {

    /* renamed from: d */
    public Serializable f26410d;

    /* renamed from: e */
    public Iterator f26411e;

    /* renamed from: f */
    public /* synthetic */ Object f26412f;

    /* renamed from: g */
    public final /* synthetic */ h.a f26413g;

    /* renamed from: h */
    public int f26414h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h.a aVar, xl.d<? super f> dVar) {
        super(dVar);
        this.f26413g = aVar;
    }

    @Override // zl.a
    public final Object t(Object obj) {
        this.f26412f = obj;
        this.f26414h |= Integer.MIN_VALUE;
        return h.a.a(this.f26413g, null, null, this);
    }
}
