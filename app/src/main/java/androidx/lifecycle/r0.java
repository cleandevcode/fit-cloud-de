package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.k;

/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a */
    public final v f2774a;

    /* renamed from: b */
    public final Handler f2775b = new Handler();

    /* renamed from: c */
    public a f2776c;

    /* loaded from: classes.dex */
    public static class a implements Runnable {

        /* renamed from: a */
        public final v f2777a;

        /* renamed from: b */
        public final k.b f2778b;

        /* renamed from: c */
        public boolean f2779c = false;

        public a(v vVar, k.b bVar) {
            this.f2777a = vVar;
            this.f2778b = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f2779c) {
                return;
            }
            this.f2777a.f(this.f2778b);
            this.f2779c = true;
        }
    }

    public r0(u uVar) {
        this.f2774a = new v(uVar);
    }

    public final void a(k.b bVar) {
        a aVar = this.f2776c;
        if (aVar != null) {
            aVar.run();
        }
        a aVar2 = new a(this.f2774a, bVar);
        this.f2776c = aVar2;
        this.f2775b.postAtFrontOfQueue(aVar2);
    }
}
