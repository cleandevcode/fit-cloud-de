package androidx.activity;

import android.annotation.SuppressLint;
import androidx.lifecycle.k;
import androidx.lifecycle.s;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import java.util.ArrayDeque;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* renamed from: a */
    public final Runnable f723a;

    /* renamed from: b */
    public final ArrayDeque<k> f724b = new ArrayDeque<>();

    /* loaded from: classes.dex */
    public class LifecycleOnBackPressedCancellable implements s, androidx.activity.a {

        /* renamed from: a */
        public final androidx.lifecycle.k f725a;

        /* renamed from: b */
        public final k f726b;

        /* renamed from: c */
        public a f727c;

        public LifecycleOnBackPressedCancellable(androidx.lifecycle.k kVar, k kVar2) {
            OnBackPressedDispatcher.this = r1;
            this.f725a = kVar;
            this.f726b = kVar2;
            kVar.a(this);
        }

        @Override // androidx.activity.a
        public final void cancel() {
            this.f725a.c(this);
            this.f726b.f746b.remove(this);
            a aVar = this.f727c;
            if (aVar != null) {
                aVar.cancel();
                this.f727c = null;
            }
        }

        @Override // androidx.lifecycle.s
        public final void d(u uVar, k.b bVar) {
            if (bVar == k.b.ON_START) {
                OnBackPressedDispatcher onBackPressedDispatcher = OnBackPressedDispatcher.this;
                k kVar = this.f726b;
                onBackPressedDispatcher.f724b.add(kVar);
                a aVar = new a(kVar);
                kVar.f746b.add(aVar);
                this.f727c = aVar;
            } else if (bVar == k.b.ON_STOP) {
                a aVar2 = this.f727c;
                if (aVar2 != null) {
                    aVar2.cancel();
                }
            } else if (bVar == k.b.ON_DESTROY) {
                cancel();
            }
        }
    }

    /* loaded from: classes.dex */
    public class a implements androidx.activity.a {

        /* renamed from: a */
        public final k f729a;

        public a(k kVar) {
            OnBackPressedDispatcher.this = r1;
            this.f729a = kVar;
        }

        @Override // androidx.activity.a
        public final void cancel() {
            OnBackPressedDispatcher.this.f724b.remove(this.f729a);
            this.f729a.f746b.remove(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f723a = runnable;
    }

    @SuppressLint({"LambdaLast"})
    public final void a(u uVar, k kVar) {
        v a02 = uVar.a0();
        if (a02.f2790c == k.c.DESTROYED) {
            return;
        }
        kVar.f746b.add(new LifecycleOnBackPressedCancellable(a02, kVar));
    }

    public final void b() {
        Iterator<k> descendingIterator = this.f724b.descendingIterator();
        while (descendingIterator.hasNext()) {
            k next = descendingIterator.next();
            if (next.f745a) {
                next.a();
                return;
            }
        }
        Runnable runnable = this.f723a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
