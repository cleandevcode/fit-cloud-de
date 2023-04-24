package d6;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.widget.r2;
import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
import d6.r0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class r extends r0 {

    /* renamed from: p */
    public static final /* synthetic */ int f12729p = 0;

    /* renamed from: o */
    public boolean f12730o;

    public r(androidx.fragment.app.x xVar, String str, String str2) {
        super(xVar, str);
        this.f12734b = str2;
    }

    public static void f(r rVar) {
        gm.l.f(rVar, "this$0");
        super.cancel();
    }

    @Override // d6.r0
    public final Bundle b(String str) {
        Uri parse = Uri.parse(str);
        m0 m0Var = m0.f12709a;
        Bundle G = m0.G(parse.getQuery());
        String string = G.getString("bridge_args");
        G.remove("bridge_args");
        if (!m0.A(string)) {
            try {
                G.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", d.a(new JSONObject(string)));
            } catch (JSONException unused) {
                m0 m0Var2 = m0.f12709a;
                o5.v vVar = o5.v.f22837a;
            }
        }
        String string2 = G.getString("method_results");
        G.remove("method_results");
        if (!m0.A(string2)) {
            try {
                G.putBundle("com.facebook.platform.protocol.RESULT_ARGS", d.a(new JSONObject(string2)));
            } catch (JSONException unused2) {
                m0 m0Var3 = m0.f12709a;
                o5.v vVar2 = o5.v.f22837a;
            }
        }
        G.remove(WiseOpenHianalyticsData.UNION_VERSION);
        G.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", e0.l());
        return G;
    }

    @Override // d6.r0, android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        r0.f fVar = this.f12736d;
        if (this.f12743k && !this.f12741i && fVar != null && fVar.isShown()) {
            if (this.f12730o) {
                return;
            }
            this.f12730o = true;
            fVar.loadUrl(gm.l.k("(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();", "javascript:"));
            new Handler(Looper.getMainLooper()).postDelayed(new r2(11, this), 1500L);
            return;
        }
        super.cancel();
    }
}
