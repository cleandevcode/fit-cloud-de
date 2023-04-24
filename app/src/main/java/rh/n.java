package rh;

import android.graphics.pdf.PdfDocument;
import android.view.ViewTreeObserver;
import bi.z0;
import com.topstep.fitcloud.pro.databinding.ActivityEcgHealthReportBinding;
import com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportActivity;
import com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportViewModel;
import pm.o0;

/* loaded from: classes2.dex */
public final class n implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    public final /* synthetic */ EcgHealthReportActivity f25720a;

    public n(EcgHealthReportActivity ecgHealthReportActivity) {
        this.f25720a = ecgHealthReportActivity;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ActivityEcgHealthReportBinding activityEcgHealthReportBinding = this.f25720a.B;
        if (activityEcgHealthReportBinding != null) {
            if (activityEcgHealthReportBinding.ecgReportView.getWidth() != 0) {
                ActivityEcgHealthReportBinding activityEcgHealthReportBinding2 = this.f25720a.B;
                if (activityEcgHealthReportBinding2 != null) {
                    if (activityEcgHealthReportBinding2.ecgReportView.getHeight() != 0) {
                        ActivityEcgHealthReportBinding activityEcgHealthReportBinding3 = this.f25720a.B;
                        if (activityEcgHealthReportBinding3 != null) {
                            activityEcgHealthReportBinding3.ecgReportView.getViewTreeObserver().removeOnPreDrawListener(this);
                            PdfDocument pdfDocument = new PdfDocument();
                            ActivityEcgHealthReportBinding activityEcgHealthReportBinding4 = this.f25720a.B;
                            if (activityEcgHealthReportBinding4 != null) {
                                int width = activityEcgHealthReportBinding4.layoutContent.getWidth();
                                ActivityEcgHealthReportBinding activityEcgHealthReportBinding5 = this.f25720a.B;
                                if (activityEcgHealthReportBinding5 != null) {
                                    PdfDocument.Page startPage = pdfDocument.startPage(new PdfDocument.PageInfo.Builder(width, activityEcgHealthReportBinding5.layoutContent.getHeight(), 1).create());
                                    ActivityEcgHealthReportBinding activityEcgHealthReportBinding6 = this.f25720a.B;
                                    if (activityEcgHealthReportBinding6 != null) {
                                        activityEcgHealthReportBinding6.layoutContent.draw(startPage.getCanvas());
                                        pdfDocument.finishPage(startPage);
                                        EcgHealthReportViewModel N = this.f25720a.N();
                                        N.getClass();
                                        v6.b.f(N, new r(N, pdfDocument, null), null, s.f25733b, 3);
                                        z0.g(rm.l.h(N), o0.f24381a, 0, new t(N, null), 2);
                                        return true;
                                    }
                                    gm.l.l("viewBind");
                                    throw null;
                                }
                                gm.l.l("viewBind");
                                throw null;
                            }
                            gm.l.l("viewBind");
                            throw null;
                        }
                        gm.l.l("viewBind");
                        throw null;
                    }
                } else {
                    gm.l.l("viewBind");
                    throw null;
                }
            }
            return false;
        }
        gm.l.l("viewBind");
        throw null;
    }
}
