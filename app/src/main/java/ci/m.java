package ci;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a */
    public final int f4792a;

    /* renamed from: b */
    public final int f4793b;

    /* renamed from: c */
    public final int f4794c;

    /* renamed from: d */
    public final int f4795d;

    /* renamed from: e */
    public final int f4796e;

    public m(int i10, int i11, int i12, int i13, int i14) {
        this.f4792a = i10;
        this.f4793b = i11;
        this.f4794c = i12;
        this.f4795d = i13;
        this.f4796e = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            return this.f4792a == mVar.f4792a && this.f4793b == mVar.f4793b && this.f4794c == mVar.f4794c && this.f4795d == mVar.f4795d && this.f4796e == mVar.f4796e;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.f4792a * 31) + this.f4793b) * 31) + this.f4794c) * 31) + this.f4795d) * 31) + this.f4796e;
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("DeviceInfo(sendPacketSize=");
        a10.append(this.f4792a);
        a10.append(", bufferCheckSize=");
        a10.append(this.f4793b);
        a10.append(", protocolVersion=");
        a10.append(this.f4794c);
        a10.append(", rwsStatus=");
        a10.append(this.f4795d);
        a10.append(", supportFormats=");
        return a1.b.a(a10, this.f4796e, ')');
    }
}
