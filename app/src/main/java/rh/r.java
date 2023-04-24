package rh;

import android.graphics.pdf.PdfDocument;
import bi.z0;
import com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportViewModel;
import java.io.File;
import pm.o0;

@zl.e(c = "com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportViewModel$createPdf$1", f = "EcgHealthReportActivity.kt", l = {271}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class r extends zl.i implements fm.l<xl.d<? super File>, Object> {

    /* renamed from: e */
    public int f25730e;

    /* renamed from: f */
    public final /* synthetic */ EcgHealthReportViewModel f25731f;

    /* renamed from: g */
    public final /* synthetic */ PdfDocument f25732g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(EcgHealthReportViewModel ecgHealthReportViewModel, PdfDocument pdfDocument, xl.d<? super r> dVar) {
        super(1, dVar);
        this.f25731f = ecgHealthReportViewModel;
        this.f25732g = pdfDocument;
    }

    @Override // fm.l
    public final Object k(xl.d<? super File> dVar) {
        return new r(this.f25731f, this.f25732g, dVar).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f25730e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            EcgHealthReportViewModel ecgHealthReportViewModel = this.f25731f;
            PdfDocument pdfDocument = this.f25732g;
            this.f25730e = 1;
            ecgHealthReportViewModel.getClass();
            obj = z0.s(this, o0.f24382b, new u(ecgHealthReportViewModel, pdfDocument, null));
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
