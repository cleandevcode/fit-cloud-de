package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import no.nordicsemi.android.dfu.DfuBaseService;
import t0.b;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: p */
    public static v0.b f1922p;

    /* renamed from: a */
    public SparseArray<View> f1923a;

    /* renamed from: b */
    public ArrayList<androidx.constraintlayout.widget.b> f1924b;

    /* renamed from: c */
    public s0.e f1925c;

    /* renamed from: d */
    public int f1926d;

    /* renamed from: e */
    public int f1927e;

    /* renamed from: f */
    public int f1928f;

    /* renamed from: g */
    public int f1929g;

    /* renamed from: h */
    public boolean f1930h;

    /* renamed from: i */
    public int f1931i;

    /* renamed from: j */
    public d f1932j;

    /* renamed from: k */
    public c f1933k;

    /* renamed from: l */
    public int f1934l;

    /* renamed from: m */
    public HashMap<String, Integer> f1935m;

    /* renamed from: n */
    public SparseArray<s0.d> f1936n;

    /* renamed from: o */
    public b f1937o;

    /* loaded from: classes.dex */
    public static class a extends ViewGroup.MarginLayoutParams {
        public int A;
        public int B;
        public int C;
        public int D;
        public float E;
        public float F;
        public String G;
        public float H;
        public float I;
        public int J;
        public int K;
        public int L;
        public int M;
        public int N;
        public int O;
        public int P;
        public int Q;
        public float R;
        public float S;
        public int T;
        public int U;
        public int V;
        public boolean W;
        public boolean X;
        public String Y;
        public int Z;

        /* renamed from: a */
        public int f1938a;

        /* renamed from: a0 */
        public boolean f1939a0;

        /* renamed from: b */
        public int f1940b;

        /* renamed from: b0 */
        public boolean f1941b0;

        /* renamed from: c */
        public float f1942c;

        /* renamed from: c0 */
        public boolean f1943c0;

        /* renamed from: d */
        public boolean f1944d;

        /* renamed from: d0 */
        public boolean f1945d0;

        /* renamed from: e */
        public int f1946e;

        /* renamed from: e0 */
        public boolean f1947e0;

        /* renamed from: f */
        public int f1948f;

        /* renamed from: f0 */
        public boolean f1949f0;

        /* renamed from: g */
        public int f1950g;

        /* renamed from: g0 */
        public int f1951g0;

        /* renamed from: h */
        public int f1952h;

        /* renamed from: h0 */
        public int f1953h0;

        /* renamed from: i */
        public int f1954i;

        /* renamed from: i0 */
        public int f1955i0;

        /* renamed from: j */
        public int f1956j;

        /* renamed from: j0 */
        public int f1957j0;

        /* renamed from: k */
        public int f1958k;

        /* renamed from: k0 */
        public int f1959k0;

        /* renamed from: l */
        public int f1960l;

        /* renamed from: l0 */
        public int f1961l0;

        /* renamed from: m */
        public int f1962m;

        /* renamed from: m0 */
        public float f1963m0;

        /* renamed from: n */
        public int f1964n;

        /* renamed from: n0 */
        public int f1965n0;

        /* renamed from: o */
        public int f1966o;

        /* renamed from: o0 */
        public int f1967o0;

        /* renamed from: p */
        public int f1968p;

        /* renamed from: p0 */
        public float f1969p0;

        /* renamed from: q */
        public int f1970q;

        /* renamed from: q0 */
        public s0.d f1971q0;

        /* renamed from: r */
        public float f1972r;

        /* renamed from: s */
        public int f1973s;

        /* renamed from: t */
        public int f1974t;

        /* renamed from: u */
        public int f1975u;

        /* renamed from: v */
        public int f1976v;

        /* renamed from: w */
        public int f1977w;

        /* renamed from: x */
        public int f1978x;

        /* renamed from: y */
        public int f1979y;

        /* renamed from: z */
        public int f1980z;

        /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a$a */
        /* loaded from: classes.dex */
        public static class C0024a {

            /* renamed from: a */
            public static final SparseIntArray f1981a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f1981a = sparseIntArray;
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintWidth, 64);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintHeight, 65);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintBaseline_toTopOf, 52);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintBaseline_toBottomOf, 53);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintCircle, 2);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_guidelineUseRtl, 67);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_android_orientation, 1);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginTop, 22);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginRight, 23);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginStart, 25);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginBaseline, 55);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_marginBaseline, 54);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constrainedWidth, 27);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constrainedHeight, 28);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintTag, 51);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_wrapBehaviorInParent, 66);
            }
        }

        public a() {
            super(-2, -2);
            this.f1938a = -1;
            this.f1940b = -1;
            this.f1942c = -1.0f;
            this.f1944d = true;
            this.f1946e = -1;
            this.f1948f = -1;
            this.f1950g = -1;
            this.f1952h = -1;
            this.f1954i = -1;
            this.f1956j = -1;
            this.f1958k = -1;
            this.f1960l = -1;
            this.f1962m = -1;
            this.f1964n = -1;
            this.f1966o = -1;
            this.f1968p = -1;
            this.f1970q = 0;
            this.f1972r = 0.0f;
            this.f1973s = -1;
            this.f1974t = -1;
            this.f1975u = -1;
            this.f1976v = -1;
            this.f1977w = Integer.MIN_VALUE;
            this.f1978x = Integer.MIN_VALUE;
            this.f1979y = Integer.MIN_VALUE;
            this.f1980z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.Z = 0;
            this.f1939a0 = true;
            this.f1941b0 = true;
            this.f1943c0 = false;
            this.f1945d0 = false;
            this.f1947e0 = false;
            this.f1949f0 = false;
            this.f1951g0 = -1;
            this.f1953h0 = -1;
            this.f1955i0 = -1;
            this.f1957j0 = -1;
            this.f1959k0 = Integer.MIN_VALUE;
            this.f1961l0 = Integer.MIN_VALUE;
            this.f1963m0 = 0.5f;
            this.f1971q0 = new s0.d();
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            String str;
            this.f1938a = -1;
            this.f1940b = -1;
            this.f1942c = -1.0f;
            this.f1944d = true;
            this.f1946e = -1;
            this.f1948f = -1;
            this.f1950g = -1;
            this.f1952h = -1;
            this.f1954i = -1;
            this.f1956j = -1;
            this.f1958k = -1;
            this.f1960l = -1;
            this.f1962m = -1;
            this.f1964n = -1;
            this.f1966o = -1;
            this.f1968p = -1;
            this.f1970q = 0;
            this.f1972r = 0.0f;
            this.f1973s = -1;
            this.f1974t = -1;
            this.f1975u = -1;
            this.f1976v = -1;
            this.f1977w = Integer.MIN_VALUE;
            this.f1978x = Integer.MIN_VALUE;
            this.f1979y = Integer.MIN_VALUE;
            this.f1980z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.Z = 0;
            this.f1939a0 = true;
            this.f1941b0 = true;
            this.f1943c0 = false;
            this.f1945d0 = false;
            this.f1947e0 = false;
            this.f1949f0 = false;
            this.f1951g0 = -1;
            this.f1953h0 = -1;
            this.f1955i0 = -1;
            this.f1957j0 = -1;
            this.f1959k0 = Integer.MIN_VALUE;
            this.f1961l0 = Integer.MIN_VALUE;
            this.f1963m0 = 0.5f;
            this.f1971q0 = new s0.d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                int i11 = C0024a.f1981a.get(index);
                switch (i11) {
                    case 1:
                        this.V = obtainStyledAttributes.getInt(index, this.V);
                        continue;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f1968p);
                        this.f1968p = resourceId;
                        if (resourceId == -1) {
                            this.f1968p = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 3:
                        this.f1970q = obtainStyledAttributes.getDimensionPixelSize(index, this.f1970q);
                        continue;
                    case 4:
                        float f10 = obtainStyledAttributes.getFloat(index, this.f1972r) % 360.0f;
                        this.f1972r = f10;
                        if (f10 < 0.0f) {
                            this.f1972r = (360.0f - f10) % 360.0f;
                        } else {
                            continue;
                        }
                    case 5:
                        this.f1938a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1938a);
                        continue;
                    case 6:
                        this.f1940b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1940b);
                        continue;
                    case 7:
                        this.f1942c = obtainStyledAttributes.getFloat(index, this.f1942c);
                        continue;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f1946e);
                        this.f1946e = resourceId2;
                        if (resourceId2 == -1) {
                            this.f1946e = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f1948f);
                        this.f1948f = resourceId3;
                        if (resourceId3 == -1) {
                            this.f1948f = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f1950g);
                        this.f1950g = resourceId4;
                        if (resourceId4 == -1) {
                            this.f1950g = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f1952h);
                        this.f1952h = resourceId5;
                        if (resourceId5 == -1) {
                            this.f1952h = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f1954i);
                        this.f1954i = resourceId6;
                        if (resourceId6 == -1) {
                            this.f1954i = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f1956j);
                        this.f1956j = resourceId7;
                        if (resourceId7 == -1) {
                            this.f1956j = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f1958k);
                        this.f1958k = resourceId8;
                        if (resourceId8 == -1) {
                            this.f1958k = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f1960l);
                        this.f1960l = resourceId9;
                        if (resourceId9 == -1) {
                            this.f1960l = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f1962m);
                        this.f1962m = resourceId10;
                        if (resourceId10 == -1) {
                            this.f1962m = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f1973s);
                        this.f1973s = resourceId11;
                        if (resourceId11 == -1) {
                            this.f1973s = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f1974t);
                        this.f1974t = resourceId12;
                        if (resourceId12 == -1) {
                            this.f1974t = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f1975u);
                        this.f1975u = resourceId13;
                        if (resourceId13 == -1) {
                            this.f1975u = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f1976v);
                        this.f1976v = resourceId14;
                        if (resourceId14 == -1) {
                            this.f1976v = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 21:
                        this.f1977w = obtainStyledAttributes.getDimensionPixelSize(index, this.f1977w);
                        continue;
                    case 22:
                        this.f1978x = obtainStyledAttributes.getDimensionPixelSize(index, this.f1978x);
                        continue;
                    case 23:
                        this.f1979y = obtainStyledAttributes.getDimensionPixelSize(index, this.f1979y);
                        continue;
                    case 24:
                        this.f1980z = obtainStyledAttributes.getDimensionPixelSize(index, this.f1980z);
                        continue;
                    case 25:
                        this.A = obtainStyledAttributes.getDimensionPixelSize(index, this.A);
                        continue;
                    case 26:
                        this.B = obtainStyledAttributes.getDimensionPixelSize(index, this.B);
                        continue;
                    case 27:
                        this.W = obtainStyledAttributes.getBoolean(index, this.W);
                        continue;
                    case 28:
                        this.X = obtainStyledAttributes.getBoolean(index, this.X);
                        continue;
                    case 29:
                        this.E = obtainStyledAttributes.getFloat(index, this.E);
                        continue;
                    case 30:
                        this.F = obtainStyledAttributes.getFloat(index, this.F);
                        continue;
                    case 31:
                        int i12 = obtainStyledAttributes.getInt(index, 0);
                        this.L = i12;
                        if (i12 == 1) {
                            str = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.";
                            break;
                        } else {
                            continue;
                        }
                    case 32:
                        int i13 = obtainStyledAttributes.getInt(index, 0);
                        this.M = i13;
                        if (i13 == 1) {
                            str = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.";
                            break;
                        } else {
                            continue;
                        }
                    case 33:
                        try {
                            this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                            continue;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.N) == -2) {
                                this.N = -2;
                            }
                        }
                    case 34:
                        try {
                            this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                            continue;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.P) == -2) {
                                this.P = -2;
                            }
                        }
                    case 35:
                        this.R = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.R));
                        this.L = 2;
                        continue;
                    case 36:
                        try {
                            this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                            continue;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.O) == -2) {
                                this.O = -2;
                            }
                        }
                    case 37:
                        try {
                            this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                            continue;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.Q) == -2) {
                                this.Q = -2;
                            }
                        }
                    case 38:
                        this.S = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.S));
                        this.M = 2;
                        continue;
                    default:
                        switch (i11) {
                            case 44:
                                d.h(this, obtainStyledAttributes.getString(index));
                                continue;
                            case 45:
                                this.H = obtainStyledAttributes.getFloat(index, this.H);
                                continue;
                            case 46:
                                this.I = obtainStyledAttributes.getFloat(index, this.I);
                                continue;
                            case 47:
                                this.J = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 48:
                                this.K = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 49:
                                this.T = obtainStyledAttributes.getDimensionPixelOffset(index, this.T);
                                continue;
                            case 50:
                                this.U = obtainStyledAttributes.getDimensionPixelOffset(index, this.U);
                                continue;
                            case 51:
                                this.Y = obtainStyledAttributes.getString(index);
                                continue;
                            case 52:
                                int resourceId15 = obtainStyledAttributes.getResourceId(index, this.f1964n);
                                this.f1964n = resourceId15;
                                if (resourceId15 == -1) {
                                    this.f1964n = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    continue;
                                }
                            case 53:
                                int resourceId16 = obtainStyledAttributes.getResourceId(index, this.f1966o);
                                this.f1966o = resourceId16;
                                if (resourceId16 == -1) {
                                    this.f1966o = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    continue;
                                }
                            case 54:
                                this.D = obtainStyledAttributes.getDimensionPixelSize(index, this.D);
                                continue;
                            case 55:
                                this.C = obtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                continue;
                            default:
                                switch (i11) {
                                    case 64:
                                        d.g(this, obtainStyledAttributes, index, 0);
                                        continue;
                                        continue;
                                        continue;
                                    case 65:
                                        d.g(this, obtainStyledAttributes, index, 1);
                                        continue;
                                    case 66:
                                        this.Z = obtainStyledAttributes.getInt(index, this.Z);
                                        continue;
                                    case 67:
                                        this.f1944d = obtainStyledAttributes.getBoolean(index, this.f1944d);
                                        continue;
                                }
                        }
                        break;
                }
                Log.e("ConstraintLayout", str);
            }
            obtainStyledAttributes.recycle();
            a();
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1938a = -1;
            this.f1940b = -1;
            this.f1942c = -1.0f;
            this.f1944d = true;
            this.f1946e = -1;
            this.f1948f = -1;
            this.f1950g = -1;
            this.f1952h = -1;
            this.f1954i = -1;
            this.f1956j = -1;
            this.f1958k = -1;
            this.f1960l = -1;
            this.f1962m = -1;
            this.f1964n = -1;
            this.f1966o = -1;
            this.f1968p = -1;
            this.f1970q = 0;
            this.f1972r = 0.0f;
            this.f1973s = -1;
            this.f1974t = -1;
            this.f1975u = -1;
            this.f1976v = -1;
            this.f1977w = Integer.MIN_VALUE;
            this.f1978x = Integer.MIN_VALUE;
            this.f1979y = Integer.MIN_VALUE;
            this.f1980z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.Z = 0;
            this.f1939a0 = true;
            this.f1941b0 = true;
            this.f1943c0 = false;
            this.f1945d0 = false;
            this.f1947e0 = false;
            this.f1949f0 = false;
            this.f1951g0 = -1;
            this.f1953h0 = -1;
            this.f1955i0 = -1;
            this.f1957j0 = -1;
            this.f1959k0 = Integer.MIN_VALUE;
            this.f1961l0 = Integer.MIN_VALUE;
            this.f1963m0 = 0.5f;
            this.f1971q0 = new s0.d();
        }

        public final void a() {
            this.f1945d0 = false;
            this.f1939a0 = true;
            this.f1941b0 = true;
            int i10 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i10 == -2 && this.W) {
                this.f1939a0 = false;
                if (this.L == 0) {
                    this.L = 1;
                }
            }
            int i11 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i11 == -2 && this.X) {
                this.f1941b0 = false;
                if (this.M == 0) {
                    this.M = 1;
                }
            }
            if (i10 == 0 || i10 == -1) {
                this.f1939a0 = false;
                if (i10 == 0 && this.L == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.W = true;
                }
            }
            if (i11 == 0 || i11 == -1) {
                this.f1941b0 = false;
                if (i11 == 0 && this.M == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.X = true;
                }
            }
            if (this.f1942c == -1.0f && this.f1938a == -1 && this.f1940b == -1) {
                return;
            }
            this.f1945d0 = true;
            this.f1939a0 = true;
            this.f1941b0 = true;
            if (!(this.f1971q0 instanceof s0.g)) {
                this.f1971q0 = new s0.g();
            }
            ((s0.g) this.f1971q0).R(this.V);
        }

        /* JADX WARN: Code restructure failed: missing block: B:178:0x00d0, code lost:
            if (r1 > 0) goto L52;
         */
        /* JADX WARN: Code restructure failed: missing block: B:179:0x00d2, code lost:
            ((android.view.ViewGroup.MarginLayoutParams) r10).rightMargin = r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:184:0x00df, code lost:
            if (r1 > 0) goto L52;
         */
        /* JADX WARN: Removed duplicated region for block: B:121:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:124:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:127:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:130:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:133:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:142:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:143:0x0082  */
        /* JADX WARN: Removed duplicated region for block: B:188:0x00e6  */
        /* JADX WARN: Removed duplicated region for block: B:192:0x00f1  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @android.annotation.TargetApi(17)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void resolveLayoutDirection(int r11) {
            /*
                Method dump skipped, instructions count: 255
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.a.resolveLayoutDirection(int):void");
        }
    }

    /* loaded from: classes.dex */
    public class b implements b.InterfaceC0491b {

        /* renamed from: a */
        public ConstraintLayout f1982a;

        /* renamed from: b */
        public int f1983b;

        /* renamed from: c */
        public int f1984c;

        /* renamed from: d */
        public int f1985d;

        /* renamed from: e */
        public int f1986e;

        /* renamed from: f */
        public int f1987f;

        /* renamed from: g */
        public int f1988g;

        public b(ConstraintLayout constraintLayout) {
            ConstraintLayout.this = r1;
            this.f1982a = constraintLayout;
        }

        public static boolean a(int i10, int i11, int i12) {
            if (i10 == i11) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i10);
            View.MeasureSpec.getSize(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i12 == size;
            }
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:352:0x01a3  */
        /* JADX WARN: Removed duplicated region for block: B:355:0x01b6  */
        /* JADX WARN: Removed duplicated region for block: B:356:0x01b8  */
        /* JADX WARN: Removed duplicated region for block: B:358:0x01bb  */
        /* JADX WARN: Removed duplicated region for block: B:359:0x01bd  */
        /* JADX WARN: Removed duplicated region for block: B:383:0x01e8 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:384:0x01e9  */
        @android.annotation.SuppressLint({"WrongCall"})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void b(s0.d r18, t0.b.a r19) {
            /*
                Method dump skipped, instructions count: 734
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.b.b(s0.d, t0.b$a):void");
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1923a = new SparseArray<>();
        this.f1924b = new ArrayList<>(4);
        this.f1925c = new s0.e();
        this.f1926d = 0;
        this.f1927e = 0;
        this.f1928f = Integer.MAX_VALUE;
        this.f1929g = Integer.MAX_VALUE;
        this.f1930h = true;
        this.f1931i = 257;
        this.f1932j = null;
        this.f1933k = null;
        this.f1934l = -1;
        this.f1935m = new HashMap<>();
        this.f1936n = new SparseArray<>();
        this.f1937o = new b(this);
        c(attributeSet, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1923a = new SparseArray<>();
        this.f1924b = new ArrayList<>(4);
        this.f1925c = new s0.e();
        this.f1926d = 0;
        this.f1927e = 0;
        this.f1928f = Integer.MAX_VALUE;
        this.f1929g = Integer.MAX_VALUE;
        this.f1930h = true;
        this.f1931i = 257;
        this.f1932j = null;
        this.f1933k = null;
        this.f1934l = -1;
        this.f1935m = new HashMap<>();
        this.f1936n = new SparseArray<>();
        this.f1937o = new b(this);
        c(attributeSet, i10);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    public static v0.b getSharedValues() {
        if (f1922p == null) {
            f1922p = new v0.b();
        }
        return f1922p;
    }

    public final s0.d b(View view) {
        if (view == this) {
            return this.f1925c;
        }
        if (view != null) {
            if (!(view.getLayoutParams() instanceof a)) {
                view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
                if (!(view.getLayoutParams() instanceof a)) {
                    return null;
                }
            }
            return ((a) view.getLayoutParams()).f1971q0;
        }
        return null;
    }

    public final void c(AttributeSet attributeSet, int i10) {
        s0.e eVar = this.f1925c;
        eVar.f26329i0 = this;
        b bVar = this.f1937o;
        eVar.f26359w0 = bVar;
        eVar.f26357u0.f27481f = bVar;
        this.f1923a.put(getId(), this);
        this.f1932j = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ConstraintLayout_Layout, i10, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                if (index == R.styleable.ConstraintLayout_Layout_android_minWidth) {
                    this.f1926d = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1926d);
                } else if (index == R.styleable.ConstraintLayout_Layout_android_minHeight) {
                    this.f1927e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1927e);
                } else if (index == R.styleable.ConstraintLayout_Layout_android_maxWidth) {
                    this.f1928f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1928f);
                } else if (index == R.styleable.ConstraintLayout_Layout_android_maxHeight) {
                    this.f1929g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1929g);
                } else if (index == R.styleable.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.f1931i = obtainStyledAttributes.getInt(index, this.f1931i);
                } else if (index == R.styleable.ConstraintLayout_Layout_layoutDescription) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            f(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f1933k = null;
                        }
                    }
                } else if (index == R.styleable.ConstraintLayout_Layout_constraintSet) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        d dVar = new d();
                        this.f1932j = dVar;
                        dVar.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f1932j = null;
                    }
                    this.f1934l = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        s0.e eVar2 = this.f1925c;
        eVar2.F0 = this.f1931i;
        q0.c.f24468p = eVar2.W(DfuBaseService.ERROR_REMOTE_TYPE_SECURE);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public final boolean d() {
        return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<androidx.constraintlayout.widget.b> arrayList = this.f1924b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                this.f1924b.get(i10).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i12 = (int) ((parseInt / 1080.0f) * width);
                        int i13 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f10 = i12;
                        float f11 = i13;
                        float f12 = i12 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f10, f11, f12, f11, paint);
                        float parseInt4 = i13 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f12, f11, f12, parseInt4, paint);
                        canvas.drawLine(f12, parseInt4, f10, parseInt4, paint);
                        canvas.drawLine(f10, parseInt4, f10, f11, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f10, f11, f12, parseInt4, paint);
                        canvas.drawLine(f10, parseInt4, f12, f11, paint);
                    }
                }
            }
        }
    }

    public void f(int i10) {
        this.f1933k = new c(getContext(), this, i10);
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.f1930h = true;
        super.forceLayout();
    }

    public final void g(String str, Integer num) {
        if ((str instanceof String) && (num instanceof Integer)) {
            if (this.f1935m == null) {
                this.f1935m = new HashMap<>();
            }
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.f1935m.put(str, Integer.valueOf(num.intValue()));
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public int getMaxHeight() {
        return this.f1929g;
    }

    public int getMaxWidth() {
        return this.f1928f;
    }

    public int getMinHeight() {
        return this.f1927e;
    }

    public int getMinWidth() {
        return this.f1926d;
    }

    public int getOptimizationLevel() {
        return this.f1925c.F0;
    }

    public String getSceneString() {
        int id2;
        StringBuilder sb2 = new StringBuilder();
        if (this.f1925c.f26332k == null) {
            int id3 = getId();
            if (id3 != -1) {
                this.f1925c.f26332k = getContext().getResources().getResourceEntryName(id3);
            } else {
                this.f1925c.f26332k = "parent";
            }
        }
        s0.e eVar = this.f1925c;
        if (eVar.f26333k0 == null) {
            eVar.f26333k0 = eVar.f26332k;
            StringBuilder a10 = android.support.v4.media.d.a(" setDebugName ");
            a10.append(this.f1925c.f26333k0);
            Log.v("ConstraintLayout", a10.toString());
        }
        Iterator<s0.d> it = this.f1925c.f26400s0.iterator();
        while (it.hasNext()) {
            s0.d next = it.next();
            View view = (View) next.f26329i0;
            if (view != null) {
                if (next.f26332k == null && (id2 = view.getId()) != -1) {
                    next.f26332k = getContext().getResources().getResourceEntryName(id2);
                }
                if (next.f26333k0 == null) {
                    next.f26333k0 = next.f26332k;
                    StringBuilder a11 = android.support.v4.media.d.a(" setDebugName ");
                    a11.append(next.f26333k0);
                    Log.v("ConstraintLayout", a11.toString());
                }
            }
        }
        this.f1925c.o(sb2);
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:503:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:544:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x03f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h() {
        /*
            Method dump skipped, instructions count: 1442
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.h():boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            a aVar = (a) childAt.getLayoutParams();
            s0.d dVar = aVar.f1971q0;
            if ((childAt.getVisibility() != 8 || aVar.f1945d0 || aVar.f1947e0 || isInEditMode) && !aVar.f1949f0) {
                int s10 = dVar.s();
                int t10 = dVar.t();
                int r10 = dVar.r() + s10;
                int l10 = dVar.l() + t10;
                childAt.layout(s10, t10, r10, l10);
                if ((childAt instanceof f) && (content = ((f) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(s10, t10, r10, l10);
                }
            }
        }
        int size = this.f1924b.size();
        if (size > 0) {
            for (int i15 = 0; i15 < size; i15++) {
                this.f1924b.get(i15).getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:507:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:541:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:577:0x01e6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:583:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:702:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:704:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:708:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:789:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:791:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:876:0x0797  */
    /* JADX WARN: Removed duplicated region for block: B:881:0x07e4  */
    /* JADX WARN: Removed duplicated region for block: B:883:0x07e7  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r24, int r25) {
        /*
            Method dump skipped, instructions count: 2028
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        s0.d b10 = b(view);
        if ((view instanceof Guideline) && !(b10 instanceof s0.g)) {
            a aVar = (a) view.getLayoutParams();
            s0.g gVar = new s0.g();
            aVar.f1971q0 = gVar;
            aVar.f1945d0 = true;
            gVar.R(aVar.V);
        }
        if (view instanceof androidx.constraintlayout.widget.b) {
            androidx.constraintlayout.widget.b bVar = (androidx.constraintlayout.widget.b) view;
            bVar.k();
            ((a) view.getLayoutParams()).f1947e0 = true;
            if (!this.f1924b.contains(bVar)) {
                this.f1924b.add(bVar);
            }
        }
        this.f1923a.put(view.getId(), view);
        this.f1930h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f1923a.remove(view.getId());
        s0.d b10 = b(view);
        this.f1925c.f26400s0.remove(b10);
        b10.D();
        this.f1924b.remove(view);
        this.f1930h = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f1930h = true;
        super.requestLayout();
    }

    public void setConstraintSet(d dVar) {
        this.f1932j = dVar;
    }

    @Override // android.view.View
    public void setId(int i10) {
        this.f1923a.remove(getId());
        super.setId(i10);
        this.f1923a.put(getId(), this);
    }

    public void setMaxHeight(int i10) {
        if (i10 == this.f1929g) {
            return;
        }
        this.f1929g = i10;
        requestLayout();
    }

    public void setMaxWidth(int i10) {
        if (i10 == this.f1928f) {
            return;
        }
        this.f1928f = i10;
        requestLayout();
    }

    public void setMinHeight(int i10) {
        if (i10 == this.f1927e) {
            return;
        }
        this.f1927e = i10;
        requestLayout();
    }

    public void setMinWidth(int i10) {
        if (i10 == this.f1926d) {
            return;
        }
        this.f1926d = i10;
        requestLayout();
    }

    public void setOnConstraintsChanged(v0.a aVar) {
        c cVar = this.f1933k;
        if (cVar != null) {
            cVar.getClass();
        }
    }

    public void setOptimizationLevel(int i10) {
        this.f1931i = i10;
        s0.e eVar = this.f1925c;
        eVar.F0 = i10;
        q0.c.f24468p = eVar.W(DfuBaseService.ERROR_REMOTE_TYPE_SECURE);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
