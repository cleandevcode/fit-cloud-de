package com.airbnb.mvrx;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.g;
import androidx.lifecycle.k;
import androidx.lifecycle.u;
import bk.i;
import fm.a;
import gm.l;
import java.io.Serializable;
import tl.d;
import y3.h;
import y3.i1;

/* loaded from: classes.dex */
public final class lifecycleAwareLazy<T> implements d<T>, Serializable {

    /* renamed from: a */
    public final u f5648a;

    /* renamed from: b */
    public a<? extends T> f5649b;

    /* renamed from: c */
    public volatile Object f5650c;

    /* renamed from: d */
    public final lifecycleAwareLazy<T> f5651d;

    public lifecycleAwareLazy(u uVar, h hVar) {
        i1 i1Var = i1.f30960b;
        l.f(uVar, "owner");
        this.f5648a = uVar;
        this.f5649b = hVar;
        this.f5650c = i.f4439b;
        this.f5651d = this;
        if (((Boolean) i1Var.m()).booleanValue()) {
            a(uVar);
        } else {
            new Handler(Looper.getMainLooper()).post(new androidx.activity.h(4, this));
        }
    }

    public final void a(u uVar) {
        boolean z10;
        k.c cVar = uVar.a0().f2790c;
        l.e(cVar, "owner.lifecycle.currentState");
        if (cVar != k.c.DESTROYED) {
            Object obj = this.f5650c;
            i iVar = i.f4439b;
            boolean z11 = true;
            if (obj != iVar) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                if (cVar == k.c.INITIALIZED) {
                    uVar.a0().a(new g(this) { // from class: com.airbnb.mvrx.lifecycleAwareLazy$initializeWhenCreated$1

                        /* renamed from: a  reason: collision with root package name */
                        public final /* synthetic */ lifecycleAwareLazy<T> f5652a;

                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            this.f5652a = this;
                        }

                        @Override // androidx.lifecycle.g
                        public final void c(u uVar2) {
                            boolean z12;
                            if (this.f5652a.f5650c != i.f4439b) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (!z12) {
                                this.f5652a.getValue();
                            }
                            uVar2.a0().c(this);
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
                        public final /* synthetic */ void onStart(u uVar2) {
                        }

                        @Override // androidx.lifecycle.g
                        public final /* synthetic */ void onStop(u uVar2) {
                        }
                    });
                    return;
                }
                if (this.f5650c == iVar) {
                    z11 = false;
                }
                if (!z11) {
                    getValue();
                }
            }
        }
    }

    @Override // tl.d
    public final T getValue() {
        T t10;
        T t11 = (T) this.f5650c;
        i iVar = i.f4439b;
        if (t11 != iVar) {
            return t11;
        }
        synchronized (this.f5651d) {
            t10 = (T) this.f5650c;
            if (t10 == iVar) {
                a<? extends T> aVar = this.f5649b;
                l.c(aVar);
                t10 = aVar.m();
                this.f5650c = t10;
                this.f5649b = null;
            }
        }
        return t10;
    }

    public final String toString() {
        boolean z10;
        if (this.f5650c != i.f4439b) {
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
