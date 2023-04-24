package t4;

import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class t extends Exception {

    /* renamed from: f */
    public static final StackTraceElement[] f27733f = new StackTraceElement[0];

    /* renamed from: a */
    public final List<Throwable> f27734a;

    /* renamed from: b */
    public r4.f f27735b;

    /* renamed from: c */
    public r4.a f27736c;

    /* renamed from: d */
    public Class<?> f27737d;

    /* renamed from: e */
    public String f27738e;

    /* loaded from: classes.dex */
    public static final class a implements Appendable {

        /* renamed from: a */
        public final Appendable f27739a;

        /* renamed from: b */
        public boolean f27740b = true;

        public a(Appendable appendable) {
            this.f27739a = appendable;
        }

        @Override // java.lang.Appendable
        public final Appendable append(char c10) {
            if (this.f27740b) {
                this.f27740b = false;
                this.f27739a.append("  ");
            }
            this.f27740b = c10 == '\n';
            this.f27739a.append(c10);
            return this;
        }

        @Override // java.lang.Appendable
        public final Appendable append(CharSequence charSequence) {
            if (charSequence == null) {
                charSequence = "";
            }
            append(charSequence, 0, charSequence.length());
            return this;
        }

        @Override // java.lang.Appendable
        public final Appendable append(CharSequence charSequence, int i10, int i11) {
            if (charSequence == null) {
                charSequence = "";
            }
            boolean z10 = false;
            if (this.f27740b) {
                this.f27740b = false;
                this.f27739a.append("  ");
            }
            if (charSequence.length() > 0 && charSequence.charAt(i11 - 1) == '\n') {
                z10 = true;
            }
            this.f27740b = z10;
            this.f27739a.append(charSequence, i10, i11);
            return this;
        }
    }

    public t(String str) {
        this(str, Collections.emptyList());
    }

    public t(String str, List<Throwable> list) {
        this.f27738e = str;
        setStackTrace(f27733f);
        this.f27734a = list;
    }

    public static void a(Throwable th2, ArrayList arrayList) {
        if (th2 instanceof t) {
            for (Throwable th3 : ((t) th2).f27734a) {
                a(th3, arrayList);
            }
            return;
        }
        arrayList.add(th2);
    }

    public static void b(List list, a aVar) {
        try {
            c(list, aVar);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void c(List list, a aVar) {
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            aVar.append("Cause (");
            int i11 = i10 + 1;
            aVar.append(String.valueOf(i11));
            aVar.append(" of ");
            aVar.append(String.valueOf(size));
            aVar.append("): ");
            Throwable th2 = (Throwable) list.get(i10);
            if (th2 instanceof t) {
                ((t) th2).f(aVar);
            } else {
                d(th2, aVar);
            }
            i10 = i11;
        }
    }

    public static void d(Throwable th2, Appendable appendable) {
        try {
            appendable.append(th2.getClass().toString()).append(": ").append(th2.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th2);
        }
    }

    public final void e() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            StringBuilder a10 = android.support.v4.media.d.a("Root cause (");
            int i11 = i10 + 1;
            a10.append(i11);
            a10.append(" of ");
            a10.append(size);
            a10.append(")");
            Log.i("Glide", a10.toString(), (Throwable) arrayList.get(i10));
            i10 = i11;
        }
    }

    public final void f(Appendable appendable) {
        d(this, appendable);
        b(this.f27734a, new a(appendable));
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str;
        String str2;
        String str3;
        StringBuilder sb2 = new StringBuilder(71);
        sb2.append(this.f27738e);
        String str4 = "";
        if (this.f27737d == null) {
            str = "";
        } else {
            StringBuilder a10 = android.support.v4.media.d.a(", ");
            a10.append(this.f27737d);
            str = a10.toString();
        }
        sb2.append(str);
        if (this.f27736c == null) {
            str2 = "";
        } else {
            StringBuilder a11 = android.support.v4.media.d.a(", ");
            a11.append(this.f27736c);
            str2 = a11.toString();
        }
        sb2.append(str2);
        if (this.f27735b != null) {
            StringBuilder a12 = android.support.v4.media.d.a(", ");
            a12.append(this.f27735b);
            str4 = a12.toString();
        }
        sb2.append(str4);
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb2.toString();
        }
        if (arrayList.size() == 1) {
            str3 = "\nThere was 1 root cause:";
        } else {
            sb2.append("\nThere were ");
            sb2.append(arrayList.size());
            str3 = " root causes:";
        }
        sb2.append(str3);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Throwable th2 = (Throwable) it.next();
            sb2.append('\n');
            sb2.append(th2.getClass().getName());
            sb2.append('(');
            sb2.append(th2.getMessage());
            sb2.append(')');
        }
        sb2.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb2.toString();
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        f(System.err);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        f(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        f(printWriter);
    }
}
