package ff;

import android.support.v4.media.d;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public int f14250a;

    /* renamed from: b */
    public List<C0251a> f14251b;

    /* renamed from: ff.a$a */
    /* loaded from: classes.dex */
    public static class C0251a {

        /* renamed from: a */
        public int f14252a;

        /* renamed from: b */
        public byte f14253b;

        public C0251a(byte b10, int i10) {
            this.f14252a = i10;
            this.f14253b = b10;
        }

        public final String toString() {
            return String.format("imageId=0x%04X, status=0x%02X", Integer.valueOf(this.f14252a), Byte.valueOf(this.f14253b));
        }
    }

    public a(int i10, ArrayList arrayList) {
        this.f14250a = i10;
        this.f14251b = arrayList;
    }

    public static a a(byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        if (bArr == null || bArr.length < 3) {
            return new a(0, arrayList);
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        int remaining = wrap.remaining() / 3;
        while (i10 < remaining) {
            int i11 = i10 + 1;
            arrayList.add(new C0251a(wrap.get(i10 + 2), (((short) (wrap.get(i11) & 255)) << 8) | ((short) (wrap.get(i10 + 0) & 255))));
            i10 = i11;
        }
        return new a(remaining, arrayList);
    }

    public final String toString() {
        StringBuilder a10 = d.a("CheckSha256Rsp{");
        a10.append(String.format(Locale.US, "\n\tnumber=%d", Integer.valueOf(this.f14250a)));
        List<C0251a> list = this.f14251b;
        if (list != null && list.size() > 0) {
            for (C0251a c0251a : this.f14251b) {
                a10.append("\n\t");
                a10.append(c0251a.toString());
            }
        }
        a10.append("\n}");
        return a10.toString();
    }
}
