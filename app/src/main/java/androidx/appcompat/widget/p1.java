package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes.dex */
public final class p1 implements AdapterView.OnItemSelectedListener {

    /* renamed from: a */
    public final /* synthetic */ r1 f1483a;

    public p1(r1 r1Var) {
        this.f1483a = r1Var;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
        m1 m1Var;
        if (i10 == -1 || (m1Var = this.f1483a.f1499c) == null) {
            return;
        }
        m1Var.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
