package nj;

import java.util.Calendar;
import mj.a;

/* loaded from: classes2.dex */
public final class n extends mj.a {

    /* loaded from: classes2.dex */
    public static final class a extends a.AbstractC0386a {
        public a() {
            this(0);
        }

        public a(int i10) {
            super(10, null);
        }

        public final void b(Calendar calendar) {
            int i10 = calendar.get(2) + 1;
            int i11 = calendar.get(5);
            byte[] bArr = this.f21880b;
            bArr[6] = (byte) ((1 & (i10 >> 3)) | (((calendar.get(1) - 2000) << 1) & 126));
            bArr[7] = (byte) ((i11 & 31) | ((i10 & 7) << 5));
        }
    }

    public n(byte[] bArr) {
        super(10, bArr);
    }
}
