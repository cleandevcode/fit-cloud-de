package gj;

/* loaded from: classes2.dex */
public final class a extends Exception {

    /* renamed from: a */
    public final int f15359a;

    /* renamed from: b */
    public final String f15360b;

    public a() {
        this(0, 7, null, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i10, int i11, String str, Throwable th2) {
        super((i11 & 4) != 0 ? null : th2);
        i10 = (i11 & 1) != 0 ? Integer.MAX_VALUE : i10;
        str = (i11 & 2) != 0 ? null : str;
        this.f15359a = i10;
        this.f15360b = str;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("errorCode:");
        a10.append(this.f15359a);
        a10.append(" errorMessage:");
        a10.append(this.f15360b);
        return a10.toString();
    }
}
