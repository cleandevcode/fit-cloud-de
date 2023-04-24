package jc;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import th.k;
import vh.b;

/* loaded from: classes.dex */
public final /* synthetic */ class w implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f17619a;

    /* renamed from: b */
    public final /* synthetic */ Object f17620b;

    /* renamed from: c */
    public final /* synthetic */ Object f17621c;

    public /* synthetic */ w(Object obj, Object obj2, int i10) {
        this.f17619a = i10;
        this.f17620b = obj;
        this.f17621c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f17619a) {
            case 0:
                ic.b bVar = (ic.b) this.f17620b;
                c cVar = (c) this.f17621c;
                gm.l.f(bVar, "$dialogFragment");
                gm.l.f(cVar, "$chainTask");
                bVar.c1(false, false);
                cVar.b();
                return;
            case 1:
                th.k kVar = (th.k) this.f17620b;
                k.a aVar = (k.a) this.f17621c;
                gm.l.f(kVar, "this$0");
                gm.l.f(aVar, "$holder");
                k.b bVar2 = kVar.f28203e;
                if (bVar2 != null) {
                    bVar2.a(aVar.d());
                    return;
                }
                return;
            default:
                vh.b bVar3 = (vh.b) this.f17620b;
                RecyclerView.b0 b0Var = (RecyclerView.b0) this.f17621c;
                gm.l.f(bVar3, "this$0");
                gm.l.f(b0Var, "$holder");
                b.InterfaceC0532b interfaceC0532b = bVar3.f29385e;
                if (interfaceC0532b != null) {
                    interfaceC0532b.a(((b.a) b0Var).d());
                    return;
                }
                return;
        }
    }
}
