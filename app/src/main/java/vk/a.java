package vk;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes2.dex */
public final class a extends RuntimeException {

    /* renamed from: a */
    public final List<Throwable> f29433a;

    /* renamed from: b */
    public final String f29434b;

    /* renamed from: c */
    public Throwable f29435c;

    /* renamed from: vk.a$a */
    /* loaded from: classes2.dex */
    public static final class C0535a extends RuntimeException {
        public C0535a(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public final synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class b {
        public abstract b a(Object obj);
    }

    /* loaded from: classes2.dex */
    public static final class c extends b {

        /* renamed from: a */
        public final PrintStream f29436a;

        public c(PrintStream printStream) {
            this.f29436a = printStream;
        }

        @Override // vk.a.b
        public final b a(Object obj) {
            this.f29436a.print(obj);
            return this;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends b {

        /* renamed from: a */
        public final PrintWriter f29437a;

        public d(PrintWriter printWriter) {
            this.f29437a = printWriter;
        }

        @Override // vk.a.b
        public final b a(Object obj) {
            this.f29437a.print(obj);
            return this;
        }
    }

    public a(List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (list != null) {
            for (Object obj : list) {
                if (obj instanceof a) {
                    linkedHashSet.addAll(((a) obj).f29433a);
                } else {
                    linkedHashSet.add(obj == null ? new NullPointerException("Throwable was null!") : obj);
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (linkedHashSet.isEmpty()) {
            throw new IllegalArgumentException("errors is empty");
        }
        List<Throwable> unmodifiableList = Collections.unmodifiableList(new ArrayList(linkedHashSet));
        this.f29433a = unmodifiableList;
        this.f29434b = unmodifiableList.size() + " exceptions occurred. ";
    }

    public a(Throwable... thArr) {
        this(Arrays.asList(thArr));
    }

    public static void a(b bVar, Throwable th2, String str) {
        bVar.a(str).a(th2).a('\n');
        for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
            bVar.a("\t\tat ").a(stackTraceElement).a('\n');
        }
        if (th2.getCause() != null) {
            bVar.a("\tCaused by: ");
            a(bVar, th2.getCause(), "");
        }
    }

    public final void b(b bVar) {
        bVar.a(this).a("\n");
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            bVar.a("\tat ").a(stackTraceElement).a("\n");
        }
        int i10 = 1;
        for (Throwable th2 : this.f29433a) {
            bVar.a("  ComposedException ").a(Integer.valueOf(i10)).a(" :\n");
            a(bVar, th2, "\t");
            i10++;
        }
        bVar.a("\n");
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        Throwable th2;
        int i10;
        String[] split;
        if (this.f29435c == null) {
            String property = System.getProperty("line.separator");
            if (this.f29433a.size() > 1) {
                IdentityHashMap identityHashMap = new IdentityHashMap();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Multiple exceptions (");
                sb2.append(this.f29433a.size());
                sb2.append(")");
                sb2.append(property);
                for (Throwable th3 : this.f29433a) {
                    int i11 = 0;
                    while (true) {
                        if (th3 != null) {
                            for (int i12 = 0; i12 < i11; i12++) {
                                sb2.append("  ");
                            }
                            sb2.append("|-- ");
                            sb2.append(th3.getClass().getCanonicalName());
                            sb2.append(": ");
                            String message = th3.getMessage();
                            if (message == null || !message.contains(property)) {
                                sb2.append(message);
                                sb2.append(property);
                            } else {
                                sb2.append(property);
                                for (String str : message.split(property)) {
                                    for (int i13 = 0; i13 < i11 + 2; i13++) {
                                        sb2.append("  ");
                                    }
                                    sb2.append(str);
                                    sb2.append(property);
                                }
                            }
                            int i14 = 0;
                            while (true) {
                                i10 = i11 + 2;
                                if (i14 >= i10) {
                                    break;
                                }
                                sb2.append("  ");
                                i14++;
                            }
                            StackTraceElement[] stackTrace = th3.getStackTrace();
                            if (stackTrace.length > 0) {
                                sb2.append("at ");
                                sb2.append(stackTrace[0]);
                                sb2.append(property);
                            }
                            if (identityHashMap.containsKey(th3)) {
                                Throwable cause = th3.getCause();
                                if (cause != null) {
                                    for (int i15 = 0; i15 < i10; i15++) {
                                        sb2.append("  ");
                                    }
                                    sb2.append("|-- ");
                                    sb2.append("(cause not expanded again) ");
                                    sb2.append(cause.getClass().getCanonicalName());
                                    sb2.append(": ");
                                    sb2.append(cause.getMessage());
                                    sb2.append(property);
                                }
                            } else {
                                identityHashMap.put(th3, Boolean.TRUE);
                                th3 = th3.getCause();
                                i11++;
                            }
                        }
                    }
                }
                th2 = new C0535a(sb2.toString().trim());
            } else {
                th2 = this.f29433a.get(0);
            }
            this.f29435c = th2;
        }
        return this.f29435c;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f29434b;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        b(new c(printStream));
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        b(new d(printWriter));
    }
}
