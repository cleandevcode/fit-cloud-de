package e8;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a */
    public static final l8.a f13499a = new l8.a("GoogleSignInCommon", new String[0]);

    public static Intent a(Context context, GoogleSignInOptions googleSignInOptions) {
        f13499a.a("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    public static void b(Context context) {
        n.a(context).b();
        Set set = g8.d.f15030a;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        if (!it.hasNext()) {
            synchronized (h8.d.f15923r) {
                h8.d dVar = h8.d.f15924s;
                if (dVar != null) {
                    dVar.f15933i.incrementAndGet();
                    v8.j jVar = dVar.f15938n;
                    jVar.sendMessageAtFrontOfQueue(jVar.obtainMessage(10));
                }
            }
            return;
        }
        ((g8.d) it.next()).getClass();
        throw new UnsupportedOperationException();
    }
}
