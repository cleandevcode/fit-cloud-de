package i8;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import g8.a;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a */
    public final SparseIntArray f16621a;

    /* renamed from: b */
    public f8.e f16622b;

    public d0() {
        f8.d dVar = f8.d.f14180d;
        this.f16621a = new SparseIntArray();
        this.f16622b = dVar;
    }

    @ResultIgnorabilityUnspecified
    public final int a(Context context, a.e eVar) {
        p.f(context);
        p.f(eVar);
        int i10 = 0;
        if (!eVar.h()) {
            return 0;
        }
        int i11 = eVar.i();
        int i12 = this.f16621a.get(i11, -1);
        if (i12 == -1) {
            int i13 = 0;
            while (true) {
                if (i13 < this.f16621a.size()) {
                    int keyAt = this.f16621a.keyAt(i13);
                    if (keyAt > i11 && this.f16621a.get(keyAt) == 0) {
                        break;
                    }
                    i13++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 == -1) {
                i12 = this.f16622b.b(context, i11);
            } else {
                i12 = i10;
            }
            this.f16621a.put(i11, i12);
        }
        return i12;
    }
}
