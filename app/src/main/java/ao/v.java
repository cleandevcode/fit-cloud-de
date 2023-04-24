package ao;

import java.lang.reflect.Array;

/* loaded from: classes2.dex */
public final class v extends w<Object> {

    /* renamed from: a */
    public final /* synthetic */ w f3863a;

    public v(w wVar) {
        this.f3863a = wVar;
    }

    @Override // ao.w
    public final void a(z zVar, Object obj) {
        if (obj == null) {
            return;
        }
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.f3863a.a(zVar, Array.get(obj, i10));
        }
    }
}
