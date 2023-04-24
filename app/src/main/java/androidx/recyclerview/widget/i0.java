package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class i0 extends k1.a {

    /* renamed from: d */
    public final RecyclerView f3118d;

    /* renamed from: e */
    public final a f3119e;

    /* loaded from: classes.dex */
    public static class a extends k1.a {

        /* renamed from: d */
        public final i0 f3120d;

        /* renamed from: e */
        public WeakHashMap f3121e = new WeakHashMap();

        public a(i0 i0Var) {
            this.f3120d = i0Var;
        }

        @Override // k1.a
        public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
            k1.a aVar = (k1.a) this.f3121e.get(view);
            return aVar != null ? aVar.a(view, accessibilityEvent) : super.a(view, accessibilityEvent);
        }

        @Override // k1.a
        public final l1.k b(View view) {
            k1.a aVar = (k1.a) this.f3121e.get(view);
            return aVar != null ? aVar.b(view) : super.b(view);
        }

        @Override // k1.a
        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            k1.a aVar = (k1.a) this.f3121e.get(view);
            if (aVar != null) {
                aVar.c(view, accessibilityEvent);
            } else {
                super.c(view, accessibilityEvent);
            }
        }

        @Override // k1.a
        public final void d(View view, l1.j jVar) {
            boolean z10;
            RecyclerView recyclerView = this.f3120d.f3118d;
            if (recyclerView.f2905u && !recyclerView.D && !recyclerView.f2871d.g()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10 && this.f3120d.f3118d.getLayoutManager() != null) {
                this.f3120d.f3118d.getLayoutManager().X(view, jVar);
                k1.a aVar = (k1.a) this.f3121e.get(view);
                if (aVar != null) {
                    aVar.d(view, jVar);
                    return;
                }
            }
            this.f18085a.onInitializeAccessibilityNodeInfo(view, jVar.f18670a);
        }

        @Override // k1.a
        public final void e(View view, AccessibilityEvent accessibilityEvent) {
            k1.a aVar = (k1.a) this.f3121e.get(view);
            if (aVar != null) {
                aVar.e(view, accessibilityEvent);
            } else {
                super.e(view, accessibilityEvent);
            }
        }

        @Override // k1.a
        public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            k1.a aVar = (k1.a) this.f3121e.get(viewGroup);
            return aVar != null ? aVar.f(viewGroup, view, accessibilityEvent) : super.f(viewGroup, view, accessibilityEvent);
        }

        @Override // k1.a
        public final boolean g(View view, int i10, Bundle bundle) {
            boolean z10;
            RecyclerView recyclerView = this.f3120d.f3118d;
            if (recyclerView.f2905u && !recyclerView.D && !recyclerView.f2871d.g()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10 && this.f3120d.f3118d.getLayoutManager() != null) {
                k1.a aVar = (k1.a) this.f3121e.get(view);
                if (aVar != null) {
                    if (aVar.g(view, i10, bundle)) {
                        return true;
                    }
                } else if (super.g(view, i10, bundle)) {
                    return true;
                }
                RecyclerView.t tVar = this.f3120d.f3118d.getLayoutManager().f2960b.f2868b;
                return false;
            }
            return super.g(view, i10, bundle);
        }

        @Override // k1.a
        public final void h(View view, int i10) {
            k1.a aVar = (k1.a) this.f3121e.get(view);
            if (aVar != null) {
                aVar.h(view, i10);
            } else {
                super.h(view, i10);
            }
        }

        @Override // k1.a
        public final void i(View view, AccessibilityEvent accessibilityEvent) {
            k1.a aVar = (k1.a) this.f3121e.get(view);
            if (aVar != null) {
                aVar.i(view, accessibilityEvent);
            } else {
                super.i(view, accessibilityEvent);
            }
        }
    }

    public i0(RecyclerView recyclerView) {
        this.f3118d = recyclerView;
        a aVar = this.f3119e;
        this.f3119e = aVar == null ? new a(this) : aVar;
    }

    @Override // k1.a
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        boolean z10;
        super.c(view, accessibilityEvent);
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = this.f3118d;
            if (recyclerView.f2905u && !recyclerView.D && !recyclerView.f2871d.g()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                RecyclerView recyclerView2 = (RecyclerView) view;
                if (recyclerView2.getLayoutManager() != null) {
                    recyclerView2.getLayoutManager().V(accessibilityEvent);
                }
            }
        }
    }

    @Override // k1.a
    public final void d(View view, l1.j jVar) {
        boolean z10;
        this.f18085a.onInitializeAccessibilityNodeInfo(view, jVar.f18670a);
        RecyclerView recyclerView = this.f3118d;
        if (recyclerView.f2905u && !recyclerView.D && !recyclerView.f2871d.g()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10 && this.f3118d.getLayoutManager() != null) {
            RecyclerView.m layoutManager = this.f3118d.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.f2960b;
            layoutManager.W(recyclerView2.f2868b, recyclerView2.f2904t0, jVar);
        }
    }

    @Override // k1.a
    public final boolean g(View view, int i10, Bundle bundle) {
        boolean z10 = true;
        if (super.g(view, i10, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f3118d;
        if (recyclerView.f2905u && !recyclerView.D && !recyclerView.f2871d.g()) {
            z10 = false;
        }
        if (z10 || this.f3118d.getLayoutManager() == null) {
            return false;
        }
        RecyclerView.m layoutManager = this.f3118d.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f2960b;
        return layoutManager.j0(recyclerView2.f2868b, recyclerView2.f2904t0, i10, bundle);
    }
}
