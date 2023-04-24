package androidx.emoji2.text;

import androidx.emoji2.text.f;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final class h extends f.h {

    /* renamed from: a */
    public final /* synthetic */ f.h f2257a;

    /* renamed from: b */
    public final /* synthetic */ ThreadPoolExecutor f2258b;

    public h(f.h hVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f2257a = hVar;
        this.f2258b = threadPoolExecutor;
    }

    @Override // androidx.emoji2.text.f.h
    public final void a(Throwable th2) {
        try {
            this.f2257a.a(th2);
        } finally {
            this.f2258b.shutdown();
        }
    }

    @Override // androidx.emoji2.text.f.h
    public final void b(n nVar) {
        try {
            this.f2257a.b(nVar);
        } finally {
            this.f2258b.shutdown();
        }
    }
}
