package d4;

import android.support.v4.media.d;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    public String f12622a = "GTD";

    /* renamed from: b */
    public String f12623b;

    public c(String str) {
        this.f12623b = str;
    }

    public final String toString() {
        StringBuilder a10 = d.a("SendData{sid='");
        a10.append(this.f12622a);
        a10.append('\'');
        a10.append(", data='");
        a10.append(this.f12623b);
        a10.append('\'');
        a10.append(", ver=");
        return b.a(a10, 1L, '}');
    }
}
