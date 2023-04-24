package z3;

import androidx.lifecycle.g;
import androidx.lifecycle.u;
import gm.l;
import java.io.Serializable;
import mf.a0;
import z3.d;
import z3.f;

/* loaded from: classes.dex */
public final class f<T> implements tl.d<T>, Serializable {

    /* renamed from: a */
    public fm.a<? extends T> f31949a;

    /* renamed from: b */
    public volatile Object f31950b;

    /* renamed from: c */
    public final f<T> f31951c;

    public f(u uVar, b bVar) {
        l.f(uVar, "owner");
        this.f31949a = bVar;
        this.f31950b = a0.f20500a;
        this.f31951c = this;
        uVar.a0().a(new g(this) { // from class: com.airbnb.mvrx.navigation.navigationLifecycleAwareLazy$1

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ f<Object> f5654a;

            {
                this.f5654a = this;
            }

            @Override // androidx.lifecycle.g
            public final /* synthetic */ void c(u uVar2) {
            }

            @Override // androidx.lifecycle.g
            public final /* synthetic */ void onDestroy(u uVar2) {
            }

            @Override // androidx.lifecycle.g
            public final /* synthetic */ void onPause(u uVar2) {
            }

            @Override // androidx.lifecycle.g
            public final /* synthetic */ void onResume(u uVar2) {
            }

            @Override // androidx.lifecycle.g
            public final void onStart(u uVar2) {
                boolean z10;
                try {
                    if (this.f5654a.f31950b != a0.f20500a) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        this.f5654a.getValue();
                    }
                    uVar2.a0().c(this);
                } catch (IllegalStateException e10) {
                    this.f5654a.getClass();
                    throw new d(e10);
                }
            }

            @Override // androidx.lifecycle.g
            public final /* synthetic */ void onStop(u uVar2) {
            }
        });
    }

    @Override // tl.d
    public final T getValue() {
        T t10;
        T t11 = (T) this.f31950b;
        a0 a0Var = a0.f20500a;
        if (t11 != a0Var) {
            return t11;
        }
        synchronized (this.f31951c) {
            t10 = (T) this.f31950b;
            if (t10 == a0Var) {
                fm.a<? extends T> aVar = this.f31949a;
                l.c(aVar);
                t10 = aVar.m();
                this.f31950b = t10;
                this.f31949a = null;
            }
        }
        return t10;
    }

    public final String toString() {
        boolean z10;
        if (this.f31950b != a0.f20500a) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
