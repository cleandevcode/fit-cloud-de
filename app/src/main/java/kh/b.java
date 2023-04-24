package kh;

import android.content.Context;
import android.content.DialogInterface;
import android.widget.LinearLayout;
import f.q;
import gm.l;
import kh.c;
import mi.e;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f18580a;

    /* renamed from: b */
    public final /* synthetic */ q f18581b;

    /* renamed from: c */
    public final /* synthetic */ LinearLayout f18582c;

    public /* synthetic */ b(q qVar, LinearLayout linearLayout, int i10) {
        this.f18580a = i10;
        this.f18581b = qVar;
        this.f18582c = linearLayout;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        e.a aVar = null;
        switch (this.f18580a) {
            case 0:
                c cVar = (c) this.f18581b;
                m7.a aVar2 = (m7.a) this.f18582c;
                int i11 = c.D0;
                l.f(cVar, "this$0");
                l.f(aVar2, "$layout");
                c.b bVar = cVar.B0;
                if (bVar != null) {
                    bVar.B(tb.a.r(aVar2.getDate(), null));
                    return;
                }
                return;
            default:
                mi.e eVar = (mi.e) this.f18581b;
                m7.b bVar2 = (m7.b) this.f18582c;
                int i12 = mi.e.B0;
                l.f(eVar, "this$0");
                l.f(bVar2, "$layout");
                Context i02 = eVar.i0();
                if (i02 instanceof e.a) {
                    aVar = (e.a) i02;
                }
                if (aVar != null) {
                    int[] value = bVar2.getValue();
                    aVar.v(((value[0] * 60) + value[1]) * 60);
                    return;
                }
                return;
        }
    }
}
