package gd;

import java.util.Locale;
import yb.y;

/* loaded from: classes.dex */
public final class i extends y {

    /* renamed from: c */
    public byte f15278c;

    public i(byte b10) {
        this.f15278c = b10;
    }

    @Override // yb.y
    public final ed.b j() {
        byte[] bArr = {(byte) 0, (byte) 2};
        System.arraycopy(new byte[]{this.f15278c}, 0, bArr, 2, 1);
        return new ed.b(2, (short) 512, (short) 512, bArr);
    }

    public final String toString() {
        return f3.a.a(Locale.US, "\nqueryType=%d", new Object[]{Byte.valueOf(this.f15278c)}, android.support.v4.media.d.a("GetEqInfoReq {"), "\n}");
    }
}
