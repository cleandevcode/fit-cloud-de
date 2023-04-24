package kj;

import android.content.Context;
import bi.m0;
import gm.l;

/* loaded from: classes2.dex */
public final class f extends bk.d {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, hj.a aVar) {
        super(context, aVar);
        l.f(context, "context");
        l.f(aVar, "connector");
    }

    @Override // bk.d
    public final boolean b(Context context) {
        l.f(context, "context");
        byte[] bArr = this.f4424b.o().f17931e.get((byte) 20);
        bArr = (bArr == null || bArr.length != 4) ? null : null;
        if (bArr == null) {
            return false;
        }
        return m0.x(bArr, 3, 0);
    }
}
