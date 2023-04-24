package ii;

import android.net.Uri;
import com.topstep.fitcloud.pro.ui.settings.FeedbackViewModel;
import java.util.ArrayList;

@zl.e(c = "com.topstep.fitcloud.pro.ui.settings.FeedbackViewModel$commit$1", f = "FeedbackFragment.kt", l = {187}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class y extends zl.i implements fm.l<xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f17002e;

    /* renamed from: f */
    public final /* synthetic */ FeedbackViewModel f17003f;

    /* renamed from: g */
    public final /* synthetic */ String f17004g;

    /* renamed from: h */
    public final /* synthetic */ String f17005h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(FeedbackViewModel feedbackViewModel, String str, String str2, xl.d<? super y> dVar) {
        super(1, dVar);
        this.f17003f = feedbackViewModel;
        this.f17004g = str;
        this.f17005h = str2;
    }

    @Override // fm.l
    public final Object k(xl.d<? super tl.l> dVar) {
        return new y(this.f17003f, this.f17004g, this.f17005h, dVar).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f17002e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            FeedbackViewModel feedbackViewModel = this.f17003f;
            sg.b bVar = feedbackViewModel.f11856h;
            String str = this.f17004g;
            String str2 = this.f17005h;
            ArrayList<Uri> arrayList = feedbackViewModel.f11857i;
            this.f17002e = 1;
            if (bVar.a(str, str2, arrayList, "fitcloudproGoogle_2.0.7", this) == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
