package ba;

import android.content.Context;
import android.view.SubMenu;
import androidx.appcompat.view.menu.h;

/* loaded from: classes.dex */
public final class c extends androidx.appcompat.view.menu.f {
    public final int A;

    /* renamed from: z */
    public final Class<?> f4085z;

    public c(Context context, Class<?> cls, int i10) {
        super(context);
        this.f4085z = cls;
        this.A = i10;
    }

    @Override // androidx.appcompat.view.menu.f
    public final h a(int i10, int i11, int i12, CharSequence charSequence) {
        if (size() + 1 <= this.A) {
            w();
            h a10 = super.a(i10, i11, i12, charSequence);
            a10.f982x = (a10.f982x & (-5)) | 4;
            v();
            return a10;
        }
        String simpleName = this.f4085z.getSimpleName();
        StringBuilder a11 = androidx.activity.result.d.a("Maximum number of items supported by ", simpleName, " is ");
        a11.append(this.A);
        a11.append(". Limit can be checked with ");
        a11.append(simpleName);
        a11.append("#getMaxItemCount()");
        throw new IllegalArgumentException(a11.toString());
    }

    @Override // androidx.appcompat.view.menu.f, android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        throw new UnsupportedOperationException(this.f4085z.getSimpleName() + " does not support submenus");
    }
}
