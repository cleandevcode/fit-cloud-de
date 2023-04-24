package rh;

import android.widget.Button;
import com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportActivity;

/* loaded from: classes2.dex */
public final class m extends gm.m implements fm.l<Button, tl.l> {

    /* renamed from: b */
    public final /* synthetic */ EcgHealthReportActivity f25716b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(EcgHealthReportActivity ecgHealthReportActivity) {
        super(1);
        this.f25716b = ecgHealthReportActivity;
    }

    @Override // fm.l
    public final tl.l k(Button button) {
        gm.l.f(button, "it");
        rm.l.g(this.f25716b).e(new l(this.f25716b, null));
        return tl.l.f28297a;
    }
}
