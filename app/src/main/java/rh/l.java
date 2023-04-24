package rh;

import android.content.Intent;
import androidx.core.content.FileProvider;
import com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportActivity;
import com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportViewModel;
import java.io.File;

@zl.e(c = "com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportActivity$initView$2$1", f = "EcgHealthReportActivity.kt", l = {185}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class l extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f25713e;

    /* renamed from: f */
    public final /* synthetic */ EcgHealthReportActivity f25714f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(EcgHealthReportActivity ecgHealthReportActivity, xl.d<? super l> dVar) {
        super(2, dVar);
        this.f25714f = ecgHealthReportActivity;
    }

    @Override // fm.p
    public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((l) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new l(this.f25714f, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f25713e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            EcgHealthReportActivity ecgHealthReportActivity = this.f25714f;
            int i11 = EcgHealthReportActivity.F;
            EcgHealthReportViewModel N = ecgHealthReportActivity.N();
            this.f25713e = 1;
            obj = N.e(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        File a10 = ((v) obj).f25745b.a();
        if (a10 != null) {
            EcgHealthReportActivity ecgHealthReportActivity2 = this.f25714f;
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("*/*");
            intent.putExtra("android.intent.extra.STREAM", FileProvider.b(ecgHealthReportActivity2, a10));
            intent.addFlags(268435457);
            ecgHealthReportActivity2.startActivity(Intent.createChooser(intent, ""));
        }
        return tl.l.f28297a;
    }
}
