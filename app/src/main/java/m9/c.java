package m9;

import android.view.View;
import java.util.WeakHashMap;
import k1.i2;
import k1.n2;
import k1.o0;
import z9.r;

/* loaded from: classes.dex */
public final class c implements r.b {
    @Override // z9.r.b
    public final n2 b(View view, n2 n2Var, r.c cVar) {
        int i10;
        cVar.f32169d = n2Var.b() + cVar.f32169d;
        WeakHashMap<View, i2> weakHashMap = o0.f18161a;
        boolean z10 = true;
        if (o0.e.d(view) != 1) {
            z10 = false;
        }
        int c10 = n2Var.c();
        int d10 = n2Var.d();
        int i11 = cVar.f32166a;
        if (z10) {
            i10 = d10;
        } else {
            i10 = c10;
        }
        cVar.f32166a = i11 + i10;
        int i12 = cVar.f32168c;
        if (!z10) {
            c10 = d10;
        }
        cVar.f32168c = i12 + c10;
        cVar.a(view);
        return n2Var;
    }
}
