package cn.sharesdk.twitter;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public class a {
    public static boolean a(Context context, Intent intent) {
        return context.getPackageManager().resolveActivity(intent, 0) != null;
    }
}
