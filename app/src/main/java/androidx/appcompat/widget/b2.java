package androidx.appcompat.widget;

/* loaded from: classes.dex */
public final class b2 {

    /* renamed from: a */
    public int f1265a = 0;

    /* renamed from: b */
    public int f1266b = 0;

    /* renamed from: c */
    public int f1267c = Integer.MIN_VALUE;

    /* renamed from: d */
    public int f1268d = Integer.MIN_VALUE;

    /* renamed from: e */
    public int f1269e = 0;

    /* renamed from: f */
    public int f1270f = 0;

    /* renamed from: g */
    public boolean f1271g = false;

    /* renamed from: h */
    public boolean f1272h = false;

    public final void a(int i10, int i11) {
        this.f1267c = i10;
        this.f1268d = i11;
        this.f1272h = true;
        if (this.f1271g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f1265a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f1266b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f1265a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f1266b = i11;
        }
    }
}
