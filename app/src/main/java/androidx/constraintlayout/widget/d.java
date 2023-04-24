package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R;
import androidx.constraintlayout.widget.e;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: d */
    public static final int[] f2023d = {0, 4, 8};

    /* renamed from: e */
    public static SparseIntArray f2024e = new SparseIntArray();

    /* renamed from: f */
    public static SparseIntArray f2025f = new SparseIntArray();

    /* renamed from: a */
    public HashMap<String, androidx.constraintlayout.widget.a> f2026a = new HashMap<>();

    /* renamed from: b */
    public boolean f2027b = true;

    /* renamed from: c */
    public HashMap<Integer, a> f2028c = new HashMap<>();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public int f2029a;

        /* renamed from: b */
        public final C0026d f2030b = new C0026d();

        /* renamed from: c */
        public final c f2031c = new c();

        /* renamed from: d */
        public final b f2032d = new b();

        /* renamed from: e */
        public final e f2033e = new e();

        /* renamed from: f */
        public HashMap<String, androidx.constraintlayout.widget.a> f2034f = new HashMap<>();

        /* renamed from: androidx.constraintlayout.widget.d$a$a */
        /* loaded from: classes.dex */
        public static class C0025a {

            /* renamed from: a */
            public int[] f2035a = new int[10];

            /* renamed from: b */
            public int[] f2036b = new int[10];

            /* renamed from: c */
            public int f2037c = 0;

            /* renamed from: d */
            public int[] f2038d = new int[10];

            /* renamed from: e */
            public float[] f2039e = new float[10];

            /* renamed from: f */
            public int f2040f = 0;

            /* renamed from: g */
            public int[] f2041g = new int[5];

            /* renamed from: h */
            public String[] f2042h = new String[5];

            /* renamed from: i */
            public int f2043i = 0;

            /* renamed from: j */
            public int[] f2044j = new int[4];

            /* renamed from: k */
            public boolean[] f2045k = new boolean[4];

            /* renamed from: l */
            public int f2046l = 0;

            public final void a(float f10, int i10) {
                int i11 = this.f2040f;
                int[] iArr = this.f2038d;
                if (i11 >= iArr.length) {
                    this.f2038d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f2039e;
                    this.f2039e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f2038d;
                int i12 = this.f2040f;
                iArr2[i12] = i10;
                float[] fArr2 = this.f2039e;
                this.f2040f = i12 + 1;
                fArr2[i12] = f10;
            }

            public final void b(int i10, int i11) {
                int i12 = this.f2037c;
                int[] iArr = this.f2035a;
                if (i12 >= iArr.length) {
                    this.f2035a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f2036b;
                    this.f2036b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f2035a;
                int i13 = this.f2037c;
                iArr3[i13] = i10;
                int[] iArr4 = this.f2036b;
                this.f2037c = i13 + 1;
                iArr4[i13] = i11;
            }

            public final void c(int i10, String str) {
                int i11 = this.f2043i;
                int[] iArr = this.f2041g;
                if (i11 >= iArr.length) {
                    this.f2041g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f2042h;
                    this.f2042h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f2041g;
                int i12 = this.f2043i;
                iArr2[i12] = i10;
                String[] strArr2 = this.f2042h;
                this.f2043i = i12 + 1;
                strArr2[i12] = str;
            }

            public final void d(int i10, boolean z10) {
                int i11 = this.f2046l;
                int[] iArr = this.f2044j;
                if (i11 >= iArr.length) {
                    this.f2044j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f2045k;
                    this.f2045k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f2044j;
                int i12 = this.f2046l;
                iArr2[i12] = i10;
                boolean[] zArr2 = this.f2045k;
                this.f2046l = i12 + 1;
                zArr2[i12] = z10;
            }
        }

        public final void a(ConstraintLayout.a aVar) {
            b bVar = this.f2032d;
            aVar.f1946e = bVar.f2062h;
            aVar.f1948f = bVar.f2064i;
            aVar.f1950g = bVar.f2066j;
            aVar.f1952h = bVar.f2068k;
            aVar.f1954i = bVar.f2070l;
            aVar.f1956j = bVar.f2072m;
            aVar.f1958k = bVar.f2074n;
            aVar.f1960l = bVar.f2076o;
            aVar.f1962m = bVar.f2078p;
            aVar.f1964n = bVar.f2079q;
            aVar.f1966o = bVar.f2080r;
            aVar.f1973s = bVar.f2081s;
            aVar.f1974t = bVar.f2082t;
            aVar.f1975u = bVar.f2083u;
            aVar.f1976v = bVar.f2084v;
            ((ViewGroup.MarginLayoutParams) aVar).leftMargin = bVar.F;
            ((ViewGroup.MarginLayoutParams) aVar).rightMargin = bVar.G;
            ((ViewGroup.MarginLayoutParams) aVar).topMargin = bVar.H;
            ((ViewGroup.MarginLayoutParams) aVar).bottomMargin = bVar.I;
            aVar.A = bVar.R;
            aVar.B = bVar.Q;
            aVar.f1978x = bVar.N;
            aVar.f1980z = bVar.P;
            aVar.E = bVar.f2085w;
            aVar.F = bVar.f2086x;
            aVar.f1968p = bVar.f2088z;
            aVar.f1970q = bVar.A;
            aVar.f1972r = bVar.B;
            aVar.G = bVar.f2087y;
            aVar.T = bVar.C;
            aVar.U = bVar.D;
            aVar.I = bVar.T;
            aVar.H = bVar.U;
            aVar.K = bVar.W;
            aVar.J = bVar.V;
            aVar.W = bVar.f2071l0;
            aVar.X = bVar.f2073m0;
            aVar.L = bVar.X;
            aVar.M = bVar.Y;
            aVar.P = bVar.Z;
            aVar.Q = bVar.f2049a0;
            aVar.N = bVar.f2051b0;
            aVar.O = bVar.f2053c0;
            aVar.R = bVar.f2055d0;
            aVar.S = bVar.f2057e0;
            aVar.V = bVar.E;
            aVar.f1942c = bVar.f2058f;
            aVar.f1938a = bVar.f2054d;
            aVar.f1940b = bVar.f2056e;
            ((ViewGroup.MarginLayoutParams) aVar).width = bVar.f2050b;
            ((ViewGroup.MarginLayoutParams) aVar).height = bVar.f2052c;
            String str = bVar.f2069k0;
            if (str != null) {
                aVar.Y = str;
            }
            aVar.Z = bVar.f2077o0;
            aVar.setMarginStart(bVar.K);
            aVar.setMarginEnd(this.f2032d.J);
            aVar.a();
        }

        public final void b(int i10, ConstraintLayout.a aVar) {
            this.f2029a = i10;
            b bVar = this.f2032d;
            bVar.f2062h = aVar.f1946e;
            bVar.f2064i = aVar.f1948f;
            bVar.f2066j = aVar.f1950g;
            bVar.f2068k = aVar.f1952h;
            bVar.f2070l = aVar.f1954i;
            bVar.f2072m = aVar.f1956j;
            bVar.f2074n = aVar.f1958k;
            bVar.f2076o = aVar.f1960l;
            bVar.f2078p = aVar.f1962m;
            bVar.f2079q = aVar.f1964n;
            bVar.f2080r = aVar.f1966o;
            bVar.f2081s = aVar.f1973s;
            bVar.f2082t = aVar.f1974t;
            bVar.f2083u = aVar.f1975u;
            bVar.f2084v = aVar.f1976v;
            bVar.f2085w = aVar.E;
            bVar.f2086x = aVar.F;
            bVar.f2087y = aVar.G;
            bVar.f2088z = aVar.f1968p;
            bVar.A = aVar.f1970q;
            bVar.B = aVar.f1972r;
            bVar.C = aVar.T;
            bVar.D = aVar.U;
            bVar.E = aVar.V;
            bVar.f2058f = aVar.f1942c;
            bVar.f2054d = aVar.f1938a;
            bVar.f2056e = aVar.f1940b;
            bVar.f2050b = ((ViewGroup.MarginLayoutParams) aVar).width;
            bVar.f2052c = ((ViewGroup.MarginLayoutParams) aVar).height;
            bVar.F = ((ViewGroup.MarginLayoutParams) aVar).leftMargin;
            bVar.G = ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
            bVar.H = ((ViewGroup.MarginLayoutParams) aVar).topMargin;
            bVar.I = ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
            bVar.L = aVar.D;
            bVar.T = aVar.I;
            bVar.U = aVar.H;
            bVar.W = aVar.K;
            bVar.V = aVar.J;
            bVar.f2071l0 = aVar.W;
            bVar.f2073m0 = aVar.X;
            bVar.X = aVar.L;
            bVar.Y = aVar.M;
            bVar.Z = aVar.P;
            bVar.f2049a0 = aVar.Q;
            bVar.f2051b0 = aVar.N;
            bVar.f2053c0 = aVar.O;
            bVar.f2055d0 = aVar.R;
            bVar.f2057e0 = aVar.S;
            bVar.f2069k0 = aVar.Y;
            bVar.N = aVar.f1978x;
            bVar.P = aVar.f1980z;
            bVar.M = aVar.f1977w;
            bVar.O = aVar.f1979y;
            bVar.R = aVar.A;
            bVar.Q = aVar.B;
            bVar.S = aVar.C;
            bVar.f2077o0 = aVar.Z;
            bVar.J = aVar.getMarginEnd();
            this.f2032d.K = aVar.getMarginStart();
        }

        public final void c(int i10, e.a aVar) {
            b(i10, aVar);
            this.f2030b.f2102c = aVar.f2119r0;
            e eVar = this.f2033e;
            eVar.f2105a = aVar.f2122u0;
            eVar.f2106b = aVar.f2123v0;
            eVar.f2107c = aVar.f2124w0;
            eVar.f2108d = aVar.f2125x0;
            eVar.f2109e = aVar.f2126y0;
            eVar.f2110f = aVar.f2127z0;
            eVar.f2111g = aVar.A0;
            eVar.f2113i = aVar.B0;
            eVar.f2114j = aVar.C0;
            eVar.f2115k = aVar.D0;
            eVar.f2117m = aVar.f2121t0;
            eVar.f2116l = aVar.f2120s0;
        }

        public final Object clone() {
            a aVar = new a();
            b bVar = aVar.f2032d;
            b bVar2 = this.f2032d;
            bVar.getClass();
            bVar.f2048a = bVar2.f2048a;
            bVar.f2050b = bVar2.f2050b;
            bVar.f2052c = bVar2.f2052c;
            bVar.f2054d = bVar2.f2054d;
            bVar.f2056e = bVar2.f2056e;
            bVar.f2058f = bVar2.f2058f;
            bVar.f2060g = bVar2.f2060g;
            bVar.f2062h = bVar2.f2062h;
            bVar.f2064i = bVar2.f2064i;
            bVar.f2066j = bVar2.f2066j;
            bVar.f2068k = bVar2.f2068k;
            bVar.f2070l = bVar2.f2070l;
            bVar.f2072m = bVar2.f2072m;
            bVar.f2074n = bVar2.f2074n;
            bVar.f2076o = bVar2.f2076o;
            bVar.f2078p = bVar2.f2078p;
            bVar.f2079q = bVar2.f2079q;
            bVar.f2080r = bVar2.f2080r;
            bVar.f2081s = bVar2.f2081s;
            bVar.f2082t = bVar2.f2082t;
            bVar.f2083u = bVar2.f2083u;
            bVar.f2084v = bVar2.f2084v;
            bVar.f2085w = bVar2.f2085w;
            bVar.f2086x = bVar2.f2086x;
            bVar.f2087y = bVar2.f2087y;
            bVar.f2088z = bVar2.f2088z;
            bVar.A = bVar2.A;
            bVar.B = bVar2.B;
            bVar.C = bVar2.C;
            bVar.D = bVar2.D;
            bVar.E = bVar2.E;
            bVar.F = bVar2.F;
            bVar.G = bVar2.G;
            bVar.H = bVar2.H;
            bVar.I = bVar2.I;
            bVar.J = bVar2.J;
            bVar.K = bVar2.K;
            bVar.L = bVar2.L;
            bVar.M = bVar2.M;
            bVar.N = bVar2.N;
            bVar.O = bVar2.O;
            bVar.P = bVar2.P;
            bVar.Q = bVar2.Q;
            bVar.R = bVar2.R;
            bVar.S = bVar2.S;
            bVar.T = bVar2.T;
            bVar.U = bVar2.U;
            bVar.V = bVar2.V;
            bVar.W = bVar2.W;
            bVar.X = bVar2.X;
            bVar.Y = bVar2.Y;
            bVar.Z = bVar2.Z;
            bVar.f2049a0 = bVar2.f2049a0;
            bVar.f2051b0 = bVar2.f2051b0;
            bVar.f2053c0 = bVar2.f2053c0;
            bVar.f2055d0 = bVar2.f2055d0;
            bVar.f2057e0 = bVar2.f2057e0;
            bVar.f2059f0 = bVar2.f2059f0;
            bVar.f2061g0 = bVar2.f2061g0;
            bVar.f2063h0 = bVar2.f2063h0;
            bVar.f2069k0 = bVar2.f2069k0;
            int[] iArr = bVar2.f2065i0;
            if (iArr != null && bVar2.f2067j0 == null) {
                bVar.f2065i0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                bVar.f2065i0 = null;
            }
            bVar.f2067j0 = bVar2.f2067j0;
            bVar.f2071l0 = bVar2.f2071l0;
            bVar.f2073m0 = bVar2.f2073m0;
            bVar.f2075n0 = bVar2.f2075n0;
            bVar.f2077o0 = bVar2.f2077o0;
            c cVar = aVar.f2031c;
            c cVar2 = this.f2031c;
            cVar.getClass();
            cVar2.getClass();
            cVar.f2090a = cVar2.f2090a;
            cVar.f2092c = cVar2.f2092c;
            cVar.f2094e = cVar2.f2094e;
            cVar.f2093d = cVar2.f2093d;
            C0026d c0026d = aVar.f2030b;
            C0026d c0026d2 = this.f2030b;
            c0026d.getClass();
            c0026d2.getClass();
            c0026d.f2100a = c0026d2.f2100a;
            c0026d.f2102c = c0026d2.f2102c;
            c0026d.f2103d = c0026d2.f2103d;
            c0026d.f2101b = c0026d2.f2101b;
            e eVar = aVar.f2033e;
            e eVar2 = this.f2033e;
            eVar.getClass();
            eVar2.getClass();
            eVar.f2105a = eVar2.f2105a;
            eVar.f2106b = eVar2.f2106b;
            eVar.f2107c = eVar2.f2107c;
            eVar.f2108d = eVar2.f2108d;
            eVar.f2109e = eVar2.f2109e;
            eVar.f2110f = eVar2.f2110f;
            eVar.f2111g = eVar2.f2111g;
            eVar.f2112h = eVar2.f2112h;
            eVar.f2113i = eVar2.f2113i;
            eVar.f2114j = eVar2.f2114j;
            eVar.f2115k = eVar2.f2115k;
            eVar.f2116l = eVar2.f2116l;
            eVar.f2117m = eVar2.f2117m;
            aVar.f2029a = this.f2029a;
            return aVar;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: p0 */
        public static SparseIntArray f2047p0;

        /* renamed from: b */
        public int f2050b;

        /* renamed from: c */
        public int f2052c;

        /* renamed from: i0 */
        public int[] f2065i0;

        /* renamed from: j0 */
        public String f2067j0;

        /* renamed from: k0 */
        public String f2069k0;

        /* renamed from: a */
        public boolean f2048a = false;

        /* renamed from: d */
        public int f2054d = -1;

        /* renamed from: e */
        public int f2056e = -1;

        /* renamed from: f */
        public float f2058f = -1.0f;

        /* renamed from: g */
        public boolean f2060g = true;

        /* renamed from: h */
        public int f2062h = -1;

        /* renamed from: i */
        public int f2064i = -1;

        /* renamed from: j */
        public int f2066j = -1;

        /* renamed from: k */
        public int f2068k = -1;

        /* renamed from: l */
        public int f2070l = -1;

        /* renamed from: m */
        public int f2072m = -1;

        /* renamed from: n */
        public int f2074n = -1;

        /* renamed from: o */
        public int f2076o = -1;

        /* renamed from: p */
        public int f2078p = -1;

        /* renamed from: q */
        public int f2079q = -1;

        /* renamed from: r */
        public int f2080r = -1;

        /* renamed from: s */
        public int f2081s = -1;

        /* renamed from: t */
        public int f2082t = -1;

        /* renamed from: u */
        public int f2083u = -1;

        /* renamed from: v */
        public int f2084v = -1;

        /* renamed from: w */
        public float f2085w = 0.5f;

        /* renamed from: x */
        public float f2086x = 0.5f;

        /* renamed from: y */
        public String f2087y = null;

        /* renamed from: z */
        public int f2088z = -1;
        public int A = 0;
        public float B = 0.0f;
        public int C = -1;
        public int D = -1;
        public int E = -1;
        public int F = 0;
        public int G = 0;
        public int H = 0;
        public int I = 0;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = Integer.MIN_VALUE;
        public int N = Integer.MIN_VALUE;
        public int O = Integer.MIN_VALUE;
        public int P = Integer.MIN_VALUE;
        public int Q = Integer.MIN_VALUE;
        public int R = Integer.MIN_VALUE;
        public int S = Integer.MIN_VALUE;
        public float T = -1.0f;
        public float U = -1.0f;
        public int V = 0;
        public int W = 0;
        public int X = 0;
        public int Y = 0;
        public int Z = 0;

        /* renamed from: a0 */
        public int f2049a0 = 0;

        /* renamed from: b0 */
        public int f2051b0 = 0;

        /* renamed from: c0 */
        public int f2053c0 = 0;

        /* renamed from: d0 */
        public float f2055d0 = 1.0f;

        /* renamed from: e0 */
        public float f2057e0 = 1.0f;

        /* renamed from: f0 */
        public int f2059f0 = -1;

        /* renamed from: g0 */
        public int f2061g0 = 0;

        /* renamed from: h0 */
        public int f2063h0 = -1;

        /* renamed from: l0 */
        public boolean f2071l0 = false;

        /* renamed from: m0 */
        public boolean f2073m0 = false;

        /* renamed from: n0 */
        public boolean f2075n0 = true;

        /* renamed from: o0 */
        public int f2077o0 = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2047p0 = sparseIntArray;
            sparseIntArray.append(R.styleable.Layout_layout_constraintLeft_toLeftOf, 24);
            f2047p0.append(R.styleable.Layout_layout_constraintLeft_toRightOf, 25);
            f2047p0.append(R.styleable.Layout_layout_constraintRight_toLeftOf, 28);
            f2047p0.append(R.styleable.Layout_layout_constraintRight_toRightOf, 29);
            f2047p0.append(R.styleable.Layout_layout_constraintTop_toTopOf, 35);
            f2047p0.append(R.styleable.Layout_layout_constraintTop_toBottomOf, 34);
            f2047p0.append(R.styleable.Layout_layout_constraintBottom_toTopOf, 4);
            f2047p0.append(R.styleable.Layout_layout_constraintBottom_toBottomOf, 3);
            f2047p0.append(R.styleable.Layout_layout_constraintBaseline_toBaselineOf, 1);
            f2047p0.append(R.styleable.Layout_layout_editor_absoluteX, 6);
            f2047p0.append(R.styleable.Layout_layout_editor_absoluteY, 7);
            f2047p0.append(R.styleable.Layout_layout_constraintGuide_begin, 17);
            f2047p0.append(R.styleable.Layout_layout_constraintGuide_end, 18);
            f2047p0.append(R.styleable.Layout_layout_constraintGuide_percent, 19);
            f2047p0.append(R.styleable.Layout_guidelineUseRtl, 90);
            f2047p0.append(R.styleable.Layout_android_orientation, 26);
            f2047p0.append(R.styleable.Layout_layout_constraintStart_toEndOf, 31);
            f2047p0.append(R.styleable.Layout_layout_constraintStart_toStartOf, 32);
            f2047p0.append(R.styleable.Layout_layout_constraintEnd_toStartOf, 10);
            f2047p0.append(R.styleable.Layout_layout_constraintEnd_toEndOf, 9);
            f2047p0.append(R.styleable.Layout_layout_goneMarginLeft, 13);
            f2047p0.append(R.styleable.Layout_layout_goneMarginTop, 16);
            f2047p0.append(R.styleable.Layout_layout_goneMarginRight, 14);
            f2047p0.append(R.styleable.Layout_layout_goneMarginBottom, 11);
            f2047p0.append(R.styleable.Layout_layout_goneMarginStart, 15);
            f2047p0.append(R.styleable.Layout_layout_goneMarginEnd, 12);
            f2047p0.append(R.styleable.Layout_layout_constraintVertical_weight, 38);
            f2047p0.append(R.styleable.Layout_layout_constraintHorizontal_weight, 37);
            f2047p0.append(R.styleable.Layout_layout_constraintHorizontal_chainStyle, 39);
            f2047p0.append(R.styleable.Layout_layout_constraintVertical_chainStyle, 40);
            f2047p0.append(R.styleable.Layout_layout_constraintHorizontal_bias, 20);
            f2047p0.append(R.styleable.Layout_layout_constraintVertical_bias, 36);
            f2047p0.append(R.styleable.Layout_layout_constraintDimensionRatio, 5);
            f2047p0.append(R.styleable.Layout_layout_constraintLeft_creator, 91);
            f2047p0.append(R.styleable.Layout_layout_constraintTop_creator, 91);
            f2047p0.append(R.styleable.Layout_layout_constraintRight_creator, 91);
            f2047p0.append(R.styleable.Layout_layout_constraintBottom_creator, 91);
            f2047p0.append(R.styleable.Layout_layout_constraintBaseline_creator, 91);
            f2047p0.append(R.styleable.Layout_android_layout_marginLeft, 23);
            f2047p0.append(R.styleable.Layout_android_layout_marginRight, 27);
            f2047p0.append(R.styleable.Layout_android_layout_marginStart, 30);
            f2047p0.append(R.styleable.Layout_android_layout_marginEnd, 8);
            f2047p0.append(R.styleable.Layout_android_layout_marginTop, 33);
            f2047p0.append(R.styleable.Layout_android_layout_marginBottom, 2);
            f2047p0.append(R.styleable.Layout_android_layout_width, 22);
            f2047p0.append(R.styleable.Layout_android_layout_height, 21);
            f2047p0.append(R.styleable.Layout_layout_constraintWidth, 41);
            f2047p0.append(R.styleable.Layout_layout_constraintHeight, 42);
            f2047p0.append(R.styleable.Layout_layout_constrainedWidth, 41);
            f2047p0.append(R.styleable.Layout_layout_constrainedHeight, 42);
            f2047p0.append(R.styleable.Layout_layout_wrapBehaviorInParent, 76);
            f2047p0.append(R.styleable.Layout_layout_constraintCircle, 61);
            f2047p0.append(R.styleable.Layout_layout_constraintCircleRadius, 62);
            f2047p0.append(R.styleable.Layout_layout_constraintCircleAngle, 63);
            f2047p0.append(R.styleable.Layout_layout_constraintWidth_percent, 69);
            f2047p0.append(R.styleable.Layout_layout_constraintHeight_percent, 70);
            f2047p0.append(R.styleable.Layout_chainUseRtl, 71);
            f2047p0.append(R.styleable.Layout_barrierDirection, 72);
            f2047p0.append(R.styleable.Layout_barrierMargin, 73);
            f2047p0.append(R.styleable.Layout_constraint_referenced_ids, 74);
            f2047p0.append(R.styleable.Layout_barrierAllowsGoneWidgets, 75);
        }

        public final void a(Context context, AttributeSet attributeSet) {
            StringBuilder sb2;
            String str;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                int i11 = f2047p0.get(index);
                switch (i11) {
                    case 1:
                        this.f2078p = d.f(obtainStyledAttributes, index, this.f2078p);
                        break;
                    case 2:
                        this.I = obtainStyledAttributes.getDimensionPixelSize(index, this.I);
                        break;
                    case 3:
                        this.f2076o = d.f(obtainStyledAttributes, index, this.f2076o);
                        break;
                    case 4:
                        this.f2074n = d.f(obtainStyledAttributes, index, this.f2074n);
                        break;
                    case 5:
                        this.f2087y = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.C = obtainStyledAttributes.getDimensionPixelOffset(index, this.C);
                        break;
                    case 7:
                        this.D = obtainStyledAttributes.getDimensionPixelOffset(index, this.D);
                        break;
                    case 8:
                        this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                        break;
                    case 9:
                        this.f2084v = d.f(obtainStyledAttributes, index, this.f2084v);
                        break;
                    case 10:
                        this.f2083u = d.f(obtainStyledAttributes, index, this.f2083u);
                        break;
                    case 11:
                        this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                        break;
                    case 12:
                        this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                        break;
                    case 13:
                        this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                        break;
                    case 14:
                        this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                        break;
                    case 15:
                        this.R = obtainStyledAttributes.getDimensionPixelSize(index, this.R);
                        break;
                    case 16:
                        this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                        break;
                    case 17:
                        this.f2054d = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2054d);
                        break;
                    case 18:
                        this.f2056e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2056e);
                        break;
                    case 19:
                        this.f2058f = obtainStyledAttributes.getFloat(index, this.f2058f);
                        break;
                    case 20:
                        this.f2085w = obtainStyledAttributes.getFloat(index, this.f2085w);
                        break;
                    case 21:
                        this.f2052c = obtainStyledAttributes.getLayoutDimension(index, this.f2052c);
                        break;
                    case 22:
                        this.f2050b = obtainStyledAttributes.getLayoutDimension(index, this.f2050b);
                        break;
                    case 23:
                        this.F = obtainStyledAttributes.getDimensionPixelSize(index, this.F);
                        break;
                    case 24:
                        this.f2062h = d.f(obtainStyledAttributes, index, this.f2062h);
                        break;
                    case 25:
                        this.f2064i = d.f(obtainStyledAttributes, index, this.f2064i);
                        break;
                    case 26:
                        this.E = obtainStyledAttributes.getInt(index, this.E);
                        break;
                    case 27:
                        this.G = obtainStyledAttributes.getDimensionPixelSize(index, this.G);
                        break;
                    case 28:
                        this.f2066j = d.f(obtainStyledAttributes, index, this.f2066j);
                        break;
                    case 29:
                        this.f2068k = d.f(obtainStyledAttributes, index, this.f2068k);
                        break;
                    case 30:
                        this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                        break;
                    case 31:
                        this.f2081s = d.f(obtainStyledAttributes, index, this.f2081s);
                        break;
                    case 32:
                        this.f2082t = d.f(obtainStyledAttributes, index, this.f2082t);
                        break;
                    case 33:
                        this.H = obtainStyledAttributes.getDimensionPixelSize(index, this.H);
                        break;
                    case 34:
                        this.f2072m = d.f(obtainStyledAttributes, index, this.f2072m);
                        break;
                    case 35:
                        this.f2070l = d.f(obtainStyledAttributes, index, this.f2070l);
                        break;
                    case 36:
                        this.f2086x = obtainStyledAttributes.getFloat(index, this.f2086x);
                        break;
                    case 37:
                        this.U = obtainStyledAttributes.getFloat(index, this.U);
                        break;
                    case 38:
                        this.T = obtainStyledAttributes.getFloat(index, this.T);
                        break;
                    case 39:
                        this.V = obtainStyledAttributes.getInt(index, this.V);
                        break;
                    case 40:
                        this.W = obtainStyledAttributes.getInt(index, this.W);
                        break;
                    case 41:
                        d.g(this, obtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        d.g(this, obtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i11) {
                            case 61:
                                this.f2088z = d.f(obtainStyledAttributes, index, this.f2088z);
                                continue;
                            case 62:
                                this.A = obtainStyledAttributes.getDimensionPixelSize(index, this.A);
                                continue;
                            case 63:
                                this.B = obtainStyledAttributes.getFloat(index, this.B);
                                continue;
                            default:
                                switch (i11) {
                                    case 69:
                                        this.f2055d0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 70:
                                        this.f2057e0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 71:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        break;
                                    case 72:
                                        this.f2059f0 = obtainStyledAttributes.getInt(index, this.f2059f0);
                                        break;
                                    case 73:
                                        this.f2061g0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f2061g0);
                                        break;
                                    case 74:
                                        this.f2067j0 = obtainStyledAttributes.getString(index);
                                        break;
                                    case 75:
                                        this.f2075n0 = obtainStyledAttributes.getBoolean(index, this.f2075n0);
                                        break;
                                    case 76:
                                        this.f2077o0 = obtainStyledAttributes.getInt(index, this.f2077o0);
                                        break;
                                    case 77:
                                        this.f2079q = d.f(obtainStyledAttributes, index, this.f2079q);
                                        break;
                                    case 78:
                                        this.f2080r = d.f(obtainStyledAttributes, index, this.f2080r);
                                        break;
                                    case 79:
                                        this.S = obtainStyledAttributes.getDimensionPixelSize(index, this.S);
                                        break;
                                    case 80:
                                        this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                                        break;
                                    case 81:
                                        this.X = obtainStyledAttributes.getInt(index, this.X);
                                        break;
                                    case 82:
                                        this.Y = obtainStyledAttributes.getInt(index, this.Y);
                                        break;
                                    case 83:
                                        this.f2049a0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f2049a0);
                                        break;
                                    case 84:
                                        this.Z = obtainStyledAttributes.getDimensionPixelSize(index, this.Z);
                                        break;
                                    case 85:
                                        this.f2053c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f2053c0);
                                        break;
                                    case 86:
                                        this.f2051b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f2051b0);
                                        break;
                                    case 87:
                                        this.f2071l0 = obtainStyledAttributes.getBoolean(index, this.f2071l0);
                                        break;
                                    case 88:
                                        this.f2073m0 = obtainStyledAttributes.getBoolean(index, this.f2073m0);
                                        break;
                                    case 89:
                                        this.f2069k0 = obtainStyledAttributes.getString(index);
                                        break;
                                    case 90:
                                        this.f2060g = obtainStyledAttributes.getBoolean(index, this.f2060g);
                                        break;
                                    case 91:
                                        sb2 = new StringBuilder();
                                        str = "unused attribute 0x";
                                        sb2.append(str);
                                        sb2.append(Integer.toHexString(index));
                                        sb2.append("   ");
                                        sb2.append(f2047p0.get(index));
                                        Log.w("ConstraintSet", sb2.toString());
                                        continue;
                                    default:
                                        sb2 = new StringBuilder();
                                        str = "Unknown attribute 0x";
                                        sb2.append(str);
                                        sb2.append(Integer.toHexString(index));
                                        sb2.append("   ");
                                        sb2.append(f2047p0.get(index));
                                        Log.w("ConstraintSet", sb2.toString());
                                        continue;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: k */
        public static SparseIntArray f2089k;

        /* renamed from: a */
        public int f2090a = -1;

        /* renamed from: b */
        public int f2091b = 0;

        /* renamed from: c */
        public int f2092c = -1;

        /* renamed from: d */
        public float f2093d = Float.NaN;

        /* renamed from: e */
        public float f2094e = Float.NaN;

        /* renamed from: f */
        public float f2095f = Float.NaN;

        /* renamed from: g */
        public int f2096g = -1;

        /* renamed from: h */
        public String f2097h = null;

        /* renamed from: i */
        public int f2098i = -3;

        /* renamed from: j */
        public int f2099j = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2089k = sparseIntArray;
            sparseIntArray.append(R.styleable.Motion_motionPathRotate, 1);
            f2089k.append(R.styleable.Motion_pathMotionArc, 2);
            f2089k.append(R.styleable.Motion_transitionEasing, 3);
            f2089k.append(R.styleable.Motion_drawPath, 4);
            f2089k.append(R.styleable.Motion_animateRelativeTo, 5);
            f2089k.append(R.styleable.Motion_animateCircleAngleTo, 6);
            f2089k.append(R.styleable.Motion_motionStagger, 7);
            f2089k.append(R.styleable.Motion_quantizeMotionSteps, 8);
            f2089k.append(R.styleable.Motion_quantizeMotionPhase, 9);
            f2089k.append(R.styleable.Motion_quantizeMotionInterpolator, 10);
        }

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Motion);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                switch (f2089k.get(index)) {
                    case 1:
                        this.f2094e = obtainStyledAttributes.getFloat(index, this.f2094e);
                        break;
                    case 2:
                        this.f2092c = obtainStyledAttributes.getInt(index, this.f2092c);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            String str = r0.a.f25145b[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f2090a = d.f(obtainStyledAttributes, index, this.f2090a);
                        break;
                    case 6:
                        this.f2091b = obtainStyledAttributes.getInteger(index, this.f2091b);
                        break;
                    case 7:
                        this.f2093d = obtainStyledAttributes.getFloat(index, this.f2093d);
                        break;
                    case 8:
                        this.f2096g = obtainStyledAttributes.getInteger(index, this.f2096g);
                        break;
                    case 9:
                        this.f2095f = obtainStyledAttributes.getFloat(index, this.f2095f);
                        break;
                    case 10:
                        int i11 = obtainStyledAttributes.peekValue(index).type;
                        if (i11 == 1) {
                            int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                            this.f2099j = resourceId;
                            if (resourceId == -1) {
                                break;
                            }
                            this.f2098i = -2;
                            break;
                        } else if (i11 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            this.f2097h = string;
                            if (string.indexOf("/") > 0) {
                                this.f2099j = obtainStyledAttributes.getResourceId(index, -1);
                                this.f2098i = -2;
                            } else {
                                this.f2098i = -1;
                                break;
                            }
                        } else {
                            this.f2098i = obtainStyledAttributes.getInteger(index, this.f2099j);
                            break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.d$d */
    /* loaded from: classes.dex */
    public static class C0026d {

        /* renamed from: a */
        public int f2100a = 0;

        /* renamed from: b */
        public int f2101b = 0;

        /* renamed from: c */
        public float f2102c = 1.0f;

        /* renamed from: d */
        public float f2103d = Float.NaN;

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.PropertySet);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == R.styleable.PropertySet_android_alpha) {
                    this.f2102c = obtainStyledAttributes.getFloat(index, this.f2102c);
                } else if (index == R.styleable.PropertySet_android_visibility) {
                    int i11 = obtainStyledAttributes.getInt(index, this.f2100a);
                    this.f2100a = i11;
                    this.f2100a = d.f2023d[i11];
                } else if (index == R.styleable.PropertySet_visibilityMode) {
                    this.f2101b = obtainStyledAttributes.getInt(index, this.f2101b);
                } else if (index == R.styleable.PropertySet_motionProgress) {
                    this.f2103d = obtainStyledAttributes.getFloat(index, this.f2103d);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: n */
        public static SparseIntArray f2104n;

        /* renamed from: a */
        public float f2105a = 0.0f;

        /* renamed from: b */
        public float f2106b = 0.0f;

        /* renamed from: c */
        public float f2107c = 0.0f;

        /* renamed from: d */
        public float f2108d = 1.0f;

        /* renamed from: e */
        public float f2109e = 1.0f;

        /* renamed from: f */
        public float f2110f = Float.NaN;

        /* renamed from: g */
        public float f2111g = Float.NaN;

        /* renamed from: h */
        public int f2112h = -1;

        /* renamed from: i */
        public float f2113i = 0.0f;

        /* renamed from: j */
        public float f2114j = 0.0f;

        /* renamed from: k */
        public float f2115k = 0.0f;

        /* renamed from: l */
        public boolean f2116l = false;

        /* renamed from: m */
        public float f2117m = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2104n = sparseIntArray;
            sparseIntArray.append(R.styleable.Transform_android_rotation, 1);
            f2104n.append(R.styleable.Transform_android_rotationX, 2);
            f2104n.append(R.styleable.Transform_android_rotationY, 3);
            f2104n.append(R.styleable.Transform_android_scaleX, 4);
            f2104n.append(R.styleable.Transform_android_scaleY, 5);
            f2104n.append(R.styleable.Transform_android_transformPivotX, 6);
            f2104n.append(R.styleable.Transform_android_transformPivotY, 7);
            f2104n.append(R.styleable.Transform_android_translationX, 8);
            f2104n.append(R.styleable.Transform_android_translationY, 9);
            f2104n.append(R.styleable.Transform_android_translationZ, 10);
            f2104n.append(R.styleable.Transform_android_elevation, 11);
            f2104n.append(R.styleable.Transform_transformPivotTarget, 12);
        }

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Transform);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                switch (f2104n.get(index)) {
                    case 1:
                        this.f2105a = obtainStyledAttributes.getFloat(index, this.f2105a);
                        break;
                    case 2:
                        this.f2106b = obtainStyledAttributes.getFloat(index, this.f2106b);
                        break;
                    case 3:
                        this.f2107c = obtainStyledAttributes.getFloat(index, this.f2107c);
                        break;
                    case 4:
                        this.f2108d = obtainStyledAttributes.getFloat(index, this.f2108d);
                        break;
                    case 5:
                        this.f2109e = obtainStyledAttributes.getFloat(index, this.f2109e);
                        break;
                    case 6:
                        this.f2110f = obtainStyledAttributes.getDimension(index, this.f2110f);
                        break;
                    case 7:
                        this.f2111g = obtainStyledAttributes.getDimension(index, this.f2111g);
                        break;
                    case 8:
                        this.f2113i = obtainStyledAttributes.getDimension(index, this.f2113i);
                        break;
                    case 9:
                        this.f2114j = obtainStyledAttributes.getDimension(index, this.f2114j);
                        break;
                    case 10:
                        this.f2115k = obtainStyledAttributes.getDimension(index, this.f2115k);
                        break;
                    case 11:
                        this.f2116l = true;
                        this.f2117m = obtainStyledAttributes.getDimension(index, this.f2117m);
                        break;
                    case 12:
                        this.f2112h = d.f(obtainStyledAttributes, index, this.f2112h);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        f2024e.append(R.styleable.Constraint_layout_constraintLeft_toLeftOf, 25);
        f2024e.append(R.styleable.Constraint_layout_constraintLeft_toRightOf, 26);
        f2024e.append(R.styleable.Constraint_layout_constraintRight_toLeftOf, 29);
        f2024e.append(R.styleable.Constraint_layout_constraintRight_toRightOf, 30);
        f2024e.append(R.styleable.Constraint_layout_constraintTop_toTopOf, 36);
        f2024e.append(R.styleable.Constraint_layout_constraintTop_toBottomOf, 35);
        f2024e.append(R.styleable.Constraint_layout_constraintBottom_toTopOf, 4);
        f2024e.append(R.styleable.Constraint_layout_constraintBottom_toBottomOf, 3);
        f2024e.append(R.styleable.Constraint_layout_constraintBaseline_toBaselineOf, 1);
        f2024e.append(R.styleable.Constraint_layout_constraintBaseline_toTopOf, 91);
        f2024e.append(R.styleable.Constraint_layout_constraintBaseline_toBottomOf, 92);
        f2024e.append(R.styleable.Constraint_layout_editor_absoluteX, 6);
        f2024e.append(R.styleable.Constraint_layout_editor_absoluteY, 7);
        f2024e.append(R.styleable.Constraint_layout_constraintGuide_begin, 17);
        f2024e.append(R.styleable.Constraint_layout_constraintGuide_end, 18);
        f2024e.append(R.styleable.Constraint_layout_constraintGuide_percent, 19);
        f2024e.append(R.styleable.Constraint_guidelineUseRtl, 99);
        f2024e.append(R.styleable.Constraint_android_orientation, 27);
        f2024e.append(R.styleable.Constraint_layout_constraintStart_toEndOf, 32);
        f2024e.append(R.styleable.Constraint_layout_constraintStart_toStartOf, 33);
        f2024e.append(R.styleable.Constraint_layout_constraintEnd_toStartOf, 10);
        f2024e.append(R.styleable.Constraint_layout_constraintEnd_toEndOf, 9);
        f2024e.append(R.styleable.Constraint_layout_goneMarginLeft, 13);
        f2024e.append(R.styleable.Constraint_layout_goneMarginTop, 16);
        f2024e.append(R.styleable.Constraint_layout_goneMarginRight, 14);
        f2024e.append(R.styleable.Constraint_layout_goneMarginBottom, 11);
        f2024e.append(R.styleable.Constraint_layout_goneMarginStart, 15);
        f2024e.append(R.styleable.Constraint_layout_goneMarginEnd, 12);
        f2024e.append(R.styleable.Constraint_layout_constraintVertical_weight, 40);
        f2024e.append(R.styleable.Constraint_layout_constraintHorizontal_weight, 39);
        f2024e.append(R.styleable.Constraint_layout_constraintHorizontal_chainStyle, 41);
        f2024e.append(R.styleable.Constraint_layout_constraintVertical_chainStyle, 42);
        f2024e.append(R.styleable.Constraint_layout_constraintHorizontal_bias, 20);
        f2024e.append(R.styleable.Constraint_layout_constraintVertical_bias, 37);
        f2024e.append(R.styleable.Constraint_layout_constraintDimensionRatio, 5);
        f2024e.append(R.styleable.Constraint_layout_constraintLeft_creator, 87);
        f2024e.append(R.styleable.Constraint_layout_constraintTop_creator, 87);
        f2024e.append(R.styleable.Constraint_layout_constraintRight_creator, 87);
        f2024e.append(R.styleable.Constraint_layout_constraintBottom_creator, 87);
        f2024e.append(R.styleable.Constraint_layout_constraintBaseline_creator, 87);
        f2024e.append(R.styleable.Constraint_android_layout_marginLeft, 24);
        f2024e.append(R.styleable.Constraint_android_layout_marginRight, 28);
        f2024e.append(R.styleable.Constraint_android_layout_marginStart, 31);
        f2024e.append(R.styleable.Constraint_android_layout_marginEnd, 8);
        f2024e.append(R.styleable.Constraint_android_layout_marginTop, 34);
        f2024e.append(R.styleable.Constraint_android_layout_marginBottom, 2);
        f2024e.append(R.styleable.Constraint_android_layout_width, 23);
        f2024e.append(R.styleable.Constraint_android_layout_height, 21);
        f2024e.append(R.styleable.Constraint_layout_constraintWidth, 95);
        f2024e.append(R.styleable.Constraint_layout_constraintHeight, 96);
        f2024e.append(R.styleable.Constraint_android_visibility, 22);
        f2024e.append(R.styleable.Constraint_android_alpha, 43);
        f2024e.append(R.styleable.Constraint_android_elevation, 44);
        f2024e.append(R.styleable.Constraint_android_rotationX, 45);
        f2024e.append(R.styleable.Constraint_android_rotationY, 46);
        f2024e.append(R.styleable.Constraint_android_rotation, 60);
        f2024e.append(R.styleable.Constraint_android_scaleX, 47);
        f2024e.append(R.styleable.Constraint_android_scaleY, 48);
        f2024e.append(R.styleable.Constraint_android_transformPivotX, 49);
        f2024e.append(R.styleable.Constraint_android_transformPivotY, 50);
        f2024e.append(R.styleable.Constraint_android_translationX, 51);
        f2024e.append(R.styleable.Constraint_android_translationY, 52);
        f2024e.append(R.styleable.Constraint_android_translationZ, 53);
        f2024e.append(R.styleable.Constraint_layout_constraintWidth_default, 54);
        f2024e.append(R.styleable.Constraint_layout_constraintHeight_default, 55);
        f2024e.append(R.styleable.Constraint_layout_constraintWidth_max, 56);
        f2024e.append(R.styleable.Constraint_layout_constraintHeight_max, 57);
        f2024e.append(R.styleable.Constraint_layout_constraintWidth_min, 58);
        f2024e.append(R.styleable.Constraint_layout_constraintHeight_min, 59);
        f2024e.append(R.styleable.Constraint_layout_constraintCircle, 61);
        f2024e.append(R.styleable.Constraint_layout_constraintCircleRadius, 62);
        f2024e.append(R.styleable.Constraint_layout_constraintCircleAngle, 63);
        f2024e.append(R.styleable.Constraint_animateRelativeTo, 64);
        f2024e.append(R.styleable.Constraint_transitionEasing, 65);
        f2024e.append(R.styleable.Constraint_drawPath, 66);
        f2024e.append(R.styleable.Constraint_transitionPathRotate, 67);
        f2024e.append(R.styleable.Constraint_motionStagger, 79);
        f2024e.append(R.styleable.Constraint_android_id, 38);
        f2024e.append(R.styleable.Constraint_motionProgress, 68);
        f2024e.append(R.styleable.Constraint_layout_constraintWidth_percent, 69);
        f2024e.append(R.styleable.Constraint_layout_constraintHeight_percent, 70);
        f2024e.append(R.styleable.Constraint_layout_wrapBehaviorInParent, 97);
        f2024e.append(R.styleable.Constraint_chainUseRtl, 71);
        f2024e.append(R.styleable.Constraint_barrierDirection, 72);
        f2024e.append(R.styleable.Constraint_barrierMargin, 73);
        f2024e.append(R.styleable.Constraint_constraint_referenced_ids, 74);
        f2024e.append(R.styleable.Constraint_barrierAllowsGoneWidgets, 75);
        f2024e.append(R.styleable.Constraint_pathMotionArc, 76);
        f2024e.append(R.styleable.Constraint_layout_constraintTag, 77);
        f2024e.append(R.styleable.Constraint_visibilityMode, 78);
        f2024e.append(R.styleable.Constraint_layout_constrainedWidth, 80);
        f2024e.append(R.styleable.Constraint_layout_constrainedHeight, 81);
        f2024e.append(R.styleable.Constraint_polarRelativeTo, 82);
        f2024e.append(R.styleable.Constraint_transformPivotTarget, 83);
        f2024e.append(R.styleable.Constraint_quantizeMotionSteps, 84);
        f2024e.append(R.styleable.Constraint_quantizeMotionPhase, 85);
        f2024e.append(R.styleable.Constraint_quantizeMotionInterpolator, 86);
        SparseIntArray sparseIntArray = f2025f;
        int i10 = R.styleable.ConstraintOverride_layout_editor_absoluteY;
        sparseIntArray.append(i10, 6);
        f2025f.append(i10, 7);
        f2025f.append(R.styleable.ConstraintOverride_android_orientation, 27);
        f2025f.append(R.styleable.ConstraintOverride_layout_goneMarginLeft, 13);
        f2025f.append(R.styleable.ConstraintOverride_layout_goneMarginTop, 16);
        f2025f.append(R.styleable.ConstraintOverride_layout_goneMarginRight, 14);
        f2025f.append(R.styleable.ConstraintOverride_layout_goneMarginBottom, 11);
        f2025f.append(R.styleable.ConstraintOverride_layout_goneMarginStart, 15);
        f2025f.append(R.styleable.ConstraintOverride_layout_goneMarginEnd, 12);
        f2025f.append(R.styleable.ConstraintOverride_layout_constraintVertical_weight, 40);
        f2025f.append(R.styleable.ConstraintOverride_layout_constraintHorizontal_weight, 39);
        f2025f.append(R.styleable.ConstraintOverride_layout_constraintHorizontal_chainStyle, 41);
        f2025f.append(R.styleable.ConstraintOverride_layout_constraintVertical_chainStyle, 42);
        f2025f.append(R.styleable.ConstraintOverride_layout_constraintHorizontal_bias, 20);
        f2025f.append(R.styleable.ConstraintOverride_layout_constraintVertical_bias, 37);
        f2025f.append(R.styleable.ConstraintOverride_layout_constraintDimensionRatio, 5);
        f2025f.append(R.styleable.ConstraintOverride_layout_constraintLeft_creator, 87);
        f2025f.append(R.styleable.ConstraintOverride_layout_constraintTop_creator, 87);
        f2025f.append(R.styleable.ConstraintOverride_layout_constraintRight_creator, 87);
        f2025f.append(R.styleable.ConstraintOverride_layout_constraintBottom_creator, 87);
        f2025f.append(R.styleable.ConstraintOverride_layout_constraintBaseline_creator, 87);
        f2025f.append(R.styleable.ConstraintOverride_android_layout_marginLeft, 24);
        f2025f.append(R.styleable.ConstraintOverride_android_layout_marginRight, 28);
        f2025f.append(R.styleable.ConstraintOverride_android_layout_marginStart, 31);
        f2025f.append(R.styleable.ConstraintOverride_android_layout_marginEnd, 8);
        f2025f.append(R.styleable.ConstraintOverride_android_layout_marginTop, 34);
        f2025f.append(R.styleable.ConstraintOverride_android_layout_marginBottom, 2);
        f2025f.append(R.styleable.ConstraintOverride_android_layout_width, 23);
        f2025f.append(R.styleable.ConstraintOverride_android_layout_height, 21);
        f2025f.append(R.styleable.ConstraintOverride_layout_constraintWidth, 95);
        f2025f.append(R.styleable.ConstraintOverride_layout_constraintHeight, 96);
        f2025f.append(R.styleable.ConstraintOverride_android_visibility, 22);
        f2025f.append(R.styleable.ConstraintOverride_android_alpha, 43);
        f2025f.append(R.styleable.ConstraintOverride_android_elevation, 44);
        f2025f.append(R.styleable.ConstraintOverride_android_rotationX, 45);
        f2025f.append(R.styleable.ConstraintOverride_android_rotationY, 46);
        f2025f.append(R.styleable.ConstraintOverride_android_rotation, 60);
        f2025f.append(R.styleable.ConstraintOverride_android_scaleX, 47);
        f2025f.append(R.styleable.ConstraintOverride_android_scaleY, 48);
        f2025f.append(R.styleable.ConstraintOverride_android_transformPivotX, 49);
        f2025f.append(R.styleable.ConstraintOverride_android_transformPivotY, 50);
        f2025f.append(R.styleable.ConstraintOverride_android_translationX, 51);
        f2025f.append(R.styleable.ConstraintOverride_android_translationY, 52);
        f2025f.append(R.styleable.ConstraintOverride_android_translationZ, 53);
        f2025f.append(R.styleable.ConstraintOverride_layout_constraintWidth_default, 54);
        f2025f.append(R.styleable.ConstraintOverride_layout_constraintHeight_default, 55);
        f2025f.append(R.styleable.ConstraintOverride_layout_constraintWidth_max, 56);
        f2025f.append(R.styleable.ConstraintOverride_layout_constraintHeight_max, 57);
        f2025f.append(R.styleable.ConstraintOverride_layout_constraintWidth_min, 58);
        f2025f.append(R.styleable.ConstraintOverride_layout_constraintHeight_min, 59);
        f2025f.append(R.styleable.ConstraintOverride_layout_constraintCircleRadius, 62);
        f2025f.append(R.styleable.ConstraintOverride_layout_constraintCircleAngle, 63);
        f2025f.append(R.styleable.ConstraintOverride_animateRelativeTo, 64);
        f2025f.append(R.styleable.ConstraintOverride_transitionEasing, 65);
        f2025f.append(R.styleable.ConstraintOverride_drawPath, 66);
        f2025f.append(R.styleable.ConstraintOverride_transitionPathRotate, 67);
        f2025f.append(R.styleable.ConstraintOverride_motionStagger, 79);
        f2025f.append(R.styleable.ConstraintOverride_android_id, 38);
        f2025f.append(R.styleable.ConstraintOverride_motionTarget, 98);
        f2025f.append(R.styleable.ConstraintOverride_motionProgress, 68);
        f2025f.append(R.styleable.ConstraintOverride_layout_constraintWidth_percent, 69);
        f2025f.append(R.styleable.ConstraintOverride_layout_constraintHeight_percent, 70);
        f2025f.append(R.styleable.ConstraintOverride_chainUseRtl, 71);
        f2025f.append(R.styleable.ConstraintOverride_barrierDirection, 72);
        f2025f.append(R.styleable.ConstraintOverride_barrierMargin, 73);
        f2025f.append(R.styleable.ConstraintOverride_constraint_referenced_ids, 74);
        f2025f.append(R.styleable.ConstraintOverride_barrierAllowsGoneWidgets, 75);
        f2025f.append(R.styleable.ConstraintOverride_pathMotionArc, 76);
        f2025f.append(R.styleable.ConstraintOverride_layout_constraintTag, 77);
        f2025f.append(R.styleable.ConstraintOverride_visibilityMode, 78);
        f2025f.append(R.styleable.ConstraintOverride_layout_constrainedWidth, 80);
        f2025f.append(R.styleable.ConstraintOverride_layout_constrainedHeight, 81);
        f2025f.append(R.styleable.ConstraintOverride_polarRelativeTo, 82);
        f2025f.append(R.styleable.ConstraintOverride_transformPivotTarget, 83);
        f2025f.append(R.styleable.ConstraintOverride_quantizeMotionSteps, 84);
        f2025f.append(R.styleable.ConstraintOverride_quantizeMotionPhase, 85);
        f2025f.append(R.styleable.ConstraintOverride_quantizeMotionInterpolator, 86);
        f2025f.append(R.styleable.ConstraintOverride_layout_wrapBehaviorInParent, 97);
    }

    public static int[] c(Barrier barrier, String str) {
        int i10;
        HashMap<String, Integer> hashMap;
        String[] split = str.split(",");
        Context context = barrier.getContext();
        int[] iArr = new int[split.length];
        int i11 = 0;
        int i12 = 0;
        while (i11 < split.length) {
            String trim = split[i11].trim();
            Integer num = null;
            try {
                i10 = R.id.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i10 = 0;
            }
            if (i10 == 0) {
                i10 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i10 == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) barrier.getParent();
                constraintLayout.getClass();
                if ((trim instanceof String) && (hashMap = constraintLayout.f1935m) != null && hashMap.containsKey(trim)) {
                    num = constraintLayout.f1935m.get(trim);
                }
                if (num != null && (num instanceof Integer)) {
                    i10 = num.intValue();
                }
            }
            iArr[i12] = i10;
            i11++;
            i12++;
        }
        if (i12 != split.length) {
            return Arrays.copyOf(iArr, i12);
        }
        return iArr;
    }

    public static a d(Context context, AttributeSet attributeSet, boolean z10) {
        int[] iArr;
        c cVar;
        c cVar2;
        int integer;
        c cVar3;
        StringBuilder a10;
        b bVar;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int dimensionPixelOffset;
        int i16;
        float f10;
        int i17;
        int i18;
        float f11;
        float dimension;
        int i19;
        String str;
        boolean z11;
        int i20;
        int i21;
        c cVar4;
        int i22;
        StringBuilder sb2;
        String str2;
        a aVar = new a();
        if (z10) {
            iArr = R.styleable.ConstraintOverride;
        } else {
            iArr = R.styleable.Constraint;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        int i23 = 3;
        int i24 = 1;
        int i25 = 0;
        if (z10) {
            int indexCount = obtainStyledAttributes.getIndexCount();
            a.C0025a c0025a = new a.C0025a();
            aVar.f2031c.getClass();
            aVar.f2032d.getClass();
            aVar.f2030b.getClass();
            aVar.f2033e.getClass();
            int i26 = 0;
            while (i26 < indexCount) {
                int index = obtainStyledAttributes.getIndex(i26);
                switch (f2025f.get(index)) {
                    case 2:
                        i11 = aVar.f2032d.I;
                        i12 = 2;
                        dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelSize(index, i11);
                        i15 = i12;
                        c0025a.b(i15, dimensionPixelOffset);
                        break;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 25:
                    case 26:
                    case 29:
                    case 30:
                    case 32:
                    case 33:
                    case 35:
                    case 36:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        sb2 = new StringBuilder();
                        str2 = "Unknown attribute 0x";
                        sb2.append(str2);
                        sb2.append(Integer.toHexString(index));
                        sb2.append("   ");
                        sb2.append(f2024e.get(index));
                        Log.w("ConstraintSet", sb2.toString());
                        break;
                    case 5:
                        i13 = 5;
                        c0025a.c(i13, obtainStyledAttributes.getString(index));
                        break;
                    case 6:
                        i14 = aVar.f2032d.C;
                        i15 = 6;
                        dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(index, i14);
                        c0025a.b(i15, dimensionPixelOffset);
                        break;
                    case 7:
                        i14 = aVar.f2032d.D;
                        i15 = 7;
                        dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(index, i14);
                        c0025a.b(i15, dimensionPixelOffset);
                        break;
                    case 8:
                        i11 = aVar.f2032d.J;
                        i12 = 8;
                        dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelSize(index, i11);
                        i15 = i12;
                        c0025a.b(i15, dimensionPixelOffset);
                        break;
                    case 11:
                        i11 = aVar.f2032d.P;
                        i12 = 11;
                        dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelSize(index, i11);
                        i15 = i12;
                        c0025a.b(i15, dimensionPixelOffset);
                        break;
                    case 12:
                        i11 = aVar.f2032d.Q;
                        i12 = 12;
                        dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelSize(index, i11);
                        i15 = i12;
                        c0025a.b(i15, dimensionPixelOffset);
                        break;
                    case 13:
                        i11 = aVar.f2032d.M;
                        i12 = 13;
                        dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelSize(index, i11);
                        i15 = i12;
                        c0025a.b(i15, dimensionPixelOffset);
                        break;
                    case 14:
                        i11 = aVar.f2032d.O;
                        i12 = 14;
                        dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelSize(index, i11);
                        i15 = i12;
                        c0025a.b(i15, dimensionPixelOffset);
                        break;
                    case 15:
                        i11 = aVar.f2032d.R;
                        i12 = 15;
                        dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelSize(index, i11);
                        i15 = i12;
                        c0025a.b(i15, dimensionPixelOffset);
                        break;
                    case 16:
                        i11 = aVar.f2032d.N;
                        i12 = 16;
                        dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelSize(index, i11);
                        i15 = i12;
                        c0025a.b(i15, dimensionPixelOffset);
                        break;
                    case 17:
                        i14 = aVar.f2032d.f2054d;
                        i15 = 17;
                        dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(index, i14);
                        c0025a.b(i15, dimensionPixelOffset);
                        break;
                    case 18:
                        i14 = aVar.f2032d.f2056e;
                        i15 = 18;
                        dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(index, i14);
                        c0025a.b(i15, dimensionPixelOffset);
                        break;
                    case 19:
                        i16 = 19;
                        f10 = aVar.f2032d.f2058f;
                        dimension = obtainStyledAttributes.getFloat(index, f10);
                        c0025a.a(dimension, i16);
                        break;
                    case 20:
                        i16 = 20;
                        f10 = aVar.f2032d.f2085w;
                        dimension = obtainStyledAttributes.getFloat(index, f10);
                        c0025a.a(dimension, i16);
                        break;
                    case 21:
                        i17 = aVar.f2032d.f2052c;
                        i15 = 21;
                        dimensionPixelOffset = obtainStyledAttributes.getLayoutDimension(index, i17);
                        c0025a.b(i15, dimensionPixelOffset);
                        break;
                    case 22:
                        i15 = 22;
                        dimensionPixelOffset = f2023d[obtainStyledAttributes.getInt(index, aVar.f2030b.f2100a)];
                        c0025a.b(i15, dimensionPixelOffset);
                        break;
                    case 23:
                        i17 = aVar.f2032d.f2050b;
                        i15 = 23;
                        dimensionPixelOffset = obtainStyledAttributes.getLayoutDimension(index, i17);
                        c0025a.b(i15, dimensionPixelOffset);
                        break;
                    case 24:
                        i11 = aVar.f2032d.F;
                        i12 = 24;
                        dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelSize(index, i11);
                        i15 = i12;
                        c0025a.b(i15, dimensionPixelOffset);
                        break;
                    case 27:
                        i18 = aVar.f2032d.E;
                        i12 = 27;
                        dimensionPixelOffset = obtainStyledAttributes.getInt(index, i18);
                        i15 = i12;
                        c0025a.b(i15, dimensionPixelOffset);
                        break;
                    case 28:
                        i11 = aVar.f2032d.G;
                        i12 = 28;
                        dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelSize(index, i11);
                        i15 = i12;
                        c0025a.b(i15, dimensionPixelOffset);
                        break;
                    case 31:
                        i11 = aVar.f2032d.K;
                        i12 = 31;
                        dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelSize(index, i11);
                        i15 = i12;
                        c0025a.b(i15, dimensionPixelOffset);
                        break;
                    case 34:
                        i11 = aVar.f2032d.H;
                        i12 = 34;
                        dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelSize(index, i11);
                        i15 = i12;
                        c0025a.b(i15, dimensionPixelOffset);
                        break;
                    case 37:
                        i16 = 37;
                        f10 = aVar.f2032d.f2086x;
                        dimension = obtainStyledAttributes.getFloat(index, f10);
                        c0025a.a(dimension, i16);
                        break;
                    case 38:
                        dimensionPixelOffset = obtainStyledAttributes.getResourceId(index, aVar.f2029a);
                        aVar.f2029a = dimensionPixelOffset;
                        i15 = 38;
                        c0025a.b(i15, dimensionPixelOffset);
                        break;
                    case 39:
                        i16 = 39;
                        f10 = aVar.f2032d.U;
                        dimension = obtainStyledAttributes.getFloat(index, f10);
                        c0025a.a(dimension, i16);
                        break;
                    case 40:
                        i16 = 40;
                        f10 = aVar.f2032d.T;
                        dimension = obtainStyledAttributes.getFloat(index, f10);
                        c0025a.a(dimension, i16);
                        break;
                    case 41:
                        i18 = aVar.f2032d.V;
                        i12 = 41;
                        dimensionPixelOffset = obtainStyledAttributes.getInt(index, i18);
                        i15 = i12;
                        c0025a.b(i15, dimensionPixelOffset);
                        break;
                    case 42:
                        i18 = aVar.f2032d.W;
                        i12 = 42;
                        dimensionPixelOffset = obtainStyledAttributes.getInt(index, i18);
                        i15 = i12;
                        c0025a.b(i15, dimensionPixelOffset);
                        break;
                    case 43:
                        i16 = 43;
                        f10 = aVar.f2030b.f2102c;
                        dimension = obtainStyledAttributes.getFloat(index, f10);
                        c0025a.a(dimension, i16);
                        break;
                    case 44:
                        i16 = 44;
                        c0025a.d(44, true);
                        f11 = aVar.f2033e.f2117m;
                        dimension = obtainStyledAttributes.getDimension(index, f11);
                        c0025a.a(dimension, i16);
                        break;
                    case 45:
                        i16 = 45;
                        f10 = aVar.f2033e.f2106b;
                        dimension = obtainStyledAttributes.getFloat(index, f10);
                        c0025a.a(dimension, i16);
                        break;
                    case 46:
                        i16 = 46;
                        f10 = aVar.f2033e.f2107c;
                        dimension = obtainStyledAttributes.getFloat(index, f10);
                        c0025a.a(dimension, i16);
                        break;
                    case 47:
                        i16 = 47;
                        f10 = aVar.f2033e.f2108d;
                        dimension = obtainStyledAttributes.getFloat(index, f10);
                        c0025a.a(dimension, i16);
                        break;
                    case 48:
                        i16 = 48;
                        f10 = aVar.f2033e.f2109e;
                        dimension = obtainStyledAttributes.getFloat(index, f10);
                        c0025a.a(dimension, i16);
                        break;
                    case 49:
                        i16 = 49;
                        f11 = aVar.f2033e.f2110f;
                        dimension = obtainStyledAttributes.getDimension(index, f11);
                        c0025a.a(dimension, i16);
                        break;
                    case 50:
                        i16 = 50;
                        f11 = aVar.f2033e.f2111g;
                        dimension = obtainStyledAttributes.getDimension(index, f11);
                        c0025a.a(dimension, i16);
                        break;
                    case 51:
                        i16 = 51;
                        f11 = aVar.f2033e.f2113i;
                        dimension = obtainStyledAttributes.getDimension(index, f11);
                        c0025a.a(dimension, i16);
                        break;
                    case 52:
                        i16 = 52;
                        f11 = aVar.f2033e.f2114j;
                        dimension = obtainStyledAttributes.getDimension(index, f11);
                        c0025a.a(dimension, i16);
                        break;
                    case 53:
                        i16 = 53;
                        f11 = aVar.f2033e.f2115k;
                        dimension = obtainStyledAttributes.getDimension(index, f11);
                        c0025a.a(dimension, i16);
                        break;
                    case 54:
                        i18 = aVar.f2032d.X;
                        i12 = 54;
                        dimensionPixelOffset = obtainStyledAttributes.getInt(index, i18);
                        i15 = i12;
                        c0025a.b(i15, dimensionPixelOffset);
                        break;
                    case 55:
                        i18 = aVar.f2032d.Y;
                        i12 = 55;
                        dimensionPixelOffset = obtainStyledAttributes.getInt(index, i18);
                        i15 = i12;
                        c0025a.b(i15, dimensionPixelOffset);
                        break;
                    case 56:
                        i11 = aVar.f2032d.Z;
                        i12 = 56;
                        dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelSize(index, i11);
                        i15 = i12;
                        c0025a.b(i15, dimensionPixelOffset);
                        break;
                    case 57:
                        i11 = aVar.f2032d.f2049a0;
                        i12 = 57;
                        dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelSize(index, i11);
                        i15 = i12;
                        c0025a.b(i15, dimensionPixelOffset);
                        break;
                    case 58:
                        i11 = aVar.f2032d.f2051b0;
                        i12 = 58;
                        dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelSize(index, i11);
                        i15 = i12;
                        c0025a.b(i15, dimensionPixelOffset);
                        break;
                    case 59:
                        i11 = aVar.f2032d.f2053c0;
                        i12 = 59;
                        dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelSize(index, i11);
                        i15 = i12;
                        c0025a.b(i15, dimensionPixelOffset);
                        break;
                    case 60:
                        i16 = 60;
                        f10 = aVar.f2033e.f2105a;
                        dimension = obtainStyledAttributes.getFloat(index, f10);
                        c0025a.a(dimension, i16);
                        break;
                    case 62:
                        i11 = aVar.f2032d.A;
                        i12 = 62;
                        dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelSize(index, i11);
                        i15 = i12;
                        c0025a.b(i15, dimensionPixelOffset);
                        break;
                    case 63:
                        i16 = 63;
                        f10 = aVar.f2032d.B;
                        dimension = obtainStyledAttributes.getFloat(index, f10);
                        c0025a.a(dimension, i16);
                        break;
                    case 64:
                        i19 = aVar.f2031c.f2090a;
                        i15 = 64;
                        dimensionPixelOffset = f(obtainStyledAttributes, index, i19);
                        c0025a.b(i15, dimensionPixelOffset);
                        break;
                    case 65:
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            str = obtainStyledAttributes.getString(index);
                        } else {
                            str = r0.a.f25145b[obtainStyledAttributes.getInteger(index, 0)];
                        }
                        c0025a.c(65, str);
                        break;
                    case 66:
                        i12 = 66;
                        i18 = 0;
                        dimensionPixelOffset = obtainStyledAttributes.getInt(index, i18);
                        i15 = i12;
                        c0025a.b(i15, dimensionPixelOffset);
                        break;
                    case 67:
                        i16 = 67;
                        f10 = aVar.f2031c.f2094e;
                        dimension = obtainStyledAttributes.getFloat(index, f10);
                        c0025a.a(dimension, i16);
                        break;
                    case 68:
                        i16 = 68;
                        f10 = aVar.f2030b.f2103d;
                        dimension = obtainStyledAttributes.getFloat(index, f10);
                        c0025a.a(dimension, i16);
                        break;
                    case 69:
                        i16 = 69;
                        f10 = 1.0f;
                        dimension = obtainStyledAttributes.getFloat(index, f10);
                        c0025a.a(dimension, i16);
                        break;
                    case 70:
                        i16 = 70;
                        f10 = 1.0f;
                        dimension = obtainStyledAttributes.getFloat(index, f10);
                        c0025a.a(dimension, i16);
                        break;
                    case 71:
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i18 = aVar.f2032d.f2059f0;
                        i12 = 72;
                        dimensionPixelOffset = obtainStyledAttributes.getInt(index, i18);
                        i15 = i12;
                        c0025a.b(i15, dimensionPixelOffset);
                        break;
                    case 73:
                        i11 = aVar.f2032d.f2061g0;
                        i12 = 73;
                        dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelSize(index, i11);
                        i15 = i12;
                        c0025a.b(i15, dimensionPixelOffset);
                        break;
                    case 74:
                        i13 = 74;
                        c0025a.c(i13, obtainStyledAttributes.getString(index));
                        break;
                    case 75:
                        z11 = aVar.f2032d.f2075n0;
                        i20 = 75;
                        c0025a.d(i20, obtainStyledAttributes.getBoolean(index, z11));
                        break;
                    case 76:
                        i18 = aVar.f2031c.f2092c;
                        i12 = 76;
                        dimensionPixelOffset = obtainStyledAttributes.getInt(index, i18);
                        i15 = i12;
                        c0025a.b(i15, dimensionPixelOffset);
                        break;
                    case 77:
                        i13 = 77;
                        c0025a.c(i13, obtainStyledAttributes.getString(index));
                        break;
                    case 78:
                        i18 = aVar.f2030b.f2101b;
                        i12 = 78;
                        dimensionPixelOffset = obtainStyledAttributes.getInt(index, i18);
                        i15 = i12;
                        c0025a.b(i15, dimensionPixelOffset);
                        break;
                    case 79:
                        i16 = 79;
                        f10 = aVar.f2031c.f2093d;
                        dimension = obtainStyledAttributes.getFloat(index, f10);
                        c0025a.a(dimension, i16);
                        break;
                    case 80:
                        z11 = aVar.f2032d.f2071l0;
                        i20 = 80;
                        c0025a.d(i20, obtainStyledAttributes.getBoolean(index, z11));
                        break;
                    case 81:
                        z11 = aVar.f2032d.f2073m0;
                        i20 = 81;
                        c0025a.d(i20, obtainStyledAttributes.getBoolean(index, z11));
                        break;
                    case 82:
                        i21 = aVar.f2031c.f2091b;
                        i15 = 82;
                        dimensionPixelOffset = obtainStyledAttributes.getInteger(index, i21);
                        c0025a.b(i15, dimensionPixelOffset);
                        break;
                    case 83:
                        i19 = aVar.f2033e.f2112h;
                        i15 = 83;
                        dimensionPixelOffset = f(obtainStyledAttributes, index, i19);
                        c0025a.b(i15, dimensionPixelOffset);
                        break;
                    case 84:
                        i21 = aVar.f2031c.f2096g;
                        i15 = 84;
                        dimensionPixelOffset = obtainStyledAttributes.getInteger(index, i21);
                        c0025a.b(i15, dimensionPixelOffset);
                        break;
                    case 85:
                        i16 = 85;
                        f10 = aVar.f2031c.f2095f;
                        dimension = obtainStyledAttributes.getFloat(index, f10);
                        c0025a.a(dimension, i16);
                        break;
                    case 86:
                        int i27 = obtainStyledAttributes.peekValue(index).type;
                        i15 = 88;
                        if (i27 == i24) {
                            aVar.f2031c.f2099j = obtainStyledAttributes.getResourceId(index, -1);
                            c0025a.b(89, aVar.f2031c.f2099j);
                            cVar4 = aVar.f2031c;
                            if (cVar4.f2099j == -1) {
                                break;
                            }
                        } else if (i27 == 3) {
                            aVar.f2031c.f2097h = obtainStyledAttributes.getString(index);
                            c0025a.c(90, aVar.f2031c.f2097h);
                            if (aVar.f2031c.f2097h.indexOf("/") > 0) {
                                aVar.f2031c.f2099j = obtainStyledAttributes.getResourceId(index, -1);
                                c0025a.b(89, aVar.f2031c.f2099j);
                                cVar4 = aVar.f2031c;
                            } else {
                                cVar4 = aVar.f2031c;
                                i22 = -1;
                                cVar4.f2098i = i22;
                                c0025a.b(88, i22);
                                break;
                            }
                        } else {
                            c cVar5 = aVar.f2031c;
                            cVar5.f2098i = obtainStyledAttributes.getInteger(index, cVar5.f2099j);
                            dimensionPixelOffset = aVar.f2031c.f2098i;
                            c0025a.b(i15, dimensionPixelOffset);
                            break;
                        }
                        i22 = -2;
                        cVar4.f2098i = i22;
                        c0025a.b(88, i22);
                    case 87:
                        sb2 = new StringBuilder();
                        str2 = "unused attribute 0x";
                        sb2.append(str2);
                        sb2.append(Integer.toHexString(index));
                        sb2.append("   ");
                        sb2.append(f2024e.get(index));
                        Log.w("ConstraintSet", sb2.toString());
                        break;
                    case 93:
                        i11 = aVar.f2032d.L;
                        i12 = 93;
                        dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelSize(index, i11);
                        i15 = i12;
                        c0025a.b(i15, dimensionPixelOffset);
                        break;
                    case 94:
                        i11 = aVar.f2032d.S;
                        i12 = 94;
                        dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelSize(index, i11);
                        i15 = i12;
                        c0025a.b(i15, dimensionPixelOffset);
                        break;
                    case 95:
                        g(c0025a, obtainStyledAttributes, index, i25);
                        break;
                    case 96:
                        g(c0025a, obtainStyledAttributes, index, i24);
                        break;
                    case 97:
                        i18 = aVar.f2032d.f2077o0;
                        i12 = 97;
                        dimensionPixelOffset = obtainStyledAttributes.getInt(index, i18);
                        i15 = i12;
                        c0025a.b(i15, dimensionPixelOffset);
                        break;
                    case 98:
                        int i28 = u0.d.U;
                        if (obtainStyledAttributes.peekValue(index).type == i23) {
                            obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            aVar.f2029a = obtainStyledAttributes.getResourceId(index, aVar.f2029a);
                            break;
                        }
                    case 99:
                        z11 = aVar.f2032d.f2060g;
                        i20 = 99;
                        c0025a.d(i20, obtainStyledAttributes.getBoolean(index, z11));
                        break;
                }
                i26++;
                i23 = 3;
                i24 = 1;
                i25 = 0;
            }
        } else {
            int indexCount2 = obtainStyledAttributes.getIndexCount();
            for (int i29 = 0; i29 < indexCount2; i29++) {
                int index2 = obtainStyledAttributes.getIndex(i29);
                if (index2 != R.styleable.Constraint_android_id && R.styleable.Constraint_android_layout_marginStart != index2 && R.styleable.Constraint_android_layout_marginEnd != index2) {
                    aVar.f2031c.getClass();
                    aVar.f2032d.getClass();
                    aVar.f2030b.getClass();
                    aVar.f2033e.getClass();
                }
                switch (f2024e.get(index2)) {
                    case 1:
                        b bVar2 = aVar.f2032d;
                        bVar2.f2078p = f(obtainStyledAttributes, index2, bVar2.f2078p);
                        break;
                    case 2:
                        b bVar3 = aVar.f2032d;
                        bVar3.I = obtainStyledAttributes.getDimensionPixelSize(index2, bVar3.I);
                        break;
                    case 3:
                        b bVar4 = aVar.f2032d;
                        bVar4.f2076o = f(obtainStyledAttributes, index2, bVar4.f2076o);
                        break;
                    case 4:
                        b bVar5 = aVar.f2032d;
                        bVar5.f2074n = f(obtainStyledAttributes, index2, bVar5.f2074n);
                        break;
                    case 5:
                        aVar.f2032d.f2087y = obtainStyledAttributes.getString(index2);
                        break;
                    case 6:
                        b bVar6 = aVar.f2032d;
                        bVar6.C = obtainStyledAttributes.getDimensionPixelOffset(index2, bVar6.C);
                        break;
                    case 7:
                        b bVar7 = aVar.f2032d;
                        bVar7.D = obtainStyledAttributes.getDimensionPixelOffset(index2, bVar7.D);
                        break;
                    case 8:
                        b bVar8 = aVar.f2032d;
                        bVar8.J = obtainStyledAttributes.getDimensionPixelSize(index2, bVar8.J);
                        break;
                    case 9:
                        b bVar9 = aVar.f2032d;
                        bVar9.f2084v = f(obtainStyledAttributes, index2, bVar9.f2084v);
                        break;
                    case 10:
                        b bVar10 = aVar.f2032d;
                        bVar10.f2083u = f(obtainStyledAttributes, index2, bVar10.f2083u);
                        break;
                    case 11:
                        b bVar11 = aVar.f2032d;
                        bVar11.P = obtainStyledAttributes.getDimensionPixelSize(index2, bVar11.P);
                        break;
                    case 12:
                        b bVar12 = aVar.f2032d;
                        bVar12.Q = obtainStyledAttributes.getDimensionPixelSize(index2, bVar12.Q);
                        break;
                    case 13:
                        b bVar13 = aVar.f2032d;
                        bVar13.M = obtainStyledAttributes.getDimensionPixelSize(index2, bVar13.M);
                        break;
                    case 14:
                        b bVar14 = aVar.f2032d;
                        bVar14.O = obtainStyledAttributes.getDimensionPixelSize(index2, bVar14.O);
                        break;
                    case 15:
                        b bVar15 = aVar.f2032d;
                        bVar15.R = obtainStyledAttributes.getDimensionPixelSize(index2, bVar15.R);
                        break;
                    case 16:
                        b bVar16 = aVar.f2032d;
                        bVar16.N = obtainStyledAttributes.getDimensionPixelSize(index2, bVar16.N);
                        break;
                    case 17:
                        b bVar17 = aVar.f2032d;
                        bVar17.f2054d = obtainStyledAttributes.getDimensionPixelOffset(index2, bVar17.f2054d);
                        break;
                    case 18:
                        b bVar18 = aVar.f2032d;
                        bVar18.f2056e = obtainStyledAttributes.getDimensionPixelOffset(index2, bVar18.f2056e);
                        break;
                    case 19:
                        b bVar19 = aVar.f2032d;
                        bVar19.f2058f = obtainStyledAttributes.getFloat(index2, bVar19.f2058f);
                        break;
                    case 20:
                        b bVar20 = aVar.f2032d;
                        bVar20.f2085w = obtainStyledAttributes.getFloat(index2, bVar20.f2085w);
                        break;
                    case 21:
                        b bVar21 = aVar.f2032d;
                        bVar21.f2052c = obtainStyledAttributes.getLayoutDimension(index2, bVar21.f2052c);
                        break;
                    case 22:
                        C0026d c0026d = aVar.f2030b;
                        c0026d.f2100a = obtainStyledAttributes.getInt(index2, c0026d.f2100a);
                        C0026d c0026d2 = aVar.f2030b;
                        c0026d2.f2100a = f2023d[c0026d2.f2100a];
                        break;
                    case 23:
                        b bVar22 = aVar.f2032d;
                        bVar22.f2050b = obtainStyledAttributes.getLayoutDimension(index2, bVar22.f2050b);
                        break;
                    case 24:
                        b bVar23 = aVar.f2032d;
                        bVar23.F = obtainStyledAttributes.getDimensionPixelSize(index2, bVar23.F);
                        break;
                    case 25:
                        b bVar24 = aVar.f2032d;
                        bVar24.f2062h = f(obtainStyledAttributes, index2, bVar24.f2062h);
                        break;
                    case 26:
                        b bVar25 = aVar.f2032d;
                        bVar25.f2064i = f(obtainStyledAttributes, index2, bVar25.f2064i);
                        break;
                    case 27:
                        b bVar26 = aVar.f2032d;
                        bVar26.E = obtainStyledAttributes.getInt(index2, bVar26.E);
                        break;
                    case 28:
                        b bVar27 = aVar.f2032d;
                        bVar27.G = obtainStyledAttributes.getDimensionPixelSize(index2, bVar27.G);
                        break;
                    case 29:
                        b bVar28 = aVar.f2032d;
                        bVar28.f2066j = f(obtainStyledAttributes, index2, bVar28.f2066j);
                        break;
                    case 30:
                        b bVar29 = aVar.f2032d;
                        bVar29.f2068k = f(obtainStyledAttributes, index2, bVar29.f2068k);
                        break;
                    case 31:
                        b bVar30 = aVar.f2032d;
                        bVar30.K = obtainStyledAttributes.getDimensionPixelSize(index2, bVar30.K);
                        break;
                    case 32:
                        b bVar31 = aVar.f2032d;
                        bVar31.f2081s = f(obtainStyledAttributes, index2, bVar31.f2081s);
                        break;
                    case 33:
                        b bVar32 = aVar.f2032d;
                        bVar32.f2082t = f(obtainStyledAttributes, index2, bVar32.f2082t);
                        break;
                    case 34:
                        b bVar33 = aVar.f2032d;
                        bVar33.H = obtainStyledAttributes.getDimensionPixelSize(index2, bVar33.H);
                        break;
                    case 35:
                        b bVar34 = aVar.f2032d;
                        bVar34.f2072m = f(obtainStyledAttributes, index2, bVar34.f2072m);
                        break;
                    case 36:
                        b bVar35 = aVar.f2032d;
                        bVar35.f2070l = f(obtainStyledAttributes, index2, bVar35.f2070l);
                        break;
                    case 37:
                        b bVar36 = aVar.f2032d;
                        bVar36.f2086x = obtainStyledAttributes.getFloat(index2, bVar36.f2086x);
                        break;
                    case 38:
                        aVar.f2029a = obtainStyledAttributes.getResourceId(index2, aVar.f2029a);
                        break;
                    case 39:
                        b bVar37 = aVar.f2032d;
                        bVar37.U = obtainStyledAttributes.getFloat(index2, bVar37.U);
                        break;
                    case 40:
                        b bVar38 = aVar.f2032d;
                        bVar38.T = obtainStyledAttributes.getFloat(index2, bVar38.T);
                        break;
                    case 41:
                        b bVar39 = aVar.f2032d;
                        bVar39.V = obtainStyledAttributes.getInt(index2, bVar39.V);
                        break;
                    case 42:
                        b bVar40 = aVar.f2032d;
                        bVar40.W = obtainStyledAttributes.getInt(index2, bVar40.W);
                        break;
                    case 43:
                        C0026d c0026d3 = aVar.f2030b;
                        c0026d3.f2102c = obtainStyledAttributes.getFloat(index2, c0026d3.f2102c);
                        break;
                    case 44:
                        e eVar = aVar.f2033e;
                        eVar.f2116l = true;
                        eVar.f2117m = obtainStyledAttributes.getDimension(index2, eVar.f2117m);
                        break;
                    case 45:
                        e eVar2 = aVar.f2033e;
                        eVar2.f2106b = obtainStyledAttributes.getFloat(index2, eVar2.f2106b);
                        break;
                    case 46:
                        e eVar3 = aVar.f2033e;
                        eVar3.f2107c = obtainStyledAttributes.getFloat(index2, eVar3.f2107c);
                        break;
                    case 47:
                        e eVar4 = aVar.f2033e;
                        eVar4.f2108d = obtainStyledAttributes.getFloat(index2, eVar4.f2108d);
                        break;
                    case 48:
                        e eVar5 = aVar.f2033e;
                        eVar5.f2109e = obtainStyledAttributes.getFloat(index2, eVar5.f2109e);
                        break;
                    case 49:
                        e eVar6 = aVar.f2033e;
                        eVar6.f2110f = obtainStyledAttributes.getDimension(index2, eVar6.f2110f);
                        break;
                    case 50:
                        e eVar7 = aVar.f2033e;
                        eVar7.f2111g = obtainStyledAttributes.getDimension(index2, eVar7.f2111g);
                        break;
                    case 51:
                        e eVar8 = aVar.f2033e;
                        eVar8.f2113i = obtainStyledAttributes.getDimension(index2, eVar8.f2113i);
                        break;
                    case 52:
                        e eVar9 = aVar.f2033e;
                        eVar9.f2114j = obtainStyledAttributes.getDimension(index2, eVar9.f2114j);
                        break;
                    case 53:
                        e eVar10 = aVar.f2033e;
                        eVar10.f2115k = obtainStyledAttributes.getDimension(index2, eVar10.f2115k);
                        break;
                    case 54:
                        b bVar41 = aVar.f2032d;
                        bVar41.X = obtainStyledAttributes.getInt(index2, bVar41.X);
                        break;
                    case 55:
                        b bVar42 = aVar.f2032d;
                        bVar42.Y = obtainStyledAttributes.getInt(index2, bVar42.Y);
                        break;
                    case 56:
                        b bVar43 = aVar.f2032d;
                        bVar43.Z = obtainStyledAttributes.getDimensionPixelSize(index2, bVar43.Z);
                        break;
                    case 57:
                        b bVar44 = aVar.f2032d;
                        bVar44.f2049a0 = obtainStyledAttributes.getDimensionPixelSize(index2, bVar44.f2049a0);
                        break;
                    case 58:
                        b bVar45 = aVar.f2032d;
                        bVar45.f2051b0 = obtainStyledAttributes.getDimensionPixelSize(index2, bVar45.f2051b0);
                        break;
                    case 59:
                        b bVar46 = aVar.f2032d;
                        bVar46.f2053c0 = obtainStyledAttributes.getDimensionPixelSize(index2, bVar46.f2053c0);
                        break;
                    case 60:
                        e eVar11 = aVar.f2033e;
                        eVar11.f2105a = obtainStyledAttributes.getFloat(index2, eVar11.f2105a);
                        break;
                    case 61:
                        b bVar47 = aVar.f2032d;
                        bVar47.f2088z = f(obtainStyledAttributes, index2, bVar47.f2088z);
                        break;
                    case 62:
                        b bVar48 = aVar.f2032d;
                        bVar48.A = obtainStyledAttributes.getDimensionPixelSize(index2, bVar48.A);
                        break;
                    case 63:
                        b bVar49 = aVar.f2032d;
                        bVar49.B = obtainStyledAttributes.getFloat(index2, bVar49.B);
                        break;
                    case 64:
                        c cVar6 = aVar.f2031c;
                        cVar6.f2090a = f(obtainStyledAttributes, index2, cVar6.f2090a);
                        break;
                    case 65:
                        if (obtainStyledAttributes.peekValue(index2).type == 3) {
                            cVar = aVar.f2031c;
                            obtainStyledAttributes.getString(index2);
                        } else {
                            cVar = aVar.f2031c;
                            String str3 = r0.a.f25145b[obtainStyledAttributes.getInteger(index2, 0)];
                        }
                        cVar.getClass();
                        break;
                    case 66:
                        cVar = aVar.f2031c;
                        obtainStyledAttributes.getInt(index2, 0);
                        cVar.getClass();
                        break;
                    case 67:
                        c cVar7 = aVar.f2031c;
                        cVar7.f2094e = obtainStyledAttributes.getFloat(index2, cVar7.f2094e);
                        break;
                    case 68:
                        C0026d c0026d4 = aVar.f2030b;
                        c0026d4.f2103d = obtainStyledAttributes.getFloat(index2, c0026d4.f2103d);
                        break;
                    case 69:
                        aVar.f2032d.f2055d0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 70:
                        aVar.f2032d.f2057e0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        b bVar50 = aVar.f2032d;
                        bVar50.f2059f0 = obtainStyledAttributes.getInt(index2, bVar50.f2059f0);
                        break;
                    case 73:
                        b bVar51 = aVar.f2032d;
                        bVar51.f2061g0 = obtainStyledAttributes.getDimensionPixelSize(index2, bVar51.f2061g0);
                        break;
                    case 74:
                        aVar.f2032d.f2067j0 = obtainStyledAttributes.getString(index2);
                        break;
                    case 75:
                        b bVar52 = aVar.f2032d;
                        bVar52.f2075n0 = obtainStyledAttributes.getBoolean(index2, bVar52.f2075n0);
                        break;
                    case 76:
                        c cVar8 = aVar.f2031c;
                        cVar8.f2092c = obtainStyledAttributes.getInt(index2, cVar8.f2092c);
                        break;
                    case 77:
                        aVar.f2032d.f2069k0 = obtainStyledAttributes.getString(index2);
                        break;
                    case 78:
                        C0026d c0026d5 = aVar.f2030b;
                        c0026d5.f2101b = obtainStyledAttributes.getInt(index2, c0026d5.f2101b);
                        break;
                    case 79:
                        c cVar9 = aVar.f2031c;
                        cVar9.f2093d = obtainStyledAttributes.getFloat(index2, cVar9.f2093d);
                        break;
                    case 80:
                        b bVar53 = aVar.f2032d;
                        bVar53.f2071l0 = obtainStyledAttributes.getBoolean(index2, bVar53.f2071l0);
                        break;
                    case 81:
                        b bVar54 = aVar.f2032d;
                        bVar54.f2073m0 = obtainStyledAttributes.getBoolean(index2, bVar54.f2073m0);
                        break;
                    case 82:
                        c cVar10 = aVar.f2031c;
                        cVar10.f2091b = obtainStyledAttributes.getInteger(index2, cVar10.f2091b);
                        break;
                    case 83:
                        e eVar12 = aVar.f2033e;
                        eVar12.f2112h = f(obtainStyledAttributes, index2, eVar12.f2112h);
                        break;
                    case 84:
                        c cVar11 = aVar.f2031c;
                        cVar11.f2096g = obtainStyledAttributes.getInteger(index2, cVar11.f2096g);
                        break;
                    case 85:
                        c cVar12 = aVar.f2031c;
                        cVar12.f2095f = obtainStyledAttributes.getFloat(index2, cVar12.f2095f);
                        break;
                    case 86:
                        int i30 = obtainStyledAttributes.peekValue(index2).type;
                        if (i30 == 1) {
                            aVar.f2031c.f2099j = obtainStyledAttributes.getResourceId(index2, -1);
                            cVar3 = aVar.f2031c;
                            if (cVar3.f2099j == -1) {
                                break;
                            }
                            cVar3.f2098i = -2;
                            break;
                        } else {
                            if (i30 == 3) {
                                aVar.f2031c.f2097h = obtainStyledAttributes.getString(index2);
                                if (aVar.f2031c.f2097h.indexOf("/") > 0) {
                                    aVar.f2031c.f2099j = obtainStyledAttributes.getResourceId(index2, -1);
                                    cVar3 = aVar.f2031c;
                                    cVar3.f2098i = -2;
                                } else {
                                    integer = -1;
                                    cVar2 = aVar.f2031c;
                                }
                            } else {
                                cVar2 = aVar.f2031c;
                                integer = obtainStyledAttributes.getInteger(index2, cVar2.f2099j);
                            }
                            cVar2.f2098i = integer;
                            break;
                        }
                    case 87:
                        a10 = android.support.v4.media.d.a("unused attribute 0x");
                        a10.append(Integer.toHexString(index2));
                        a10.append("   ");
                        a10.append(f2024e.get(index2));
                        Log.w("ConstraintSet", a10.toString());
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        a10 = android.support.v4.media.d.a("Unknown attribute 0x");
                        a10.append(Integer.toHexString(index2));
                        a10.append("   ");
                        a10.append(f2024e.get(index2));
                        Log.w("ConstraintSet", a10.toString());
                        break;
                    case 91:
                        b bVar55 = aVar.f2032d;
                        bVar55.f2079q = f(obtainStyledAttributes, index2, bVar55.f2079q);
                        break;
                    case 92:
                        b bVar56 = aVar.f2032d;
                        bVar56.f2080r = f(obtainStyledAttributes, index2, bVar56.f2080r);
                        break;
                    case 93:
                        b bVar57 = aVar.f2032d;
                        bVar57.L = obtainStyledAttributes.getDimensionPixelSize(index2, bVar57.L);
                        break;
                    case 94:
                        b bVar58 = aVar.f2032d;
                        bVar58.S = obtainStyledAttributes.getDimensionPixelSize(index2, bVar58.S);
                        break;
                    case 95:
                        bVar = aVar.f2032d;
                        i10 = 0;
                        g(bVar, obtainStyledAttributes, index2, i10);
                        break;
                    case 96:
                        bVar = aVar.f2032d;
                        i10 = 1;
                        g(bVar, obtainStyledAttributes, index2, i10);
                        break;
                    case 97:
                        b bVar59 = aVar.f2032d;
                        bVar59.f2077o0 = obtainStyledAttributes.getInt(index2, bVar59.f2077o0);
                        break;
                }
            }
            b bVar60 = aVar.f2032d;
            if (bVar60.f2067j0 != null) {
                bVar60.f2065i0 = null;
            }
        }
        obtainStyledAttributes.recycle();
        return aVar;
    }

    public static int f(TypedArray typedArray, int i10, int i11) {
        int resourceId = typedArray.getResourceId(i10, i11);
        return resourceId == -1 ? typedArray.getInt(i10, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void g(java.lang.Object r8, android.content.res.TypedArray r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.d.g(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    public static void h(ConstraintLayout.a aVar, String str) {
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i10 = -1;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                i10 = substring.equalsIgnoreCase("W") ? 0 : substring.equalsIgnoreCase("H") ? 1 : -1;
                r2 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            try {
                if (indexOf2 < 0 || indexOf2 >= length - 1) {
                    String substring2 = str.substring(r2);
                    if (substring2.length() > 0) {
                        Float.parseFloat(substring2);
                    }
                } else {
                    String substring3 = str.substring(r2, indexOf2);
                    String substring4 = str.substring(indexOf2 + 1);
                    if (substring3.length() > 0 && substring4.length() > 0) {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            if (i10 == 1) {
                                Math.abs(parseFloat2 / parseFloat);
                            } else {
                                Math.abs(parseFloat / parseFloat2);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        aVar.G = str;
    }

    public final void a(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f2028c.keySet());
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            int id2 = childAt.getId();
            if (!this.f2028c.containsKey(Integer.valueOf(id2))) {
                StringBuilder a10 = android.support.v4.media.d.a("id unknown ");
                a10.append(u0.a.b(childAt));
                Log.w("ConstraintSet", a10.toString());
            } else if (this.f2027b && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else {
                if (id2 != -1) {
                    if (this.f2028c.containsKey(Integer.valueOf(id2))) {
                        hashSet.remove(Integer.valueOf(id2));
                        a aVar = this.f2028c.get(Integer.valueOf(id2));
                        if (aVar != null) {
                            if (childAt instanceof Barrier) {
                                aVar.f2032d.f2063h0 = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id2);
                                barrier.setType(aVar.f2032d.f2059f0);
                                barrier.setMargin(aVar.f2032d.f2061g0);
                                barrier.setAllowsGoneWidget(aVar.f2032d.f2075n0);
                                b bVar = aVar.f2032d;
                                int[] iArr = bVar.f2065i0;
                                if (iArr != null) {
                                    barrier.setReferencedIds(iArr);
                                } else {
                                    String str = bVar.f2067j0;
                                    if (str != null) {
                                        bVar.f2065i0 = c(barrier, str);
                                        barrier.setReferencedIds(aVar.f2032d.f2065i0);
                                    }
                                }
                            }
                            ConstraintLayout.a aVar2 = (ConstraintLayout.a) childAt.getLayoutParams();
                            aVar2.a();
                            aVar.a(aVar2);
                            androidx.constraintlayout.widget.a.b(childAt, aVar.f2034f);
                            childAt.setLayoutParams(aVar2);
                            C0026d c0026d = aVar.f2030b;
                            if (c0026d.f2101b == 0) {
                                childAt.setVisibility(c0026d.f2100a);
                            }
                            childAt.setAlpha(aVar.f2030b.f2102c);
                            childAt.setRotation(aVar.f2033e.f2105a);
                            childAt.setRotationX(aVar.f2033e.f2106b);
                            childAt.setRotationY(aVar.f2033e.f2107c);
                            childAt.setScaleX(aVar.f2033e.f2108d);
                            childAt.setScaleY(aVar.f2033e.f2109e);
                            e eVar = aVar.f2033e;
                            if (eVar.f2112h != -1) {
                                View findViewById = ((View) childAt.getParent()).findViewById(aVar.f2033e.f2112h);
                                if (findViewById != null) {
                                    float bottom = (findViewById.getBottom() + findViewById.getTop()) / 2.0f;
                                    float right = (findViewById.getRight() + findViewById.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(eVar.f2110f)) {
                                    childAt.setPivotX(aVar.f2033e.f2110f);
                                }
                                if (!Float.isNaN(aVar.f2033e.f2111g)) {
                                    childAt.setPivotY(aVar.f2033e.f2111g);
                                }
                            }
                            childAt.setTranslationX(aVar.f2033e.f2113i);
                            childAt.setTranslationY(aVar.f2033e.f2114j);
                            childAt.setTranslationZ(aVar.f2033e.f2115k);
                            e eVar2 = aVar.f2033e;
                            if (eVar2.f2116l) {
                                childAt.setElevation(eVar2.f2117m);
                            }
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id2);
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar3 = this.f2028c.get(num);
            if (aVar3 != null) {
                if (aVar3.f2032d.f2063h0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    b bVar2 = aVar3.f2032d;
                    int[] iArr2 = bVar2.f2065i0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar2.f2067j0;
                        if (str2 != null) {
                            bVar2.f2065i0 = c(barrier2, str2);
                            barrier2.setReferencedIds(aVar3.f2032d.f2065i0);
                        }
                    }
                    barrier2.setType(aVar3.f2032d.f2059f0);
                    barrier2.setMargin(aVar3.f2032d.f2061g0);
                    v0.b bVar3 = ConstraintLayout.f1922p;
                    ConstraintLayout.a aVar4 = new ConstraintLayout.a();
                    barrier2.k();
                    aVar3.a(aVar4);
                    constraintLayout.addView(barrier2, aVar4);
                }
                if (aVar3.f2032d.f2048a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    v0.b bVar4 = ConstraintLayout.f1922p;
                    ConstraintLayout.a aVar5 = new ConstraintLayout.a();
                    aVar3.a(aVar5);
                    constraintLayout.addView(guideline, aVar5);
                }
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = constraintLayout.getChildAt(i11);
            if (childAt2 instanceof androidx.constraintlayout.widget.b) {
                ((androidx.constraintlayout.widget.b) childAt2).g(constraintLayout);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        androidx.constraintlayout.widget.a aVar;
        d dVar = this;
        int childCount = constraintLayout.getChildCount();
        dVar.f2028c.clear();
        int i10 = 0;
        while (i10 < childCount) {
            View childAt = constraintLayout.getChildAt(i10);
            ConstraintLayout.a aVar2 = (ConstraintLayout.a) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (dVar.f2027b && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!dVar.f2028c.containsKey(Integer.valueOf(id2))) {
                dVar.f2028c.put(Integer.valueOf(id2), new a());
            }
            a aVar3 = dVar.f2028c.get(Integer.valueOf(id2));
            if (aVar3 != null) {
                HashMap<String, androidx.constraintlayout.widget.a> hashMap = dVar.f2026a;
                HashMap<String, androidx.constraintlayout.widget.a> hashMap2 = new HashMap<>();
                Class<?> cls = childAt.getClass();
                for (String str : hashMap.keySet()) {
                    androidx.constraintlayout.widget.a aVar4 = hashMap.get(str);
                    try {
                        if (str.equals("BackgroundColor")) {
                            aVar = new androidx.constraintlayout.widget.a(aVar4, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor()));
                        } else {
                            try {
                                aVar = new androidx.constraintlayout.widget.a(aVar4, cls.getMethod("getMap" + str, new Class[0]).invoke(childAt, new Object[0]));
                            } catch (IllegalAccessException e10) {
                                e = e10;
                                e.printStackTrace();
                            } catch (NoSuchMethodException e11) {
                                e = e11;
                                e.printStackTrace();
                            } catch (InvocationTargetException e12) {
                                e = e12;
                                e.printStackTrace();
                            }
                        }
                        hashMap2.put(str, aVar);
                    } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e13) {
                        e = e13;
                    }
                }
                aVar3.f2034f = hashMap2;
                aVar3.b(id2, aVar2);
                aVar3.f2030b.f2100a = childAt.getVisibility();
                aVar3.f2030b.f2102c = childAt.getAlpha();
                aVar3.f2033e.f2105a = childAt.getRotation();
                aVar3.f2033e.f2106b = childAt.getRotationX();
                aVar3.f2033e.f2107c = childAt.getRotationY();
                aVar3.f2033e.f2108d = childAt.getScaleX();
                aVar3.f2033e.f2109e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    e eVar = aVar3.f2033e;
                    eVar.f2110f = pivotX;
                    eVar.f2111g = pivotY;
                }
                aVar3.f2033e.f2113i = childAt.getTranslationX();
                aVar3.f2033e.f2114j = childAt.getTranslationY();
                aVar3.f2033e.f2115k = childAt.getTranslationZ();
                e eVar2 = aVar3.f2033e;
                if (eVar2.f2116l) {
                    eVar2.f2117m = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    aVar3.f2032d.f2075n0 = barrier.getAllowsGoneWidget();
                    aVar3.f2032d.f2065i0 = barrier.getReferencedIds();
                    aVar3.f2032d.f2059f0 = barrier.getType();
                    aVar3.f2032d.f2061g0 = barrier.getMargin();
                }
            }
            i10++;
            dVar = this;
        }
    }

    public final void e(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                    continue;
                } else if (eventType != 2) {
                    continue;
                } else {
                    String name = xml.getName();
                    a d10 = d(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        d10.f2032d.f2048a = true;
                    }
                    this.f2028c.put(Integer.valueOf(d10.f2029a), d10);
                    continue;
                }
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }
}
