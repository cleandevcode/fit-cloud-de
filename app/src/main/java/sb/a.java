package sb;

import android.content.Context;
import android.net.Uri;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.sina.weibo.BuildConfig;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a */
    public d f26808a;

    /* renamed from: b */
    public final String f26809b;

    /* renamed from: c */
    public final c f26810c;

    /* renamed from: d */
    public final Context f26811d;

    /* renamed from: e */
    public final String f26812e;

    /* renamed from: f */
    public final qb.c f26813f;

    public a(String str, int i10, c cVar, Context context, String str2, GrsBaseInfo grsBaseInfo, qb.c cVar2) {
        this.f26809b = str;
        this.f26810c = cVar;
        this.f26811d = context;
        this.f26812e = str2;
        this.f26813f = cVar2;
    }

    public final int a() {
        if (this.f26809b.isEmpty()) {
            return 3;
        }
        String path = Uri.parse(this.f26809b).getPath();
        if (path.contains(BuildConfig.VERSION_NAME)) {
            return 2;
        }
        if (!path.contains("2.0")) {
            return 3;
        }
        return 1;
    }
}
