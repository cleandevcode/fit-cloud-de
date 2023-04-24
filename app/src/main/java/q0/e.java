package q0;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class e implements Comparable<e> {

    /* renamed from: a */
    public boolean f24491a;

    /* renamed from: e */
    public float f24495e;

    /* renamed from: i */
    public int f24499i;

    /* renamed from: b */
    public int f24492b = -1;

    /* renamed from: c */
    public int f24493c = -1;

    /* renamed from: d */
    public int f24494d = 0;

    /* renamed from: f */
    public boolean f24496f = false;

    /* renamed from: g */
    public float[] f24497g = new float[9];

    /* renamed from: h */
    public float[] f24498h = new float[9];

    /* renamed from: j */
    public b[] f24500j = new b[16];

    /* renamed from: k */
    public int f24501k = 0;

    /* renamed from: l */
    public int f24502l = 0;

    public e(int i10) {
        this.f24499i = i10;
    }

    public final void a(b bVar) {
        int i10 = 0;
        while (true) {
            int i11 = this.f24501k;
            if (i10 >= i11) {
                b[] bVarArr = this.f24500j;
                if (i11 >= bVarArr.length) {
                    this.f24500j = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f24500j;
                int i12 = this.f24501k;
                bVarArr2[i12] = bVar;
                this.f24501k = i12 + 1;
                return;
            } else if (this.f24500j[i10] == bVar) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void c(b bVar) {
        int i10 = this.f24501k;
        int i11 = 0;
        while (i11 < i10) {
            if (this.f24500j[i11] == bVar) {
                while (i11 < i10 - 1) {
                    b[] bVarArr = this.f24500j;
                    int i12 = i11 + 1;
                    bVarArr[i11] = bVarArr[i12];
                    i11 = i12;
                }
                this.f24501k--;
                return;
            }
            i11++;
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(e eVar) {
        return this.f24492b - eVar.f24492b;
    }

    public final void d() {
        this.f24499i = 5;
        this.f24494d = 0;
        this.f24492b = -1;
        this.f24493c = -1;
        this.f24495e = 0.0f;
        this.f24496f = false;
        int i10 = this.f24501k;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f24500j[i11] = null;
        }
        this.f24501k = 0;
        this.f24502l = 0;
        this.f24491a = false;
        Arrays.fill(this.f24498h, 0.0f);
    }

    public final void e(c cVar, float f10) {
        this.f24495e = f10;
        this.f24496f = true;
        int i10 = this.f24501k;
        this.f24493c = -1;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f24500j[i11].h(cVar, this, false);
        }
        this.f24501k = 0;
    }

    public final void f(c cVar, b bVar) {
        int i10 = this.f24501k;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f24500j[i11].i(cVar, bVar, false);
        }
        this.f24501k = 0;
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("");
        a10.append(this.f24492b);
        return a10.toString();
    }
}
