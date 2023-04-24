package e8;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: c */
    public static final l8.a f13492c = new l8.a("RevokeAccessOperation", new String[0]);

    /* renamed from: a */
    public final String f13493a;

    /* renamed from: b */
    public final h8.n f13494b;

    public e(String str) {
        i8.p.d(str);
        this.f13493a = str;
        this.f13494b = new h8.n(null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        l8.a aVar;
        String concat;
        Status status = Status.f6053h;
        try {
            String str = this.f13493a;
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + str).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f6051f;
            } else {
                l8.a aVar2 = f13492c;
                Log.e(aVar2.f19402a, aVar2.f19403b.concat("Unable to revoke access!"));
            }
            l8.a aVar3 = f13492c;
            aVar3.a("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e10) {
            aVar = f13492c;
            concat = "IOException when revoking access: ".concat(String.valueOf(e10.toString()));
            Log.e(aVar.f19402a, aVar.f19403b.concat(concat));
            this.f13494b.e(status);
        } catch (Exception e11) {
            aVar = f13492c;
            concat = "Exception when revoking access: ".concat(String.valueOf(e11.toString()));
            Log.e(aVar.f19402a, aVar.f19403b.concat(concat));
            this.f13494b.e(status);
        }
        this.f13494b.e(status);
    }
}
