package ef;

import androidx.fragment.app.a0;
import java.util.Locale;

/* loaded from: classes.dex */
public final class b extends a0 {

    /* renamed from: a */
    public ff.b f13606a;

    public b(ff.b bVar) {
        this.f13606a = bVar;
    }

    @Override // androidx.fragment.app.a0
    public final byte[] h() {
        byte[] a10 = this.f13606a.a();
        byte[] bArr = new byte[a10.length + 1];
        bArr[0] = (byte) 15;
        if (a10.length == 32) {
            System.arraycopy(a10, 0, bArr, 1, a10.length);
        }
        return bArr;
    }

    @Override // androidx.fragment.app.a0
    public final short p() {
        return (short) 15;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format("CheckSha256Req(0x%04X) {", (short) 15));
        ff.b bVar = this.f13606a;
        if (bVar != null) {
            sb2.append(String.format(Locale.US, "\n\tsha256=%s", bVar.toString()));
        }
        sb2.append("\n}");
        return sb2.toString();
    }
}
