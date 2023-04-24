package o5;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o5.y;

/* loaded from: classes.dex */
public final class c0 extends AsyncTask<Void, Void, List<? extends e0>> {

    /* renamed from: a */
    public final HttpURLConnection f22684a;

    /* renamed from: b */
    public final d0 f22685b;

    /* renamed from: c */
    public Exception f22686c;

    public c0(d0 d0Var) {
        gm.l.f(d0Var, "requests");
        this.f22684a = null;
        this.f22685b = d0Var;
    }

    public final void a(List<e0> list) {
        if (i6.a.b(this)) {
            return;
        }
        try {
            gm.l.f(list, WiseOpenHianalyticsData.UNION_RESULT);
            super.onPostExecute(list);
            Exception exc = this.f22686c;
            if (exc != null) {
                d6.m0 m0Var = d6.m0.f12709a;
                gm.l.e(String.format("onPostExecute: exception encountered during request: %s", Arrays.copyOf(new Object[]{exc.getMessage()}, 1)), "java.lang.String.format(format, *args)");
                v vVar = v.f22837a;
            }
        } catch (Throwable th2) {
            i6.a.a(this, th2);
        }
    }

    @Override // android.os.AsyncTask
    public final List<? extends e0> doInBackground(Void[] voidArr) {
        ArrayList d10;
        if (i6.a.b(this)) {
            return null;
        }
        try {
            Void[] voidArr2 = voidArr;
            if (i6.a.b(this)) {
                return null;
            }
            gm.l.f(voidArr2, "params");
            try {
                HttpURLConnection httpURLConnection = this.f22684a;
                if (httpURLConnection == null) {
                    d0 d0Var = this.f22685b;
                    d0Var.getClass();
                    String str = y.f22858j;
                    d10 = y.c.c(d0Var);
                } else {
                    String str2 = y.f22858j;
                    d10 = y.c.d(this.f22685b, httpURLConnection);
                }
                return d10;
            } catch (Exception e10) {
                this.f22686c = e10;
                return null;
            }
        } catch (Throwable th2) {
            i6.a.a(this, th2);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(List<? extends e0> list) {
        if (i6.a.b(this)) {
            return;
        }
        try {
            a(list);
        } catch (Throwable th2) {
            i6.a.a(this, th2);
        }
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
        Handler handler;
        if (i6.a.b(this)) {
            return;
        }
        try {
            super.onPreExecute();
            v vVar = v.f22837a;
            if (this.f22685b.f22690a == null) {
                if (Thread.currentThread() instanceof HandlerThread) {
                    handler = new Handler();
                } else {
                    handler = new Handler(Looper.getMainLooper());
                }
                this.f22685b.f22690a = handler;
            }
        } catch (Throwable th2) {
            i6.a.a(this, th2);
        }
    }

    public final String toString() {
        StringBuilder a10 = p.a.a("{RequestAsyncTask: ", " connection: ");
        a10.append(this.f22684a);
        a10.append(", requests: ");
        a10.append(this.f22685b);
        a10.append("}");
        String sb2 = a10.toString();
        gm.l.e(sb2, "StringBuilder()\n        .append(\"{RequestAsyncTask: \")\n        .append(\" connection: \")\n        .append(connection)\n        .append(\", requests: \")\n        .append(requests)\n        .append(\"}\")\n        .toString()");
        return sb2;
    }
}
