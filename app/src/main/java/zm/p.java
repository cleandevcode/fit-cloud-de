package zm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class p implements Iterable<tl.f<? extends String, ? extends String>>, hm.a {

    /* renamed from: b */
    public static final b f32652b = new b();

    /* renamed from: a */
    public final String[] f32653a;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        public final ArrayList f32654a = new ArrayList(20);

        public final void a(String str, String str2) {
            gm.l.f(str, "name");
            gm.l.f(str2, "value");
            p.f32652b.getClass();
            b.a(str);
            b.b(str2, str);
            b(str, str2);
        }

        public final void b(String str, String str2) {
            gm.l.f(str, "name");
            gm.l.f(str2, "value");
            this.f32654a.add(str);
            this.f32654a.add(om.l.x0(str2).toString());
        }

        public final p c() {
            Object[] array = this.f32654a.toArray(new String[0]);
            if (array != null) {
                return new p((String[]) array);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }

        public final void d(String str) {
            int i10 = 0;
            while (i10 < this.f32654a.size()) {
                if (om.h.V(str, (String) this.f32654a.get(i10))) {
                    this.f32654a.remove(i10);
                    this.f32654a.remove(i10);
                    i10 -= 2;
                }
                i10 += 2;
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {
        public static void a(String str) {
            if (!(str.length() > 0)) {
                throw new IllegalArgumentException("name is empty".toString());
            }
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char charAt = str.charAt(i10);
                if (!('!' <= charAt && '~' >= charAt)) {
                    throw new IllegalArgumentException(an.c.g("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i10), str).toString());
                }
            }
        }

        public static void b(String str, String str2) {
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char charAt = str.charAt(i10);
                if (!(charAt == '\t' || (' ' <= charAt && '~' >= charAt))) {
                    throw new IllegalArgumentException(an.c.g("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt), Integer.valueOf(i10), str2, str).toString());
                }
            }
        }

        public static p c(String... strArr) {
            boolean z10;
            boolean z11;
            if (strArr.length % 2 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                Object clone = strArr.clone();
                if (clone != null) {
                    String[] strArr2 = (String[]) clone;
                    int length = strArr2.length;
                    for (int i10 = 0; i10 < length; i10++) {
                        String str = strArr2[i10];
                        if (str != null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            if (str != null) {
                                strArr2[i10] = om.l.x0(str).toString();
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                            }
                        } else {
                            throw new IllegalArgumentException("Headers cannot be null".toString());
                        }
                    }
                    lm.h x10 = h7.a.x(h7.a.A(0, strArr2.length), 2);
                    int i11 = x10.f20071a;
                    int i12 = x10.f20072b;
                    int i13 = x10.f20073c;
                    if (i13 < 0 ? i11 >= i12 : i11 <= i12) {
                        while (true) {
                            String str2 = strArr2[i11];
                            String str3 = strArr2[i11 + 1];
                            a(str2);
                            b(str3, str2);
                            if (i11 == i12) {
                                break;
                            }
                            i11 += i13;
                        }
                    }
                    return new p(strArr2);
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            }
            throw new IllegalArgumentException("Expected alternating header names and values".toString());
        }
    }

    public p(String[] strArr) {
        this.f32653a = strArr;
    }

    public final String e(String str) {
        gm.l.f(str, "name");
        b bVar = f32652b;
        String[] strArr = this.f32653a;
        bVar.getClass();
        lm.h x10 = h7.a.x(new lm.h(strArr.length - 2, 0, -1), 2);
        int i10 = x10.f20071a;
        int i11 = x10.f20072b;
        int i12 = x10.f20073c;
        if (i12 < 0 ? i10 >= i11 : i10 <= i11) {
            while (!om.h.V(str, strArr[i10])) {
                if (i10 != i11) {
                    i10 += i12;
                }
            }
            return strArr[i10 + 1];
        }
        return null;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof p) && Arrays.equals(this.f32653a, ((p) obj).f32653a);
    }

    public final String f(int i10) {
        return this.f32653a[i10 * 2];
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f32653a);
    }

    public final a i() {
        a aVar = new a();
        ArrayList arrayList = aVar.f32654a;
        String[] strArr = this.f32653a;
        gm.l.f(arrayList, "<this>");
        gm.l.f(strArr, "elements");
        arrayList.addAll(ul.i.t(strArr));
        return aVar;
    }

    @Override // java.lang.Iterable
    public final Iterator<tl.f<? extends String, ? extends String>> iterator() {
        int length = this.f32653a.length / 2;
        tl.f[] fVarArr = new tl.f[length];
        for (int i10 = 0; i10 < length; i10++) {
            fVarArr[i10] = new tl.f(f(i10), j(i10));
        }
        return ih.v.i(fVarArr);
    }

    public final String j(int i10) {
        return this.f32653a[(i10 * 2) + 1];
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int length = this.f32653a.length / 2;
        for (int i10 = 0; i10 < length; i10++) {
            sb2.append(f(i10));
            sb2.append(": ");
            sb2.append(j(i10));
            sb2.append("\n");
        }
        String sb3 = sb2.toString();
        gm.l.e(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
