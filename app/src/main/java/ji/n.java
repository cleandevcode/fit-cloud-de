package ji;

import android.app.Dialog;
import android.os.Bundle;
import androidx.appcompat.app.AlertController;
import f.q;
import java.io.File;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata
/* loaded from: classes2.dex */
public final class n extends q {
    public static final /* synthetic */ int B0 = 0;

    @Override // f.q, androidx.fragment.app.o
    public final Dialog d1(Bundle bundle) {
        String[] stringArray = U0().getStringArray("extraArgs");
        gm.l.c(stringArray);
        ArrayList arrayList = new ArrayList(stringArray.length);
        for (String str : stringArray) {
            arrayList.add(new File(str).getName());
        }
        Object[] array = arrayList.toArray(new String[0]);
        gm.l.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        v9.b bVar = new v9.b(V0(), 0);
        kh.d dVar = new kh.d(this, stringArray, 1);
        AlertController.b bVar2 = bVar.f838a;
        bVar2.f819o = (String[]) array;
        bVar2.f821q = dVar;
        return bVar.a();
    }
}
