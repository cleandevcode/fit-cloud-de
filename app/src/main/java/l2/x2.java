package l2;

import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class x2 {

    @zl.e(c = "androidx.paging.SeparatorsKt", f = "Separators.kt", l = {81}, m = "insertInternalSeparators")
    /* loaded from: classes.dex */
    public static final class a<R, T extends R> extends zl.c {

        /* renamed from: d */
        public g3 f19349d;

        /* renamed from: e */
        public fm.q f19350e;

        /* renamed from: f */
        public ArrayList f19351f;

        /* renamed from: g */
        public ArrayList f19352g;

        /* renamed from: h */
        public Object f19353h;

        /* renamed from: i */
        public int f19354i;

        /* renamed from: j */
        public int f19355j;

        /* renamed from: k */
        public int f19356k;

        /* renamed from: l */
        public /* synthetic */ Object f19357l;

        /* renamed from: m */
        public int f19358m;

        public a(xl.d<? super a> dVar) {
            super(dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f19357l = obj;
            this.f19358m |= Integer.MIN_VALUE;
            return x2.b(null, null, this);
        }
    }

    public static final <R, T extends R> void a(List<g3<R>> list, R r10, g3<T> g3Var, g3<T> g3Var2, int i10, int i11) {
        int[] iArr;
        gm.l.f(list, "<this>");
        int[] iArr2 = null;
        if (g3Var == null) {
            iArr = null;
        } else {
            iArr = g3Var.f18900a;
        }
        if (g3Var2 != null) {
            iArr2 = g3Var2.f18900a;
        }
        if (iArr != null && iArr2 != null) {
            int length = iArr.length;
            int length2 = iArr2.length;
            int[] copyOf = Arrays.copyOf(iArr, length + length2);
            System.arraycopy(iArr2, 0, copyOf, length, length2);
            gm.l.e(copyOf, WiseOpenHianalyticsData.UNION_RESULT);
            LinkedHashSet linkedHashSet = new LinkedHashSet(ih.v.j(copyOf.length));
            for (int i12 : copyOf) {
                linkedHashSet.add(Integer.valueOf(i12));
            }
            iArr = ul.q.X(ul.q.T(ul.q.Y(linkedHashSet)));
        } else if (iArr == null && iArr2 != null) {
            iArr = iArr2;
        } else if (iArr == null || iArr2 != null) {
            throw new IllegalArgumentException("Separator page expected adjacentPageBefore or adjacentPageAfter, but both were null.");
        }
        if (r10 != null) {
            list.add(new g3<>(iArr, h7.a.p(r10), i10, h7.a.p(Integer.valueOf(i11))));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x00c3 -> B:74:0x00cc). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <R, T extends R> java.lang.Object b(l2.g3<T> r12, fm.q<? super T, ? super T, ? super xl.d<? super R>, ? extends java.lang.Object> r13, xl.d<? super l2.g3<R>> r14) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l2.x2.b(l2.g3, fm.q, xl.d):java.lang.Object");
    }
}
