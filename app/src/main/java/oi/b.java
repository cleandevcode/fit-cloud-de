package oi;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class b extends RecyclerView.l {

    /* renamed from: a */
    public final int f23561a;

    /* renamed from: b */
    public final int f23562b;

    /* renamed from: c */
    public final boolean f23563c = true;

    public b(int i10, int i11) {
        this.f23561a = i10;
        this.f23562b = i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void f(Rect rect, View view, RecyclerView recyclerView) {
        int i10;
        recyclerView.getClass();
        RecyclerView.b0 J = RecyclerView.J(view);
        if (J != null) {
            i10 = J.c();
        } else {
            i10 = -1;
        }
        if (i10 == -1) {
            RecyclerView.b0 J2 = RecyclerView.J(view);
            if (J2 != null) {
                i10 = J2.e();
            } else {
                i10 = -1;
            }
        }
        if (i10 == -1) {
            return;
        }
        int i11 = this.f23561a;
        int i12 = i10 % i11;
        if (this.f23563c) {
            int i13 = this.f23562b;
            rect.left = i13 - ((i12 * i13) / i11);
            rect.right = ((i12 + 1) * i13) / i11;
            if (i10 < i11) {
                rect.top = i13;
            }
            rect.bottom = i13;
            return;
        }
        int i14 = this.f23562b;
        rect.left = (i12 * i14) / i11;
        rect.right = i14 - (((i12 + 1) * i14) / i11);
        if (i10 >= i11) {
            rect.top = i14;
        }
    }
}
