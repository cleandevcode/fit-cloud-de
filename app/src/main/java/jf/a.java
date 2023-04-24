package jf;

import java.util.Locale;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public byte f17644a;

    /* renamed from: b */
    public int f17645b;

    public a(byte b10, int i10) {
        this.f17644a = b10;
        this.f17645b = i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format("BufferCheckEvent(0x%04X) {", (short) 1544));
        return f3.a.a(Locale.US, "\n\tstatus=0x%02X, updateOffset=0x%08X(%d)", new Object[]{Byte.valueOf(this.f17644a), Integer.valueOf(this.f17645b), Integer.valueOf(this.f17645b)}, sb2, "\n}");
    }
}
