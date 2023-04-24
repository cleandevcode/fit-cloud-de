package lh;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.r;
import com.topstep.fitcloudpro.R;
import d6.q0;
import gm.l;
import gm.m;
import kotlin.Metadata;

@Metadata
/* loaded from: classes2.dex */
public abstract class c extends r {

    /* renamed from: l0 */
    public static final /* synthetic */ int f20000l0 = 0;

    /* loaded from: classes2.dex */
    public static final class a extends m implements fm.a<String> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super(0);
            c.this = r1;
        }

        @Override // fm.a
        public final String m() {
            return c.this.getClass().getSimpleName();
        }
    }

    public c() {
        fb.e.a(new a());
    }

    public c(int i10) {
        super(i10);
        fb.e.a(new a());
    }

    @Override // androidx.fragment.app.r
    public void O0(View view, Bundle bundle) {
        l.f(view, "view");
        View c12 = c1(view);
        if (c12 != null) {
            b.b(c12);
        }
        Toolbar toolbar = c12 instanceof Toolbar ? (Toolbar) c12 : (Toolbar) view.findViewById(R.id.toolbar);
        if (toolbar != null) {
            toolbar.setNavigationOnClickListener(new q0(2, this));
        }
    }

    public View c1(View view) {
        l.f(view, "view");
        return view.findViewById(R.id.toolbar);
    }

    public final void d1() {
        r rVar;
        r rVar2 = this.f2537v;
        if (rVar2 != null && (rVar = rVar2.f2537v) != null) {
            tb.a.f(rVar).o();
        }
    }
}
