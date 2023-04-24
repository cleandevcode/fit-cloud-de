package fc;

import android.content.Context;
import android.os.AsyncTask;
import java.io.FileInputStream;
import yb.y;

/* loaded from: classes.dex */
public final class b extends AsyncTask<Context, Integer, Boolean> {

    /* renamed from: a */
    public static final String f14230a = b.class.getSimpleName();

    @Override // android.os.AsyncTask
    public final Boolean doInBackground(Context[] contextArr) {
        FileInputStream fileInputStream;
        Context[] contextArr2 = contextArr;
        System.currentTimeMillis();
        try {
            fileInputStream = a.i(contextArr2[0]);
        } catch (Exception e10) {
            String str = f14230a;
            StringBuilder a10 = android.support.v4.media.d.a("doInBackground: exception : ");
            a10.append(e10.getMessage());
            p.b.c(str, a10.toString());
            fileInputStream = null;
        }
        System.currentTimeMillis();
        if (fileInputStream != null) {
            y.g(fileInputStream);
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Boolean bool) {
        if (bool.booleanValue()) {
            p.b.e(f14230a, "onPostExecute: upate done");
        } else {
            p.b.c(f14230a, "onPostExecute: upate failed");
        }
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
    }

    @Override // android.os.AsyncTask
    public final void onProgressUpdate(Integer[] numArr) {
        p.b.e(f14230a, "onProgressUpdate");
    }
}
