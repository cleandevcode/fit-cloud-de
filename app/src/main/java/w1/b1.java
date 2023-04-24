package w1;

/* loaded from: classes.dex */
public final class b1 implements n0 {

    /* renamed from: a */
    public final p0 f29541a;

    /* renamed from: b */
    public final String f29542b;

    /* renamed from: c */
    public final Object[] f29543c;

    /* renamed from: d */
    public final int f29544d;

    public b1(w wVar, String str, Object[] objArr) {
        char charAt;
        this.f29541a = wVar;
        this.f29542b = str;
        this.f29543c = objArr;
        int charAt2 = str.charAt(0);
        if (charAt2 >= 55296) {
            int i10 = charAt2 & 8191;
            int i11 = 1;
            int i12 = 13;
            while (true) {
                int i13 = i11 + 1;
                charAt = str.charAt(i11);
                if (charAt < 55296) {
                    break;
                }
                i10 |= (charAt & 8191) << i12;
                i12 += 13;
                i11 = i13;
            }
            charAt2 = i10 | (charAt << i12);
        }
        this.f29544d = charAt2;
    }

    @Override // w1.n0
    public final boolean a() {
        return (this.f29544d & 2) == 2;
    }

    @Override // w1.n0
    public final p0 b() {
        return this.f29541a;
    }

    @Override // w1.n0
    public final int c() {
        return (this.f29544d & 1) == 1 ? 1 : 2;
    }

    public final Object[] d() {
        return this.f29543c;
    }

    public final String e() {
        return this.f29542b;
    }
}
