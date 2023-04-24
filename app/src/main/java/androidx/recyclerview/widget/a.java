package androidx.recyclerview.widget;

import androidx.recyclerview.widget.a0;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a implements a0.a {

    /* renamed from: d */
    public final InterfaceC0031a f3075d;

    /* renamed from: a */
    public j1.e f3072a = new j1.e(30, 0);

    /* renamed from: b */
    public final ArrayList<b> f3073b = new ArrayList<>();

    /* renamed from: c */
    public final ArrayList<b> f3074c = new ArrayList<>();

    /* renamed from: f */
    public int f3077f = 0;

    /* renamed from: e */
    public final a0 f3076e = new a0(this);

    /* renamed from: androidx.recyclerview.widget.a$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0031a {
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public int f3078a;

        /* renamed from: b */
        public int f3079b;

        /* renamed from: c */
        public Object f3080c;

        /* renamed from: d */
        public int f3081d;

        public b(Object obj, int i10, int i11, int i12) {
            this.f3078a = i10;
            this.f3079b = i11;
            this.f3081d = i12;
            this.f3080c = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                int i10 = this.f3078a;
                if (i10 != bVar.f3078a) {
                    return false;
                }
                if (i10 == 8 && Math.abs(this.f3081d - this.f3079b) == 1 && this.f3081d == bVar.f3079b && this.f3079b == bVar.f3081d) {
                    return true;
                }
                if (this.f3081d == bVar.f3081d && this.f3079b == bVar.f3079b) {
                    Object obj2 = this.f3080c;
                    Object obj3 = bVar.f3080c;
                    if (obj2 != null) {
                        if (!obj2.equals(obj3)) {
                            return false;
                        }
                    } else if (obj3 != null) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }

        public final int hashCode() {
            return (((this.f3078a * 31) + this.f3079b) * 31) + this.f3081d;
        }

        public final String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append("[");
            int i10 = this.f3078a;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 != 8) {
                            str = "??";
                        } else {
                            str = "mv";
                        }
                    } else {
                        str = "up";
                    }
                } else {
                    str = "rm";
                }
            } else {
                str = "add";
            }
            sb2.append(str);
            sb2.append(",s:");
            sb2.append(this.f3079b);
            sb2.append("c:");
            sb2.append(this.f3081d);
            sb2.append(",p:");
            sb2.append(this.f3080c);
            sb2.append("]");
            return sb2.toString();
        }
    }

    public a(h0 h0Var) {
        this.f3075d = h0Var;
    }

    public final boolean a(int i10) {
        int size = this.f3074c.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = this.f3074c.get(i11);
            int i12 = bVar.f3078a;
            if (i12 == 8) {
                if (f(bVar.f3081d, i11 + 1) == i10) {
                    return true;
                }
            } else if (i12 == 1) {
                int i13 = bVar.f3079b;
                int i14 = bVar.f3081d + i13;
                while (i13 < i14) {
                    if (f(i13, i11 + 1) == i10) {
                        return true;
                    }
                    i13++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    public final void b() {
        int size = this.f3074c.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((h0) this.f3075d).a(this.f3074c.get(i10));
        }
        l(this.f3074c);
        this.f3077f = 0;
    }

    public final void c() {
        b();
        int size = this.f3073b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = this.f3073b.get(i10);
            int i11 = bVar.f3078a;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 4) {
                        if (i11 == 8) {
                            ((h0) this.f3075d).a(bVar);
                            ((h0) this.f3075d).e(bVar.f3079b, bVar.f3081d);
                        }
                    } else {
                        ((h0) this.f3075d).a(bVar);
                        ((h0) this.f3075d).c(bVar.f3079b, bVar.f3081d, bVar.f3080c);
                    }
                } else {
                    ((h0) this.f3075d).a(bVar);
                    InterfaceC0031a interfaceC0031a = this.f3075d;
                    int i12 = bVar.f3079b;
                    int i13 = bVar.f3081d;
                    h0 h0Var = (h0) interfaceC0031a;
                    h0Var.f3115a.P(i12, i13, true);
                    RecyclerView recyclerView = h0Var.f3115a;
                    recyclerView.f2910w0 = true;
                    recyclerView.f2904t0.f3017c += i13;
                }
            } else {
                ((h0) this.f3075d).a(bVar);
                ((h0) this.f3075d).d(bVar.f3079b, bVar.f3081d);
            }
        }
        l(this.f3073b);
        this.f3077f = 0;
    }

    public final void d(b bVar) {
        int i10;
        boolean z10;
        int i11 = bVar.f3078a;
        if (i11 != 1 && i11 != 8) {
            int m10 = m(bVar.f3079b, i11);
            int i12 = bVar.f3079b;
            int i13 = bVar.f3078a;
            if (i13 != 2) {
                if (i13 == 4) {
                    i10 = 1;
                } else {
                    throw new IllegalArgumentException("op should be remove or update." + bVar);
                }
            } else {
                i10 = 0;
            }
            int i14 = 1;
            for (int i15 = 1; i15 < bVar.f3081d; i15++) {
                int m11 = m((i10 * i15) + bVar.f3079b, bVar.f3078a);
                int i16 = bVar.f3078a;
                if (i16 == 2 ? m11 == m10 : !(i16 != 4 || m11 != m10 + 1)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    i14++;
                } else {
                    b h10 = h(bVar.f3080c, i16, m10, i14);
                    e(h10, i12);
                    h10.f3080c = null;
                    this.f3072a.release(h10);
                    if (bVar.f3078a == 4) {
                        i12 += i14;
                    }
                    m10 = m11;
                    i14 = 1;
                }
            }
            Object obj = bVar.f3080c;
            bVar.f3080c = null;
            this.f3072a.release(bVar);
            if (i14 > 0) {
                b h11 = h(obj, bVar.f3078a, m10, i14);
                e(h11, i12);
                h11.f3080c = null;
                this.f3072a.release(h11);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("should not dispatch add or move for pre layout");
    }

    public final void e(b bVar, int i10) {
        ((h0) this.f3075d).a(bVar);
        int i11 = bVar.f3078a;
        if (i11 != 2) {
            if (i11 == 4) {
                ((h0) this.f3075d).c(i10, bVar.f3081d, bVar.f3080c);
                return;
            }
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
        InterfaceC0031a interfaceC0031a = this.f3075d;
        int i12 = bVar.f3081d;
        h0 h0Var = (h0) interfaceC0031a;
        h0Var.f3115a.P(i10, i12, true);
        RecyclerView recyclerView = h0Var.f3115a;
        recyclerView.f2910w0 = true;
        recyclerView.f2904t0.f3017c += i12;
    }

    public final int f(int i10, int i11) {
        int size = this.f3074c.size();
        while (i11 < size) {
            b bVar = this.f3074c.get(i11);
            int i12 = bVar.f3078a;
            if (i12 == 8) {
                int i13 = bVar.f3079b;
                if (i13 == i10) {
                    i10 = bVar.f3081d;
                } else {
                    if (i13 < i10) {
                        i10--;
                    }
                    if (bVar.f3081d <= i10) {
                        i10++;
                    }
                }
            } else {
                int i14 = bVar.f3079b;
                if (i14 > i10) {
                    continue;
                } else if (i12 == 2) {
                    int i15 = bVar.f3081d;
                    if (i10 < i14 + i15) {
                        return -1;
                    }
                    i10 -= i15;
                } else if (i12 == 1) {
                    i10 += bVar.f3081d;
                }
            }
            i11++;
        }
        return i10;
    }

    public final boolean g() {
        return this.f3073b.size() > 0;
    }

    public final b h(Object obj, int i10, int i11, int i12) {
        b bVar = (b) this.f3072a.acquire();
        if (bVar == null) {
            return new b(obj, i10, i11, i12);
        }
        bVar.f3078a = i10;
        bVar.f3079b = i11;
        bVar.f3081d = i12;
        bVar.f3080c = obj;
        return bVar;
    }

    public final void i(b bVar) {
        this.f3074c.add(bVar);
        int i10 = bVar.f3078a;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 4) {
                    if (i10 == 8) {
                        ((h0) this.f3075d).e(bVar.f3079b, bVar.f3081d);
                        return;
                    }
                    throw new IllegalArgumentException("Unknown update op type for " + bVar);
                }
                ((h0) this.f3075d).c(bVar.f3079b, bVar.f3081d, bVar.f3080c);
                return;
            }
            InterfaceC0031a interfaceC0031a = this.f3075d;
            h0 h0Var = (h0) interfaceC0031a;
            h0Var.f3115a.P(bVar.f3079b, bVar.f3081d, false);
            h0Var.f3115a.f2910w0 = true;
            return;
        }
        ((h0) this.f3075d).d(bVar.f3079b, bVar.f3081d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:302:0x0165, code lost:
        if (r5 > r12.f3079b) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x018f, code lost:
        if (r5 >= r12.f3079b) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x0191, code lost:
        r11.f3081d = r5 - r12.f3081d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x0196, code lost:
        r2.set(r3, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x019d, code lost:
        if (r11.f3079b == r11.f3081d) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x019f, code lost:
        r2.set(r7, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x01a3, code lost:
        r2.remove(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x01a6, code lost:
        if (r4 == null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x01a8, code lost:
        r2.add(r3, r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:247:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:400:0x013c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0126 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:404:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0009 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 696
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.a.j():void");
    }

    public final void k(b bVar) {
        bVar.f3080c = null;
        this.f3072a.release(bVar);
    }

    public final void l(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            k((b) arrayList.get(i10));
        }
        arrayList.clear();
    }

    public final int m(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        for (int size = this.f3074c.size() - 1; size >= 0; size--) {
            b bVar = this.f3074c.get(size);
            int i18 = bVar.f3078a;
            if (i18 == 8) {
                int i19 = bVar.f3079b;
                int i20 = bVar.f3081d;
                if (i19 < i20) {
                    i14 = i19;
                    i13 = i20;
                } else {
                    i13 = i19;
                    i14 = i20;
                }
                if (i10 < i14 || i10 > i13) {
                    if (i10 < i19) {
                        if (i11 == 1) {
                            bVar.f3079b = i19 + 1;
                            i15 = i20 + 1;
                        } else if (i11 == 2) {
                            bVar.f3079b = i19 - 1;
                            i15 = i20 - 1;
                        }
                        bVar.f3081d = i15;
                    }
                } else if (i14 == i19) {
                    if (i11 == 1) {
                        i17 = i20 + 1;
                    } else {
                        if (i11 == 2) {
                            i17 = i20 - 1;
                        }
                        i10++;
                    }
                    bVar.f3081d = i17;
                    i10++;
                } else {
                    if (i11 == 1) {
                        i16 = i19 + 1;
                    } else {
                        if (i11 == 2) {
                            i16 = i19 - 1;
                        }
                        i10--;
                    }
                    bVar.f3079b = i16;
                    i10--;
                }
            } else {
                int i21 = bVar.f3079b;
                if (i21 > i10) {
                    if (i11 == 1) {
                        i12 = i21 + 1;
                    } else if (i11 == 2) {
                        i12 = i21 - 1;
                    }
                    bVar.f3079b = i12;
                } else if (i18 == 1) {
                    i10 -= bVar.f3081d;
                } else if (i18 == 2) {
                    i10 += bVar.f3081d;
                }
            }
        }
        for (int size2 = this.f3074c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.f3074c.get(size2);
            if (bVar2.f3078a == 8) {
                int i22 = bVar2.f3081d;
                if (i22 != bVar2.f3079b && i22 >= 0) {
                }
                this.f3074c.remove(size2);
                k(bVar2);
            } else {
                if (bVar2.f3081d > 0) {
                }
                this.f3074c.remove(size2);
                k(bVar2);
            }
        }
        return i10;
    }
}
