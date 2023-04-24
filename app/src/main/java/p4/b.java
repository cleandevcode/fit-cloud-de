package p4;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class b implements Closeable {

    /* renamed from: a */
    public final File f23851a;

    /* renamed from: b */
    public final File f23852b;

    /* renamed from: c */
    public final File f23853c;

    /* renamed from: d */
    public final File f23854d;

    /* renamed from: f */
    public long f23856f;

    /* renamed from: i */
    public BufferedWriter f23859i;

    /* renamed from: k */
    public int f23861k;

    /* renamed from: h */
    public long f23858h = 0;

    /* renamed from: j */
    public final LinkedHashMap<String, d> f23860j = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: l */
    public long f23862l = 0;

    /* renamed from: m */
    public final ThreadPoolExecutor f23863m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC0429b());

    /* renamed from: n */
    public final a f23864n = new a();

    /* renamed from: e */
    public final int f23855e = 1;

    /* renamed from: g */
    public final int f23857g = 1;

    /* loaded from: classes.dex */
    public class a implements Callable<Void> {
        public a() {
            b.this = r1;
        }

        @Override // java.util.concurrent.Callable
        public final Void call() {
            synchronized (b.this) {
                b bVar = b.this;
                if (bVar.f23859i != null) {
                    bVar.I();
                    if (b.this.s()) {
                        b.this.E();
                        b.this.f23861k = 0;
                    }
                }
            }
            return null;
        }
    }

    /* renamed from: p4.b$b */
    /* loaded from: classes.dex */
    public static final class ThreadFactoryC0429b implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public final synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }
    }

    /* loaded from: classes.dex */
    public final class c {

        /* renamed from: a */
        public final d f23866a;

        /* renamed from: b */
        public final boolean[] f23867b;

        /* renamed from: c */
        public boolean f23868c;

        public c(d dVar) {
            boolean[] zArr;
            b.this = r1;
            this.f23866a = dVar;
            if (dVar.f23874e) {
                zArr = null;
            } else {
                zArr = new boolean[r1.f23857g];
            }
            this.f23867b = zArr;
        }

        public final void a() {
            b.a(b.this, this, false);
        }

        public final File b() {
            File file;
            synchronized (b.this) {
                d dVar = this.f23866a;
                if (dVar.f23875f == this) {
                    if (!dVar.f23874e) {
                        this.f23867b[0] = true;
                    }
                    file = dVar.f23873d[0];
                    b.this.f23851a.mkdirs();
                } else {
                    throw new IllegalStateException();
                }
            }
            return file;
        }
    }

    /* loaded from: classes.dex */
    public final class d {

        /* renamed from: a */
        public final String f23870a;

        /* renamed from: b */
        public final long[] f23871b;

        /* renamed from: c */
        public File[] f23872c;

        /* renamed from: d */
        public File[] f23873d;

        /* renamed from: e */
        public boolean f23874e;

        /* renamed from: f */
        public c f23875f;

        public d(String str) {
            b.this = r7;
            this.f23870a = str;
            int i10 = r7.f23857g;
            this.f23871b = new long[i10];
            this.f23872c = new File[i10];
            this.f23873d = new File[i10];
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append('.');
            int length = sb2.length();
            for (int i11 = 0; i11 < r7.f23857g; i11++) {
                sb2.append(i11);
                this.f23872c[i11] = new File(r7.f23851a, sb2.toString());
                sb2.append(".tmp");
                this.f23873d[i11] = new File(r7.f23851a, sb2.toString());
                sb2.setLength(length);
            }
        }

        public final String a() {
            long[] jArr;
            StringBuilder sb2 = new StringBuilder();
            for (long j10 : this.f23871b) {
                sb2.append(' ');
                sb2.append(j10);
            }
            return sb2.toString();
        }
    }

    /* loaded from: classes.dex */
    public final class e {

        /* renamed from: a */
        public final File[] f23877a;

        public e(File[] fileArr) {
            this.f23877a = fileArr;
        }
    }

    public b(File file, long j10) {
        this.f23851a = file;
        this.f23852b = new File(file, "journal");
        this.f23853c = new File(file, "journal.tmp");
        this.f23854d = new File(file, "journal.bkp");
        this.f23856f = j10;
    }

    public static void F(File file, File file2, boolean z10) {
        if (z10) {
            h(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public static void a(b bVar, c cVar, boolean z10) {
        synchronized (bVar) {
            d dVar = cVar.f23866a;
            if (dVar.f23875f == cVar) {
                if (z10 && !dVar.f23874e) {
                    for (int i10 = 0; i10 < bVar.f23857g; i10++) {
                        if (cVar.f23867b[i10]) {
                            if (!dVar.f23873d[i10].exists()) {
                                cVar.a();
                                break;
                            }
                        } else {
                            cVar.a();
                            throw new IllegalStateException("Newly created entry didn't create value for index " + i10);
                        }
                    }
                }
                for (int i11 = 0; i11 < bVar.f23857g; i11++) {
                    File file = dVar.f23873d[i11];
                    if (z10) {
                        if (file.exists()) {
                            File file2 = dVar.f23872c[i11];
                            file.renameTo(file2);
                            long j10 = dVar.f23871b[i11];
                            long length = file2.length();
                            dVar.f23871b[i11] = length;
                            bVar.f23858h = (bVar.f23858h - j10) + length;
                        }
                    } else {
                        h(file);
                    }
                }
                bVar.f23861k++;
                dVar.f23875f = null;
                if (dVar.f23874e | z10) {
                    dVar.f23874e = true;
                    bVar.f23859i.append((CharSequence) "CLEAN");
                    bVar.f23859i.append(' ');
                    bVar.f23859i.append((CharSequence) dVar.f23870a);
                    bVar.f23859i.append((CharSequence) dVar.a());
                    bVar.f23859i.append('\n');
                    if (z10) {
                        bVar.f23862l++;
                        dVar.getClass();
                    }
                } else {
                    bVar.f23860j.remove(dVar.f23870a);
                    bVar.f23859i.append((CharSequence) "REMOVE");
                    bVar.f23859i.append(' ');
                    bVar.f23859i.append((CharSequence) dVar.f23870a);
                    bVar.f23859i.append('\n');
                }
                k(bVar.f23859i);
                if (bVar.f23858h > bVar.f23856f || bVar.s()) {
                    bVar.f23863m.submit(bVar.f23864n);
                }
            } else {
                throw new IllegalStateException();
            }
        }
    }

    @TargetApi(26)
    public static void b(Writer writer) {
        StrictMode.ThreadPolicy.Builder permitUnbufferedIo;
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        permitUnbufferedIo = new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo();
        StrictMode.setThreadPolicy(permitUnbufferedIo.build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void h(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    @TargetApi(26)
    public static void k(Writer writer) {
        StrictMode.ThreadPolicy.Builder permitUnbufferedIo;
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        permitUnbufferedIo = new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo();
        StrictMode.setThreadPolicy(permitUnbufferedIo.build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static b v(File file, long j10) {
        if (j10 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    F(file2, file3, false);
                }
            }
            b bVar = new b(file, j10);
            if (bVar.f23852b.exists()) {
                try {
                    bVar.C();
                    bVar.y();
                    return bVar;
                } catch (IOException e10) {
                    PrintStream printStream = System.out;
                    printStream.println("DiskLruCache " + file + " is corrupt: " + e10.getMessage() + ", removing");
                    bVar.close();
                    p4.d.a(bVar.f23851a);
                }
            }
            file.mkdirs();
            b bVar2 = new b(file, j10);
            bVar2.E();
            return bVar2;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final void C() {
        p4.c cVar = new p4.c(new FileInputStream(this.f23852b), p4.d.f23884a);
        try {
            String a10 = cVar.a();
            String a11 = cVar.a();
            String a12 = cVar.a();
            String a13 = cVar.a();
            String a14 = cVar.a();
            if ("libcore.io.DiskLruCache".equals(a10) && "1".equals(a11) && Integer.toString(this.f23855e).equals(a12) && Integer.toString(this.f23857g).equals(a13) && "".equals(a14)) {
                boolean z10 = false;
                int i10 = 0;
                while (true) {
                    try {
                        D(cVar.a());
                        i10++;
                    } catch (EOFException unused) {
                        this.f23861k = i10 - this.f23860j.size();
                        if (cVar.f23882e == -1) {
                            z10 = true;
                        }
                        if (z10) {
                            E();
                        } else {
                            this.f23859i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f23852b, true), p4.d.f23884a));
                        }
                        try {
                            cVar.close();
                            return;
                        } catch (RuntimeException e10) {
                            throw e10;
                        } catch (Exception unused2) {
                            return;
                        }
                    }
                }
            } else {
                throw new IOException("unexpected journal header: [" + a10 + ", " + a11 + ", " + a13 + ", " + a14 + "]");
            }
        } catch (Throwable th2) {
            try {
                cVar.close();
            } catch (RuntimeException e11) {
                throw e11;
            } catch (Exception unused3) {
            }
            throw th2;
        }
    }

    public final void D(String str) {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i10 = indexOf + 1;
            int indexOf2 = str.indexOf(32, i10);
            if (indexOf2 == -1) {
                substring = str.substring(i10);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f23860j.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i10, indexOf2);
            }
            d dVar = this.f23860j.get(substring);
            if (dVar == null) {
                dVar = new d(substring);
                this.f23860j.put(substring, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                dVar.f23874e = true;
                dVar.f23875f = null;
                if (split.length == b.this.f23857g) {
                    for (int i11 = 0; i11 < split.length; i11++) {
                        try {
                            dVar.f23871b[i11] = Long.parseLong(split[i11]);
                        } catch (NumberFormatException unused) {
                            StringBuilder a10 = android.support.v4.media.d.a("unexpected journal line: ");
                            a10.append(Arrays.toString(split));
                            throw new IOException(a10.toString());
                        }
                    }
                    return;
                }
                StringBuilder a11 = android.support.v4.media.d.a("unexpected journal line: ");
                a11.append(Arrays.toString(split));
                throw new IOException(a11.toString());
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                dVar.f23875f = new c(dVar);
                return;
            } else if (indexOf2 == -1 && indexOf == 4 && str.startsWith("READ")) {
                return;
            } else {
                throw new IOException(a.b.b("unexpected journal line: ", str));
            }
        }
        throw new IOException(a.b.b("unexpected journal line: ", str));
    }

    public final synchronized void E() {
        StringBuilder sb2;
        BufferedWriter bufferedWriter = this.f23859i;
        if (bufferedWriter != null) {
            b(bufferedWriter);
        }
        BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f23853c), p4.d.f23884a));
        bufferedWriter2.write("libcore.io.DiskLruCache");
        bufferedWriter2.write("\n");
        bufferedWriter2.write("1");
        bufferedWriter2.write("\n");
        bufferedWriter2.write(Integer.toString(this.f23855e));
        bufferedWriter2.write("\n");
        bufferedWriter2.write(Integer.toString(this.f23857g));
        bufferedWriter2.write("\n");
        bufferedWriter2.write("\n");
        for (d dVar : this.f23860j.values()) {
            if (dVar.f23875f != null) {
                sb2 = new StringBuilder();
                sb2.append("DIRTY ");
                sb2.append(dVar.f23870a);
                sb2.append('\n');
            } else {
                sb2 = new StringBuilder();
                sb2.append("CLEAN ");
                sb2.append(dVar.f23870a);
                sb2.append(dVar.a());
                sb2.append('\n');
            }
            bufferedWriter2.write(sb2.toString());
        }
        b(bufferedWriter2);
        if (this.f23852b.exists()) {
            F(this.f23852b, this.f23854d, true);
        }
        F(this.f23853c, this.f23852b, false);
        this.f23854d.delete();
        this.f23859i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f23852b, true), p4.d.f23884a));
    }

    public final void I() {
        while (this.f23858h > this.f23856f) {
            String key = this.f23860j.entrySet().iterator().next().getKey();
            synchronized (this) {
                if (this.f23859i != null) {
                    d dVar = this.f23860j.get(key);
                    if (dVar != null && dVar.f23875f == null) {
                        for (int i10 = 0; i10 < this.f23857g; i10++) {
                            File file = dVar.f23872c[i10];
                            if (file.exists() && !file.delete()) {
                                throw new IOException("failed to delete " + file);
                            }
                            long j10 = this.f23858h;
                            long[] jArr = dVar.f23871b;
                            this.f23858h = j10 - jArr[i10];
                            jArr[i10] = 0;
                        }
                        this.f23861k++;
                        this.f23859i.append((CharSequence) "REMOVE");
                        this.f23859i.append(' ');
                        this.f23859i.append((CharSequence) key);
                        this.f23859i.append('\n');
                        this.f23860j.remove(key);
                        if (s()) {
                            this.f23863m.submit(this.f23864n);
                        }
                    }
                } else {
                    throw new IllegalStateException("cache is closed");
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f23859i == null) {
            return;
        }
        Iterator it = new ArrayList(this.f23860j.values()).iterator();
        while (it.hasNext()) {
            c cVar = ((d) it.next()).f23875f;
            if (cVar != null) {
                cVar.a();
            }
        }
        I();
        b(this.f23859i);
        this.f23859i = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x001d, code lost:
        if (r0.f23875f != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p4.b.c j(java.lang.String r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.io.BufferedWriter r0 = r3.f23859i     // Catch: java.lang.Throwable -> L49
            if (r0 == 0) goto L4b
            java.util.LinkedHashMap<java.lang.String, p4.b$d> r0 = r3.f23860j     // Catch: java.lang.Throwable -> L49
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> L49
            p4.b$d r0 = (p4.b.d) r0     // Catch: java.lang.Throwable -> L49
            r1 = 0
            if (r0 != 0) goto L1b
            p4.b$d r0 = new p4.b$d     // Catch: java.lang.Throwable -> L49
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L49
            java.util.LinkedHashMap<java.lang.String, p4.b$d> r1 = r3.f23860j     // Catch: java.lang.Throwable -> L49
            r1.put(r4, r0)     // Catch: java.lang.Throwable -> L49
            goto L21
        L1b:
            p4.b$c r2 = r0.f23875f     // Catch: java.lang.Throwable -> L49
            if (r2 == 0) goto L21
        L1f:
            monitor-exit(r3)
            goto L48
        L21:
            p4.b$c r1 = new p4.b$c     // Catch: java.lang.Throwable -> L49
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L49
            r0.f23875f = r1     // Catch: java.lang.Throwable -> L49
            java.io.BufferedWriter r0 = r3.f23859i     // Catch: java.lang.Throwable -> L49
            java.lang.String r2 = "DIRTY"
            r0.append(r2)     // Catch: java.lang.Throwable -> L49
            java.io.BufferedWriter r0 = r3.f23859i     // Catch: java.lang.Throwable -> L49
            r2 = 32
            r0.append(r2)     // Catch: java.lang.Throwable -> L49
            java.io.BufferedWriter r0 = r3.f23859i     // Catch: java.lang.Throwable -> L49
            r0.append(r4)     // Catch: java.lang.Throwable -> L49
            java.io.BufferedWriter r4 = r3.f23859i     // Catch: java.lang.Throwable -> L49
            r0 = 10
            r4.append(r0)     // Catch: java.lang.Throwable -> L49
            java.io.BufferedWriter r4 = r3.f23859i     // Catch: java.lang.Throwable -> L49
            k(r4)     // Catch: java.lang.Throwable -> L49
            goto L1f
        L48:
            return r1
        L49:
            r4 = move-exception
            goto L53
        L4b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L49
            java.lang.String r0 = "cache is closed"
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L49
            throw r4     // Catch: java.lang.Throwable -> L49
        L53:
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.b.j(java.lang.String):p4.b$c");
    }

    public final synchronized e q(String str) {
        if (this.f23859i != null) {
            d dVar = this.f23860j.get(str);
            if (dVar == null) {
                return null;
            }
            if (!dVar.f23874e) {
                return null;
            }
            for (File file : dVar.f23872c) {
                if (!file.exists()) {
                    return null;
                }
            }
            this.f23861k++;
            this.f23859i.append((CharSequence) "READ");
            this.f23859i.append(' ');
            this.f23859i.append((CharSequence) str);
            this.f23859i.append('\n');
            if (s()) {
                this.f23863m.submit(this.f23864n);
            }
            return new e(dVar.f23872c);
        }
        throw new IllegalStateException("cache is closed");
    }

    public final boolean s() {
        int i10 = this.f23861k;
        return i10 >= 2000 && i10 >= this.f23860j.size();
    }

    public final void y() {
        h(this.f23853c);
        Iterator<d> it = this.f23860j.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            int i10 = 0;
            if (next.f23875f == null) {
                while (i10 < this.f23857g) {
                    this.f23858h += next.f23871b[i10];
                    i10++;
                }
            } else {
                next.f23875f = null;
                while (i10 < this.f23857g) {
                    h(next.f23872c[i10]);
                    h(next.f23873d[i10]);
                    i10++;
                }
                it.remove();
            }
        }
    }
}
