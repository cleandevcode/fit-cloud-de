package h7;

import android.content.Context;
import android.net.Uri;
import gm.l;

/* loaded from: classes.dex */
public final class b {
    public static Uri a(Context context, int i10) {
        l.f(context, "context");
        Uri parse = Uri.parse("android.resource://" + context.getResources().getResourcePackageName(i10) + '/' + context.getResources().getResourceTypeName(i10) + '/' + context.getResources().getResourceEntryName(i10));
        l.e(parse, "parse(builder)");
        return parse;
    }
}
