package se;

import android.content.Context;
import ge.b;
import java.util.Locale;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public int f26896a;

    /* renamed from: b */
    public String f26897b;

    /* renamed from: c */
    public int f26898c;

    /* renamed from: d */
    public int f26899d;

    /* renamed from: e */
    public long f26900e;

    /* renamed from: f */
    public int f26901f;

    /* renamed from: g */
    public int f26902g;

    /* renamed from: i */
    public int f26904i;

    /* renamed from: j */
    public int f26905j;

    /* renamed from: k */
    public byte[] f26906k;

    /* renamed from: l */
    public int f26907l = -1;

    /* renamed from: h */
    public int f26903h = 0;

    public a(int i10, String str, int i11, int i12, long j10, int i13, int i14) {
        this.f26896a = i10;
        this.f26897b = str;
        this.f26898c = i11;
        this.f26899d = i12;
        this.f26900e = j10;
        this.f26901f = i13;
        this.f26902g = i14;
    }

    public final te.a a(Context context, int i10) {
        try {
            te.a o10 = we.a.o(context, i10, this.f26897b, this.f26900e, 0);
            if (o10 != null) {
                o10.f28067x = this.f26906k;
                o10.M = this.f26907l;
            }
            return o10;
        } catch (Exception e10) {
            b.p(e10.toString());
            return null;
        }
    }

    public final te.a b(Context context, int i10, int i11) {
        try {
            te.a o10 = we.a.o(context, i10, this.f26897b, this.f26900e, i11);
            if (o10 != null) {
                o10.f28067x = this.f26906k;
                o10.M = this.f26907l;
            }
            return o10;
        } catch (Exception e10) {
            b.p(e10.toString());
            return null;
        }
    }

    public final te.a c(int i10, int i11) {
        try {
            te.a p10 = we.a.p(i10, i11, this.f26900e, this.f26897b);
            if (p10 != null) {
                p10.f28067x = this.f26906k;
                p10.M = this.f26907l;
            }
            return p10;
        } catch (Exception e10) {
            b.p(e10.toString());
            return null;
        }
    }

    public final int d() {
        int i10 = this.f26899d;
        return i10 == 0 ? this.f26898c : this.f26898c % i10;
    }

    public final String toString() {
        return String.format(Locale.US, "icType=0x%02X, bitNumber=%d(%d), binId=0x%04X, imageId=0x%04X, startAddr=%d, downloadAddr=0x%08x, size=0x%08x(%d), reserved=%d", Integer.valueOf(this.f26896a), Integer.valueOf(this.f26898c), Integer.valueOf(this.f26899d), Integer.valueOf(this.f26904i), Integer.valueOf(this.f26905j), Long.valueOf(this.f26900e), Integer.valueOf(this.f26901f), Integer.valueOf(this.f26902g), Integer.valueOf(this.f26902g), Integer.valueOf(this.f26903h));
    }
}
