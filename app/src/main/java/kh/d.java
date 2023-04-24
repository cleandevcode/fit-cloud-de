package kh;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import androidx.core.content.FileProvider;
import gm.l;
import java.io.File;
import ji.n;
import kh.f;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f18583a;

    /* renamed from: b */
    public final /* synthetic */ Object f18584b;

    /* renamed from: c */
    public final /* synthetic */ Object f18585c;

    public /* synthetic */ d(Object obj, Object obj2, int i10) {
        this.f18583a = i10;
        this.f18584b = obj;
        this.f18585c = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f18583a) {
            case 0:
                m7.b bVar = (m7.b) this.f18584b;
                f fVar = (f) this.f18585c;
                int i11 = f.D0;
                l.f(bVar, "$layout");
                l.f(fVar, "this$0");
                int[] value = bVar.getValue();
                f.b bVar2 = fVar.B0;
                if (bVar2 != null) {
                    int i12 = hh.b.f16094a;
                    l.f(value, "<this>");
                    bVar2.c(((value[0] * 12) + value[1]) / 0.3937008f);
                    return;
                }
                return;
            default:
                n nVar = (n) this.f18584b;
                String[] strArr = (String[]) this.f18585c;
                int i13 = n.B0;
                l.f(nVar, "this$0");
                l.f(strArr, "$files");
                Context V0 = nVar.V0();
                File file = new File(strArr[i10]);
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("*/*");
                intent.putExtra("android.intent.extra.STREAM", FileProvider.b(V0, file));
                intent.addFlags(268435457);
                V0.startActivity(Intent.createChooser(intent, null));
                return;
        }
    }
}
