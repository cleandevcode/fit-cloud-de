package mi;

import android.content.Context;
import android.database.Cursor;
import android.provider.Telephony;
import cn.sharesdk.framework.InnerShareParams;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.e;
import com.topstep.fitcloud.pro.ui.sport.SportDetailActivity;
import java.util.List;
import si.f;

/* loaded from: classes2.dex */
public final /* synthetic */ class n implements e.a, f.a {

    /* renamed from: a */
    public final /* synthetic */ Context f21848a;

    /* renamed from: b */
    public final /* synthetic */ Object f21849b;

    public /* synthetic */ n(Context context, Object obj) {
        this.f21848a = context;
        this.f21849b = obj;
    }

    @Override // si.f.a
    public final void b(boolean z10) {
        int type;
        Context context = this.f21848a;
        f.a aVar = (f.a) this.f21849b;
        gm.l.f(context, "$context");
        if (si.f.f27071a.d(context)) {
            try {
                Cursor query = context.getContentResolver().query(Telephony.Sms.CONTENT_URI, new String[]{"_id", InnerShareParams.ADDRESS, "person", "body"}, null, null, null);
                if (query != null) {
                    if (query.moveToFirst() && (type = query.getType(0)) != 0 && (type == 1 || type == 2 || type == 3 || type != 4)) {
                        query.getString(0);
                    }
                    tl.l lVar = tl.l.f28297a;
                    mf.a0.d(query, null);
                }
            } catch (Throwable unused) {
            }
        }
        if (aVar != null) {
            aVar.b(z10);
        }
    }

    @Override // com.google.android.material.tabs.e.a
    public final void f(TabLayout.g gVar, int i10) {
        SportDetailActivity sportDetailActivity = (SportDetailActivity) this.f21848a;
        List list = (List) this.f21849b;
        SportDetailActivity.a aVar = SportDetailActivity.B;
        gm.l.f(sportDetailActivity, "this$0");
        gm.l.f(list, "$titleResList");
        gVar.a(sportDetailActivity.getString(((Number) list.get(i10)).intValue()));
    }
}
