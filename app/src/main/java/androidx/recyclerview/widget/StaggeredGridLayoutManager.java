package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.WeakHashMap;
import k1.i2;
import k1.o0;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.m implements RecyclerView.x.b {
    public boolean D;
    public boolean E;
    public e F;
    public int G;
    public int[] L;

    /* renamed from: p */
    public int f3029p;

    /* renamed from: q */
    public f[] f3030q;

    /* renamed from: r */
    public d0 f3031r;

    /* renamed from: s */
    public d0 f3032s;

    /* renamed from: t */
    public int f3033t;

    /* renamed from: u */
    public int f3034u;

    /* renamed from: v */
    public final w f3035v;

    /* renamed from: w */
    public boolean f3036w;

    /* renamed from: y */
    public BitSet f3038y;

    /* renamed from: x */
    public boolean f3037x = false;

    /* renamed from: z */
    public int f3039z = -1;
    public int A = Integer.MIN_VALUE;
    public d B = new d();
    public int C = 2;
    public final Rect H = new Rect();
    public final b I = new b();
    public boolean J = false;
    public boolean K = true;
    public final a M = new a();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
            StaggeredGridLayoutManager.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            StaggeredGridLayoutManager.this.F0();
        }
    }

    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a */
        public int f3041a;

        /* renamed from: b */
        public int f3042b;

        /* renamed from: c */
        public boolean f3043c;

        /* renamed from: d */
        public boolean f3044d;

        /* renamed from: e */
        public boolean f3045e;

        /* renamed from: f */
        public int[] f3046f;

        public b() {
            StaggeredGridLayoutManager.this = r1;
            a();
        }

        public final void a() {
            this.f3041a = -1;
            this.f3042b = Integer.MIN_VALUE;
            this.f3043c = false;
            this.f3044d = false;
            this.f3045e = false;
            int[] iArr = this.f3046f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c extends RecyclerView.n {

        /* renamed from: e */
        public f f3048e;

        /* renamed from: f */
        public boolean f3049f;

        public c(int i10, int i11) {
            super(i10, i11);
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        public int[] f3050a;

        /* renamed from: b */
        public List<a> f3051b;

        @SuppressLint({"BanParcelableUsage"})
        /* loaded from: classes.dex */
        public static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0030a();

            /* renamed from: a */
            public int f3052a;

            /* renamed from: b */
            public int f3053b;

            /* renamed from: c */
            public int[] f3054c;

            /* renamed from: d */
            public boolean f3055d;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a */
            /* loaded from: classes.dex */
            public class C0030a implements Parcelable.Creator<a> {
                @Override // android.os.Parcelable.Creator
                public final a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                @Override // android.os.Parcelable.Creator
                public final a[] newArray(int i10) {
                    return new a[i10];
                }
            }

            public a() {
            }

            public a(Parcel parcel) {
                this.f3052a = parcel.readInt();
                this.f3053b = parcel.readInt();
                this.f3055d = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f3054c = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final String toString() {
                StringBuilder a10 = android.support.v4.media.d.a("FullSpanItem{mPosition=");
                a10.append(this.f3052a);
                a10.append(", mGapDir=");
                a10.append(this.f3053b);
                a10.append(", mHasUnwantedGapAfter=");
                a10.append(this.f3055d);
                a10.append(", mGapPerSpan=");
                a10.append(Arrays.toString(this.f3054c));
                a10.append('}');
                return a10.toString();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i10) {
                parcel.writeInt(this.f3052a);
                parcel.writeInt(this.f3053b);
                parcel.writeInt(this.f3055d ? 1 : 0);
                int[] iArr = this.f3054c;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f3054c);
            }
        }

        public final void a(a aVar) {
            if (this.f3051b == null) {
                this.f3051b = new ArrayList();
            }
            int size = this.f3051b.size();
            for (int i10 = 0; i10 < size; i10++) {
                a aVar2 = this.f3051b.get(i10);
                if (aVar2.f3052a == aVar.f3052a) {
                    this.f3051b.remove(i10);
                }
                if (aVar2.f3052a >= aVar.f3052a) {
                    this.f3051b.add(i10, aVar);
                    return;
                }
            }
            this.f3051b.add(aVar);
        }

        public final void b() {
            int[] iArr = this.f3050a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f3051b = null;
        }

        public final void c(int i10) {
            int[] iArr = this.f3050a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i10, 10) + 1];
                this.f3050a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i10 >= iArr.length) {
                int length = iArr.length;
                while (length <= i10) {
                    length *= 2;
                }
                int[] iArr3 = new int[length];
                this.f3050a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f3050a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        public final void d(int i10) {
            List<a> list = this.f3051b;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    } else if (this.f3051b.get(size).f3052a >= i10) {
                        this.f3051b.remove(size);
                    }
                }
            }
            g(i10);
        }

        public final a e(int i10, int i11, int i12) {
            List<a> list = this.f3051b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                a aVar = this.f3051b.get(i13);
                int i14 = aVar.f3052a;
                if (i14 >= i11) {
                    return null;
                }
                if (i14 >= i10 && (i12 == 0 || aVar.f3053b == i12 || aVar.f3055d)) {
                    return aVar;
                }
            }
            return null;
        }

        public final a f(int i10) {
            List<a> list = this.f3051b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f3051b.get(size);
                if (aVar.f3052a == i10) {
                    return aVar;
                }
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:54:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0052  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int g(int r5) {
            /*
                r4 = this;
                int[] r0 = r4.f3050a
                r1 = -1
                if (r0 != 0) goto L6
                return r1
            L6:
                int r0 = r0.length
                if (r5 < r0) goto La
                return r1
            La:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r4.f3051b
                if (r0 != 0) goto L10
            Le:
                r0 = -1
                goto L46
            L10:
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r0 = r4.f(r5)
                if (r0 == 0) goto L1b
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r2 = r4.f3051b
                r2.remove(r0)
            L1b:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r4.f3051b
                int r0 = r0.size()
                r2 = 0
            L22:
                if (r2 >= r0) goto L34
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r3 = r4.f3051b
                java.lang.Object r3 = r3.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a) r3
                int r3 = r3.f3052a
                if (r3 < r5) goto L31
                goto L35
            L31:
                int r2 = r2 + 1
                goto L22
            L34:
                r2 = -1
            L35:
                if (r2 == r1) goto Le
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r4.f3051b
                java.lang.Object r0 = r0.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a) r0
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r3 = r4.f3051b
                r3.remove(r2)
                int r0 = r0.f3052a
            L46:
                if (r0 != r1) goto L52
                int[] r0 = r4.f3050a
                int r2 = r0.length
                java.util.Arrays.fill(r0, r5, r2, r1)
                int[] r5 = r4.f3050a
                int r5 = r5.length
                return r5
            L52:
                int r0 = r0 + 1
                int[] r2 = r4.f3050a
                int r2 = r2.length
                int r0 = java.lang.Math.min(r0, r2)
                int[] r2 = r4.f3050a
                java.util.Arrays.fill(r2, r5, r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.d.g(int):int");
        }

        public final void h(int i10, int i11) {
            int[] iArr = this.f3050a;
            if (iArr == null || i10 >= iArr.length) {
                return;
            }
            int i12 = i10 + i11;
            c(i12);
            int[] iArr2 = this.f3050a;
            System.arraycopy(iArr2, i10, iArr2, i12, (iArr2.length - i10) - i11);
            Arrays.fill(this.f3050a, i10, i12, -1);
            List<a> list = this.f3051b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f3051b.get(size);
                int i13 = aVar.f3052a;
                if (i13 >= i10) {
                    aVar.f3052a = i13 + i11;
                }
            }
        }

        public final void i(int i10, int i11) {
            int[] iArr = this.f3050a;
            if (iArr == null || i10 >= iArr.length) {
                return;
            }
            int i12 = i10 + i11;
            c(i12);
            int[] iArr2 = this.f3050a;
            System.arraycopy(iArr2, i12, iArr2, i10, (iArr2.length - i10) - i11);
            int[] iArr3 = this.f3050a;
            Arrays.fill(iArr3, iArr3.length - i11, iArr3.length, -1);
            List<a> list = this.f3051b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f3051b.get(size);
                int i13 = aVar.f3052a;
                if (i13 >= i10) {
                    if (i13 < i12) {
                        this.f3051b.remove(size);
                    } else {
                        aVar.f3052a = i13 - i11;
                    }
                }
            }
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: a */
        public int f3056a;

        /* renamed from: b */
        public int f3057b;

        /* renamed from: c */
        public int f3058c;

        /* renamed from: d */
        public int[] f3059d;

        /* renamed from: e */
        public int f3060e;

        /* renamed from: f */
        public int[] f3061f;

        /* renamed from: g */
        public List<d.a> f3062g;

        /* renamed from: h */
        public boolean f3063h;

        /* renamed from: i */
        public boolean f3064i;

        /* renamed from: j */
        public boolean f3065j;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<e> {
            @Override // android.os.Parcelable.Creator
            public final e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final e[] newArray(int i10) {
                return new e[i10];
            }
        }

        public e() {
        }

        public e(Parcel parcel) {
            this.f3056a = parcel.readInt();
            this.f3057b = parcel.readInt();
            int readInt = parcel.readInt();
            this.f3058c = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f3059d = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f3060e = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f3061f = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f3063h = parcel.readInt() == 1;
            this.f3064i = parcel.readInt() == 1;
            this.f3065j = parcel.readInt() == 1;
            this.f3062g = parcel.readArrayList(d.a.class.getClassLoader());
        }

        public e(e eVar) {
            this.f3058c = eVar.f3058c;
            this.f3056a = eVar.f3056a;
            this.f3057b = eVar.f3057b;
            this.f3059d = eVar.f3059d;
            this.f3060e = eVar.f3060e;
            this.f3061f = eVar.f3061f;
            this.f3063h = eVar.f3063h;
            this.f3064i = eVar.f3064i;
            this.f3065j = eVar.f3065j;
            this.f3062g = eVar.f3062g;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f3056a);
            parcel.writeInt(this.f3057b);
            parcel.writeInt(this.f3058c);
            if (this.f3058c > 0) {
                parcel.writeIntArray(this.f3059d);
            }
            parcel.writeInt(this.f3060e);
            if (this.f3060e > 0) {
                parcel.writeIntArray(this.f3061f);
            }
            parcel.writeInt(this.f3063h ? 1 : 0);
            parcel.writeInt(this.f3064i ? 1 : 0);
            parcel.writeInt(this.f3065j ? 1 : 0);
            parcel.writeList(this.f3062g);
        }
    }

    /* loaded from: classes.dex */
    public class f {

        /* renamed from: a */
        public ArrayList<View> f3066a = new ArrayList<>();

        /* renamed from: b */
        public int f3067b = Integer.MIN_VALUE;

        /* renamed from: c */
        public int f3068c = Integer.MIN_VALUE;

        /* renamed from: d */
        public int f3069d = 0;

        /* renamed from: e */
        public final int f3070e;

        public f(int i10) {
            StaggeredGridLayoutManager.this = r1;
            this.f3070e = i10;
        }

        public static c j(View view) {
            return (c) view.getLayoutParams();
        }

        public final void a(View view) {
            c cVar = (c) view.getLayoutParams();
            cVar.f3048e = this;
            this.f3066a.add(view);
            this.f3068c = Integer.MIN_VALUE;
            if (this.f3066a.size() == 1) {
                this.f3067b = Integer.MIN_VALUE;
            }
            if (cVar.c() || cVar.b()) {
                this.f3069d = StaggeredGridLayoutManager.this.f3031r.c(view) + this.f3069d;
            }
        }

        public final void b() {
            d.a f10;
            int i10;
            ArrayList<View> arrayList = this.f3066a;
            View view = arrayList.get(arrayList.size() - 1);
            c j10 = j(view);
            this.f3068c = StaggeredGridLayoutManager.this.f3031r.b(view);
            if (j10.f3049f && (f10 = StaggeredGridLayoutManager.this.B.f(j10.a())) != null && f10.f3053b == 1) {
                int i11 = this.f3068c;
                int i12 = this.f3070e;
                int[] iArr = f10.f3054c;
                if (iArr == null) {
                    i10 = 0;
                } else {
                    i10 = iArr[i12];
                }
                this.f3068c = i10 + i11;
            }
        }

        public final void c() {
            d.a f10;
            int i10 = 0;
            View view = this.f3066a.get(0);
            c j10 = j(view);
            this.f3067b = StaggeredGridLayoutManager.this.f3031r.e(view);
            if (j10.f3049f && (f10 = StaggeredGridLayoutManager.this.B.f(j10.a())) != null && f10.f3053b == -1) {
                int i11 = this.f3067b;
                int i12 = this.f3070e;
                int[] iArr = f10.f3054c;
                if (iArr != null) {
                    i10 = iArr[i12];
                }
                this.f3067b = i11 - i10;
            }
        }

        public final void d() {
            this.f3066a.clear();
            this.f3067b = Integer.MIN_VALUE;
            this.f3068c = Integer.MIN_VALUE;
            this.f3069d = 0;
        }

        public final int e() {
            int i10;
            int size;
            if (StaggeredGridLayoutManager.this.f3036w) {
                i10 = this.f3066a.size() - 1;
                size = -1;
            } else {
                i10 = 0;
                size = this.f3066a.size();
            }
            return g(i10, size);
        }

        public final int f() {
            int size;
            int i10;
            if (StaggeredGridLayoutManager.this.f3036w) {
                size = 0;
                i10 = this.f3066a.size();
            } else {
                size = this.f3066a.size() - 1;
                i10 = -1;
            }
            return g(size, i10);
        }

        public final int g(int i10, int i11) {
            int k10 = StaggeredGridLayoutManager.this.f3031r.k();
            int g10 = StaggeredGridLayoutManager.this.f3031r.g();
            int i12 = i11 > i10 ? 1 : -1;
            while (i10 != i11) {
                View view = this.f3066a.get(i10);
                int e10 = StaggeredGridLayoutManager.this.f3031r.e(view);
                int b10 = StaggeredGridLayoutManager.this.f3031r.b(view);
                boolean z10 = e10 <= g10;
                boolean z11 = b10 >= k10;
                if (z10 && z11 && (e10 < k10 || b10 > g10)) {
                    StaggeredGridLayoutManager.this.getClass();
                    return RecyclerView.m.H(view);
                }
                i10 += i12;
            }
            return -1;
        }

        public final int h(int i10) {
            int i11 = this.f3068c;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f3066a.size() == 0) {
                return i10;
            }
            b();
            return this.f3068c;
        }

        public final View i(int i10, int i11) {
            View view = null;
            if (i11 != -1) {
                int size = this.f3066a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f3066a.get(size);
                    if ((StaggeredGridLayoutManager.this.f3036w && RecyclerView.m.H(view2) >= i10) || ((!StaggeredGridLayoutManager.this.f3036w && RecyclerView.m.H(view2) <= i10) || !view2.hasFocusable())) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f3066a.size();
                int i12 = 0;
                while (i12 < size2) {
                    View view3 = this.f3066a.get(i12);
                    if ((StaggeredGridLayoutManager.this.f3036w && RecyclerView.m.H(view3) <= i10) || ((!StaggeredGridLayoutManager.this.f3036w && RecyclerView.m.H(view3) >= i10) || !view3.hasFocusable())) {
                        break;
                    }
                    i12++;
                    view = view3;
                }
            }
            return view;
        }

        public final int k(int i10) {
            int i11 = this.f3067b;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f3066a.size() == 0) {
                return i10;
            }
            c();
            return this.f3067b;
        }

        public final void l() {
            int size = this.f3066a.size();
            View remove = this.f3066a.remove(size - 1);
            c j10 = j(remove);
            j10.f3048e = null;
            if (j10.c() || j10.b()) {
                this.f3069d -= StaggeredGridLayoutManager.this.f3031r.c(remove);
            }
            if (size == 1) {
                this.f3067b = Integer.MIN_VALUE;
            }
            this.f3068c = Integer.MIN_VALUE;
        }

        public final void m() {
            View remove = this.f3066a.remove(0);
            c j10 = j(remove);
            j10.f3048e = null;
            if (this.f3066a.size() == 0) {
                this.f3068c = Integer.MIN_VALUE;
            }
            if (j10.c() || j10.b()) {
                this.f3069d -= StaggeredGridLayoutManager.this.f3031r.c(remove);
            }
            this.f3067b = Integer.MIN_VALUE;
        }

        public final void n(View view) {
            c cVar = (c) view.getLayoutParams();
            cVar.f3048e = this;
            this.f3066a.add(0, view);
            this.f3067b = Integer.MIN_VALUE;
            if (this.f3066a.size() == 1) {
                this.f3068c = Integer.MIN_VALUE;
            }
            if (cVar.c() || cVar.b()) {
                this.f3069d = StaggeredGridLayoutManager.this.f3031r.c(view) + this.f3069d;
            }
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f3029p = -1;
        this.f3036w = false;
        RecyclerView.m.d I = RecyclerView.m.I(context, attributeSet, i10, i11);
        int i12 = I.f2976a;
        if (i12 != 0 && i12 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        d(null);
        if (i12 != this.f3033t) {
            this.f3033t = i12;
            d0 d0Var = this.f3031r;
            this.f3031r = this.f3032s;
            this.f3032s = d0Var;
            p0();
        }
        int i13 = I.f2977b;
        d(null);
        if (i13 != this.f3029p) {
            this.B.b();
            p0();
            this.f3029p = i13;
            this.f3038y = new BitSet(this.f3029p);
            this.f3030q = new f[this.f3029p];
            for (int i14 = 0; i14 < this.f3029p; i14++) {
                this.f3030q[i14] = new f(i14);
            }
            p0();
        }
        boolean z10 = I.f2978c;
        d(null);
        e eVar = this.F;
        if (eVar != null && eVar.f3063h != z10) {
            eVar.f3063h = z10;
        }
        this.f3036w = z10;
        p0();
        this.f3035v = new w();
        this.f3031r = d0.a(this, this.f3033t);
        this.f3032s = d0.a(this, 1 - this.f3033t);
    }

    public static int i1(int i10, int i11, int i12) {
        if (i11 == 0 && i12 == 0) {
            return i10;
        }
        int mode = View.MeasureSpec.getMode(i10);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - i11) - i12), mode) : i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void B0(RecyclerView recyclerView, int i10) {
        x xVar = new x(recyclerView.getContext());
        xVar.f3000a = i10;
        C0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean D0() {
        return this.F == null;
    }

    public final int E0(int i10) {
        if (y() == 0) {
            return this.f3037x ? 1 : -1;
        }
        return (i10 < O0()) != this.f3037x ? -1 : 1;
    }

    public final boolean F0() {
        int O0;
        int P0;
        int i10;
        if (y() == 0 || this.C == 0 || !this.f2965g) {
            return false;
        }
        if (this.f3037x) {
            O0 = P0();
            P0 = O0();
        } else {
            O0 = O0();
            P0 = P0();
        }
        if (O0 == 0 && T0() != null) {
            this.B.b();
        } else if (!this.J) {
            return false;
        } else {
            if (this.f3037x) {
                i10 = -1;
            } else {
                i10 = 1;
            }
            int i11 = P0 + 1;
            d.a e10 = this.B.e(O0, i11, i10);
            if (e10 == null) {
                this.J = false;
                this.B.d(i11);
                return false;
            }
            d.a e11 = this.B.e(O0, e10.f3052a, i10 * (-1));
            if (e11 == null) {
                this.B.d(e10.f3052a);
            } else {
                this.B.d(e11.f3052a + 1);
            }
        }
        this.f2964f = true;
        p0();
        return true;
    }

    public final int G0(RecyclerView.y yVar) {
        if (y() == 0) {
            return 0;
        }
        return j0.a(yVar, this.f3031r, L0(!this.K), K0(!this.K), this, this.K);
    }

    public final int H0(RecyclerView.y yVar) {
        if (y() == 0) {
            return 0;
        }
        return j0.b(yVar, this.f3031r, L0(!this.K), K0(!this.K), this, this.K, this.f3037x);
    }

    public final int I0(RecyclerView.y yVar) {
        if (y() == 0) {
            return 0;
        }
        return j0.c(yVar, this.f3031r, L0(!this.K), K0(!this.K), this, this.K);
    }

    /* JADX WARN: Removed duplicated region for block: B:300:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0335  */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v24 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int J0(androidx.recyclerview.widget.RecyclerView.t r19, androidx.recyclerview.widget.w r20, androidx.recyclerview.widget.RecyclerView.y r21) {
        /*
            Method dump skipped, instructions count: 898
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.J0(androidx.recyclerview.widget.RecyclerView$t, androidx.recyclerview.widget.w, androidx.recyclerview.widget.RecyclerView$y):int");
    }

    public final View K0(boolean z10) {
        int k10 = this.f3031r.k();
        int g10 = this.f3031r.g();
        View view = null;
        for (int y10 = y() - 1; y10 >= 0; y10--) {
            View x10 = x(y10);
            int e10 = this.f3031r.e(x10);
            int b10 = this.f3031r.b(x10);
            if (b10 > k10 && e10 < g10) {
                if (b10 <= g10 || !z10) {
                    return x10;
                }
                if (view == null) {
                    view = x10;
                }
            }
        }
        return view;
    }

    public final View L0(boolean z10) {
        int k10 = this.f3031r.k();
        int g10 = this.f3031r.g();
        int y10 = y();
        View view = null;
        for (int i10 = 0; i10 < y10; i10++) {
            View x10 = x(i10);
            int e10 = this.f3031r.e(x10);
            if (this.f3031r.b(x10) > k10 && e10 < g10) {
                if (e10 >= k10 || !z10) {
                    return x10;
                }
                if (view == null) {
                    view = x10;
                }
            }
        }
        return view;
    }

    public final void M0(RecyclerView.t tVar, RecyclerView.y yVar, boolean z10) {
        int g10;
        int Q0 = Q0(Integer.MIN_VALUE);
        if (Q0 != Integer.MIN_VALUE && (g10 = this.f3031r.g() - Q0) > 0) {
            int i10 = g10 - (-d1(-g10, tVar, yVar));
            if (!z10 || i10 <= 0) {
                return;
            }
            this.f3031r.o(i10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean N() {
        return this.C != 0;
    }

    public final void N0(RecyclerView.t tVar, RecyclerView.y yVar, boolean z10) {
        int k10;
        int R0 = R0(Integer.MAX_VALUE);
        if (R0 != Integer.MAX_VALUE && (k10 = R0 - this.f3031r.k()) > 0) {
            int d12 = k10 - d1(k10, tVar, yVar);
            if (!z10 || d12 <= 0) {
                return;
            }
            this.f3031r.o(-d12);
        }
    }

    public final int O0() {
        if (y() == 0) {
            return 0;
        }
        return RecyclerView.m.H(x(0));
    }

    public final int P0() {
        int y10 = y();
        if (y10 == 0) {
            return 0;
        }
        return RecyclerView.m.H(x(y10 - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void Q(int i10) {
        super.Q(i10);
        for (int i11 = 0; i11 < this.f3029p; i11++) {
            f fVar = this.f3030q[i11];
            int i12 = fVar.f3067b;
            if (i12 != Integer.MIN_VALUE) {
                fVar.f3067b = i12 + i10;
            }
            int i13 = fVar.f3068c;
            if (i13 != Integer.MIN_VALUE) {
                fVar.f3068c = i13 + i10;
            }
        }
    }

    public final int Q0(int i10) {
        int h10 = this.f3030q[0].h(i10);
        for (int i11 = 1; i11 < this.f3029p; i11++) {
            int h11 = this.f3030q[i11].h(i10);
            if (h11 > h10) {
                h10 = h11;
            }
        }
        return h10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void R(int i10) {
        super.R(i10);
        for (int i11 = 0; i11 < this.f3029p; i11++) {
            f fVar = this.f3030q[i11];
            int i12 = fVar.f3067b;
            if (i12 != Integer.MIN_VALUE) {
                fVar.f3067b = i12 + i10;
            }
            int i13 = fVar.f3068c;
            if (i13 != Integer.MIN_VALUE) {
                fVar.f3068c = i13 + i10;
            }
        }
    }

    public final int R0(int i10) {
        int k10 = this.f3030q[0].k(i10);
        for (int i11 = 1; i11 < this.f3029p; i11++) {
            int k11 = this.f3030q[i11].k(i10);
            if (k11 < k10) {
                k10 = k11;
            }
        }
        return k10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void S() {
        this.B.b();
        for (int i10 = 0; i10 < this.f3029p; i10++) {
            this.f3030q[i10].d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void S0(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f3037x
            if (r0 == 0) goto L9
            int r0 = r6.P0()
            goto Ld
        L9:
            int r0 = r6.O0()
        Ld:
            r1 = 8
            if (r9 != r1) goto L1a
            if (r7 >= r8) goto L16
            int r2 = r8 + 1
            goto L1c
        L16:
            int r2 = r7 + 1
            r3 = r8
            goto L1d
        L1a:
            int r2 = r7 + r8
        L1c:
            r3 = r7
        L1d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.B
            r4.g(r3)
            r4 = 1
            if (r9 == r4) goto L3c
            r5 = 2
            if (r9 == r5) goto L36
            if (r9 == r1) goto L2b
            goto L41
        L2b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.B
            r9.i(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r6.B
            r7.h(r8, r4)
            goto L41
        L36:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.B
            r9.i(r7, r8)
            goto L41
        L3c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.B
            r9.h(r7, r8)
        L41:
            if (r2 > r0) goto L44
            return
        L44:
            boolean r7 = r6.f3037x
            if (r7 == 0) goto L4d
            int r7 = r6.O0()
            goto L51
        L4d:
            int r7 = r6.P0()
        L51:
            if (r3 > r7) goto L56
            r6.p0()
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.S0(int, int, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void T(RecyclerView recyclerView) {
        a aVar = this.M;
        RecyclerView recyclerView2 = this.f2960b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(aVar);
        }
        for (int i10 = 0; i10 < this.f3029p; i10++) {
            this.f3030q[i10].d();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x00bc, code lost:
        if (r11 == r12) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x00ce, code lost:
        if (r11 == r12) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x00d0, code lost:
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x00d2, code lost:
        r11 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View T0() {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.T0():android.view.View");
    }

    /* JADX WARN: Code restructure failed: missing block: B:180:0x004a, code lost:
        if (r9.f3033t == 1) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x004f, code lost:
        if (r9.f3033t == 0) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x005e, code lost:
        if (U0() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x006a, code lost:
        if (U0() == false) goto L118;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View U(android.view.View r10, int r11, androidx.recyclerview.widget.RecyclerView.t r12, androidx.recyclerview.widget.RecyclerView.y r13) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.U(android.view.View, int, androidx.recyclerview.widget.RecyclerView$t, androidx.recyclerview.widget.RecyclerView$y):android.view.View");
    }

    public final boolean U0() {
        return B() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void V(AccessibilityEvent accessibilityEvent) {
        super.V(accessibilityEvent);
        if (y() > 0) {
            View L0 = L0(false);
            View K0 = K0(false);
            if (L0 == null || K0 == null) {
                return;
            }
            int H = RecyclerView.m.H(L0);
            int H2 = RecyclerView.m.H(K0);
            if (H < H2) {
                accessibilityEvent.setFromIndex(H);
                accessibilityEvent.setToIndex(H2);
                return;
            }
            accessibilityEvent.setFromIndex(H2);
            accessibilityEvent.setToIndex(H);
        }
    }

    public final void V0(View view, int i10, int i11, boolean z10) {
        e(view, this.H);
        c cVar = (c) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
        Rect rect = this.H;
        int i13 = i1(i10, i12 + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int i14 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
        Rect rect2 = this.H;
        int i15 = i1(i11, i14 + rect2.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect2.bottom);
        if (y0(view, i13, i15, cVar)) {
            view.measure(i13, i15);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:562:0x041c, code lost:
        if (F0() != false) goto L271;
     */
    /* JADX WARN: Removed duplicated region for block: B:420:0x01be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void W0(androidx.recyclerview.widget.RecyclerView.t r12, androidx.recyclerview.widget.RecyclerView.y r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 1086
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.W0(androidx.recyclerview.widget.RecyclerView$t, androidx.recyclerview.widget.RecyclerView$y, boolean):void");
    }

    public final boolean X0(int i10) {
        if (this.f3033t == 0) {
            return (i10 == -1) != this.f3037x;
        }
        return ((i10 == -1) == this.f3037x) == U0();
    }

    public final void Y0(int i10, RecyclerView.y yVar) {
        int O0;
        int i11;
        if (i10 > 0) {
            O0 = P0();
            i11 = 1;
        } else {
            O0 = O0();
            i11 = -1;
        }
        this.f3035v.f3319a = true;
        g1(O0, yVar);
        e1(i11);
        w wVar = this.f3035v;
        wVar.f3321c = O0 + wVar.f3322d;
        wVar.f3320b = Math.abs(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void Z(int i10, int i11) {
        S0(i10, i11, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0011, code lost:
        if (r6.f3323e == (-1)) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Z0(androidx.recyclerview.widget.RecyclerView.t r5, androidx.recyclerview.widget.w r6) {
        /*
            r4 = this;
            boolean r0 = r6.f3319a
            if (r0 == 0) goto L7c
            boolean r0 = r6.f3327i
            if (r0 == 0) goto La
            goto L7c
        La:
            int r0 = r6.f3320b
            r1 = -1
            if (r0 != 0) goto L1f
            int r0 = r6.f3323e
            if (r0 != r1) goto L19
        L13:
            int r6 = r6.f3325g
        L15:
            r4.a1(r6, r5)
            goto L7c
        L19:
            int r6 = r6.f3324f
        L1b:
            r4.b1(r6, r5)
            goto L7c
        L1f:
            int r0 = r6.f3323e
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L50
            int r0 = r6.f3324f
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r4.f3030q
            r1 = r1[r2]
            int r1 = r1.k(r0)
        L2f:
            int r2 = r4.f3029p
            if (r3 >= r2) goto L41
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r2 = r4.f3030q
            r2 = r2[r3]
            int r2 = r2.k(r0)
            if (r2 <= r1) goto L3e
            r1 = r2
        L3e:
            int r3 = r3 + 1
            goto L2f
        L41:
            int r0 = r0 - r1
            if (r0 >= 0) goto L45
            goto L13
        L45:
            int r1 = r6.f3325g
            int r6 = r6.f3320b
            int r6 = java.lang.Math.min(r0, r6)
            int r6 = r1 - r6
            goto L15
        L50:
            int r0 = r6.f3325g
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r4.f3030q
            r1 = r1[r2]
            int r1 = r1.h(r0)
        L5a:
            int r2 = r4.f3029p
            if (r3 >= r2) goto L6c
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r2 = r4.f3030q
            r2 = r2[r3]
            int r2 = r2.h(r0)
            if (r2 >= r1) goto L69
            r1 = r2
        L69:
            int r3 = r3 + 1
            goto L5a
        L6c:
            int r0 = r6.f3325g
            int r1 = r1 - r0
            if (r1 >= 0) goto L72
            goto L19
        L72:
            int r0 = r6.f3324f
            int r6 = r6.f3320b
            int r6 = java.lang.Math.min(r1, r6)
            int r6 = r6 + r0
            goto L1b
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.Z0(androidx.recyclerview.widget.RecyclerView$t, androidx.recyclerview.widget.w):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.x.b
    public final PointF a(int i10) {
        int E0 = E0(i10);
        PointF pointF = new PointF();
        if (E0 == 0) {
            return null;
        }
        if (this.f3033t == 0) {
            pointF.x = E0;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = E0;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void a0() {
        this.B.b();
        p0();
    }

    public final void a1(int i10, RecyclerView.t tVar) {
        for (int y10 = y() - 1; y10 >= 0; y10--) {
            View x10 = x(y10);
            if (this.f3031r.e(x10) < i10 || this.f3031r.n(x10) < i10) {
                return;
            }
            c cVar = (c) x10.getLayoutParams();
            if (cVar.f3049f) {
                for (int i11 = 0; i11 < this.f3029p; i11++) {
                    if (this.f3030q[i11].f3066a.size() == 1) {
                        return;
                    }
                }
                for (int i12 = 0; i12 < this.f3029p; i12++) {
                    this.f3030q[i12].l();
                }
            } else if (cVar.f3048e.f3066a.size() == 1) {
                return;
            } else {
                cVar.f3048e.l();
            }
            m0(x10, tVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void b0(int i10, int i11) {
        S0(i10, i11, 8);
    }

    public final void b1(int i10, RecyclerView.t tVar) {
        while (y() > 0) {
            View x10 = x(0);
            if (this.f3031r.b(x10) > i10 || this.f3031r.m(x10) > i10) {
                return;
            }
            c cVar = (c) x10.getLayoutParams();
            if (cVar.f3049f) {
                for (int i11 = 0; i11 < this.f3029p; i11++) {
                    if (this.f3030q[i11].f3066a.size() == 1) {
                        return;
                    }
                }
                for (int i12 = 0; i12 < this.f3029p; i12++) {
                    this.f3030q[i12].m();
                }
            } else if (cVar.f3048e.f3066a.size() == 1) {
                return;
            } else {
                cVar.f3048e.m();
            }
            m0(x10, tVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void c0(int i10, int i11) {
        S0(i10, i11, 2);
    }

    public final void c1() {
        this.f3037x = (this.f3033t == 1 || !U0()) ? this.f3036w : !this.f3036w;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void d(String str) {
        if (this.F == null) {
            super.d(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void d0(int i10, int i11) {
        S0(i10, i11, 4);
    }

    public final int d1(int i10, RecyclerView.t tVar, RecyclerView.y yVar) {
        if (y() == 0 || i10 == 0) {
            return 0;
        }
        Y0(i10, yVar);
        int J0 = J0(tVar, this.f3035v, yVar);
        if (this.f3035v.f3320b >= J0) {
            i10 = i10 < 0 ? -J0 : J0;
        }
        this.f3031r.o(-i10);
        this.D = this.f3037x;
        w wVar = this.f3035v;
        wVar.f3320b = 0;
        Z0(tVar, wVar);
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void e0(RecyclerView.t tVar, RecyclerView.y yVar) {
        W0(tVar, yVar, true);
    }

    public final void e1(int i10) {
        w wVar = this.f3035v;
        wVar.f3323e = i10;
        wVar.f3322d = this.f3037x != (i10 == -1) ? -1 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean f() {
        return this.f3033t == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void f0(RecyclerView.y yVar) {
        this.f3039z = -1;
        this.A = Integer.MIN_VALUE;
        this.F = null;
        this.I.a();
    }

    public final void f1(int i10, int i11) {
        for (int i12 = 0; i12 < this.f3029p; i12++) {
            if (!this.f3030q[i12].f3066a.isEmpty()) {
                h1(this.f3030q[i12], i10, i11);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean g() {
        return this.f3033t == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void g0(Parcelable parcelable) {
        if (parcelable instanceof e) {
            e eVar = (e) parcelable;
            this.F = eVar;
            if (this.f3039z != -1) {
                eVar.f3059d = null;
                eVar.f3058c = 0;
                eVar.f3056a = -1;
                eVar.f3057b = -1;
                eVar.f3059d = null;
                eVar.f3058c = 0;
                eVar.f3060e = 0;
                eVar.f3061f = null;
                eVar.f3062g = null;
            }
            p0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g1(int r5, androidx.recyclerview.widget.RecyclerView.y r6) {
        /*
            r4 = this;
            androidx.recyclerview.widget.w r0 = r4.f3035v
            r1 = 0
            r0.f3320b = r1
            r0.f3321c = r5
            androidx.recyclerview.widget.RecyclerView$x r0 = r4.f2963e
            r2 = 1
            if (r0 == 0) goto L12
            boolean r0 = r0.f3004e
            if (r0 == 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            if (r0 == 0) goto L33
            int r6 = r6.f3015a
            r0 = -1
            if (r6 == r0) goto L33
            boolean r0 = r4.f3037x
            if (r6 >= r5) goto L20
            r5 = 1
            goto L21
        L20:
            r5 = 0
        L21:
            if (r0 != r5) goto L2a
            androidx.recyclerview.widget.d0 r5 = r4.f3031r
            int r5 = r5.l()
            goto L34
        L2a:
            androidx.recyclerview.widget.d0 r5 = r4.f3031r
            int r5 = r5.l()
            r6 = r5
            r5 = 0
            goto L35
        L33:
            r5 = 0
        L34:
            r6 = 0
        L35:
            androidx.recyclerview.widget.RecyclerView r0 = r4.f2960b
            if (r0 == 0) goto L3f
            boolean r0 = r0.f2877g
            if (r0 == 0) goto L3f
            r0 = 1
            goto L40
        L3f:
            r0 = 0
        L40:
            if (r0 == 0) goto L59
            androidx.recyclerview.widget.w r0 = r4.f3035v
            androidx.recyclerview.widget.d0 r3 = r4.f3031r
            int r3 = r3.k()
            int r3 = r3 - r6
            r0.f3324f = r3
            androidx.recyclerview.widget.w r6 = r4.f3035v
            androidx.recyclerview.widget.d0 r0 = r4.f3031r
            int r0 = r0.g()
            int r0 = r0 + r5
            r6.f3325g = r0
            goto L69
        L59:
            androidx.recyclerview.widget.w r0 = r4.f3035v
            androidx.recyclerview.widget.d0 r3 = r4.f3031r
            int r3 = r3.f()
            int r3 = r3 + r5
            r0.f3325g = r3
            androidx.recyclerview.widget.w r5 = r4.f3035v
            int r6 = -r6
            r5.f3324f = r6
        L69:
            androidx.recyclerview.widget.w r5 = r4.f3035v
            r5.f3326h = r1
            r5.f3319a = r2
            androidx.recyclerview.widget.d0 r6 = r4.f3031r
            int r6 = r6.i()
            if (r6 != 0) goto L80
            androidx.recyclerview.widget.d0 r6 = r4.f3031r
            int r6 = r6.f()
            if (r6 != 0) goto L80
            r1 = 1
        L80:
            r5.f3327i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.g1(int, androidx.recyclerview.widget.RecyclerView$y):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean h(RecyclerView.n nVar) {
        return nVar instanceof c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final Parcelable h0() {
        int O0;
        View L0;
        int k10;
        int k11;
        int[] iArr;
        e eVar = this.F;
        if (eVar != null) {
            return new e(eVar);
        }
        e eVar2 = new e();
        eVar2.f3063h = this.f3036w;
        eVar2.f3064i = this.D;
        eVar2.f3065j = this.E;
        d dVar = this.B;
        if (dVar != null && (iArr = dVar.f3050a) != null) {
            eVar2.f3061f = iArr;
            eVar2.f3060e = iArr.length;
            eVar2.f3062g = dVar.f3051b;
        } else {
            eVar2.f3060e = 0;
        }
        int i10 = -1;
        if (y() > 0) {
            if (this.D) {
                O0 = P0();
            } else {
                O0 = O0();
            }
            eVar2.f3056a = O0;
            if (this.f3037x) {
                L0 = K0(true);
            } else {
                L0 = L0(true);
            }
            if (L0 != null) {
                i10 = RecyclerView.m.H(L0);
            }
            eVar2.f3057b = i10;
            int i11 = this.f3029p;
            eVar2.f3058c = i11;
            eVar2.f3059d = new int[i11];
            for (int i12 = 0; i12 < this.f3029p; i12++) {
                if (this.D) {
                    k10 = this.f3030q[i12].h(Integer.MIN_VALUE);
                    if (k10 != Integer.MIN_VALUE) {
                        k11 = this.f3031r.g();
                        k10 -= k11;
                        eVar2.f3059d[i12] = k10;
                    } else {
                        eVar2.f3059d[i12] = k10;
                    }
                } else {
                    k10 = this.f3030q[i12].k(Integer.MIN_VALUE);
                    if (k10 != Integer.MIN_VALUE) {
                        k11 = this.f3031r.k();
                        k10 -= k11;
                        eVar2.f3059d[i12] = k10;
                    } else {
                        eVar2.f3059d[i12] = k10;
                    }
                }
            }
        } else {
            eVar2.f3056a = -1;
            eVar2.f3057b = -1;
            eVar2.f3058c = 0;
        }
        return eVar2;
    }

    public final void h1(f fVar, int i10, int i11) {
        int i12 = fVar.f3069d;
        if (i10 == -1) {
            int i13 = fVar.f3067b;
            if (i13 == Integer.MIN_VALUE) {
                fVar.c();
                i13 = fVar.f3067b;
            }
            if (i13 + i12 > i11) {
                return;
            }
        } else {
            int i14 = fVar.f3068c;
            if (i14 == Integer.MIN_VALUE) {
                fVar.b();
                i14 = fVar.f3068c;
            }
            if (i14 - i12 < i11) {
                return;
            }
        }
        this.f3038y.set(fVar.f3070e, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void i0(int i10) {
        if (i10 == 0) {
            F0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void j(int i10, int i11, RecyclerView.y yVar, RecyclerView.m.c cVar) {
        boolean z10;
        int h10;
        int i12;
        if (this.f3033t != 0) {
            i10 = i11;
        }
        if (y() != 0 && i10 != 0) {
            Y0(i10, yVar);
            int[] iArr = this.L;
            if (iArr == null || iArr.length < this.f3029p) {
                this.L = new int[this.f3029p];
            }
            int i13 = 0;
            for (int i14 = 0; i14 < this.f3029p; i14++) {
                w wVar = this.f3035v;
                if (wVar.f3322d == -1) {
                    h10 = wVar.f3324f;
                    i12 = this.f3030q[i14].k(h10);
                } else {
                    h10 = this.f3030q[i14].h(wVar.f3325g);
                    i12 = this.f3035v.f3325g;
                }
                int i15 = h10 - i12;
                if (i15 >= 0) {
                    this.L[i13] = i15;
                    i13++;
                }
            }
            Arrays.sort(this.L, 0, i13);
            for (int i16 = 0; i16 < i13; i16++) {
                int i17 = this.f3035v.f3321c;
                if (i17 >= 0 && i17 < yVar.b()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    ((s.b) cVar).a(this.f3035v.f3321c, this.L[i16]);
                    w wVar2 = this.f3035v;
                    wVar2.f3321c += wVar2.f3322d;
                } else {
                    return;
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int l(RecyclerView.y yVar) {
        return G0(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int m(RecyclerView.y yVar) {
        return H0(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int n(RecyclerView.y yVar) {
        return I0(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int o(RecyclerView.y yVar) {
        return G0(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int p(RecyclerView.y yVar) {
        return H0(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int q(RecyclerView.y yVar) {
        return I0(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int q0(int i10, RecyclerView.t tVar, RecyclerView.y yVar) {
        return d1(i10, tVar, yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void r0(int i10) {
        e eVar = this.F;
        if (eVar != null && eVar.f3056a != i10) {
            eVar.f3059d = null;
            eVar.f3058c = 0;
            eVar.f3056a = -1;
            eVar.f3057b = -1;
        }
        this.f3039z = i10;
        this.A = Integer.MIN_VALUE;
        p0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int s0(int i10, RecyclerView.t tVar, RecyclerView.y yVar) {
        return d1(i10, tVar, yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final RecyclerView.n t() {
        return this.f3033t == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final RecyclerView.n u(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final RecyclerView.n v(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void v0(Rect rect, int i10, int i11) {
        int i12;
        int i13;
        int F = F() + E();
        int D = D() + G();
        if (this.f3033t == 1) {
            int height = rect.height() + D;
            RecyclerView recyclerView = this.f2960b;
            WeakHashMap<View, i2> weakHashMap = k1.o0.f18161a;
            i13 = RecyclerView.m.i(i11, height, o0.d.d(recyclerView));
            i12 = RecyclerView.m.i(i10, (this.f3034u * this.f3029p) + F, o0.d.e(this.f2960b));
        } else {
            int width = rect.width() + F;
            RecyclerView recyclerView2 = this.f2960b;
            WeakHashMap<View, i2> weakHashMap2 = k1.o0.f18161a;
            i12 = RecyclerView.m.i(i10, width, o0.d.e(recyclerView2));
            i13 = RecyclerView.m.i(i11, (this.f3034u * this.f3029p) + D, o0.d.d(this.f2960b));
        }
        this.f2960b.setMeasuredDimension(i12, i13);
    }
}
