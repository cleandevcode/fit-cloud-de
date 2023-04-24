package androidx.emoji2.text;

import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import s.h1;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: i */
    public static final Object f2235i = new Object();

    /* renamed from: j */
    public static volatile f f2236j;

    /* renamed from: a */
    public final ReentrantReadWriteLock f2237a;

    /* renamed from: b */
    public final o0.d f2238b;

    /* renamed from: c */
    public volatile int f2239c;

    /* renamed from: d */
    public final Handler f2240d;

    /* renamed from: e */
    public final a f2241e;

    /* renamed from: f */
    public final g f2242f;

    /* renamed from: g */
    public final int f2243g;

    /* renamed from: h */
    public final androidx.emoji2.text.d f2244h;

    /* loaded from: classes.dex */
    public static final class a extends b {

        /* renamed from: b */
        public volatile j f2245b;

        /* renamed from: c */
        public volatile n f2246c;

        public a(f fVar) {
            super(fVar);
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public final f f2247a;

        public b(f fVar) {
            this.f2247a = fVar;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {

        /* renamed from: a */
        public final g f2248a;

        /* renamed from: b */
        public int f2249b = 0;

        /* renamed from: c */
        public androidx.emoji2.text.d f2250c = new androidx.emoji2.text.d();

        public c(g gVar) {
            this.f2248a = gVar;
        }
    }

    /* loaded from: classes.dex */
    public interface d {
    }

    /* loaded from: classes.dex */
    public static abstract class e {
        public void a() {
        }

        public void b() {
        }
    }

    /* renamed from: androidx.emoji2.text.f$f */
    /* loaded from: classes.dex */
    public static class RunnableC0028f implements Runnable {

        /* renamed from: a */
        public final ArrayList f2251a;

        /* renamed from: b */
        public final int f2252b;

        public RunnableC0028f(List list, int i10, Throwable th2) {
            h1.i(list, "initCallbacks cannot be null");
            this.f2251a = new ArrayList(list);
            this.f2252b = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int size = this.f2251a.size();
            int i10 = 0;
            if (this.f2252b != 1) {
                while (i10 < size) {
                    ((e) this.f2251a.get(i10)).a();
                    i10++;
                }
                return;
            }
            while (i10 < size) {
                ((e) this.f2251a.get(i10)).b();
                i10++;
            }
        }
    }

    /* loaded from: classes.dex */
    public interface g {
        void a(h hVar);
    }

    /* loaded from: classes.dex */
    public static abstract class h {
        public abstract void a(Throwable th2);

        public abstract void b(n nVar);
    }

    /* loaded from: classes.dex */
    public static class i {
    }

    public f(EmojiCompatInitializer.a aVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f2237a = reentrantReadWriteLock;
        this.f2239c = 3;
        g gVar = aVar.f2248a;
        this.f2242f = gVar;
        int i10 = aVar.f2249b;
        this.f2243g = i10;
        this.f2244h = aVar.f2250c;
        this.f2240d = new Handler(Looper.getMainLooper());
        this.f2238b = new o0.d();
        a aVar2 = new a(this);
        this.f2241e = aVar2;
        reentrantReadWriteLock.writeLock().lock();
        if (i10 == 0) {
            try {
                this.f2239c = 0;
            } catch (Throwable th2) {
                this.f2237a.writeLock().unlock();
                throw th2;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                gVar.a(new androidx.emoji2.text.e(aVar2));
            } catch (Throwable th3) {
                aVar2.f2247a.d(th3);
            }
        }
    }

    public static f a() {
        f fVar;
        synchronized (f2235i) {
            fVar = f2236j;
            h1.k("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.", fVar != null);
        }
        return fVar;
    }

    public final int b() {
        this.f2237a.readLock().lock();
        try {
            return this.f2239c;
        } finally {
            this.f2237a.readLock().unlock();
        }
    }

    public final void c() {
        boolean z10;
        boolean z11 = true;
        if (this.f2243g == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        h1.k("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading", z10);
        if (b() != 1) {
            z11 = false;
        }
        if (z11) {
            return;
        }
        this.f2237a.writeLock().lock();
        try {
            if (this.f2239c == 0) {
                return;
            }
            this.f2239c = 0;
            this.f2237a.writeLock().unlock();
            a aVar = this.f2241e;
            aVar.getClass();
            try {
                aVar.f2247a.f2242f.a(new androidx.emoji2.text.e(aVar));
            } catch (Throwable th2) {
                aVar.f2247a.d(th2);
            }
        } finally {
            this.f2237a.writeLock().unlock();
        }
    }

    public final void d(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        this.f2237a.writeLock().lock();
        try {
            this.f2239c = 2;
            arrayList.addAll(this.f2238b);
            this.f2238b.clear();
            this.f2237a.writeLock().unlock();
            this.f2240d.post(new RunnableC0028f(arrayList, this.f2239c, th2));
        } catch (Throwable th3) {
            this.f2237a.writeLock().unlock();
            throw th3;
        }
    }

    public final void e() {
        ArrayList arrayList = new ArrayList();
        this.f2237a.writeLock().lock();
        try {
            this.f2239c = 1;
            arrayList.addAll(this.f2238b);
            this.f2238b.clear();
            this.f2237a.writeLock().unlock();
            this.f2240d.post(new RunnableC0028f(arrayList, this.f2239c, null));
        } catch (Throwable th2) {
            this.f2237a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:208:0x00ed, code lost:
        if (r7.b(r19, r11, r0, r10.f2269d.f2290b) != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x00ef, code lost:
        if (r3 != null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x00f1, code lost:
        r3 = new androidx.emoji2.text.s((android.text.Spannable) new android.text.SpannableString(r19));
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x00fb, code lost:
        r4 = r10.f2269d.f2290b;
        r7.f2263a.getClass();
        r3.setSpan(new androidx.emoji2.text.p(r4), r11, r0, 33);
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0177, code lost:
        if (r8 != false) goto L115;
     */
    /* JADX WARN: Removed duplicated region for block: B:187:0x009b A[Catch: all -> 0x0184, TryCatch #0 {all -> 0x0184, blocks: (B:171:0x0062, B:174:0x0067, B:176:0x006b, B:178:0x007a, B:181:0x008a, B:183:0x0094, B:185:0x0097, B:187:0x009b, B:189:0x00a7, B:190:0x00aa, B:192:0x00b7, B:195:0x00bf, B:201:0x00d9, B:207:0x00e5, B:210:0x00f1, B:211:0x00fb, B:213:0x0110, B:215:0x0117, B:216:0x011c, B:218:0x0127, B:219:0x012c, B:221:0x0130, B:223:0x0136, B:225:0x013a, B:231:0x0147, B:234:0x0153, B:235:0x0159, B:237:0x016c, B:179:0x0080), top: B:256:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0153 A[Catch: all -> 0x0184, TryCatch #0 {all -> 0x0184, blocks: (B:171:0x0062, B:174:0x0067, B:176:0x006b, B:178:0x007a, B:181:0x008a, B:183:0x0094, B:185:0x0097, B:187:0x009b, B:189:0x00a7, B:190:0x00aa, B:192:0x00b7, B:195:0x00bf, B:201:0x00d9, B:207:0x00e5, B:210:0x00f1, B:211:0x00fb, B:213:0x0110, B:215:0x0117, B:216:0x011c, B:218:0x0127, B:219:0x012c, B:221:0x0130, B:223:0x0136, B:225:0x013a, B:231:0x0147, B:234:0x0153, B:235:0x0159, B:237:0x016c, B:179:0x0080), top: B:256:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x016c A[Catch: all -> 0x0184, TRY_LEAVE, TryCatch #0 {all -> 0x0184, blocks: (B:171:0x0062, B:174:0x0067, B:176:0x006b, B:178:0x007a, B:181:0x008a, B:183:0x0094, B:185:0x0097, B:187:0x009b, B:189:0x00a7, B:190:0x00aa, B:192:0x00b7, B:195:0x00bf, B:201:0x00d9, B:207:0x00e5, B:210:0x00f1, B:211:0x00fb, B:213:0x0110, B:215:0x0117, B:216:0x011c, B:218:0x0127, B:219:0x012c, B:221:0x0130, B:223:0x0136, B:225:0x013a, B:231:0x0147, B:234:0x0153, B:235:0x0159, B:237:0x016c, B:179:0x0080), top: B:256:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x011c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.CharSequence f(int r17, int r18, java.lang.CharSequence r19) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.f.f(int, int, java.lang.CharSequence):java.lang.CharSequence");
    }

    public final void g(e eVar) {
        h1.i(eVar, "initCallback cannot be null");
        this.f2237a.writeLock().lock();
        try {
            if (this.f2239c != 1 && this.f2239c != 2) {
                this.f2238b.add(eVar);
            }
            this.f2240d.post(new RunnableC0028f(Arrays.asList(eVar), this.f2239c, null));
        } finally {
            this.f2237a.writeLock().unlock();
        }
    }
}
