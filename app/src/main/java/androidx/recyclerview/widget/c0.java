package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class c0 extends d0 {
    public c0(RecyclerView.m mVar) {
        super(mVar);
    }

    @Override // androidx.recyclerview.widget.d0
    public final int b(View view) {
        this.f3089a.getClass();
        return RecyclerView.m.w(view) + view.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.n) view.getLayoutParams())).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.d0
    public final int c(View view) {
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        this.f3089a.getClass();
        Rect rect = ((RecyclerView.n) view.getLayoutParams()).f2981b;
        return view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) nVar).topMargin + ((ViewGroup.MarginLayoutParams) nVar).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.d0
    public final int d(View view) {
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        this.f3089a.getClass();
        Rect rect = ((RecyclerView.n) view.getLayoutParams()).f2981b;
        return view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) nVar).leftMargin + ((ViewGroup.MarginLayoutParams) nVar).rightMargin;
    }

    @Override // androidx.recyclerview.widget.d0
    public final int e(View view) {
        this.f3089a.getClass();
        return (view.getTop() - RecyclerView.m.L(view)) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.n) view.getLayoutParams())).topMargin;
    }

    @Override // androidx.recyclerview.widget.d0
    public final int f() {
        return this.f3089a.f2973o;
    }

    @Override // androidx.recyclerview.widget.d0
    public final int g() {
        RecyclerView.m mVar = this.f3089a;
        return mVar.f2973o - mVar.D();
    }

    @Override // androidx.recyclerview.widget.d0
    public final int h() {
        return this.f3089a.D();
    }

    @Override // androidx.recyclerview.widget.d0
    public final int i() {
        return this.f3089a.f2971m;
    }

    @Override // androidx.recyclerview.widget.d0
    public final int j() {
        return this.f3089a.f2970l;
    }

    @Override // androidx.recyclerview.widget.d0
    public final int k() {
        return this.f3089a.G();
    }

    @Override // androidx.recyclerview.widget.d0
    public final int l() {
        RecyclerView.m mVar = this.f3089a;
        return (mVar.f2973o - mVar.G()) - this.f3089a.D();
    }

    @Override // androidx.recyclerview.widget.d0
    public final int m(View view) {
        this.f3089a.M(view, this.f3091c);
        return this.f3091c.bottom;
    }

    @Override // androidx.recyclerview.widget.d0
    public final int n(View view) {
        this.f3089a.M(view, this.f3091c);
        return this.f3091c.top;
    }

    @Override // androidx.recyclerview.widget.d0
    public final void o(int i10) {
        this.f3089a.R(i10);
    }
}
