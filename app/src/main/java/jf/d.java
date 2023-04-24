package jf;

import java.util.Locale;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    public byte f17650a;

    /* renamed from: b */
    public int f17651b;

    /* renamed from: c */
    public int f17652c;

    public d(byte b10, int i10, int i11) {
        this.f17650a = b10;
        this.f17651b = i10;
        this.f17652c = i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format("EnableBufferCheckRsp(0x%04X) {", (short) 1541));
        return f3.a.a(Locale.US, "\n\tstatus=0x%02X,maxBufferSize=0x%04X(%d), bufferCheckMtuSize=0x%04X(%d)", new Object[]{Byte.valueOf(this.f17650a), Integer.valueOf(this.f17651b), Integer.valueOf(this.f17651b), Integer.valueOf(this.f17652c), Integer.valueOf(this.f17652c)}, sb2, "\n}");
    }
}
