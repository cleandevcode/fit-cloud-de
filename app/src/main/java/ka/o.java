package ka;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.r1;

/* loaded from: classes.dex */
public final class o implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ p f18247a;

    public o(p pVar) {
        this.f18247a = pVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        Object item;
        p pVar = this.f18247a;
        if (i10 < 0) {
            r1 r1Var = pVar.f18248e;
            if (!r1Var.a()) {
                item = null;
            } else {
                item = r1Var.f1499c.getSelectedItem();
            }
        } else {
            item = pVar.getAdapter().getItem(i10);
        }
        p.a(this.f18247a, item);
        AdapterView.OnItemClickListener onItemClickListener = this.f18247a.getOnItemClickListener();
        if (onItemClickListener != null) {
            if (view == null || i10 < 0) {
                r1 r1Var2 = this.f18247a.f18248e;
                if (!r1Var2.a()) {
                    view = null;
                } else {
                    view = r1Var2.f1499c.getSelectedView();
                }
                r1 r1Var3 = this.f18247a.f18248e;
                if (!r1Var3.a()) {
                    i10 = -1;
                } else {
                    i10 = r1Var3.f1499c.getSelectedItemPosition();
                }
                r1 r1Var4 = this.f18247a.f18248e;
                if (!r1Var4.a()) {
                    j10 = Long.MIN_VALUE;
                } else {
                    j10 = r1Var4.f1499c.getSelectedItemId();
                }
            }
            onItemClickListener.onItemClick(this.f18247a.f18248e.f1499c, view, i10, j10);
        }
        this.f18247a.f18248e.dismiss();
    }
}
