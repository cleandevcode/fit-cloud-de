package d9;

/* loaded from: classes.dex */
public final class d extends c {

    /* renamed from: e */
    public final a f12872e;

    /* renamed from: f */
    public final float f12873f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar, float f10) {
        super(3, aVar, Float.valueOf(f10));
        if (aVar != null) {
            if (f10 > 0.0f) {
                this.f12872e = aVar;
                this.f12873f = f10;
                return;
            }
            throw new IllegalArgumentException("refWidth must be positive");
        }
        throw new NullPointerException("bitmapDescriptor must not be null");
    }

    @Override // d9.c
    public final String toString() {
        String valueOf = String.valueOf(this.f12872e);
        float f10 = this.f12873f;
        return "[CustomCap: bitmapDescriptor=" + valueOf + " refWidth=" + f10 + "]";
    }
}
