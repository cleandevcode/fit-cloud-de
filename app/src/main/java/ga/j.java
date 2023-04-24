package ga;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import ga.f;
import ga.l;
import java.util.ArrayList;
import java.util.BitSet;
import pm.g0;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a */
    public final l[] f15141a = new l[4];

    /* renamed from: b */
    public final Matrix[] f15142b = new Matrix[4];

    /* renamed from: c */
    public final Matrix[] f15143c = new Matrix[4];

    /* renamed from: d */
    public final PointF f15144d = new PointF();

    /* renamed from: e */
    public final Path f15145e = new Path();

    /* renamed from: f */
    public final Path f15146f = new Path();

    /* renamed from: g */
    public final l f15147g = new l();

    /* renamed from: h */
    public final float[] f15148h = new float[2];

    /* renamed from: i */
    public final float[] f15149i = new float[2];

    /* renamed from: j */
    public final Path f15150j = new Path();

    /* renamed from: k */
    public final Path f15151k = new Path();

    /* renamed from: l */
    public boolean f15152l = true;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public static final j f15153a = new j();
    }

    public j() {
        for (int i10 = 0; i10 < 4; i10++) {
            this.f15141a[i10] = new l();
            this.f15142b[i10] = new Matrix();
            this.f15143c[i10] = new Matrix();
        }
    }

    public final void a(i iVar, float f10, RectF rectF, f.a aVar, Path path) {
        int i10;
        float[] fArr;
        float centerX;
        float f11;
        e eVar;
        l lVar;
        Matrix matrix;
        Path path2;
        c cVar;
        g0 g0Var;
        float f12;
        float f13;
        path.rewind();
        this.f15145e.rewind();
        this.f15146f.rewind();
        this.f15146f.addRect(rectF, Path.Direction.CW);
        int i11 = 0;
        while (true) {
            if (i11 >= 4) {
                break;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        cVar = iVar.f15122f;
                    } else {
                        cVar = iVar.f15121e;
                    }
                } else {
                    cVar = iVar.f15124h;
                }
            } else {
                cVar = iVar.f15123g;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        g0Var = iVar.f15118b;
                    } else {
                        g0Var = iVar.f15117a;
                    }
                } else {
                    g0Var = iVar.f15120d;
                }
            } else {
                g0Var = iVar.f15119c;
            }
            l lVar2 = this.f15141a[i11];
            g0Var.getClass();
            g0Var.g(f10, cVar.a(rectF), lVar2);
            int i12 = i11 + 1;
            float f14 = i12 * 90;
            this.f15142b[i11].reset();
            PointF pointF = this.f15144d;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        f12 = rectF.right;
                    } else {
                        f12 = rectF.left;
                    }
                    f13 = rectF.top;
                    pointF.set(f12, f13);
                    Matrix matrix2 = this.f15142b[i11];
                    PointF pointF2 = this.f15144d;
                    matrix2.setTranslate(pointF2.x, pointF2.y);
                    this.f15142b[i11].preRotate(f14);
                    float[] fArr2 = this.f15148h;
                    l lVar3 = this.f15141a[i11];
                    fArr2[0] = lVar3.f15158c;
                    fArr2[1] = lVar3.f15159d;
                    this.f15142b[i11].mapPoints(fArr2);
                    this.f15143c[i11].reset();
                    Matrix matrix3 = this.f15143c[i11];
                    float[] fArr3 = this.f15148h;
                    matrix3.setTranslate(fArr3[0], fArr3[1]);
                    this.f15143c[i11].preRotate(f14);
                    i11 = i12;
                } else {
                    f12 = rectF.left;
                }
            } else {
                f12 = rectF.right;
            }
            f13 = rectF.bottom;
            pointF.set(f12, f13);
            Matrix matrix22 = this.f15142b[i11];
            PointF pointF22 = this.f15144d;
            matrix22.setTranslate(pointF22.x, pointF22.y);
            this.f15142b[i11].preRotate(f14);
            float[] fArr22 = this.f15148h;
            l lVar32 = this.f15141a[i11];
            fArr22[0] = lVar32.f15158c;
            fArr22[1] = lVar32.f15159d;
            this.f15142b[i11].mapPoints(fArr22);
            this.f15143c[i11].reset();
            Matrix matrix32 = this.f15143c[i11];
            float[] fArr32 = this.f15148h;
            matrix32.setTranslate(fArr32[0], fArr32[1]);
            this.f15143c[i11].preRotate(f14);
            i11 = i12;
        }
        int i13 = 0;
        for (i10 = 4; i13 < i10; i10 = 4) {
            float[] fArr4 = this.f15148h;
            l lVar4 = this.f15141a[i13];
            fArr4[0] = lVar4.f15156a;
            fArr4[1] = lVar4.f15157b;
            this.f15142b[i13].mapPoints(fArr4);
            float[] fArr5 = this.f15148h;
            if (i13 == 0) {
                path.moveTo(fArr5[0], fArr5[1]);
            } else {
                path.lineTo(fArr5[0], fArr5[1]);
            }
            this.f15141a[i13].c(this.f15142b[i13], path);
            if (aVar != null) {
                l lVar5 = this.f15141a[i13];
                Matrix matrix4 = this.f15142b[i13];
                BitSet bitSet = f.this.f15072d;
                lVar5.getClass();
                bitSet.set(i13, false);
                l.f[] fVarArr = f.this.f15070b;
                lVar5.b(lVar5.f15161f);
                fVarArr[i13] = new k(new ArrayList(lVar5.f15163h), new Matrix(matrix4));
            }
            int i14 = i13 + 1;
            int i15 = i14 % 4;
            float[] fArr6 = this.f15148h;
            l lVar6 = this.f15141a[i13];
            fArr6[0] = lVar6.f15158c;
            fArr6[1] = lVar6.f15159d;
            this.f15142b[i13].mapPoints(fArr6);
            float[] fArr7 = this.f15149i;
            l lVar7 = this.f15141a[i15];
            fArr7[0] = lVar7.f15156a;
            fArr7[1] = lVar7.f15157b;
            this.f15142b[i15].mapPoints(fArr7);
            float f15 = this.f15148h[0];
            float[] fArr8 = this.f15149i;
            float max = Math.max(((float) Math.hypot(f15 - fArr8[0], fArr[1] - fArr8[1])) - 0.001f, 0.0f);
            float[] fArr9 = this.f15148h;
            l lVar8 = this.f15141a[i13];
            fArr9[0] = lVar8.f15158c;
            fArr9[1] = lVar8.f15159d;
            this.f15142b[i13].mapPoints(fArr9);
            if (i13 != 1 && i13 != 3) {
                centerX = rectF.centerY();
                f11 = this.f15148h[1];
            } else {
                centerX = rectF.centerX();
                f11 = this.f15148h[0];
            }
            float abs = Math.abs(centerX - f11);
            this.f15147g.e(0.0f, 270.0f, 0.0f);
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 != 3) {
                        eVar = iVar.f15126j;
                    } else {
                        eVar = iVar.f15125i;
                    }
                } else {
                    eVar = iVar.f15128l;
                }
            } else {
                eVar = iVar.f15127k;
            }
            eVar.a(max, abs, f10, this.f15147g);
            this.f15150j.reset();
            this.f15147g.c(this.f15143c[i13], this.f15150j);
            if (this.f15152l && (b(this.f15150j, i13) || b(this.f15150j, i15))) {
                Path path3 = this.f15150j;
                path3.op(path3, this.f15146f, Path.Op.DIFFERENCE);
                float[] fArr10 = this.f15148h;
                l lVar9 = this.f15147g;
                fArr10[0] = lVar9.f15156a;
                fArr10[1] = lVar9.f15157b;
                this.f15143c[i13].mapPoints(fArr10);
                Path path4 = this.f15145e;
                float[] fArr11 = this.f15148h;
                path4.moveTo(fArr11[0], fArr11[1]);
                lVar = this.f15147g;
                matrix = this.f15143c[i13];
                path2 = this.f15145e;
            } else {
                lVar = this.f15147g;
                matrix = this.f15143c[i13];
                path2 = path;
            }
            lVar.c(matrix, path2);
            if (aVar != null) {
                l lVar10 = this.f15147g;
                Matrix matrix5 = this.f15143c[i13];
                lVar10.getClass();
                f.this.f15072d.set(i13 + 4, false);
                l.f[] fVarArr2 = f.this.f15071c;
                lVar10.b(lVar10.f15161f);
                fVarArr2[i13] = new k(new ArrayList(lVar10.f15163h), new Matrix(matrix5));
            }
            i13 = i14;
        }
        path.close();
        this.f15145e.close();
        if (!this.f15145e.isEmpty()) {
            path.op(this.f15145e, Path.Op.UNION);
        }
    }

    public final boolean b(Path path, int i10) {
        this.f15151k.reset();
        this.f15141a[i10].c(this.f15142b[i10], this.f15151k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f15151k.computeBounds(rectF, true);
        path.op(this.f15151k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }
}
