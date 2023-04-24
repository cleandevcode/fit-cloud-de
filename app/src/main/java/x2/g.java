package x2;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: b */
    public View f30176b;

    /* renamed from: a */
    public final HashMap f30175a = new HashMap();

    /* renamed from: c */
    public final ArrayList<androidx.transition.i> f30177c = new ArrayList<>();

    @Deprecated
    public g() {
    }

    public g(View view) {
        this.f30176b = view;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            g gVar = (g) obj;
            return this.f30176b == gVar.f30176b && this.f30175a.equals(gVar.f30175a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f30175a.hashCode() + (this.f30176b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("TransitionValues@");
        a10.append(Integer.toHexString(hashCode()));
        a10.append(":\n");
        StringBuilder a11 = p.a.a(a10.toString(), "    view = ");
        a11.append(this.f30176b);
        a11.append("\n");
        String b10 = a.b.b(a11.toString(), "    values:");
        for (String str : this.f30175a.keySet()) {
            b10 = b10 + "    " + str + ": " + this.f30175a.get(str) + "\n";
        }
        return b10;
    }
}
