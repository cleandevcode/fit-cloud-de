package dagger.hilt.android.internal.managers;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import androidx.fragment.app.r;
import androidx.lifecycle.k;
import androidx.lifecycle.s;
import androidx.lifecycle.u;

/* loaded from: classes2.dex */
public final class ViewComponentManager$FragmentContextWrapper extends ContextWrapper {

    /* renamed from: a */
    public LayoutInflater f12945a;

    /* renamed from: b */
    public LayoutInflater f12946b;

    /* renamed from: c */
    public final s f12947c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewComponentManager$FragmentContextWrapper(Context context, r rVar) {
        super(context);
        context.getClass();
        s sVar = new s() { // from class: dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper.1
            @Override // androidx.lifecycle.s
            public final void d(u uVar, k.b bVar) {
                if (bVar == k.b.ON_DESTROY) {
                    ViewComponentManager$FragmentContextWrapper viewComponentManager$FragmentContextWrapper = ViewComponentManager$FragmentContextWrapper.this;
                    viewComponentManager$FragmentContextWrapper.getClass();
                    viewComponentManager$FragmentContextWrapper.f12945a = null;
                    viewComponentManager$FragmentContextWrapper.f12946b = null;
                }
            }
        };
        this.f12947c = sVar;
        this.f12945a = null;
        rVar.getClass();
        rVar.Z.a(sVar);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.f12946b == null) {
                if (this.f12945a == null) {
                    this.f12945a = (LayoutInflater) getBaseContext().getSystemService("layout_inflater");
                }
                this.f12946b = this.f12945a.cloneInContext(this);
            }
            return this.f12946b;
        }
        return getBaseContext().getSystemService(str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ViewComponentManager$FragmentContextWrapper(android.view.LayoutInflater r2, androidx.fragment.app.r r3) {
        /*
            r1 = this;
            r2.getClass()
            android.content.Context r0 = r2.getContext()
            r0.getClass()
            r1.<init>(r0)
            dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper$1 r0 = new dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper$1
            r0.<init>()
            r1.f12947c = r0
            r1.f12945a = r2
            r3.getClass()
            androidx.lifecycle.v r2 = r3.Z
            r2.a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper.<init>(android.view.LayoutInflater, androidx.fragment.app.r):void");
    }
}
