package p000do;

import android.os.Build;
import android.util.Log;
import androidx.fragment.app.i1;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import gm.l;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import no.nordicsemi.android.dfu.DfuBaseService;

/* renamed from: do.a */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a */
    public static final b f13275a = new b();

    /* renamed from: b */
    public static final ArrayList<c> f13276b = new ArrayList<>();

    /* renamed from: c */
    public static volatile c[] f13277c = new c[0];

    /* renamed from: do.a$a */
    /* loaded from: classes2.dex */
    public static class C0232a extends c {

        /* renamed from: c */
        public static final Pattern f13278c = Pattern.compile("(\\$\\d+)+$");

        /* renamed from: b */
        public final List<String> f13279b = h7.a.q(a.class.getName(), b.class.getName(), c.class.getName(), C0232a.class.getName());

        @Override // p000do.a.c
        public final String g() {
            String g10 = super.g();
            if (g10 == null) {
                StackTraceElement[] stackTrace = new Throwable().getStackTrace();
                l.e(stackTrace, "Throwable().stackTrace");
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (!this.f13279b.contains(stackTraceElement.getClassName())) {
                        String className = stackTraceElement.getClassName();
                        l.e(className, "element.className");
                        String w02 = om.l.w0(className, className);
                        Matcher matcher = f13278c.matcher(w02);
                        if (matcher.find()) {
                            w02 = matcher.replaceAll("");
                            l.e(w02, "m.replaceAll(\"\")");
                        }
                        if (w02.length() > 23 && Build.VERSION.SDK_INT < 26) {
                            String substring = w02.substring(0, 23);
                            l.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                            return substring;
                        }
                        return w02;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            return g10;
        }

        @Override // p000do.a.c
        public void k(int i10, String str, String str2) {
            int min;
            l.f(str2, CrashHianalyticsData.MESSAGE);
            if (str2.length() < 4000) {
                if (i10 == 7) {
                    Log.wtf(str, str2);
                    return;
                } else {
                    Log.println(i10, str, str2);
                    return;
                }
            }
            int length = str2.length();
            int i11 = 0;
            while (i11 < length) {
                int g02 = om.l.g0(str2, '\n', i11, false, 4);
                if (g02 == -1) {
                    g02 = length;
                }
                while (true) {
                    min = Math.min(g02, i11 + 4000);
                    String substring = str2.substring(i11, min);
                    l.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    if (i10 == 7) {
                        Log.wtf(str, substring);
                    } else {
                        Log.println(i10, str, substring);
                    }
                    if (min >= g02) {
                        break;
                    }
                    i11 = min;
                }
                i11 = min + 1;
            }
        }
    }

    /* renamed from: do.a$b */
    /* loaded from: classes2.dex */
    public static final class b extends c {
        @Override // p000do.a.c
        public final void a(Exception exc) {
            for (c cVar : a.f13277c) {
                cVar.a(exc);
            }
        }

        @Override // p000do.a.c
        public final void b(String str, Object... objArr) {
            l.f(objArr, "args");
            for (c cVar : a.f13277c) {
                cVar.b(str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // p000do.a.c
        public final void c(Throwable th2, String str, Object... objArr) {
            l.f(objArr, "args");
            for (c cVar : a.f13277c) {
                cVar.c(th2, str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // p000do.a.c
        public final void d(String str, Object... objArr) {
            l.f(objArr, "args");
            for (c cVar : a.f13277c) {
                cVar.d(str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // p000do.a.c
        public final void e(Throwable th2, String str, Object... objArr) {
            l.f(objArr, "args");
            for (c cVar : a.f13277c) {
                cVar.e(th2, str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // p000do.a.c
        public final void h(String str, Object... objArr) {
            l.f(objArr, "args");
            for (c cVar : a.f13277c) {
                cVar.h(str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // p000do.a.c
        public final void i(Throwable th2, Object... objArr) {
            l.f(objArr, "args");
            for (c cVar : a.f13277c) {
                cVar.i(th2, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // p000do.a.c
        public final void k(int i10, String str, String str2) {
            l.f(str2, CrashHianalyticsData.MESSAGE);
            throw new AssertionError();
        }

        @Override // p000do.a.c
        public final void l(int i10, String str, Object... objArr) {
            l.f(objArr, "args");
            for (c cVar : a.f13277c) {
                cVar.l(i10, str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // p000do.a.c
        public final void n(String str, Object... objArr) {
            l.f(objArr, "args");
            for (c cVar : a.f13277c) {
                cVar.n(str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // p000do.a.c
        public final void o(Throwable th2, String str, Object... objArr) {
            l.f(objArr, "args");
            for (c cVar : a.f13277c) {
                cVar.o(th2, str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // p000do.a.c
        public final void p(String str, Object... objArr) {
            l.f(objArr, "args");
            for (c cVar : a.f13277c) {
                cVar.p(str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // p000do.a.c
        public final void q(Throwable th2) {
            for (c cVar : a.f13277c) {
                cVar.q(th2);
            }
        }

        @Override // p000do.a.c
        public final void r(Throwable th2, String str, Object... objArr) {
            l.f(objArr, "args");
            for (c cVar : a.f13277c) {
                cVar.r(th2, str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        public final void s(C0232a c0232a) {
            boolean z10;
            if (c0232a != this) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                ArrayList<c> arrayList = a.f13276b;
                synchronized (arrayList) {
                    arrayList.add(c0232a);
                    Object[] array = arrayList.toArray(new c[0]);
                    if (array != null) {
                        a.f13277c = (c[]) array;
                        tl.l lVar = tl.l.f28297a;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Cannot plant Timber into itself.".toString());
        }

        public final void t(String str) {
            l.f(str, "tag");
            c[] cVarArr = a.f13277c;
            int length = cVarArr.length;
            int i10 = 0;
            while (i10 < length) {
                c cVar = cVarArr[i10];
                i10++;
                cVar.f13280a.set(str);
            }
        }
    }

    /* renamed from: do.a$c */
    /* loaded from: classes2.dex */
    public static abstract class c {

        /* renamed from: a */
        public final ThreadLocal<String> f13280a = new ThreadLocal<>();

        public static String f(Throwable th2) {
            StringWriter stringWriter = new StringWriter(DfuBaseService.ERROR_REMOTE_TYPE_LEGACY);
            PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
            th2.printStackTrace(printWriter);
            printWriter.flush();
            String stringWriter2 = stringWriter.toString();
            l.e(stringWriter2, "sw.toString()");
            return stringWriter2;
        }

        public void a(Exception exc) {
            m(3, exc, null, new Object[0]);
        }

        public void b(String str, Object... objArr) {
            l.f(objArr, "args");
            m(3, null, str, Arrays.copyOf(objArr, objArr.length));
        }

        public void c(Throwable th2, String str, Object... objArr) {
            l.f(objArr, "args");
            m(3, th2, str, Arrays.copyOf(objArr, objArr.length));
        }

        public void d(String str, Object... objArr) {
            l.f(objArr, "args");
            m(6, null, str, Arrays.copyOf(objArr, objArr.length));
        }

        public void e(Throwable th2, String str, Object... objArr) {
            l.f(objArr, "args");
            m(6, th2, str, Arrays.copyOf(objArr, objArr.length));
        }

        public /* synthetic */ String g() {
            String str = this.f13280a.get();
            if (str != null) {
                this.f13280a.remove();
            }
            return str;
        }

        public void h(String str, Object... objArr) {
            l.f(objArr, "args");
            m(4, null, str, Arrays.copyOf(objArr, objArr.length));
        }

        public void i(Throwable th2, Object... objArr) {
            l.f(objArr, "args");
            m(4, th2, "continuation fail", Arrays.copyOf(objArr, objArr.length));
        }

        public boolean j(int i10) {
            return true;
        }

        public abstract void k(int i10, String str, String str2);

        public void l(int i10, String str, Object... objArr) {
            l.f(objArr, "args");
            m(i10, null, str, Arrays.copyOf(objArr, objArr.length));
        }

        public final void m(int i10, Throwable th2, String str, Object... objArr) {
            boolean z10;
            String str2;
            String g10 = g();
            if (!j(i10)) {
                return;
            }
            boolean z11 = false;
            if (str != null && str.length() != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                if (th2 == null) {
                    return;
                }
                str2 = f(th2);
            } else {
                if (objArr.length == 0) {
                    z11 = true;
                }
                if (!z11) {
                    l.f(str, CrashHianalyticsData.MESSAGE);
                    Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                    str = i1.d(copyOf, copyOf.length, str, "java.lang.String.format(this, *args)");
                }
                if (th2 != null) {
                    str2 = ((Object) str) + '\n' + f(th2);
                } else {
                    str2 = str;
                }
            }
            k(i10, g10, str2);
        }

        public void n(String str, Object... objArr) {
            l.f(objArr, "args");
            m(2, null, str, Arrays.copyOf(objArr, objArr.length));
        }

        public void o(Throwable th2, String str, Object... objArr) {
            l.f(objArr, "args");
            m(2, th2, str, Arrays.copyOf(objArr, objArr.length));
        }

        public void p(String str, Object... objArr) {
            l.f(objArr, "args");
            m(5, null, str, Arrays.copyOf(objArr, objArr.length));
        }

        public void q(Throwable th2) {
            m(5, th2, null, new Object[0]);
        }

        public void r(Throwable th2, String str, Object... objArr) {
            l.f(objArr, "args");
            m(5, th2, str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    public a() {
        throw new AssertionError();
    }

    public static void a(Exception exc) {
        f13275a.q(exc);
    }
}
