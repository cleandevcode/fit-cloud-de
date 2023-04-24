package f8;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public abstract class s extends q {

    /* renamed from: c */
    public static final WeakReference f14191c = new WeakReference(null);

    /* renamed from: b */
    public WeakReference f14192b;

    public s(byte[] bArr) {
        super(bArr);
        this.f14192b = f14191c;
    }

    @Override // f8.q
    public final byte[] f0() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.f14192b.get();
            if (bArr == null) {
                bArr = y0();
                this.f14192b = new WeakReference(bArr);
            }
        }
        return bArr;
    }

    public abstract byte[] y0();
}
