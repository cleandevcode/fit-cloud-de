package androidx.recyclerview.widget;

import androidx.appcompat.widget.e2;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import l2.z0;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a */
    public static final a f3186a = new a();

    /* loaded from: classes.dex */
    public class a implements Comparator<c> {
        @Override // java.util.Comparator
        public final int compare(c cVar, c cVar2) {
            return cVar.f3187a - cVar2.f3187a;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {
        public abstract boolean a(int i10, int i11);

        public abstract boolean b(int i10, int i11);

        public abstract Object c(int i10, int i11);
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        public final int f3187a;

        /* renamed from: b */
        public final int f3188b;

        /* renamed from: c */
        public final int f3189c;

        public c(int i10, int i11, int i12) {
            this.f3187a = i10;
            this.f3188b = i11;
            this.f3189c = i12;
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        public final List<c> f3190a;

        /* renamed from: b */
        public final int[] f3191b;

        /* renamed from: c */
        public final int[] f3192c;

        /* renamed from: d */
        public final b f3193d;

        /* renamed from: e */
        public final int f3194e;

        /* renamed from: f */
        public final int f3195f;

        /* renamed from: g */
        public final boolean f3196g;

        public d(z0 z0Var, ArrayList arrayList, int[] iArr, int[] iArr2) {
            c cVar;
            int i10;
            c cVar2;
            int i11;
            int i12;
            int i13;
            this.f3190a = arrayList;
            this.f3191b = iArr;
            this.f3192c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.f3193d = z0Var;
            int i14 = z0Var.f19382d;
            this.f3194e = i14;
            int i15 = z0Var.f19383e;
            this.f3195f = i15;
            this.f3196g = true;
            if (arrayList.isEmpty()) {
                cVar = null;
            } else {
                cVar = (c) arrayList.get(0);
            }
            if (cVar == null || cVar.f3187a != 0 || cVar.f3188b != 0) {
                arrayList.add(0, new c(0, 0, 0));
            }
            arrayList.add(new c(i14, i15, 0));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                c cVar3 = (c) it.next();
                for (int i16 = 0; i16 < cVar3.f3189c; i16++) {
                    int i17 = cVar3.f3187a + i16;
                    int i18 = cVar3.f3188b + i16;
                    if (this.f3193d.a(i17, i18)) {
                        i13 = 1;
                    } else {
                        i13 = 2;
                    }
                    this.f3191b[i17] = (i18 << 4) | i13;
                    this.f3192c[i18] = (i17 << 4) | i13;
                }
            }
            if (this.f3196g) {
                int i19 = 0;
                for (c cVar4 : this.f3190a) {
                    while (true) {
                        i10 = cVar4.f3187a;
                        if (i19 < i10) {
                            if (this.f3191b[i19] == 0) {
                                int size = this.f3190a.size();
                                int i20 = 0;
                                int i21 = 0;
                                while (true) {
                                    if (i20 < size) {
                                        cVar2 = this.f3190a.get(i20);
                                        while (true) {
                                            i11 = cVar2.f3188b;
                                            if (i21 < i11) {
                                                if (this.f3192c[i21] == 0 && this.f3193d.b(i19, i21)) {
                                                    if (this.f3193d.a(i19, i21)) {
                                                        i12 = 8;
                                                    } else {
                                                        i12 = 4;
                                                    }
                                                    this.f3191b[i19] = (i21 << 4) | i12;
                                                    this.f3192c[i21] = i12 | (i19 << 4);
                                                } else {
                                                    i21++;
                                                }
                                            }
                                        }
                                    }
                                    i21 = cVar2.f3189c + i11;
                                    i20++;
                                }
                            }
                            i19++;
                        }
                    }
                    i19 = cVar4.f3189c + i10;
                }
            }
        }

        public static f b(ArrayDeque arrayDeque, int i10, boolean z10) {
            f fVar;
            Iterator it = arrayDeque.iterator();
            while (true) {
                if (!it.hasNext()) {
                    fVar = null;
                    break;
                }
                fVar = (f) it.next();
                if (fVar.f3197a == i10 && fVar.f3199c == z10) {
                    it.remove();
                    break;
                }
            }
            while (it.hasNext()) {
                f fVar2 = (f) it.next();
                int i11 = fVar2.f3198b;
                fVar2.f3198b = z10 ? i11 - 1 : i11 + 1;
            }
            return fVar;
        }

        public final int a(int i10) {
            if (i10 >= 0 && i10 < this.f3194e) {
                int i11 = this.f3191b[i10];
                if ((i11 & 15) == 0) {
                    return -1;
                }
                return i11 >> 4;
            }
            StringBuilder a10 = e2.a("Index out of bounds - passed position = ", i10, ", old list size = ");
            a10.append(this.f3194e);
            throw new IndexOutOfBoundsException(a10.toString());
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e<T> {
        public abstract boolean a(T t10, T t11);

        public abstract boolean b(T t10, T t11);
    }

    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a */
        public int f3197a;

        /* renamed from: b */
        public int f3198b;

        /* renamed from: c */
        public boolean f3199c;

        public f(int i10, int i11, boolean z10) {
            this.f3197a = i10;
            this.f3198b = i11;
            this.f3199c = z10;
        }
    }

    /* loaded from: classes.dex */
    public static class g {

        /* renamed from: a */
        public int f3200a;

        /* renamed from: b */
        public int f3201b;

        /* renamed from: c */
        public int f3202c;

        /* renamed from: d */
        public int f3203d;

        public g() {
        }

        public g(int i10, int i11) {
            this.f3200a = 0;
            this.f3201b = i10;
            this.f3202c = 0;
            this.f3203d = i11;
        }
    }

    /* loaded from: classes.dex */
    public static class h {

        /* renamed from: a */
        public int f3204a;

        /* renamed from: b */
        public int f3205b;

        /* renamed from: c */
        public int f3206c;

        /* renamed from: d */
        public int f3207d;

        /* renamed from: e */
        public boolean f3208e;
    }
}
