package si;

import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.widget.Button;
import f.p;
import gm.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata
/* loaded from: classes2.dex */
public final class a extends ic.b {
    public static final /* synthetic */ int D0 = 0;
    public ArrayList<String> B0;
    public ArrayList<c> C0;

    /* renamed from: si.a$a */
    /* loaded from: classes2.dex */
    public static final class C0483a {
        public static a a(int i10, List list, ArrayList arrayList, String str) {
            Bundle bundle = new Bundle();
            bundle.putInt("type", i10);
            bundle.putStringArrayList("permissions", new ArrayList<>(list));
            bundle.putParcelableArrayList("descriptors", arrayList);
            bundle.putSerializable("disable_request_key", str);
            a aVar = new a();
            aVar.Z0(bundle);
            return aVar;
        }
    }

    @Override // androidx.fragment.app.r
    public final void Z0(Bundle bundle) {
        super.Z0(bundle);
        ArrayList<String> stringArrayList = U0().getStringArrayList("permissions");
        l.c(stringArrayList);
        this.B0 = stringArrayList;
        Bundle U0 = U0();
        ArrayList<c> parcelableArrayList = Build.VERSION.SDK_INT >= 33 ? U0.getParcelableArrayList("descriptors", c.class) : U0.getParcelableArrayList("descriptors");
        l.c(parcelableArrayList);
        this.C0 = parcelableArrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:191:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0234 A[SYNTHETIC] */
    @Override // androidx.fragment.app.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.app.Dialog d1(android.os.Bundle r19) {
        /*
            Method dump skipped, instructions count: 591
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: si.a.d1(android.os.Bundle):android.app.Dialog");
    }

    @Override // androidx.fragment.app.o
    public final void g1(Dialog dialog, int i10) {
        l.f(dialog, "dialog");
        if (!(dialog instanceof p)) {
            throw new UnsupportedOperationException();
        }
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return;
            }
            Window window = dialog.getWindow();
            l.c(window);
            window.addFlags(24);
        }
        ((p) dialog).h();
    }

    public final Button i1() {
        Dialog dialog = this.f2477w0;
        l.d(dialog, "null cannot be cast to non-null type androidx.appcompat.app.AlertDialog");
        return ((androidx.appcompat.app.d) dialog).j(-2);
    }

    public final ArrayList j1() {
        ArrayList<String> arrayList = this.B0;
        if (arrayList != null) {
            return arrayList;
        }
        l.l("permissions");
        throw null;
    }

    public final Button k1() {
        Dialog dialog = this.f2477w0;
        l.d(dialog, "null cannot be cast to non-null type androidx.appcompat.app.AlertDialog");
        Button j10 = ((androidx.appcompat.app.d) dialog).j(-1);
        l.e(j10, "dialog as AlertDialog).g…nterface.BUTTON_POSITIVE)");
        return j10;
    }
}
