package y5;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public int[] f31131a;

    /* renamed from: b */
    public int f31132b;

    /* renamed from: c */
    public float[] f31133c;

    /* renamed from: y5.a$a */
    /* loaded from: classes.dex */
    public static final class C0574a {
        public static final int a(int[] iArr) {
            boolean z10;
            int i10 = 1;
            if (iArr.length == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                int i11 = iArr[0];
                int length = iArr.length - 1;
                if (1 <= length) {
                    while (true) {
                        i11 *= iArr[i10];
                        if (i10 == length) {
                            break;
                        }
                        i10++;
                    }
                }
                return i11;
            }
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
    }

    static {
        new C0574a();
    }

    public a(int[] iArr) {
        this.f31131a = iArr;
        int a10 = C0574a.a(iArr);
        this.f31132b = a10;
        this.f31133c = new float[a10];
    }
}
