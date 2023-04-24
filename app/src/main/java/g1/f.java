package g1;

import android.util.Base64;
import java.util.List;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a */
    public final String f14809a;

    /* renamed from: b */
    public final String f14810b;

    /* renamed from: c */
    public final String f14811c;

    /* renamed from: d */
    public final List<List<byte[]>> f14812d;

    /* renamed from: e */
    public final String f14813e;

    public f(String str, String str2, String str3, List<List<byte[]>> list) {
        str.getClass();
        this.f14809a = str;
        str2.getClass();
        this.f14810b = str2;
        this.f14811c = str3;
        list.getClass();
        this.f14812d = list;
        this.f14813e = str + "-" + str2 + "-" + str3;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        StringBuilder a10 = android.support.v4.media.d.a("FontRequest {mProviderAuthority: ");
        a10.append(this.f14809a);
        a10.append(", mProviderPackage: ");
        a10.append(this.f14810b);
        a10.append(", mQuery: ");
        a10.append(this.f14811c);
        a10.append(", mCertificates:");
        sb2.append(a10.toString());
        for (int i10 = 0; i10 < this.f14812d.size(); i10++) {
            sb2.append(" [");
            List<byte[]> list = this.f14812d.get(i10);
            for (int i11 = 0; i11 < list.size(); i11++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString(list.get(i11), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
        }
        return androidx.activity.e.b(sb2, "}", "mCertificatesArray: 0");
    }
}
