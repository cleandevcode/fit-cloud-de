package an;

import a0.a2;
import gm.l;
import ih.v;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import ln.e;
import ln.g;
import ln.h;
import ln.p;
import o5.a0;
import zm.b0;
import zm.c0;
import zm.p;
import zm.q;
import zm.u;
import zm.y;
import zm.z;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a */
    public static final byte[] f635a;

    /* renamed from: b */
    public static final p f636b;

    /* renamed from: c */
    public static final b0 f637c;

    /* renamed from: d */
    public static final TimeZone f638d;

    /* renamed from: e */
    public static final om.c f639e;

    /* renamed from: f */
    public static final String f640f;

    static {
        byte[] bArr = new byte[0];
        f635a = bArr;
        p.f32652b.getClass();
        f636b = p.b.c(new String[0]);
        c0.f32573a.getClass();
        e eVar = new e();
        eVar.m14write(bArr, 0, 0);
        long j10 = 0;
        f637c = new b0(null, j10, eVar);
        z.f32767a.getClass();
        if ((j10 | j10) >= 0 && j10 <= j10 && j10 - j10 >= j10) {
            new y(null, bArr, 0, 0);
            p.a aVar = ln.p.f20119c;
            h hVar = h.f20100d;
            h[] hVarArr = {h.a.a("efbbbf"), h.a.a("feff"), h.a.a("fffe"), h.a.a("0000ffff"), h.a.a("ffff0000")};
            aVar.getClass();
            p.a.b(hVarArr);
            TimeZone timeZone = TimeZone.getTimeZone("GMT");
            l.c(timeZone);
            f638d = timeZone;
            f639e = new om.c("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
            String o02 = om.l.o0("okhttp3.", u.class.getName());
            if (om.h.U(o02, "Client", false)) {
                o02 = o02.substring(0, o02.length() - "Client".length());
                l.e(o02, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            f640f = o02;
            return;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public static final boolean a(q qVar, q qVar2) {
        l.f(qVar, "$this$canReuseConnectionFor");
        l.f(qVar2, "other");
        if (l.a(qVar.f32661e, qVar2.f32661e) && qVar.f32662f == qVar2.f32662f && l.a(qVar.f32658b, qVar2.f32658b)) {
            return true;
        }
        return false;
    }

    public static final void b(Closeable closeable) {
        l.f(closeable, "$this$closeQuietly");
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final void c(Socket socket) {
        try {
            socket.close();
        } catch (AssertionError e10) {
            throw e10;
        } catch (RuntimeException e11) {
            if (!l.a(e11.getMessage(), "bio == null")) {
                throw e11;
            }
        } catch (Exception unused) {
        }
    }

    public static final int d(int i10, int i11, String str, String str2) {
        l.f(str, "$this$delimiterOffset");
        while (i10 < i11) {
            if (om.l.g0(str2, str.charAt(i10), 0, false, 2) >= 0) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static final int e(String str, char c10, int i10, int i11) {
        l.f(str, "$this$delimiterOffset");
        while (i10 < i11) {
            if (str.charAt(i10) == c10) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static final boolean f(ln.y yVar, TimeUnit timeUnit) {
        l.f(yVar, "$this$discard");
        l.f(timeUnit, "timeUnit");
        try {
            return q(yVar, 100, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String g(String str, Object... objArr) {
        l.f(str, "format");
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        return a0.a(copyOf, copyOf.length, locale, str, "java.lang.String.format(locale, format, *args)");
    }

    public static final boolean h(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        l.f(strArr, "$this$hasIntersection");
        l.f(comparator, "comparator");
        if (!(strArr.length == 0) && strArr2 != null) {
            if (!(strArr2.length == 0)) {
                for (String str : strArr) {
                    for (String str2 : strArr2) {
                        if (comparator.compare(str, str2) == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final long i(zm.a0 a0Var) {
        String e10 = a0Var.f32534f.e("Content-Length");
        if (e10 != null) {
            try {
                return Long.parseLong(e10);
            } catch (NumberFormatException unused) {
            }
        }
        return -1L;
    }

    @SafeVarargs
    public static final <T> List<T> j(T... tArr) {
        l.f(tArr, "elements");
        Object[] objArr = (Object[]) tArr.clone();
        List<T> unmodifiableList = Collections.unmodifiableList(h7.a.q(Arrays.copyOf(objArr, objArr.length)));
        l.e(unmodifiableList, "Collections.unmodifiable…istOf(*elements.clone()))");
        return unmodifiableList;
    }

    public static final int k(String str) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (l.h(charAt, 31) <= 0 || l.h(charAt, 127) >= 0) {
                return i10;
            }
        }
        return -1;
    }

    public static final int l(int i10, int i11, String str) {
        l.f(str, "$this$indexOfFirstNonAsciiWhitespace");
        while (i10 < i11) {
            char charAt = str.charAt(i10);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static final int m(int i10, int i11, String str) {
        l.f(str, "$this$indexOfLastNonAsciiWhitespace");
        int i12 = i11 - 1;
        if (i12 >= i10) {
            while (true) {
                char charAt = str.charAt(i12);
                if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                    return i12 + 1;
                }
                if (i12 == i10) {
                    break;
                }
                i12--;
            }
        }
        return i10;
    }

    public static final String[] n(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        l.f(strArr2, "other");
        l.f(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i10]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i10++;
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public static final int o(char c10) {
        if ('0' <= c10 && '9' >= c10) {
            return c10 - '0';
        }
        char c11 = 'a';
        if ('a' > c10 || 'f' < c10) {
            c11 = 'A';
            if ('A' > c10 || 'F' < c10) {
                return -1;
            }
        }
        return (c10 - c11) + 10;
    }

    public static final int p(g gVar) {
        l.f(gVar, "$this$readMedium");
        return (gVar.readByte() & 255) | ((gVar.readByte() & 255) << 16) | ((gVar.readByte() & 255) << 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0051, code lost:
        if (r5 == Long.MAX_VALUE) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0053, code lost:
        r11.e().a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x005b, code lost:
        r11.e().d(r0 + r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x007a, code lost:
        if (r5 != Long.MAX_VALUE) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x007d, code lost:
        return r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean q(ln.y r11, int r12, java.util.concurrent.TimeUnit r13) {
        /*
            java.lang.String r0 = "$this$skipAll"
            gm.l.f(r11, r0)
            java.lang.String r0 = "timeUnit"
            gm.l.f(r13, r0)
            long r0 = java.lang.System.nanoTime()
            ln.z r2 = r11.e()
            boolean r2 = r2.e()
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r2 == 0) goto L27
            ln.z r2 = r11.e()
            long r5 = r2.c()
            long r5 = r5 - r0
            goto L28
        L27:
            r5 = r3
        L28:
            ln.z r2 = r11.e()
            long r7 = (long) r12
            long r12 = r13.toNanos(r7)
            long r12 = java.lang.Math.min(r5, r12)
            long r12 = r12 + r0
            r2.d(r12)
            ln.e r12 = new ln.e     // Catch: java.lang.Throwable -> L64 java.io.InterruptedIOException -> L76
            r12.<init>()     // Catch: java.lang.Throwable -> L64 java.io.InterruptedIOException -> L76
        L3e:
            r7 = 8192(0x2000, double:4.0474E-320)
            long r7 = r11.V(r12, r7)     // Catch: java.lang.Throwable -> L64 java.io.InterruptedIOException -> L76
            r9 = -1
            int r13 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r13 == 0) goto L4e
            r12.a()     // Catch: java.lang.Throwable -> L64 java.io.InterruptedIOException -> L76
            goto L3e
        L4e:
            r12 = 1
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L5b
        L53:
            ln.z r11 = r11.e()
            r11.a()
            goto L7d
        L5b:
            ln.z r11 = r11.e()
            long r0 = r0 + r5
            r11.d(r0)
            goto L7d
        L64:
            r12 = move-exception
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            ln.z r11 = r11.e()
            if (r13 != 0) goto L71
            r11.a()
            goto L75
        L71:
            long r0 = r0 + r5
            r11.d(r0)
        L75:
            throw r12
        L76:
            r12 = 0
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L5b
            goto L53
        L7d:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: an.c.q(ln.y, int, java.util.concurrent.TimeUnit):boolean");
    }

    public static final zm.p r(List<gn.c> list) {
        p.a aVar = new p.a();
        for (gn.c cVar : list) {
            aVar.b(cVar.f15524b.k(), cVar.f15525c.k());
        }
        return aVar.c();
    }

    public static final String s(q qVar, boolean z10) {
        String str;
        l.f(qVar, "$this$toHostHeader");
        if (om.l.c0(qVar.f32661e, ":", false)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            str = a2.a(sb2, qVar.f32661e, ']');
        } else {
            str = qVar.f32661e;
        }
        if (!z10) {
            int i10 = qVar.f32662f;
            q.b bVar = q.f32656l;
            String str2 = qVar.f32658b;
            bVar.getClass();
            if (i10 == q.b.b(str2)) {
                return str;
            }
        }
        return str + ':' + qVar.f32662f;
    }

    public static final <T> List<T> t(List<? extends T> list) {
        l.f(list, "$this$toImmutableList");
        List<T> unmodifiableList = Collections.unmodifiableList(ul.q.Z(list));
        l.e(unmodifiableList, "Collections.unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    public static final int u(int i10, String str) {
        if (str != null) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
                if (parseLong < 0) {
                    return 0;
                }
                return (int) parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        return i10;
    }

    public static final String v(int i10, int i11, String str) {
        int l10 = l(i10, i11, str);
        String substring = str.substring(l10, m(l10, i11, str));
        l.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static final void w(IOException iOException, List list) {
        l.f(iOException, "$this$withSuppressed");
        if (list.size() > 1) {
            System.out.println(list);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            v.b(iOException, (Exception) it.next());
        }
    }
}
