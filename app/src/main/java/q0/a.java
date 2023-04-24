package q0;

import java.util.Arrays;
import p.g;
import q0.b;

/* loaded from: classes.dex */
public final class a implements b.a {

    /* renamed from: b */
    public final b f24454b;

    /* renamed from: c */
    public final g f24455c;

    /* renamed from: a */
    public int f24453a = 0;

    /* renamed from: d */
    public int f24456d = 8;

    /* renamed from: e */
    public int[] f24457e = new int[8];

    /* renamed from: f */
    public int[] f24458f = new int[8];

    /* renamed from: g */
    public float[] f24459g = new float[8];

    /* renamed from: h */
    public int f24460h = -1;

    /* renamed from: i */
    public int f24461i = -1;

    /* renamed from: j */
    public boolean f24462j = false;

    public a(b bVar, g gVar) {
        this.f24454b = bVar;
        this.f24455c = gVar;
    }

    @Override // q0.b.a
    public final float a(e eVar, boolean z10) {
        int i10 = this.f24460h;
        if (i10 == -1) {
            return 0.0f;
        }
        int i11 = 0;
        int i12 = -1;
        while (i10 != -1 && i11 < this.f24453a) {
            if (this.f24457e[i10] == eVar.f24492b) {
                if (i10 == this.f24460h) {
                    this.f24460h = this.f24458f[i10];
                } else {
                    int[] iArr = this.f24458f;
                    iArr[i12] = iArr[i10];
                }
                if (z10) {
                    eVar.c(this.f24454b);
                }
                eVar.f24502l--;
                this.f24453a--;
                this.f24457e[i10] = -1;
                if (this.f24462j) {
                    this.f24461i = i10;
                }
                return this.f24459g[i10];
            }
            i11++;
            i12 = i10;
            i10 = this.f24458f[i10];
        }
        return 0.0f;
    }

    @Override // q0.b.a
    public final int b() {
        return this.f24453a;
    }

