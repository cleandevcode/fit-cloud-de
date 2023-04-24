package kc;

import android.content.Context;

/* loaded from: classes.dex */
public final class z implements v3.c<Integer> {

    /* renamed from: a */
    public final w3.a<Context> f18435a;

    public z(w3.a<Context> aVar) {
        this.f18435a = aVar;
    }

    @Override // w3.a
    public final Object get() {
        int i10;
        Context context = this.f18435a.get();
        try {
            i10 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion;
        } catch (Throwable unused) {
            i10 = Integer.MAX_VALUE;
        }
        return Integer.valueOf(i10);
    }
}
