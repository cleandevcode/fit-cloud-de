package db;

import java.nio.charset.StandardCharsets;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    public final String f12970a;

    /* renamed from: b */
    public g f12971b;

    /* renamed from: c */
    public za.b f12972c;

    /* renamed from: d */
    public za.b f12973d;

    /* renamed from: e */
    public final StringBuilder f12974e;

    /* renamed from: f */
    public int f12975f;

    /* renamed from: g */
    public int f12976g;

    /* renamed from: h */
    public f f12977h;

    /* renamed from: i */
    public int f12978i;

    public d(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb2 = new StringBuilder(bytes.length);
        int length = bytes.length;
        for (int i10 = 0; i10 < length; i10++) {
            char c10 = (char) (bytes[i10] & 255);
            if (c10 == '?' && str.charAt(i10) != '?') {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
            sb2.append(c10);
        }
        this.f12970a = sb2.toString();
        this.f12971b = g.FORCE_NONE;
        this.f12974e = new StringBuilder(str.length());
        this.f12976g = -1;
    }

    public final int a() {
        return this.f12974e.length();
    }

    public final char b() {
        return this.f12970a.charAt(this.f12975f);
    }

    public final boolean c() {
        return this.f12975f < this.f12970a.length() - this.f12978i;
    }

    public final void d(int i10) {
        f fVar = this.f12977h;
        if (fVar == null || i10 > fVar.f12985b) {
            this.f12977h = f.f(i10, this.f12971b, this.f12972c, this.f12973d);
        }
    }

    public final void e(char c10) {
        this.f12974e.append(c10);
    }
}
