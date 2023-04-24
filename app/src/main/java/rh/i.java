package rh;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.topstep.fitcloudpro.R;
import kotlin.Metadata;

@Metadata
/* loaded from: classes2.dex */
public final class i extends f.q {
    public static final /* synthetic */ int B0 = 0;

    /* loaded from: classes2.dex */
    public interface a {
        void N();
    }

    @Override // f.q, androidx.fragment.app.o
    public final Dialog d1(Bundle bundle) {
        View inflate = LayoutInflater.from(V0()).inflate(R.layout.dialog_ecg_start, (ViewGroup) null);
        ((ImageView) inflate.findViewById(R.id.img_title)).setImageResource(R.drawable.ic_ecg_error_dialog_title);
        ((TextView) inflate.findViewById(R.id.tv_message)).setText(R.string.ecg_error_dialog_message);
        v9.b bVar = new v9.b(V0(), 0);
        bVar.m(inflate);
        bVar.f(null);
        bVar.h(17039370, new h(this, 0));
        return bVar.a();
    }
}
