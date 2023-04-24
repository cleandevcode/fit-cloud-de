package r;

import a0.h1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: classes.dex */
public final class c extends h1<b> {
    public c(b... bVarArr) {
        this.f96a.addAll(Arrays.asList(bVarArr));
    }

    @Override // a0.h1
    /* renamed from: a */
    public final c clone() {
        c cVar = new c(new b[0]);
        cVar.f96a.addAll(Collections.unmodifiableList(new ArrayList(this.f96a)));
        return cVar;
    }
}
