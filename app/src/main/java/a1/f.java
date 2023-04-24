package a1;

import android.graphics.Path;
import android.util.Log;

/* loaded from: classes.dex */
public final class f {

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public char f219a;

        /* renamed from: b */
        public float[] f220b;

        public a(char c10, float[] fArr) {
            this.f219a = c10;
            this.f220b = fArr;
        }

        public a(a aVar) {
            this.f219a = aVar.f219a;
            float[] fArr = aVar.f220b;
            this.f220b = f.b(fArr, fArr.length);
        }

        public static void a(Path path, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z10, boolean z11) {
            double d10;
            double d11;
            double radians = Math.toRadians(f16);
            double cos = Math.cos(radians);
            double sin = Math.sin(radians);
            double d12 = f10;
            double d13 = f11;
            double d14 = (d13 * sin) + (d12 * cos);
            double d15 = d12;
            double d16 = f14;
            double d17 = d14 / d16;
            double d18 = f15;
            double d19 = ((d13 * cos) + ((-f10) * sin)) / d18;
            double d20 = d13;
            double d21 = f13;
            double d22 = ((d21 * sin) + (f12 * cos)) / d16;
            double d23 = ((d21 * cos) + ((-f12) * sin)) / d18;
            double d24 = d17 - d22;
            double d25 = d19 - d23;
            double d26 = (d17 + d22) / 2.0d;
            double d27 = (d19 + d23) / 2.0d;
            double d28 = (d25 * d25) + (d24 * d24);
            if (d28 == 0.0d) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double d29 = (1.0d / d28) - 0.25d;
            if (d29 < 0.0d) {
                Log.w("PathParser", "Points are too far apart " + d28);
                float sqrt = (float) (Math.sqrt(d28) / 1.99999d);
                a(path, f10, f11, f12, f13, f14 * sqrt, f15 * sqrt, f16, z10, z11);
                return;
            }
            double sqrt2 = Math.sqrt(d29);
            double d30 = d24 * sqrt2;
            double d31 = sqrt2 * d25;
            if (z10 == z11) {
                d10 = d26 - d31;
                d11 = d27 + d30;
            } else {
                d10 = d26 + d31;
                d11 = d27 - d30;
            }
            double atan2 = Math.atan2(d19 - d11, d17 - d10);
            double atan22 = Math.atan2(d23 - d11, d22 - d10) - atan2;
            int i10 = 0;
            int i11 = (atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1));
            if (z11 != (i11 >= 0)) {
                atan22 = i11 > 0 ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
            }
            double d32 = d10 * d16;
            double d33 = d11 * d18;
            double d34 = (d32 * cos) - (d33 * sin);
            double d35 = (d33 * cos) + (d32 * sin);
            int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
            double cos2 = Math.cos(radians);
            double sin2 = Math.sin(radians);
            double cos3 = Math.cos(atan2);
            double sin3 = Math.sin(atan2);
            double d36 = -d16;
            double d37 = d36 * cos2;
            double d38 = d18 * sin2;
            double d39 = (d37 * sin3) - (d38 * cos3);
            double d40 = d36 * sin2;
            double d41 = d18 * cos2;
            double d42 = (cos3 * d41) + (sin3 * d40);
            double d43 = atan22 / ceil;
            double d44 = atan2;
            while (i10 < ceil) {
                double d45 = d44 + d43;
                double sin4 = Math.sin(d45);
                double cos4 = Math.cos(d45);
                double d46 = d43;
                double d47 = (((d16 * cos2) * cos4) + d34) - (d38 * sin4);
                double d48 = d34;
                double d49 = (d41 * sin4) + (d16 * sin2 * cos4) + d35;
                double d50 = (d37 * sin4) - (d38 * cos4);
                double d51 = (cos4 * d41) + (sin4 * d40);
                double d52 = d45 - d44;
                double tan = Math.tan(d52 / 2.0d);
                double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d52)) / 3.0d;
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) ((d39 * sqrt3) + d15), (float) ((d42 * sqrt3) + d20), (float) (d47 - (sqrt3 * d50)), (float) (d49 - (sqrt3 * d51)), (float) d47, (float) d49);
                i10++;
                d41 = d41;
                d40 = d40;
                ceil = ceil;
                cos2 = cos2;
                d44 = d45;
                d16 = d16;
                d42 = d51;
                d39 = d50;
                d15 = d47;
                d20 = d49;
                d43 = d46;
                d34 = d48;
            }
        }

        public static void b(a[] aVarArr, Path path) {
            int i10;
            int i11;
            float[] fArr;
            char c10;
            int i12;
            boolean z10;
            boolean z11;
            float f10;
            float f11;
            boolean z12;
            boolean z13;
            float f12;
            float f13;
            float f14;
            float f15;
            float f16;
            float f17;
            float f18;
            float f19;
            float f20;
            float f21;
            float f22;
            float f23;
            float f24;
            float f25;
            float f26;
            float f27;
            float f28;
            float f29;
            float f30;
            a[] aVarArr2 = aVarArr;
            float[] fArr2 = new float[6];
            char c11 = 'm';
            char c12 = 0;
            char c13 = 'm';
            int i13 = 0;
            while (i13 < aVarArr2.length) {
                a aVar = aVarArr2[i13];
                char c14 = aVar.f219a;
                float[] fArr3 = aVar.f220b;
                float f31 = fArr2[c12];
                float f32 = fArr2[1];
                float f33 = fArr2[2];
                float f34 = fArr2[3];
                float f35 = fArr2[4];
                float f36 = fArr2[5];
                switch (c14) {
                    case 'A':
                    case 'a':
                        i10 = 7;
                        break;
                    case 'C':
                    case 'c':
                        i10 = 6;
                        break;
                    case 'H':
                    case 'V':
                    case 'h':
                    case 'v':
                        i10 = 1;
                        break;
                    case 'Q':
                    case 'S':
                    case 'q':
                    case 's':
                        i10 = 4;
                        break;
                    case 'Z':
                    case 'z':
                        path.close();
                        path.moveTo(f35, f36);
                        f31 = f35;
                        f33 = f31;
                        f32 = f36;
                        f34 = f32;
                    default:
                        i10 = 2;
                        break;
                }
                float f37 = f35;
                float f38 = f36;
                float f39 = f31;
                float f40 = f32;
                int i14 = 0;
                while (i14 < fArr3.length) {
                    if (c14 != 'A') {
                        if (c14 != 'C') {
                            if (c14 != 'H') {
                                if (c14 != 'Q') {
                                    if (c14 != 'V') {
                                        if (c14 != 'a') {
                                            if (c14 != 'c') {
                                                if (c14 != 'h') {
                                                    if (c14 != 'q') {
                                                        if (c14 != 'v') {
                                                            if (c14 != 'L') {
                                                                if (c14 != 'M') {
                                                                    if (c14 != 'S') {
                                                                        if (c14 != 'T') {
                                                                            if (c14 != 'l') {
                                                                                if (c14 != c11) {
                                                                                    if (c14 != 's') {
                                                                                        if (c14 == 't') {
                                                                                            if (c13 != 'q' && c13 != 't' && c13 != 'Q' && c13 != 'T') {
                                                                                                f30 = 0.0f;
                                                                                                f29 = 0.0f;
                                                                                            } else {
                                                                                                f29 = f39 - f33;
                                                                                                f30 = f40 - f34;
                                                                                            }
                                                                                            int i15 = i14 + 0;
                                                                                            int i16 = i14 + 1;
                                                                                            path.rQuadTo(f29, f30, fArr3[i15], fArr3[i16]);
                                                                                            float f41 = f29 + f39;
                                                                                            float f42 = f30 + f40;
                                                                                            f39 += fArr3[i15];
                                                                                            f40 += fArr3[i16];
                                                                                            f34 = f42;
                                                                                            f33 = f41;
                                                                                        }
                                                                                        i11 = i14;
                                                                                    } else {
                                                                                        if (c13 != 'c' && c13 != 's' && c13 != 'C' && c13 != 'S') {
                                                                                            f28 = 0.0f;
                                                                                            f27 = 0.0f;
                                                                                        } else {
                                                                                            f27 = f40 - f34;
                                                                                            f28 = f39 - f33;
                                                                                        }
                                                                                        int i17 = i14 + 0;
                                                                                        int i18 = i14 + 1;
                                                                                        int i19 = i14 + 2;
                                                                                        int i20 = i14 + 3;
                                                                                        i11 = i14;
                                                                                        f12 = f40;
                                                                                        float f43 = f39;
                                                                                        path.rCubicTo(f28, f27, fArr3[i17], fArr3[i18], fArr3[i19], fArr3[i20]);
                                                                                        f13 = fArr3[i17] + f43;
                                                                                        f14 = fArr3[i18] + f12;
                                                                                        f15 = f43 + fArr3[i19];
                                                                                        f16 = fArr3[i20];
                                                                                    }
                                                                                } else {
                                                                                    i11 = i14;
                                                                                    float f44 = fArr3[i11 + 0];
                                                                                    f39 += f44;
                                                                                    float f45 = fArr3[i11 + 1];
                                                                                    f40 += f45;
                                                                                    if (i11 > 0) {
                                                                                        path.rLineTo(f44, f45);
                                                                                    } else {
                                                                                        path.rMoveTo(f44, f45);
                                                                                        f38 = f40;
                                                                                        f37 = f39;
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                i11 = i14;
                                                                                f19 = f40;
                                                                                int i21 = i11 + 0;
                                                                                int i22 = i11 + 1;
                                                                                path.rLineTo(fArr3[i21], fArr3[i22]);
                                                                                f39 += fArr3[i21];
                                                                                f20 = fArr3[i22];
                                                                            }
                                                                        } else {
                                                                            i11 = i14;
                                                                            float f46 = f40;
                                                                            float f47 = f39;
                                                                            if (c13 != 'q' && c13 != 't' && c13 != 'Q' && c13 != 'T') {
                                                                                f25 = f47;
                                                                                f26 = f46;
                                                                            } else {
                                                                                f25 = (f47 * 2.0f) - f33;
                                                                                f26 = (f46 * 2.0f) - f34;
                                                                            }
                                                                            int i23 = i11 + 0;
                                                                            int i24 = i11 + 1;
                                                                            path.quadTo(f25, f26, fArr3[i23], fArr3[i24]);
                                                                            f34 = f26;
                                                                            f33 = f25;
                                                                            fArr = fArr3;
                                                                            c10 = c14;
                                                                            i12 = i13;
                                                                            f39 = fArr3[i23];
                                                                            f40 = fArr3[i24];
                                                                        }
                                                                    } else {
                                                                        i11 = i14;
                                                                        float f48 = f40;
                                                                        float f49 = f39;
                                                                        if (c13 != 'c' && c13 != 's' && c13 != 'C' && c13 != 'S') {
                                                                            f24 = f49;
                                                                            f23 = f48;
                                                                        } else {
                                                                            f23 = (f48 * 2.0f) - f34;
                                                                            f24 = (f49 * 2.0f) - f33;
                                                                        }
                                                                        int i25 = i11 + 0;
                                                                        int i26 = i11 + 1;
                                                                        int i27 = i11 + 2;
                                                                        int i28 = i11 + 3;
                                                                        path.cubicTo(f24, f23, fArr3[i25], fArr3[i26], fArr3[i27], fArr3[i28]);
                                                                        float f50 = fArr3[i25];
                                                                        float f51 = fArr3[i26];
                                                                        f18 = fArr3[i27];
                                                                        f17 = fArr3[i28];
                                                                        f33 = f50;
                                                                        f34 = f51;
                                                                        f39 = f18;
                                                                        f40 = f17;
                                                                    }
                                                                } else {
                                                                    i11 = i14;
                                                                    f21 = fArr3[i11 + 0];
                                                                    f22 = fArr3[i11 + 1];
                                                                    if (i11 > 0) {
                                                                        path.lineTo(f21, f22);
                                                                    } else {
                                                                        path.moveTo(f21, f22);
                                                                        f37 = f21;
                                                                        f38 = f22;
                                                                    }
                                                                }
                                                                f39 = f37;
                                                                f40 = f38;
                                                            } else {
                                                                i11 = i14;
                                                                int i29 = i11 + 0;
                                                                int i30 = i11 + 1;
                                                                path.lineTo(fArr3[i29], fArr3[i30]);
                                                                f21 = fArr3[i29];
                                                                f22 = fArr3[i30];
                                                            }
                                                            f39 = f21;
                                                            f40 = f22;
                                                        } else {
                                                            i11 = i14;
                                                            f19 = f40;
                                                            int i31 = i11 + 0;
                                                            path.rLineTo(0.0f, fArr3[i31]);
                                                            f20 = fArr3[i31];
                                                        }
                                                        f40 = f19 + f20;
                                                    } else {
                                                        i11 = i14;
                                                        f12 = f40;
                                                        float f52 = f39;
                                                        int i32 = i11 + 0;
                                                        int i33 = i11 + 1;
                                                        int i34 = i11 + 2;
                                                        int i35 = i11 + 3;
                                                        path.rQuadTo(fArr3[i32], fArr3[i33], fArr3[i34], fArr3[i35]);
                                                        f13 = fArr3[i32] + f52;
                                                        f14 = fArr3[i33] + f12;
                                                        float f53 = f52 + fArr3[i34];
                                                        float f54 = fArr3[i35];
                                                        f15 = f53;
                                                        f16 = f54;
                                                    }
                                                } else {
                                                    i11 = i14;
                                                    int i36 = i11 + 0;
                                                    path.rLineTo(fArr3[i36], 0.0f);
                                                    f39 += fArr3[i36];
                                                }
                                                fArr = fArr3;
                                                c10 = c14;
                                                i12 = i13;
                                            } else {
                                                i11 = i14;
                                                f12 = f40;
                                                float f55 = f39;
                                                int i37 = i11 + 2;
                                                int i38 = i11 + 3;
                                                int i39 = i11 + 4;
                                                int i40 = i11 + 5;
                                                path.rCubicTo(fArr3[i11 + 0], fArr3[i11 + 1], fArr3[i37], fArr3[i38], fArr3[i39], fArr3[i40]);
                                                f13 = fArr3[i37] + f55;
                                                f14 = fArr3[i38] + f12;
                                                f15 = f55 + fArr3[i39];
                                                f16 = fArr3[i40];
                                            }
                                            f17 = f12 + f16;
                                            f33 = f13;
                                            f34 = f14;
                                            f18 = f15;
                                            f39 = f18;
                                            f40 = f17;
                                            fArr = fArr3;
                                            c10 = c14;
                                            i12 = i13;
                                        } else {
                                            i11 = i14;
                                            float f56 = f40;
                                            float f57 = f39;
                                            int i41 = i11 + 5;
                                            float f58 = fArr3[i41] + f57;
                                            int i42 = i11 + 6;
                                            float f59 = fArr3[i42] + f56;
                                            float f60 = fArr3[i11 + 0];
                                            float f61 = fArr3[i11 + 1];
                                            float f62 = fArr3[i11 + 2];
                                            if (fArr3[i11 + 3] != 0.0f) {
                                                z12 = true;
                                            } else {
                                                z12 = false;
                                            }
                                            if (fArr3[i11 + 4] != 0.0f) {
                                                z13 = true;
                                            } else {
                                                z13 = false;
                                            }
                                            fArr = fArr3;
                                            c10 = c14;
                                            i12 = i13;
                                            a(path, f57, f56, f58, f59, f60, f61, f62, z12, z13);
                                            f39 = f57 + fArr[i41];
                                            f40 = f56 + fArr[i42];
                                        }
                                    } else {
                                        i11 = i14;
                                        fArr = fArr3;
                                        c10 = c14;
                                        i12 = i13;
                                        int i43 = i11 + 0;
                                        path.lineTo(f39, fArr[i43]);
                                        f40 = fArr[i43];
                                    }
                                } else {
                                    i11 = i14;
                                    fArr = fArr3;
                                    c10 = c14;
                                    i12 = i13;
                                    int i44 = i11 + 0;
                                    int i45 = i11 + 1;
                                    int i46 = i11 + 2;
                                    int i47 = i11 + 3;
                                    path.quadTo(fArr[i44], fArr[i45], fArr[i46], fArr[i47]);
                                    f10 = fArr[i44];
                                    f11 = fArr[i45];
                                    f39 = fArr[i46];
                                    f40 = fArr[i47];
                                }
                            } else {
                                i11 = i14;
                                fArr = fArr3;
                                c10 = c14;
                                i12 = i13;
                                int i48 = i11 + 0;
                                path.lineTo(fArr[i48], f40);
                                f39 = fArr[i48];
                            }
                            i14 = i11 + i10;
                            c13 = c10;
                            c14 = c13;
                            fArr3 = fArr;
                            i13 = i12;
                            c11 = 'm';
                        } else {
                            i11 = i14;
                            fArr = fArr3;
                            c10 = c14;
                            i12 = i13;
                            int i49 = i11 + 2;
                            int i50 = i11 + 3;
                            int i51 = i11 + 4;
                            int i52 = i11 + 5;
                            path.cubicTo(fArr[i11 + 0], fArr[i11 + 1], fArr[i49], fArr[i50], fArr[i51], fArr[i52]);
                            float f63 = fArr[i51];
                            float f64 = fArr[i52];
                            f10 = fArr[i49];
                            f39 = f63;
                            f40 = f64;
                            f11 = fArr[i50];
                        }
                        f33 = f10;
                        f34 = f11;
                        i14 = i11 + i10;
                        c13 = c10;
                        c14 = c13;
                        fArr3 = fArr;
                        i13 = i12;
                        c11 = 'm';
                    } else {
                        i11 = i14;
                        float f65 = f40;
                        float f66 = f39;
                        fArr = fArr3;
                        c10 = c14;
                        i12 = i13;
                        int i53 = i11 + 5;
                        float f67 = fArr[i53];
                        int i54 = i11 + 6;
                        float f68 = fArr[i54];
                        float f69 = fArr[i11 + 0];
                        float f70 = fArr[i11 + 1];
                        float f71 = fArr[i11 + 2];
                        if (fArr[i11 + 3] != 0.0f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (fArr[i11 + 4] != 0.0f) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        a(path, f66, f65, f67, f68, f69, f70, f71, z10, z11);
                        f39 = fArr[i53];
                        f40 = fArr[i54];
                    }
                    f34 = f40;
                    f33 = f39;
                    i14 = i11 + i10;
                    c13 = c10;
                    c14 = c13;
                    fArr3 = fArr;
                    i13 = i12;
                    c11 = 'm';
                }
                int i55 = i13;
                fArr2[0] = f39;
                fArr2[1] = f40;
                fArr2[2] = f33;
                fArr2[3] = f34;
                fArr2[4] = f37;
                fArr2[5] = f38;
                i13 = i55 + 1;
                c13 = aVarArr[i55].f219a;
                c11 = 'm';
                c12 = 0;
                aVarArr2 = aVarArr;
            }
        }
    }

    public static boolean a(a[] aVarArr, a[] aVarArr2) {
        if (aVarArr == null || aVarArr2 == null || aVarArr.length != aVarArr2.length) {
            return false;
        }
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            a aVar = aVarArr[i10];
            char c10 = aVar.f219a;
            a aVar2 = aVarArr2[i10];
            if (c10 != aVar2.f219a || aVar.f220b.length != aVar2.f220b.length) {
                return false;
            }
        }
        return true;
    }

    public static float[] b(float[] fArr, int i10) {
        if (i10 >= 0) {
            int length = fArr.length;
            if (length >= 0) {
                int i11 = i10 - 0;
                int min = Math.min(i11, length - 0);
                float[] fArr2 = new float[i11];
                System.arraycopy(fArr, 0, fArr2, 0, min);
                return fArr2;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x008b, code lost:
        if (r13 == false) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0098 A[Catch: NumberFormatException -> 0x00b9, LOOP:3: B:115:0x006d->B:135:0x0098, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00b9, blocks: (B:112:0x005a, B:115:0x006d, B:117:0x0073, B:122:0x0081, B:135:0x0098, B:137:0x009d, B:140:0x00ad, B:142:0x00b1), top: B:157:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x009d A[Catch: NumberFormatException -> 0x00b9, TryCatch #0 {NumberFormatException -> 0x00b9, blocks: (B:112:0x005a, B:115:0x006d, B:117:0x0073, B:122:0x0081, B:135:0x0098, B:137:0x009d, B:140:0x00ad, B:142:0x00b1), top: B:157:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00ad A[Catch: NumberFormatException -> 0x00b9, TryCatch #0 {NumberFormatException -> 0x00b9, blocks: (B:112:0x005a, B:115:0x006d, B:117:0x0073, B:122:0x0081, B:135:0x0098, B:137:0x009d, B:140:0x00ad, B:142:0x00b1), top: B:157:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0097 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static a1.f.a[] c(java.lang.String r16) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.f.c(java.lang.String):a1.f$a[]");
    }

    public static Path d(String str) {
        Path path = new Path();
        a[] c10 = c(str);
        if (c10 != null) {
            try {
                a.b(c10, path);
                return path;
            } catch (RuntimeException e10) {
                throw new RuntimeException(a.b.b("Error in parsing ", str), e10);
            }
        }
        return null;
    }

    public static a[] e(a[] aVarArr) {
        if (aVarArr == null) {
            return null;
        }
        a[] aVarArr2 = new a[aVarArr.length];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            aVarArr2[i10] = new a(aVarArr[i10]);
        }
        return aVarArr2;
    }
}
