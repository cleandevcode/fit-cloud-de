package p001if;

import android.support.v4.media.d;
import java.util.Locale;
import java.util.UUID;

/* renamed from: if.b */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    public String f16784a;

    /* renamed from: b */
    public String f16785b;

    /* renamed from: c */
    public boolean f16786c;

    /* renamed from: d */
    public int f16787d;

    /* renamed from: e */
    public UUID f16788e;

    /* renamed from: f */
    public UUID f16789f;

    /* renamed from: g */
    public boolean f16790g;

    /* renamed from: h */
    public int f16791h;

    /* renamed from: i */
    public boolean f16792i;

    public b(String str, int i10, UUID uuid, UUID uuid2, int i11) {
        this.f16787d = 1;
        this.f16788e = UUID.fromString("0000d0ff-3c17-d293-8e48-14fe2e4da212");
        UUID.fromString("00006287-3c17-d293-8e48-14fe2e4da212");
        this.f16784a = str;
        this.f16785b = "";
        this.f16786c = false;
        this.f16787d = i10;
        this.f16788e = uuid;
        this.f16789f = uuid2;
        this.f16790g = false;
        this.f16791h = i11;
        this.f16792i = false;
    }

    public final String toString() {
        StringBuilder a10 = d.a("ConnectParams{\n");
        a10.append(String.format("localName=%s, address=%s\n", this.f16785b, p.b.m(this.f16784a)));
        a10.append(String.format("isHid=%b\n", Boolean.valueOf(this.f16786c)));
        a10.append(String.format("refreshCache=%b\n", Boolean.valueOf(this.f16790g)));
        a10.append(String.format(Locale.US, "reconnectTimes=%d\n", Integer.valueOf(this.f16787d)));
        a10.append(String.format("imageFeatureEnabled=%b\n", Boolean.valueOf(this.f16792i)));
        a10.append("}");
        return a10.toString();
    }
}
