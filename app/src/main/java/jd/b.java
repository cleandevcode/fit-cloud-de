package jd;

import cn.sharesdk.framework.Platform;
import java.util.Locale;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    public int f17640a;

    /* renamed from: b */
    public int f17641b;

    public b(int i10, int i11) {
        this.f17640a = i10;
        this.f17641b = i11;
    }

    public static b a(byte[] bArr) {
        int i10;
        int length = bArr.length;
        int i11 = 1;
        int i12 = 4;
        if (bArr[1] == 0) {
            i10 = length >= 4 ? ((bArr[2] << 8) | (bArr[3] & 255)) & Platform.CUSTOMER_ACTION_MASK : 0;
            if (length >= 6) {
                i11 = ((bArr[5] & 255) | (bArr[4] << 8)) & Platform.CUSTOMER_ACTION_MASK;
            } else if (i10 != 0 && i10 != 1) {
                if (i10 != 256) {
                    if (i10 == 257) {
                        i12 = 2;
                    } else if (i10 == 258) {
                        i12 = 3;
                    } else if (i10 != 259) {
                        if (i10 == 260) {
                            i12 = 5;
                        }
                    }
                    return new b(i10, i12);
                }
            }
            i12 = i11;
            return new b(i10, i12);
        }
        i10 = 0;
        i12 = 0;
        return new b(i10, i12);
    }

    public final String toString() {
        return String.format(Locale.US, "CmdSetInfo{ cmdSetVersion=0x%04X, eqSpecVersion=0x%04X }", Integer.valueOf(this.f17640a), Integer.valueOf(this.f17641b));
    }
}
