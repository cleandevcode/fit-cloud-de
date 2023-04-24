package k7;

import android.view.View;
import com.github.kilnn.tool.R;
import fm.l;
import uh.a0;
import uh.z;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f18201a;

    /* renamed from: b */
    public final /* synthetic */ Object f18202b;

    /* renamed from: c */
    public final /* synthetic */ Object f18203c;

    public /* synthetic */ b(Object obj, Object obj2, int i10) {
        this.f18201a = i10;
        this.f18202b = obj;
        this.f18203c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z10;
        switch (this.f18201a) {
            case 0:
                View view2 = (View) this.f18202b;
                l lVar = (l) this.f18203c;
                gm.l.f(view2, "$this_clickTrigger");
                gm.l.f(lVar, "$block");
                long currentTimeMillis = System.currentTimeMillis();
                int i10 = R.id.triggerLastTimeKey;
                long tag = view2.getTag(i10);
                if (tag == null) {
                    tag = 0L;
                }
                long longValue = currentTimeMillis - ((Long) tag).longValue();
                long tag2 = view2.getTag(R.id.triggerDelayKey);
                if (tag2 == null) {
                    tag2 = -1L;
                }
                if (longValue >= ((Long) tag2).longValue()) {
                    z10 = true;
                    view2.setTag(i10, Long.valueOf(currentTimeMillis));
                } else {
                    z10 = false;
                }
                if (z10) {
                    lVar.k(view2);
                    return;
                }
                return;
            default:
                a0 a0Var = (a0) this.f18202b;
                a0.a aVar = (a0.a) this.f18203c;
                gm.l.f(a0Var, "this$0");
                gm.l.f(aVar, "$holder");
                a0.b bVar = a0Var.f28740e;
                if (bVar != null) {
                    z b10 = a0Var.f28739d.b(aVar.d());
                    gm.l.e(b10, "sorter[holder.bindingAdapterPosition]");
                    bVar.a(b10);
                    return;
                }
                return;
        }
    }
}
