package kc;

import kc.k;

/* loaded from: classes.dex */
public final class w implements v3.c<String[][]> {

    /* renamed from: a */
    public final w3.a<Integer> f18423a = k.a.f18345a;

    /* renamed from: b */
    public final w3.a<Integer> f18424b;

    /* renamed from: c */
    public final w3.a<Boolean> f18425c;

    public w(w3.a aVar, w3.a aVar2) {
        this.f18424b = aVar;
        this.f18425c = aVar2;
    }

    @Override // w3.a
    public final Object get() {
        int intValue = this.f18423a.get().intValue();
        int intValue2 = this.f18424b.get().intValue();
        boolean booleanValue = this.f18425c.get().booleanValue();
        int min = Math.min(intValue, intValue2);
        if (min < 23) {
            return new String[0];
        }
        if (min < 29) {
            return new String[][]{new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}};
        }
        if (min < 31) {
            return new String[][]{new String[]{"android.permission.ACCESS_FINE_LOCATION"}};
        }
        return booleanValue ? new String[][]{new String[]{"android.permission.BLUETOOTH_SCAN"}} : new String[][]{new String[]{"android.permission.BLUETOOTH_SCAN"}, new String[]{"android.permission.ACCESS_FINE_LOCATION"}};
    }
}