    @Override // q0.b.a
    public final void c(e eVar, float f10, boolean z10) {
        if (f10 <= -0.001f || f10 >= 0.001f) {
            int i10 = this.f24460h;
            if (i10 == -1) {
                this.f24460h = 0;
                this.f24459g[0] = f10;
                this.f24457e[0] = eVar.f24492b;
                this.f24458f[0] = -1;
                eVar.f24502l++;
                eVar.a(this.f24454b);
                this.f24453a++;
                if (this.f24462j) {
                    return;
                }
                int i11 = this.f24461i + 1;
                this.f24461i = i11;
                int[] iArr = this.f24457e;
                if (i11 >= iArr.length) {
                    this.f24462j = true;
                    this.f24461i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i12 = -1;
            for (int i13 = 0; i10 != -1 && i13 < this.f24453a; i13++) {
                int i14 = this.f24457e[i10];
                int i15 = eVar.f24492b;
                if (i14 == i15) {
                    float[] fArr = this.f24459g;
                    float f11 = fArr[i10] + f10;
                    if (f11 > -0.001f && f11 < 0.001f) {
                        f11 = 0.0f;
                    }
                    fArr[i10] = f11;
                    if (f11 == 0.0f) {
                        if (i10 == this.f24460h) {
                            this.f24460h = this.f24458f[i10];
                        } else {
                            int[] iArr2 = this.f24458f;
                            iArr2[i12] = iArr2[i10];
                        }
                        if (z10) {
                            eVar.c(this.f24454b);
                        }
                        if (this.f24462j) {
                            this.f24461i = i10;
                        }
                        eVar.f24502l--;
                        this.f24453a--;
                        return;
                    }
                    return;
                }
                if (i14 < i15) {
                    i12 = i10;
                }
                i10 = this.f24458f[i10];
            }
            int i16 = this.f24461i;
            int i17 = i16 + 1;
            if (this.f24462j) {
                int[] iArr3 = this.f24457e;
                if (iArr3[i16] != -1) {
                    i16 = iArr3.length;
                }
            } else {
                i16 = i17;
            }
            int[] iArr4 = this.f24457e;
            if (i16 >= iArr4.length && this.f24453a < iArr4.length) {
                int i18 = 0;
                while (true) {
                    int[] iArr5 = this.f24457e;
                    if (i18 >= iArr5.length) {
                        break;
                    } else if (iArr5[i18] == -1) {
                        i16 = i18;
                        break;
                    } else {
                        i18++;
                    }
                }
            }
            int[] iArr6 = this.f24457e;
            if (i16 >= iArr6.length) {
                i16 = iArr6.length;
                int i19 = this.f24456d * 2;
                this.f24456d = i19;
                this.f24462j = false;
                this.f24461i = i16 - 1;
                this.f24459g = Arrays.copyOf(this.f24459g, i19);
                this.f24457e = Arrays.copyOf(this.f24457e, this.f24456d);
                this.f24458f = Arrays.copyOf(this.f24458f, this.f24456d);
            }
            this.f24457e[i16] = eVar.f24492b;
            this.f24459g[i16] = f10;
            int[] iArr7 = this.f24458f;
            if (i12 != -1) {
                iArr7[i16] = iArr7[i12];
                iArr7[i12] = i16;
            } else {
                iArr7[i16] = this.f24460h;
                this.f24460h = i16;
            }
            eVar.f24502l++;
            eVar.a(this.f24454b);
            this.f24453a++;
            if (!this.f24462j) {
                this.f24461i++;
            }
            int i20 = this.f24461i;
            int[] iArr8 = this.f24457e;
            if (i20 >= iArr8.length) {
                this.f24462j = true;
                this.f24461i = iArr8.length - 1;
            }
        }
    }

    @Override // q0.b.a
    public final void clear() {
        int i10 = this.f24460h;
        for (int i11 = 0; i10 != -1 && i11 < this.f24453a; i11++) {
            e eVar = ((e[]) this.f24455c.f23729d)[this.f24457e[i10]];
            if (eVar != null) {
                eVar.c(this.f24454b);
            }
            i10 = this.f24458f[i10];
        }
        this.f24460h = -1;
        this.f24461i = -1;
        this.f24462j = false;
        this.f24453a = 0;
    }

    @Override // q0.b.a
    public final float d(b bVar, boolean z10) {
        float j10 = j(bVar.f24463a);
        a(bVar.f24463a, z10);
        b.a aVar = bVar.f24466d;
        int b10 = aVar.b();
        for (int i10 = 0; i10 < b10; i10++) {
            e e10 = aVar.e(i10);
            c(e10, aVar.j(e10) * j10, z10);
        }
        return j10;
    }

    @Override // q0.b.a
    public final e e(int i10) {
        int i11 = this.f24460h;
        for (int i12 = 0; i11 != -1 && i12 < this.f24453a; i12++) {
            if (i12 == i10) {
                return ((e[]) this.f24455c.f23729d)[this.f24457e[i11]];
            }
            i11 = this.f24458f[i11];
        }
        return null;
    }

    @Override // q0.b.a
    public final void f() {
        int i10 = this.f24460h;
        for (int i11 = 0; i10 != -1 && i11 < this.f24453a; i11++) {
            float[] fArr = this.f24459g;
            fArr[i10] = fArr[i10] * (-1.0f);
            i10 = this.f24458f[i10];
        }
    }

    @Override // q0.b.a
    public final float g(int i10) {
        int i11 = this.f24460h;
        for (int i12 = 0; i11 != -1 && i12 < this.f24453a; i12++) {
            if (i12 == i10) {
                return this.f24459g[i11];
            }
            i11 = this.f24458f[i11];
        }
        return 0.0f;
    }

    @Override // q0.b.a
    public final boolean h(e eVar) {
        int i10 = this.f24460h;
        if (i10 == -1) {
            return false;
        }
        for (int i11 = 0; i10 != -1 && i11 < this.f24453a; i11++) {
            if (this.f24457e[i10] == eVar.f24492b) {
                return true;
            }
            i10 = this.f24458f[i10];
        }
        return false;
    }

    @Override // q0.b.a
    public final void i(e eVar, float f10) {
        if (f10 == 0.0f) {
            a(eVar, true);
            return;
        }
        int i10 = this.f24460h;
        if (i10 == -1) {
            this.f24460h = 0;
            this.f24459g[0] = f10;
            this.f24457e[0] = eVar.f24492b;
            this.f24458f[0] = -1;
            eVar.f24502l++;
            eVar.a(this.f24454b);
            this.f24453a++;
            if (this.f24462j) {
                return;
            }
            int i11 = this.f24461i + 1;
            this.f24461i = i11;
            int[] iArr = this.f24457e;
            if (i11 >= iArr.length) {
                this.f24462j = true;
                this.f24461i = iArr.length - 1;
                return;
            }
            return;
        }
        int i12 = -1;
        for (int i13 = 0; i10 != -1 && i13 < this.f24453a; i13++) {
            int i14 = this.f24457e[i10];
            int i15 = eVar.f24492b;
            if (i14 == i15) {
                this.f24459g[i10] = f10;
                return;
            }
            if (i14 < i15) {
                i12 = i10;
            }
            i10 = this.f24458f[i10];
        }
        int i16 = this.f24461i;
        int i17 = i16 + 1;
        if (this.f24462j) {
            int[] iArr2 = this.f24457e;
            if (iArr2[i16] != -1) {
                i16 = iArr2.length;
            }
        } else {
            i16 = i17;
        }
        int[] iArr3 = this.f24457e;
        if (i16 >= iArr3.length && this.f24453a < iArr3.length) {
            int i18 = 0;
            while (true) {
                int[] iArr4 = this.f24457e;
                if (i18 >= iArr4.length) {
                    break;
                } else if (iArr4[i18] == -1) {
                    i16 = i18;
                    break;
                } else {
                    i18++;
                }
            }
        }
        int[] iArr5 = this.f24457e;
        if (i16 >= iArr5.length) {
            i16 = iArr5.length;
            int i19 = this.f24456d * 2;
            this.f24456d = i19;
            this.f24462j = false;
            this.f24461i = i16 - 1;
            this.f24459g = Arrays.copyOf(this.f24459g, i19);
            this.f24457e = Arrays.copyOf(this.f24457e, this.f24456d);
            this.f24458f = Arrays.copyOf(this.f24458f, this.f24456d);
        }
        this.f24457e[i16] = eVar.f24492b;
        this.f24459g[i16] = f10;
        int[] iArr6 = this.f24458f;
        if (i12 != -1) {
            iArr6[i16] = iArr6[i12];
            iArr6[i12] = i16;
        } else {
            iArr6[i16] = this.f24460h;
            this.f24460h = i16;
        }
        eVar.f24502l++;
        eVar.a(this.f24454b);
        int i20 = this.f24453a + 1;
        this.f24453a = i20;
        if (!this.f24462j) {
            this.f24461i++;
        }
        int[] iArr7 = this.f24457e;
        if (i20 >= iArr7.length) {
            this.f24462j = true;
        }
        if (this.f24461i >= iArr7.length) {
            this.f24462j = true;
            this.f24461i = iArr7.length - 1;
        }
    }

    @Override // q0.b.a
    public final float j(e eVar) {
        int i10 = this.f24460h;
        for (int i11 = 0; i10 != -1 && i11 < this.f24453a; i11++) {
            if (this.f24457e[i10] == eVar.f24492b) {
                return this.f24459g[i10];
            }
            i10 = this.f24458f[i10];
        }
        return 0.0f;
    }

    @Override // q0.b.a
    public final void k(float f10) {
        int i10 = this.f24460h;
        for (int i11 = 0; i10 != -1 && i11 < this.f24453a; i11++) {
            float[] fArr = this.f24459g;
            fArr[i10] = fArr[i10] / f10;
            i10 = this.f24458f[i10];
        }
    }

    public final String toString() {
        int i10 = this.f24460h;
        String str = "";
        for (int i11 = 0; i10 != -1 && i11 < this.f24453a; i11++) {
            StringBuilder a10 = android.support.v4.media.d.a(a.b.b(str, " -> "));
            a10.append(this.f24459g[i10]);
            a10.append(" : ");
            StringBuilder a11 = android.support.v4.media.d.a(a10.toString());
            a11.append(((e[]) this.f24455c.f23729d)[this.f24457e[i10]]);
            str = a11.toString();
            i10 = this.f24458f[i10];
        }
        return str;
    }
}
