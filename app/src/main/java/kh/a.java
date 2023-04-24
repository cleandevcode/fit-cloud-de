package kh;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.topstep.fitcloudpro.R;
import f.q;
import kotlin.Metadata;

@Metadata
/* loaded from: classes2.dex */
public final class a extends q {
    @Override // f.q, androidx.fragment.app.o
    public final Dialog d1(Bundle bundle) {
        View inflate = LayoutInflater.from(V0()).inflate(R.layout.dialog_auth_code_help, (ViewGroup) null);
        ((TextView) inflate.findViewById(R.id.tv_des2)).setText(p0(R.string.auth_code_help_des2, o0(R.string.app_name)));
        v9.b bVar = new v9.b(V0(), 0);
        bVar.k(R.string.auth_code_help_title);
        bVar.h(R.string.tip_i_know, null);
        bVar.m(inflate);
        return bVar.a();
    }
}
