package e4;

import j4.d1;
import j4.e1;
import j4.g0;
import j4.i0;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class f implements g0 {

    /* renamed from: a */
    public String f13353a;

    /* renamed from: b */
    public final ArrayList f13354b = new ArrayList();

    public f() {
    }

    public f(String str) {
        this.f13353a = str;
    }

    @Override // j4.g0
    public final void a(i0 i0Var, int i10) {
        d1 d1Var = i0Var.f17406j;
        int i11 = e1.BrowserSecure.f17396a;
        if ((i10 & i11) != 0 || d1Var.k(i11)) {
            d1Var.write("/**/");
        }
        d1Var.write(this.f13353a);
        d1Var.write(40);
        for (int i12 = 0; i12 < this.f13354b.size(); i12++) {
            if (i12 != 0) {
                d1Var.write(44);
            }
            i0Var.s(this.f13354b.get(i12));
        }
        d1Var.write(41);
    }

    public final String toString() {
        return a.t(this);
    }
}
