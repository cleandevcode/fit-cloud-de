package q0;

import java.util.Arrays;
import java.util.Comparator;
import p.g;
import q0.b;

/* loaded from: classes.dex */
public final class d extends q0.b {

    /* renamed from: f */
    public e[] f24485f;

    /* renamed from: g */
    public e[] f24486g;

    /* renamed from: h */
    public int f24487h;

    /* renamed from: i */
    public b f24488i;

    /* loaded from: classes.dex */
    public class a implements Comparator<e> {
        @Override // java.util.Comparator
        public final int compare(e eVar, e eVar2) {
            return eVar.f24492b - eVar2.f24492b;
        }
    }

    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a */
        public e f24489a;

        public b() {
            d.this = r1;
        }

        public final String toString() {
            String str = "[ ";
            if (this.f24489a != null) {
                for (int i10 = 0; i10 < 9; i10++) {
                    StringBuilder a10 = android.support.v4.media.d.a(str);
                    a10.append(this.f24489a.f24498h[i10]);
                    a10.append(" ");
                    str = a10.toString();
                }
            }
            StringBuilder a11 = p.a.a(str, "] ");
            a11.append(this.f24489a);
            return a11.toString();
        }
    }

    public d(g gVar) {
        super(gVar);
        this.f24485f = new e[128];
        this.f24486g = new e[128];
        this.f24487h = 0;
        this.f24488i = new b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x004d, code lost:
        if (r9 < r8) goto L32;
     */
    @Override // q0.b, q0.c.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final q0.e a(boolean[] r12) {
        /*
            r11 = this;
            r0 = 0
            r1 = -1
            r2 = 0
            r3 = -1
        L4:
            int r4 = r11.f24487h
            if (r2 >= r4) goto L57
            q0.e[] r4 = r11.f24485f
            r5 = r4[r2]
            int r6 = r5.f24492b
            boolean r6 = r12[r6]
            if (r6 == 0) goto L13
            goto L54
        L13:
            q0.d$b r6 = r11.f24488i
            r6.f24489a = r5
            r5 = 8
            r7 = 1
            if (r3 != r1) goto L36
        L1c:
            if (r5 < 0) goto L32
            q0.e r4 = r6.f24489a
            float[] r4 = r4.f24498h
            r4 = r4[r5]
            r8 = 0
            int r9 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r9 <= 0) goto L2a
            goto L32
        L2a:
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 >= 0) goto L2f
            goto L33
        L2f:
            int r5 = r5 + (-1)
            goto L1c
        L32:
            r7 = 0
        L33:
            if (r7 == 0) goto L54
            goto L53
        L36:
            r4 = r4[r3]
        L38:
            if (r5 < 0) goto L50
            float[] r8 = r4.f24498h
            r8 = r8[r5]
            q0.e r9 = r6.f24489a
            float[] r9 = r9.f24498h
            r9 = r9[r5]
            int r10 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r10 != 0) goto L4b
            int r5 = r5 + (-1)
            goto L38
        L4b:
            int r4 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r4 >= 0) goto L50
            goto L51
        L50:
            r7 = 0
        L51:
            if (r7 == 0) goto L54
        L53:
            r3 = r2
        L54:
            int r2 = r2 + 1
            goto L4
        L57:
            if (r3 != r1) goto L5b
            r12 = 0
            return r12
        L5b:
            q0.e[] r12 = r11.f24485f
            r12 = r12[r3]
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.d.a(boolean[]):q0.e");
    }

    @Override // q0.b
    public final boolean e() {
        return this.f24487h == 0;
    }

    @Override // q0.b
    public final void i(c cVar, q0.b bVar, boolean z10) {
        e eVar = bVar.f24463a;
        if (eVar == null) {
            return;
        }
        b.a aVar = bVar.f24466d;
        int b10 = aVar.b();
        for (int i10 = 0; i10 < b10; i10++) {
            e e10 = aVar.e(i10);
            float g10 = aVar.g(i10);
            b bVar2 = this.f24488i;
            bVar2.f24489a = e10;
            boolean z11 = true;
            if (e10.f24491a) {
                for (int i11 = 0; i11 < 9; i11++) {
                    float[] fArr = bVar2.f24489a.f24498h;
                    float f10 = (eVar.f24498h[i11] * g10) + fArr[i11];
                    fArr[i11] = f10;
                    if (Math.abs(f10) < 1.0E-4f) {
                        bVar2.f24489a.f24498h[i11] = 0.0f;
                    } else {
                        z11 = false;
                    }
                }
                if (z11) {
                    d.this.k(bVar2.f24489a);
                }
                z11 = false;
            } else {
                for (int i12 = 0; i12 < 9; i12++) {
                    float f11 = eVar.f24498h[i12];
                    if (f11 != 0.0f) {
                        float f12 = f11 * g10;
                        if (Math.abs(f12) < 1.0E-4f) {
                            f12 = 0.0f;
                        }
                        bVar2.f24489a.f24498h[i12] = f12;
                    } else {
                        bVar2.f24489a.f24498h[i12] = 0.0f;
                    }
                }
            }
            if (z11) {
                j(e10);
            }
            this.f24464b = (bVar.f24464b * g10) + this.f24464b;
        }
        k(eVar);
    }

    public final void j(e eVar) {
        int i10;
        int i11 = this.f24487h + 1;
        e[] eVarArr = this.f24485f;
        if (i11 > eVarArr.length) {
            e[] eVarArr2 = (e[]) Arrays.copyOf(eVarArr, eVarArr.length * 2);
            this.f24485f = eVarArr2;
            this.f24486g = (e[]) Arrays.copyOf(eVarArr2, eVarArr2.length * 2);
        }
        e[] eVarArr3 = this.f24485f;
        int i12 = this.f24487h;
        eVarArr3[i12] = eVar;
        int i13 = i12 + 1;
        this.f24487h = i13;
        if (i13 > 1 && eVarArr3[i13 - 1].f24492b > eVar.f24492b) {
            int i14 = 0;
            while (true) {
                i10 = this.f24487h;
                if (i14 >= i10) {
                    break;
                }
                this.f24486g[i14] = this.f24485f[i14];
                i14++;
            }
            Arrays.sort(this.f24486g, 0, i10, new a());
            for (int i15 = 0; i15 < this.f24487h; i15++) {
                this.f24485f[i15] = this.f24486g[i15];
            }
        }
        eVar.f24491a = true;
        eVar.a(this);
    }

    public final void k(e eVar) {
        int i10 = 0;
        while (i10 < this.f24487h) {
            if (this.f24485f[i10] == eVar) {
                while (true) {
                    int i11 = this.f24487h;
                    if (i10 >= i11 - 1) {
                        this.f24487h = i11 - 1;
                        eVar.f24491a = false;
                        return;
                    }
                    e[] eVarArr = this.f24485f;
                    int i12 = i10 + 1;
                    eVarArr[i10] = eVarArr[i12];
                    i10 = i12;
                }
            } else {
                i10++;
            }
        }
    }

    @Override // q0.b
    public final String toString() {
        StringBuilder a10 = p.a.a("", " goal -> (");
        a10.append(this.f24464b);
        a10.append(") : ");
        String sb2 = a10.toString();
        for (int i10 = 0; i10 < this.f24487h; i10++) {
            this.f24488i.f24489a = this.f24485f[i10];
            StringBuilder a11 = android.support.v4.media.d.a(sb2);
            a11.append(this.f24488i);
            a11.append(" ");
            sb2 = a11.toString();
        }
        return sb2;
    }
}
