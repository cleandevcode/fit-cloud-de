package h6;

import com.huawei.hms.scankit.C0637e;
import d6.m0;
import f6.b;
import f6.f;
import gm.l;
import java.io.File;
import java.io.FilenameFilter;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import lm.i;
import om.h;
import org.json.JSONArray;
import ul.q;

/* loaded from: classes.dex */
public final class c implements Thread.UncaughtExceptionHandler {

    /* renamed from: b */
    public static final a f15885b = new a();

    /* renamed from: c */
    public static final String f15886c = c.class.getCanonicalName();

    /* renamed from: d */
    public static c f15887d;

    /* renamed from: a */
    public final Thread.UncaughtExceptionHandler f15888a;

    /* loaded from: classes.dex */
    public static final class a {
        public static void a() {
            File[] fileArr;
            if (m0.y()) {
                return;
            }
            File b10 = f.b();
            if (b10 == null || (fileArr = b10.listFiles(new FilenameFilter() { // from class: f6.c
                @Override // java.io.FilenameFilter
                public final boolean accept(File file, String str) {
                    l.e(str, "name");
                    String format = String.format("^(%s|%s|%s)[0-9]+.json$", Arrays.copyOf(new Object[]{"crash_log_", "shield_log_", "thread_check_log_"}, 3));
                    l.e(format, "java.lang.String.format(format, *args)");
                    Pattern compile = Pattern.compile(format);
                    l.e(compile, "compile(pattern)");
                    return compile.matcher(str).matches();
                }
            })) == null) {
                fileArr = new File[0];
            }
            ArrayList arrayList = new ArrayList(fileArr.length);
            for (File file : fileArr) {
                l.f(file, "file");
                arrayList.add(new f6.b(file));
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (((f6.b) next).b()) {
                    arrayList2.add(next);
                }
            }
            List U = q.U(arrayList2, new Comparator() { // from class: h6.a
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    f6.b bVar = (f6.b) obj2;
                    l.e(bVar, "o2");
                    return ((f6.b) obj).a(bVar);
                }
            });
            JSONArray jSONArray = new JSONArray();
            i it2 = h7.a.A(0, Math.min(U.size(), 5)).iterator();
            while (it2.f20076c) {
                jSONArray.put(U.get(it2.nextInt()));
            }
            f.e("crash_reports", jSONArray, new b(0, U));
        }
    }

    public c(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f15888a = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        boolean z10;
        l.f(thread, "t");
        l.f(th2, C0637e.f7371a);
        Throwable th3 = null;
        Throwable th4 = th2;
        loop0: while (true) {
            z10 = false;
            if (th4 == null || th4 == th3) {
                break;
            }
            StackTraceElement[] stackTrace = th4.getStackTrace();
            l.e(stackTrace, "t.stackTrace");
            int length = stackTrace.length;
            int i10 = 0;
            while (i10 < length) {
                StackTraceElement stackTraceElement = stackTrace[i10];
                i10++;
                String className = stackTraceElement.getClassName();
                l.e(className, "element.className");
                if (h.a0(className, "com.facebook", false)) {
                    z10 = true;
                    break loop0;
                }
            }
            th3 = th4;
            th4 = th4.getCause();
        }
        if (z10) {
            o8.b.l(th2);
            new f6.b(th2, b.a.CrashReport).c();
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f15888a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th2);
        }
    }
}
