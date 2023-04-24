package x1;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a */
    public int f30164a;

    /* renamed from: b */
    public ByteBuffer f30165b;

    /* renamed from: c */
    public int f30166c;

    /* renamed from: d */
    public int f30167d;

    public c() {
        if (h7.a.f15891c == null) {
            h7.a.f15891c = new h7.a();
        }
    }

    public final int a(int i10) {
        if (i10 < this.f30167d) {
            return this.f30165b.getShort(this.f30166c + i10);
        }
        return 0;
    }
}
