package ga;

import pm.g0;

/* loaded from: classes.dex */
public final class d extends g0 {

    /* renamed from: a */
    public float f15066a = -1.0f;

    @Override // pm.g0
    public final void g(float f10, float f11, l lVar) {
        lVar.e(f11 * f10, 180.0f, 90.0f);
        double d10 = f11;
        double d11 = f10;
        lVar.d((float) (Math.sin(Math.toRadians(90.0f)) * d10 * d11), (float) (Math.sin(Math.toRadians(0.0f)) * d10 * d11));
    }
}
