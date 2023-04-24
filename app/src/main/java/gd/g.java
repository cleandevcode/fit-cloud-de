package gd;

import cn.sharesdk.framework.Platform;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: h */
    public static final double f15267h = Math.pow(2.0d, 10.0d);

    /* renamed from: i */
    public static final /* synthetic */ int f15268i = 0;

    /* renamed from: a */
    public double f15269a;

    /* renamed from: b */
    public int f15270b;

    /* renamed from: c */
    public int f15271c;

    /* renamed from: d */
    public double[] f15272d;

    /* renamed from: e */
    public double[] f15273e;

    /* renamed from: f */
    public double[] f15274f;

    /* renamed from: g */
    public int[] f15275g;

    public g(double d10, int i10, int i11, double[] dArr, double[] dArr2, double[] dArr3, int[] iArr) {
        this.f15269a = d10;
        this.f15270b = i10;
        this.f15271c = i11;
        this.f15272d = dArr;
        this.f15273e = dArr2;
        this.f15274f = dArr3;
        this.f15275g = iArr;
    }

    public static double a(double d10, int i10) {
        return (32768 & i10) == 0 ? i10 / d10 : 0.0d - ((((~i10) + 1) & Platform.CUSTOMER_ACTION_MASK) / d10);
    }

    public static g b(byte[] bArr) {
        String format;
        if (bArr.length < 4) {
            format = "invalid packet";
        } else {
            byte b10 = bArr[0];
            int i10 = b10 & 15;
            int i11 = (b10 >> 4) & 15;
            byte b11 = 3;
            double a10 = a(100.0d, ((bArr[3] << 8) | (bArr[2] & 255)) & Platform.CUSTOMER_ACTION_MASK);
            if (i10 > 10) {
                format = String.format(Locale.US, "invalid stageNum(%d)", Integer.valueOf(i10));
            } else {
                int length = bArr.length - 4;
                if (i10 * 5 <= length) {
                    double[] copyOf = Arrays.copyOf(a.f15219j, 10);
                    double[] copyOf2 = Arrays.copyOf(a.f15220k, 10);
                    double[] copyOf3 = Arrays.copyOf(a.f15221l, 10);
                    int[] copyOf4 = Arrays.copyOf(a.f15222m, 10);
                    int i12 = 0;
                    int i13 = 4;
                    while (i12 < i10) {
                        byte b12 = bArr[i13];
                        copyOf4[i12] = b12 & 7;
                        byte b13 = bArr[i13 + 1];
                        copyOf2[i12] = (((b12 >> b11) & 31) | ((b13 << 5) & 992)) / 100.0f;
                        int i14 = ((((b13 & 224) >> 5) & 255) | (bArr[i13 + 2] << b11)) & 2047;
                        byte b14 = bArr[i13 + 3];
                        int i15 = i14 | (((b14 & 1) == 0 ? 0 : 255) << 11);
                        int i16 = i12;
                        copyOf3[i16] = (i15 & 2048) == 0 ? i15 / 100.0d : 0.0d - ((((~i15) + 1) & Platform.CUSTOMER_ACTION_MASK) / 100.0d);
                        copyOf[i16] = ((b14 >> 1) & 127) | ((bArr[i13 + 4] << 7) & 32640);
                        i13 += 5;
                        i12 = i16 + 1;
                        b11 = 3;
                    }
                    return new g(a10, i11, i10, copyOf, copyOf2, copyOf3, copyOf4);
                }
                format = String.format(Locale.US, "invalid paramLen(%d),stageNum=%d", Integer.valueOf(length), Integer.valueOf(i10));
            }
        }
        ge.b.n(format);
        return null;
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("EqParameterInfo {");
        a10.append(String.format(Locale.US, "\nStageNum=%d, globalGain=%f, sampleRate=%d", Integer.valueOf(this.f15271c), Double.valueOf(this.f15269a), Integer.valueOf(this.f15270b)));
        a10.append("\nFreq=" + Arrays.toString(this.f15272d));
        a10.append("\nGain=" + Arrays.toString(this.f15274f));
        a10.append("\nQ=" + Arrays.toString(this.f15273e));
        a10.append("\nbiquadType=" + Arrays.toString(this.f15275g));
        a10.append("\n}");
        return a10.toString();
    }
}
