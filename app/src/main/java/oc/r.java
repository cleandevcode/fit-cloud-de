package oc;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Locale;

/* loaded from: classes.dex */
public final class r implements z0 {

    /* renamed from: a */
    public final /* synthetic */ int f23027a;

    /* renamed from: b */
    public int f23028b;

    public /* synthetic */ r(int i10, int i11) {
        this.f23027a = i11;
        this.f23028b = i10;
    }

    public static r b(byte[] bArr) {
        if (bArr == null || bArr.length < 1) {
            ge.b.n("invalid packet");
            return null;
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        return new r(wrap.get(), 1);
    }

    @Override // oc.z0
    public final int a() {
        return this.f23028b;
    }

    public final String toString() {
        switch (this.f23027a) {
            case 1:
                return f3.a.a(Locale.US, "\n\ttime=0x%02X(%d)", new Object[]{Integer.valueOf(this.f23028b), Integer.valueOf(this.f23028b)}, android.support.v4.media.d.a("AptPowerOnDelayTimeEvent {"), "\n}");
            default:
                return super.toString();
        }
    }
}
