package rh;

import android.content.Context;
import android.graphics.pdf.PdfDocument;
import android.os.Environment;
import com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportViewModel;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import y0.a;

@zl.e(c = "com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportViewModel$createPdfInternal$2", f = "EcgHealthReportActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class u extends zl.i implements fm.p<pm.e0, xl.d<? super File>, Object> {

    /* renamed from: e */
    public final /* synthetic */ EcgHealthReportViewModel f25742e;

    /* renamed from: f */
    public final /* synthetic */ PdfDocument f25743f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(EcgHealthReportViewModel ecgHealthReportViewModel, PdfDocument pdfDocument, xl.d<? super u> dVar) {
        super(2, dVar);
        this.f25742e = ecgHealthReportViewModel;
        this.f25743f = pdfDocument;
    }

    @Override // fm.p
    public final Object A(pm.e0 e0Var, xl.d<? super File> dVar) {
        return ((u) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new u(this.f25742e, this.f25743f, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        File file;
        File[] listFiles;
        mf.a0.k(obj);
        long currentTimeMillis = System.currentTimeMillis();
        EcgHealthReportViewModel ecgHealthReportViewModel = this.f25742e;
        Context context = ecgHealthReportViewModel.f10722j;
        Date time = ecgHealthReportViewModel.f10724l.getTime();
        ecgHealthReportViewModel.getClass();
        gm.l.f(context, "context");
        String str = Environment.DIRECTORY_DOWNLOADS;
        Object obj2 = y0.a.f30807a;
        File[] b10 = a.b.b(context, str);
        gm.l.e(b10, "getExternalFilesDirs(con…ment.DIRECTORY_DOWNLOADS)");
        File file2 = (File) ul.i.B(b10);
        if (file2 == null || (!file2.exists() && !file2.mkdirs())) {
            file2 = null;
        }
        if (file2 == null) {
            file = null;
        } else {
            if (file2.exists() && (listFiles = file2.listFiles()) != null) {
                for (File file3 : listFiles) {
                    String name = file3.getName();
                    gm.l.e(name, "it.name");
                    if (om.h.U(name, ".pdf", false)) {
                        file3.delete();
                    }
                }
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss", Locale.US);
            file = new File(file2, simpleDateFormat.format(time) + ".pdf");
        }
        if (file != null) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                this.f25743f.writeTo(fileOutputStream);
                tl.l lVar = tl.l.f28297a;
                mf.a0.d(fileOutputStream, null);
            } finally {
                this.f25743f.close();
            }
        }
        p000do.a.f13275a.b("CreatePdfTime:%d", new Long(System.currentTimeMillis() - currentTimeMillis));
        return file;
    }
}
