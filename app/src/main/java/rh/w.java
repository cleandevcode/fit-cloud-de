package rh;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.topstep.fitcloudpro.R;
import java.util.Random;
import kotlin.Metadata;

@Metadata
/* loaded from: classes2.dex */
public final class w extends f.q {
    @Override // f.q, androidx.fragment.app.o
    public final Dialog d1(Bundle bundle) {
        View inflate = LayoutInflater.from(V0()).inflate(R.layout.dialog_ecg_result, (ViewGroup) null);
        Random random = new Random();
        int nextInt = random.nextInt(20) + 19;
        int nextInt2 = random.nextInt(19) + 18;
        int nextInt3 = random.nextInt(19) + 18;
        int nextInt4 = random.nextInt(16) + 72;
        ((TextView) inflate.findViewById(R.id.tv_health_index)).setText(String.valueOf(random.nextInt(4) + 5 + (((((((100 - nextInt) + 100) - nextInt2) + 100) - nextInt3) + nextInt4) / 4)));
        ((TextView) inflate.findViewById(R.id.tv_fatigue_index)).setText(String.valueOf(nextInt));
        ((TextView) inflate.findViewById(R.id.tv_mental_index)).setText(String.valueOf(nextInt2));
        ((TextView) inflate.findViewById(R.id.tv_body_index)).setText(String.valueOf(nextInt3));
        ((TextView) inflate.findViewById(R.id.tv_cardiac_index)).setText(String.valueOf(nextInt4));
        v9.b bVar = new v9.b(V0(), 0);
        bVar.k(R.string.ecg_result_title);
        bVar.m(inflate);
        bVar.h(17039370, null);
        return bVar.a();
    }
}
