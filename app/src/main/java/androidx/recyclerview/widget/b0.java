package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class b0 extends d0 {
    public b0(RecyclerView.m mVar) {
        super(mVar);
    }

    @Override // androidx.recyclerview.widget.d0
    public final int b(View view) {
        this.f3089a.getClass();
        return RecyclerView.m.J(view) + view.getRight() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.n) view.getLayoutParams())).rightMargin;
    }

    @Override // androidx.recyclerview.widget.d0
    public final int c(View view) {
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        this.f3089a.getClass();
        Rect rect = ((RecyclerView.n) view.getLayoutParams()).f2981b;
        return view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) nVar).leftMargin + ((ViewGroup.MarginLayoutParams) nVar).rightMargin;
    }

    @Override // androidx.recyclerview.widget.d0
    public final int d(View view) {
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        this.f3089a.getClass();
        Rect rect = ((RecyclerView.n) view.getLayoutParams()).f2981b;
        return view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) nVar).topMargin + ((ViewGroup.MarginLayoutParams) nVar).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.d0
    public final int e(View view) {
        this.f3089a.getClass();
        return (view.getLeft() - RecyclerView.m.C(view)) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.n) view.getLayoutParams())).leftMargin;
    }

    @Override // androidx.recyclerview.widget.d0
    public final int f() {
        return this.f3089a.f2972n;
    }

    @Override // androidx.recyclerview.widget.d0
    public final int g() {
        RecyclerView.m mVar = this.f3089a;
        return mVar.f2972n - mVar.F();
    }

    @Override // androidx.recyclerview.widget.d0
    public final int h() {
        return this.f3089a.F();
    }

    @Override // androidx.recyclerview.widget.d0
    public final int i() {
        return this.f3089a.f2970l;
    }

    @Override // androidx.recyclerview.widget.d0
    public final int j() {
        return this.f3089a.f2971m;
    }

    @Override // androidx.recyclerview.widget.d0
    public final int k() {
        return this.f3089a.E();
    }

    @Override // androidx.recyclerview.widget.d0
    public final int l() {
        RecyclerView.m mVar = this.f3089a;
        return (mVar.f2972n - mVar.E()) - this.f3089a.F();
    }

    @Override // androidx.recyclerview.widget.d0
    public final int m(View view) {
        this.f3089a.M(view, this.f3091c);
        return this.f3091c.right;
    }

    @Override // androidx.recyclerview.widget.d0
    public final int n(View view) {
        this.f3089a.M(view, this.f3091c);
        return this.f3091c.left;
    }

    @Override // androidx.recyclerview.widget.d0
    public final void o(int i10) {
        this.f3089a.Q(i10);
    }
}
