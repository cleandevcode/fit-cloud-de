package lh;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.AlertController;
import androidx.fragment.app.r;
import com.topstep.fitcloudpro.R;
import f.q;
import gm.l;
import kotlin.Metadata;
import lh.f;

@Metadata
/* loaded from: classes2.dex */
public final class f extends q {
    public static final /* synthetic */ int C0 = 0;
    public a B0;

    /* loaded from: classes2.dex */
    public interface a {
        void I(int i10);

        void l(int i10);
    }

    @Override // androidx.fragment.app.o, androidx.fragment.app.r
    public final void A0(Context context) {
        a aVar;
        l.f(context, "context");
        super.A0(context);
        r rVar = this.f2537v;
        if (rVar instanceof a) {
            aVar = (a) rVar;
        } else {
            aVar = null;
        }
        this.B0 = aVar;
    }

    @Override // androidx.fragment.app.o, androidx.fragment.app.r
    public final void F0() {
        super.F0();
        this.B0 = null;
    }

    @Override // f.q, androidx.fragment.app.o
    public final Dialog d1(Bundle bundle) {
        String o02 = o0(R.string.action_take_photo);
        l.e(o02, "getString(R.string.action_take_photo)");
        String o03 = o0(R.string.action_choose_photo);
        l.e(o03, "getString(R.string.action_choose_photo)");
        CharSequence[] charSequenceArr = {o02, o03};
        final int i10 = U0().getInt("crop_mode", 1);
        v9.b bVar = new v9.b(V0(), 0);
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: lh.e
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                f fVar = f.this;
                int i12 = i10;
                int i13 = f.C0;
                l.f(fVar, "this$0");
                f.a aVar = fVar.B0;
                if (i11 == 0) {
                    if (aVar != null) {
                        aVar.l(i12);
                    }
                } else if (aVar != null) {
                    aVar.I(i12);
                }
            }
        };
        AlertController.b bVar2 = bVar.f838a;
        bVar2.f819o = charSequenceArr;
        bVar2.f821q = onClickListener;
        return bVar.a();
    }
}
